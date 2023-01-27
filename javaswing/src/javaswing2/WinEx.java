package javaswing2;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WinEx extends JFrame implements ActionListener {
	JTextField tf = new JTextField();
	JButton jb = new JButton("삭제");
	JTextArea ta = new JTextArea();
	JScrollPane js = new JScrollPane();
	StudentDB stu;
	WinEx() throws ClassNotFoundException, SQLException {
		stu = new StudentDB();
		Container c = this.getContentPane();
		c.setLayout(null);
		tf.setBounds(100, 30, 80, 30);
		c.add(tf);
		jb.setBounds(200, 30, 80, 30);
		c.add(jb);
		ta.setBounds(100, 100, 300, 200);
		c.add(ta);
		setVisible(true);
		setSize(600, 400);
		this.setLocation(500, 300);
		jb.addActionListener(this);
	}
	public static void main(String[] ar) throws ClassNotFoundException, SQLException {
		new WinEx();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			stu.delete(tf.getText());
			String str = stu.selectAll();
			ta.setText(str);
//			System.out.println(str);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}