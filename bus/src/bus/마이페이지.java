package bus;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class 마이페이지 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
	public 마이페이지() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		데이터 db = new 데이터();
		frame = new JFrame();
		frame.setSize(1000, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(189, 215, 238));
		panel.setBounds(0, 0, 984, 90);
		frame.getContentPane().add(panel);

		ImageIcon backIcon = new ImageIcon("C:/_yhj/bus/src/image//back.png");
		Image backImg = backIcon.getImage();
		Image backUpdate = backImg.getScaledInstance(100, 50, Image.SCALE_SMOOTH);
		ImageIcon backUpdateIcon = new ImageIcon(backUpdate);

		ImageIcon backIcon2 = new ImageIcon("C:/_yhj/bus/src/image//back2.png");
		Image backImg2 = backIcon2.getImage();
		Image backUpdate2 = backImg2.getScaledInstance(100, 50, Image.SCALE_SMOOTH);
		ImageIcon backUpdateIcon2 = new ImageIcon(backUpdate2);
		panel.setLayout(null);

		JButton back = new JButton(backUpdateIcon);
		back.setBounds(844, 20, 100, 50);

		back.setPreferredSize(new Dimension(100, 50));
		back.setRolloverIcon(backUpdateIcon2); // 버튼에 마우스가 올라갈떄 이미지 변환
		back.setBorderPainted(false); // 버튼 테두리 설정해제
		back.setFocusPainted(false);
		back.setContentAreaFilled(false);
		back.setOpaque(false);
		panel.add(back);

		back.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				메인화면.main(null);
				frame.dispose();
			}
		});

		JLabel lblNewLabel = new JLabel("저희 서비스를 이용해주셔서 감사합니다.");
		lblNewLabel.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 25));
		lblNewLabel.setBounds(32, 26, 460, 31);
		panel.add(lblNewLabel);

		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(166, 222, 249));
		panel1.setBounds(0, 0, 984, 761);
		frame.getContentPane().add(panel1);

		// 구분 선 삽입
		ImageIcon line = new ImageIcon("C:/_yhj/bus/src/image//line.png");
		Image img2 = line.getImage();
		Image updateImg2 = img2.getScaledInstance(400, 50, Image.SCALE_DEFAULT);
		ImageIcon updateIcon2 = new ImageIcon(updateImg2);
		panel1.setLayout(null);

		JLabel image2 = new JLabel(updateIcon2);
		image2.setBounds(80, 255, 350, 50);
		image2.setHorizontalAlignment(JLabel.CENTER);
		panel1.add(image2);

		// 세로 선 삽입
		ImageIcon line2 = new ImageIcon("C:/_yhj/bus/src/image//line2.png");
		Image img3 = line2.getImage();
		Image updateImg3 = img3.getScaledInstance(50, 800, Image.SCALE_DEFAULT);
		ImageIcon updateIcon3 = new ImageIcon(updateImg3);

		JLabel image3 = new JLabel(updateIcon3);
		image3.setBounds(500, 123, 50, 610);
		image3.setHorizontalAlignment(JLabel.CENTER);
		panel1.add(image3);
	

		
		
		     // 프로필 이미지 삽입
		ImageIcon profile = new ImageIcon("C:/_yhj/bus/src/image/profile.png");
		Image img = profile.getImage();
		Image updateImg = img.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
		ImageIcon updateIcon = new ImageIcon(updateImg);

		JButton image = new JButton(updateIcon);
		image.setBounds(80, 171, 100, 100);
		image.setHorizontalAlignment(JLabel.CENTER);
		image.setBorderPainted(false); // 버튼 테두리 설정해제
		image.setFocusPainted(false);
		image.setContentAreaFilled(false);
		image.setOpaque(false);
		panel1.add(image);
		}
	}

