package chap14_3;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonEx  extends JFrame implements ActionListener{
	Button bt;
	JButton bt1 = new JButton("클릭");
//	JLabel lb = new JLabel("여기에");
	ButtonEx(){
		Container c = this.getContentPane();
		bt = new Button("연습",c);
		c.setLayout(null);
		
		bt.setBounds(100,30,80,50);
		bt1.setBounds(200,30,80,50);
//		lb.setBounds(100,200,80,50);
		
		c.add(bt);
//		c.add(lb);
		c.add(bt1);
		bt.addActionListener(this);
		this.setLocation(700,350);
		this.setSize(400,300);
		this.setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		new ButtonEx();
//		Button btn = new Button();
//		
//		btn.setOnclickListener(new CallListener());
//		btn.touch();
//
//		btn.setOnclickListener(new MessageListener());
//		btn.touch();	
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		bt.setOnclickListener(new CallListener());
		bt.touch();
	}
}
