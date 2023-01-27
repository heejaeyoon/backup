import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JoinFrame {

	private JFrame frame;
	private JTextField username;
	private JTextField userid;
	private JTextField email;
	private JTextField phone;
	private JPasswordField pw;

	/**
	 * Launch the application.
	 */
	public static void sign() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JoinFrame window = new JoinFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JoinFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 310, 396);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 294, 357);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회원가입");
		lblNewLabel.setFont(new Font("나눔고딕", Font.PLAIN, 27));
		lblNewLabel.setBounds(87, 10, 118, 55);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setBounds(30, 140, 57, 15);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("이메일");
		lblNewLabel_2.setBounds(30, 180, 57, 15);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("이름");
		lblNewLabel_3.setBounds(30, 100, 57, 15);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("비밀 번호");
		lblNewLabel_4.setBounds(30, 260, 57, 15);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("휴대폰 번호");
		lblNewLabel_4_1.setBounds(30, 220, 76, 15);
		panel.add(lblNewLabel_4_1);
		
		username = new JTextField();
		username.setBounds(138, 100, 116, 21);
		panel.add(username);
		username.setColumns(10);
		
		userid = new JTextField();
		userid.setColumns(10);
		userid.setBounds(138, 140, 116, 21);
		panel.add(userid);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(138, 180, 116, 21);
		panel.add(email);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(138, 220, 116, 21);
		panel.add(phone);
		
		pw = new JPasswordField();
		pw.setBounds(138, 260, 116, 21);
		panel.add(pw);
		
		JButton joincombtn = new JButton("회원 가입 완료");
		joincombtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		joincombtn.setBounds(87, 310, 118, 31);
		panel.add(joincombtn);
		
		joincombtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String nameTxt = username.getText();
				String idTxt = userid.getText();
				String emailTxt = email.getText();
				String phoneTxt = phone.getText();
				String pwTxt = pw.getText();
				MemberDTO memberDTO = new MemberDTO();
				
				JOptionPane.showMessageDialog(null,"회원 가입 완료");
			}
		});
	}
		

}
