import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JLabel;

public class Gui {

	private JFrame frame;
	private JTextField txid;
	private JPasswordField txpw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
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
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 373, 244);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		JPanel welcom = new JPanel();
		welcom.setBounds(0, 0, 357, 205);
		frame.getContentPane().add(welcom);
		welcom.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(52, 47, 57, 15);
		welcom.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setBounds(52, 90, 57, 15);
		welcom.add(lblNewLabel_1);
		
		JButton loginbtn = new JButton("로그인");
		loginbtn.setBounds(52, 153, 97, 23);
		welcom.add(loginbtn);
		
		loginbtn.addActionListener(new ActionListener() {
			JoinFrame join = new JoinFrame();
			@Override
			public void actionPerformed(ActionEvent e) {
				if(txid.getText().equals("희재") && Arrays.equals(txpw.getPassword(),"1234".toCharArray())) {
					System.out.println("로그인");
					welcom.setVisible(false);
					frame.dispose();
					join.sign();
				} 
//				System.out.println(txid.getText());
//				System.out.println(txpw.getText());
			}
		});
		
		JButton signbtn = new JButton("회원가입");
		signbtn.setBounds(221, 153, 97, 23);
		welcom.add(signbtn);
		
		
		
		txid = new JTextField();
		txid.setBounds(202, 44, 116, 21);
		welcom.add(txid);
		txid.setColumns(10);
		
		txpw = new JPasswordField();
		txpw.setBounds(202, 86, 116, 23);
		welcom.add(txpw);
		
	}	
		
		
}
