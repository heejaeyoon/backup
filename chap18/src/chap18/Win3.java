package chap18;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Win3 extends JFrame{
	JButton jb1 = new JButton("새 창");
	JFrame fr1;
	 
	Win3(JFrame jf) {
		fr1 = jf;
		this.setTitle("새창");
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(jb1);
		this.setSize(700,350);
		this.setLocationRelativeTo(null);
		this.setVisible(false);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
	}
	public static void main(String[] args) {
		new Win3();
	
		}
	}
