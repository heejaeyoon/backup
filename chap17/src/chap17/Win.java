package chap17;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.time.LocalDateTime;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Win extends JFrame{
	
	Win() {
		JLabel lb = new JLabel("여기");
		JTextField tf = new JTextField("검색",10);
		JButton bt = new JButton("클릭");
		
		Container c = this.getContentPane();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(new FlowLayout());
		
		
		c.add(lb);
		c.add(bt);
		c.add(tf);
		Thread th = new Thread() {
			public void run() {
				for (;;) {
					LocalDateTime now = LocalDateTime.now();
					lb.setText(now.getSecond() + "초");
					}
			};
		};
		th.start();
	
		bt.addActionListener((e123)->{
			
		
			
			
				try {
					int num = Integer.parseInt(tf.getText());
					JOptionPane.showMessageDialog(null, num);
//					return;
//					System.out.println(num);
					if(num>= 100) {
						throw new XXXException("100 이상");
					} else {
						JOptionPane.showMessageDialog(null, num);
					}
						
				} catch (NumberFormatException ev) {
					JOptionPane.showMessageDialog(null, "숫자만 입력!");
//					ev.printStackTrace();
//					System.out.println("숫자만 입력!");
				} catch (XXXException e2) {
					JOptionPane.showMessageDialog(null, e2.getMessage()+"입력 바람");
				} finally {
					JOptionPane.showMessageDialog(null, "끝!");
				}
			
			
		});
		
		
		tf.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				tf.setText(getName());
			}

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		this.setSize(700,500);
		this.setVisible(true);
		this.setLocationRelativeTo(null);

		
	}
	public static void main(String[] args) {
		new Win();
	}
}
