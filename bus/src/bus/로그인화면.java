package bus;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

import javax.sound.midi.Soundbank;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class 로그인화면 {
	데이터 db = new 데이터();
	private JFrame frame;
	private JTextField id;
	private JPasswordField pw;
	private JLabel lblNewLabel;
	private JLabel signUpBtn;
	private JButton subBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					로그인화면 window = new 로그인화면();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public 로그인화면() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\_yhj\\bus\\src\\image\\login_bus.png"));
		frame.setTitle("버스 예약 통합 시스템");
		frame.getContentPane().setLayout(null);
		ImagePanel welcomPanel = new ImagePanel(new ImageIcon("C:/_yhj/bus/src/image/login_bus.png").getImage());
		welcomPanel.setBackground(Color.GRAY);
		welcomPanel.setBounds(0, 1, 508, 500);
		frame.getContentPane().add(welcomPanel);

		subBtn = new JButton("");
		subBtn.setBounds(220, 385, 65, 35);
		subBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		subBtn.setIcon(new ImageIcon("C:\\_yhj\\bus\\src\\image\\bus_number.png"));
		subBtn.setPressedIcon(new ImageIcon("C:\\_yhj\\bus\\src\\image\\bus_number0.png"));
		subBtn.addActionListener(new ActionListener() {
			// 로그인 액션
			@Override
			public void actionPerformed(ActionEvent e) {
				// String data2 = id.getText();
				String data1 = pw.getText(); // 패스워드
				String aa = null;
				String aa2 = "";
				
				String[] result;
				try {
					result = db.selectAll(id.getText());
//					if( aa2.equals(result[0])){
//						System.out.println("널포인트 에러");
//					}

					System.out.println(result[0] + "result");
//					String id = result[0];
//					String pw = result[1];
					System.out.println("id>>" + data1);
					if (result[0]==null || result[0].equals("")) { // ''
						JOptionPane.showMessageDialog(null, "아이디를 확인해 주세요");
					} else if (!data1.equals(result[0])) { // 가져온 비밀번호가 우리가 적은 비밀번호값이랑 비교해서 맞지않을때
						JOptionPane.showMessageDialog(frame, "비밀번호를 확인해주세요");
					} else if (data1.equals(result[0])) { // '' 우리가 '' 맞을때
						JOptionPane.showMessageDialog(frame, "로그인 성공");
						메인화면.main(null);
						frame.setVisible(false);
					}
					

				} catch (Exception e2) {
					e2.printStackTrace();
				}

			}
		});

		welcomPanel.setLayout(null);

		welcomPanel.add(subBtn);

		id = new JTextField();
		id.setBounds(155, 120, 200, 35);
		id.setColumns(10);
		welcomPanel.add(id);

		pw = new JPasswordField();
		pw.setBounds(155, 200, 200, 35);
		welcomPanel.add(pw);

		lblNewLabel = new JLabel("     회원이 아니신가요?");
		lblNewLabel.setBounds(155, 315, 200, 30);
		lblNewLabel.setFont(new Font("돋움체", Font.PLAIN, 14));
		welcomPanel.add(lblNewLabel);

		signUpBtn = new JLabel("<HTML><U>         회원 가입</U></HTML> ");
		signUpBtn.setBounds(220, 345, 65, 30);
		signUpBtn.setFont(new Font("돋움체", Font.PLAIN, 14));

		welcomPanel.add(signUpBtn);
		// 회원가입 글자 클릭 시 이벤트
		signUpBtn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				가입화면 sign = new 가입화면();
				frame.dispose();

			}
		});

		frame.setSize(524, 540);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class ImagePanel extends JPanel {
	private Image img;

	public ImagePanel(Image img) {
		this.img = img;

		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setLayout(null);
	}

	public int getWidth() {
		return img.getWidth(null);
	}

	public int getHeiht() {
		return img.getHeight(null);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
}
