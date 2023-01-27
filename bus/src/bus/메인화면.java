package bus;

import java.awt.Color;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class 메인화면 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					메인화면 window = new 메인화면();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public 메인화면() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(메인화면.class.getResource("/image/bg.png")));
		frame.setSize(936,740);
		frame.setTitle("버스 예약 통합 시스템");
		
		
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(189, 215, 235));
		panel2.setBounds(0, 0, 920, 94);
		frame.getContentPane().add(panel2);
		panel2.setLayout(null);
		
		

		ImagePanel panel = new ImagePanel(new ImageIcon("C:/_yhj/bus/src/image/bg.png").getImage());
		panel.setBackground(Color.GRAY);
		frame.getContentPane().add(panel);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel lblNewLabel = new JLabel("저희 서비스를 이용해주셔서 감사합니다.");
		lblNewLabel.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 25));
		lblNewLabel.setBounds(23, 10, 460, 67);
		panel2.add(lblNewLabel);
		
		JButton mypageBtn = new JButton("");
		mypageBtn.setIcon(new ImageIcon("C:\\_yhj\\bus\\src\\image\\remy.png"));
		mypageBtn.setPressedIcon(new ImageIcon("C:\\_yhj\\bus\\src\\image\\remy1.png"));
		mypageBtn.setPressedIcon(new ImageIcon("C:\\_yhj\\bus\\src\\image\\remy1.png"));
		mypageBtn.setBounds(737, 18, 61, 59);	
		panel2.add(mypageBtn);
		
		mypageBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				마이페이지.main(null);
				frame.setVisible(false);
			}
		});
		
		
		JButton logoutbtn = new JButton("");
		logoutbtn.setIcon(new ImageIcon("C:\\_yhj\\bus\\src\\image\\reout.png"));
		logoutbtn.setPressedIcon(new ImageIcon("C:\\_yhj\\bus\\src\\image\\reout1.png"));
		logoutbtn.setBounds(832, 18, 61, 59);
		panel2.add(logoutbtn);
		
		 // 로그아웃 버튼 클릭 시 이벤트
        logoutbtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int answer = JOptionPane.showConfirmDialog(null, "로그아웃 하시겠습니까?","로그아웃",JOptionPane.YES_NO_OPTION);
                if (answer == JOptionPane.YES_OPTION) {
                	로그인화면.main(null);
                    frame.dispose();   // dispose를 밑으로 빼니 창 전환 시 더 자연스러운 모션
                }
            }
        });
        
        JLabel p1 = new JLabel("예매하기");
        JLabel p2 = new JLabel("예약조회");
        JLabel p3 = new JLabel("챗봇문의");
        p1.setFont(new Font("휴먼엑스포", Font.PLAIN, 35));
        p2.setFont(new Font("휴먼엑스포", Font.PLAIN, 35));
        p3.setFont(new Font("휴먼엑스포", Font.PLAIN, 35));
        p1.setForeground(Color.WHITE);
        p2.setForeground(Color.WHITE);
        p3.setForeground(Color.WHITE);
        p1.setBounds(105,240,200,200);
        p2.setBounds(375,240,200,200);
        p3.setBounds(645,240,200,200);
        panel.add(p1);
        panel.add(p2);
        panel.add(p3);

    
        ImageIcon reIcon = new ImageIcon("C://_yhj//bus//src//image//icon4.png");
        Image reImg = reIcon.getImage();
        Image reUpdate = reImg.getScaledInstance(180,180, Image.SCALE_SMOOTH);
        ImageIcon reUpdateIcon = new ImageIcon(reUpdate);

        ImageIcon reIcon2 = new ImageIcon("C://_yhj//bus//src//image//blurIcon2.png");
        Image reImg2 = reIcon2.getImage();
        Image reUpdate2 = reImg2.getScaledInstance(180,180, Image.SCALE_SMOOTH);
        ImageIcon reUpdateIcon2 = new ImageIcon(reUpdate2);

        JButton reservation = new JButton(reUpdateIcon);
        reservation.setBounds(75,120,190,190);
        reservation.setBorderPainted(false); // 버튼 테두리 설정해제
        Color mycor=new Color(189,215,238);
        reservation.setRolloverIcon(reUpdateIcon2); // 버튼에 마우스가 올라갈떄 이미지 변환
        reservation.setBackground(mycor);
        reservation.setFocusPainted(false);
        reservation.setContentAreaFilled(false);
        reservation.setOpaque(false);
        panel.add(reservation);
        

        // 예매내역 조회 버튼 이미지
        ImageIcon chIcon = new ImageIcon("C://_yhj//bus//src//image//icon2.png");
        Image chImg = chIcon.getImage();
        Image chUpdate = chImg.getScaledInstance(180,180, Image.SCALE_SMOOTH);
        ImageIcon chUpdateIcon = new ImageIcon(chUpdate);

        ImageIcon chIcon2 = new ImageIcon("C://_yhj//bus//src//image//blurIcon3.png");
        Image chImg2 = chIcon2.getImage();
        Image chUpdate2 = chImg2.getScaledInstance(180,180, Image.SCALE_SMOOTH);
        ImageIcon chUpdateIcon2 = new ImageIcon(chUpdate2);

        JButton checkUp = new JButton(chUpdateIcon);
        checkUp.setBounds(345,120,190,190);
        checkUp.setBorderPainted(false); // 버튼 테두리 설정해제
        checkUp.setRolloverIcon(chUpdateIcon2); // 버튼에 마우스가 올라갈떄 이미지 변환
        checkUp.setBackground(mycor);
        checkUp.setFocusPainted(false);
        checkUp.setContentAreaFilled(false);
        checkUp.setOpaque(false);
        panel.add(checkUp);

        // 챗봇 버튼 이미지
        ImageIcon chatIcon = new ImageIcon("C://_yhj//bus//src//image//icon3.png");
        Image chatImg = chatIcon.getImage();
        Image chatUpdate = chatImg.getScaledInstance(180,180, Image.SCALE_SMOOTH);
        ImageIcon chatUpdateIcon = new ImageIcon(chatUpdate);

        ImageIcon chatIcon2 = new ImageIcon("C://_yhj//bus//src//image//blurIcon1.png");
        Image chatImg2 = chatIcon2.getImage();
        Image chatUpdate2 = chatImg2.getScaledInstance(180,180, Image.SCALE_SMOOTH);
        ImageIcon chatUpdateIcon2 = new ImageIcon(chatUpdate2);

        JButton chatBot = new JButton(chatUpdateIcon);
        chatBot.setBounds(615,120,190,190);
        chatBot.setRolloverIcon(chatUpdateIcon2); // 버튼에 마우스가 올라갈떄 이미지 변환
        chatBot.setBorderPainted(false); // 버튼 테두리 설정해제
        chatBot.setBackground(mycor);
        chatBot.setFocusPainted(false);
        chatBot.setContentAreaFilled(false);
        chatBot.setOpaque(false);
        panel.add(chatBot);


		
	
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
	
	
}
