package swing04;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Win5 extends JFrame{
	int num;
	JButton jb = new JButton("클릭");
	Win5() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(null);
		jb.setBounds(100,30,80,40);
		num = 10;
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("클릭!!"+ num);
			}
		});
		c.add(jb);
		this.setLocation(700,350);
		this.setSize(400,300);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Win5();
	}
}

