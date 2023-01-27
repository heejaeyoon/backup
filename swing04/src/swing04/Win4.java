package swing04;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Win4 extends JFrame {
	int num;
	class Listener implements ActionListener {
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("클릭!" + num);
		}
		
	}
	JButton jb = new JButton("클릭");
	Win4() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(null);
		jb.setBounds(100,30,80,40);
		jb.addActionListener(new Listener());
		c.add(jb);
		num = 10;
		this.setLocation(700,350);
		this.setSize(400,300);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Win4();
	}
}

