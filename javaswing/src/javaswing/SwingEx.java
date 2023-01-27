package javaswing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx extends JFrame 
implements WindowListener, ActionListener {
	
	JButton jb = new JButton("클릭");
//	JFrame jf = new JFrame("Swing 연습");
	public SwingEx() {
		Container cp = this.getContentPane();
		setVisible(true);	
		
		jb.setBounds(10, 10, 80, 50);
		this.add(jb);
		this.setLayout(null);
		this.setSize(100,100);
		this.setSize(400,300);
		this.addWindowListener(this);
		jb.addActionListener(this);
	}
	public static void main(String[] args) {
		new SwingEx();
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("종료");
		System.out.println(0);
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("아이콘!");
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("아이콘 풀림!");
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼 클릭!");
	}
}
