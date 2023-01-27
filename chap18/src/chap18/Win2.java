package chap18;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Win2 extends JFrame{
	JButton jb1 = new JButton("새 창");
	JFrame fr1;
	 
	Win2() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(jb1);
		this.setSize(700,350);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fr1 = new Win3();
				setVisible(true);
			}
		});
		
		
			
		
	};
	
	public static void main(String[] args) {
		new Win2();
	
	}
}

