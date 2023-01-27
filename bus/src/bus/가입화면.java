package bus;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JTextField;

import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;
import com.mysql.cj.xdevapi.AddResultBuilder;

import javax.crypto.BadPaddingException;
import javax.sound.midi.Soundbank;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class 가입화면 {
	데이터 db = new 데이터();
	private JFrame fr;
	private JTextField name;
	private JTextField phone;
	private JTextField email;
	private JTextField idcheck;
	private JPasswordField pw;
	private JPasswordField pwcheck;
	int find = 1;
//	public static void mian(String[] agr) {

//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					SignUp window = new SignUp();
//					window.fr.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	public 가입화면() {
		initialize();
	}

	private void initialize() {

		fr = new JFrame();

		fr.getContentPane().setLayout(null);
		fr.setSize(400, 477);
		fr.setLocationRelativeTo(null);
		fr.setResizable(false);
//		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setVisible(true);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 384, 438);
		fr.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("회원 가입");
		lblNewLabel.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 24));
		lblNewLabel.setBounds(133, 0, 104, 44);
		panel.add(lblNewLabel);

		JLabel Name = new JLabel("이름");
		Name.setFont(new Font("굴림", Font.PLAIN, 15));
		Name.setBounds(51, 50, 47, 29);
		panel.add(Name);

		name = new JTextField();
		name.setBounds(215, 50, 144, 29);
		panel.add(name);
		name.setColumns(10);

		JLabel Phone = new JLabel("전화번호");
		Phone.setFont(new Font("굴림", Font.PLAIN, 15));
		Phone.setBounds(51, 100, 104, 29);
		panel.add(Phone);

		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(215, 100, 144, 29);
		panel.add(phone);

		JLabel Email = new JLabel("이메일");
		Email.setFont(new Font("굴림", Font.PLAIN, 15));
		Email.setBounds(51, 150, 104, 29);
		panel.add(Email);

		email = new JTextField();
		email.setColumns(10);
		email.setBounds(215, 150, 144, 29);
		panel.add(email);

		JLabel Id = new JLabel("아이디");
		Id.setFont(new Font("굴림", Font.PLAIN, 15));
		Id.setBounds(51, 200, 47, 29);
		panel.add(Id);

		idcheck = new JTextField();
		idcheck.setColumns(10);
		idcheck.setBounds(215, 200, 144, 29);
		panel.add(idcheck);

		JLabel Pw = new JLabel("비밀 번호");
		Pw.setFont(new Font("굴림", Font.PLAIN, 15));
		Pw.setBounds(51, 250, 84, 29);
		panel.add(Pw);

		JLabel PwCheck = new JLabel("비밀 번호 확인");
		PwCheck.setFont(new Font("굴림", Font.PLAIN, 15));
		PwCheck.setBounds(51, 300, 104, 29);
		panel.add(PwCheck);

		pw = new JPasswordField();
		pw.setBounds(215, 250, 144, 29);
		panel.add(pw);

		pwcheck = new JPasswordField();
		pwcheck.setBounds(215, 300, 144, 29);
		panel.add(pwcheck);

		JButton SubmitBtn = new JButton("");
		SubmitBtn.setIcon(new ImageIcon(가입화면.class.getResource("/image/registered1.png")));
		SubmitBtn.setPressedIcon(new ImageIcon(가입화면.class.getResource("/image/registered2.png")));
		SubmitBtn.setBounds(64, 350, 91, 49);

		panel.add(SubmitBtn);

		SubmitBtn.addActionListener(new ActionListener() {
			// 회원가입 액션
			@Override

			public void actionPerformed(ActionEvent e) {
				if (find == 1) {
					System.out.println("중복체크를 확인해주세요!");
					JOptionPane.showMessageDialog(fr, "중복체크를 확인해주세요!");
					
					return;

				}
				String txtname = name.getText();
				String txtphone = phone.getText();
				String txtemail = email.getText();
				String txtid = idcheck.getText();
				String txtpw = pw.getText();
				String txtpwcheck = pwcheck.getText();

				try {

					if (txtid.equals("")) {
						JOptionPane.showMessageDialog(fr, "아이디를 입력하셔야 합니다.");
					} else if (txtpw.equals("")) {
						JOptionPane.showMessageDialog(fr, "비밀번호를 입력하셔야 합니다.");
						JOptionPane.showMessageDialog(fr, "비밀번호 확인을 입력하셔야 합니다.");
					} else if (txtemail.equals("")) {
						JOptionPane.showMessageDialog(fr, "이메일을 입력하셔야 합니다.");
					} else if (txtphone.equals("")) {
						JOptionPane.showMessageDialog(fr, "전화번호를 입력하셔야 합니다.");
					} else if (txtname.equals("")) {
						JOptionPane.showMessageDialog(fr, "이름을 입력하셔야 합니다.");
					} else if (!(txtpw.equals(txtpwcheck))) {
						JOptionPane.showMessageDialog(fr, "비밀번호가 다릅니다.");
					} else {
						int result = db.insert(name.getText(), phone.getText(), email.getText(), idcheck.getText(),
								pw.getText(), pwcheck.getText());

						JOptionPane.showMessageDialog(null, "가입 완료");
						find=1;
						로그인화면.main(null);
						fr.dispose();

					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});

		JButton CancleBtn = new JButton("");
		CancleBtn.setIcon(new ImageIcon(가입화면.class.getResource("/image/close1.png")));
		CancleBtn.setPressedIcon(new ImageIcon(가입화면.class.getResource("/image/close2.png")));
		CancleBtn.setBounds(228, 350, 91, 49);
		panel.add(CancleBtn);

		CancleBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				로그인화면.main(null);
				fr.dispose();
			}
		});

		JButton chbtn = new JButton("");
		chbtn.setIcon(new ImageIcon(가입화면.class.getResource("/image/overlap1.png")));
		chbtn.setPressedIcon(new ImageIcon(가입화면.class.getResource("/image/overlap2.png")));
		chbtn.setBounds(100, 195, 65, 35);
		panel.add(chbtn);

		chbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String txtid = idcheck.getText();
				int result = db.findExistID(idcheck.getText());
				if (txtid.equals("")) {
					JOptionPane.showMessageDialog(null, "아이디를 입력하셔야 합니다.");
				} else if (result == 0) {
					JOptionPane.showMessageDialog(null, "사용 가능");
					idcheck.setEditable(false);
					find = 0;
				} else if (result == 1) {
					JOptionPane.showMessageDialog(null, "사용중인 아이디");
				}
			}
		});

	}

}

// 회원 가입 첫번쨰 도전============================
//	String txtname = name.getText();
//	String txtphone = phone.getText();
//	String txtemail = email.getText();
//	String txtid = id.getText();
//	String txtpw = pw.getText();
//String txtpwcheck = pwcheck.getText();
//
//	try
//	{
//		int result = db.insert(txtname, txtphone, txtemail, txtid, txtpw, txtpwcheck);
//		if (result != 0) {
//			JOptionPane.showMessageDialog(fr, "회원가입 성공");
//		} else {
//			JOptionPane.showMessageDialog(fr, "회원가입 실패");
//
//		}
//	}catch(
//	SQLException e2)
//	{
//		e2.printStackTrace();
//
//	}
//}});
