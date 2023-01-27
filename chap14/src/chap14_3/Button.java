package chap14_3;

import java.awt.Container;
import java.net.http.WebSocket.Listener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Button extends JButton{
	onClickListner listener;
	JLabel lb = new JLabel("여기에");
	Button(String str,Container c){
		super(str);
		this.setBounds(100,30,80,50);
		lb.setBounds(100,200,80,50);
		c.add(lb);
	}
	
	void setOnclickListener(onClickListner listener) {
		this.listener = listener;
	}

	void touch() {
		lb.setText(listener.onClick());
	}
	interface onClickListner{
		String onClick();
	}
}
