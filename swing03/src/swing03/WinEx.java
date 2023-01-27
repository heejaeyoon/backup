package swing03;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WinEx extends JFrame{
	
	JButton jb1 = new JButton("1");
	JButton jb2 = new JButton("2");
	JButton jb3 = new JButton("3");
	JButton jb4 = new JButton("4");
	JButton jb5 = new JButton("5");
	JButton jb6 = new JButton("6");
	JButton jb7 = new JButton("7");
	JButton jb8 = new JButton("8");
	
	WinEx() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		JPanel jp1 = new JPanel();
		jp1.setLayout(new FlowLayout(FlowLayout.LEFT, 15,15));
		c.add(jp1,BorderLayout.NORTH);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jb4);
		jp1.add(jb5);
		jp1.add(jb6);
		jp1.add(jb7);
		jp1.add(jb8);
		JPanel jp2 = new JPanel();
		jp2.setLayout(new GridLayout(4,2,10,1));
		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		jp2.add(jb6);
		jp2.add(jb7);
		jp2.add(jb8);
		c.add(jp2,BorderLayout.CENTER);
		this.setLocation(700,350);
	 	this.setSize(400,300);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new WinEx();
		
	}
}
