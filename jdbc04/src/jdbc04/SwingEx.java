package jdbc04;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx extends JFrame implements ActionListener{
	JButton sel = new JButton("검색");
	JButton del = new JButton("삭제");
	StudentDB stu = new StudentDB();
	
	SwingEx() throws ClassNotFoundException, SQLException {
		stu = new StudentDB();		
		Container con = this.getContentPane();
		sel.setBounds(50,50,80,50);
		del.setBounds(150,50,80,50);
		con.setLayout(null);
		con.add(sel);
		sel.addActionListener(this);
		del.addActionListener(this);
		con.add(del);
		
		this.setVisible(true);
		this.setLocation(300,500);
		this.setSize(400,300);
		
		
		
		
	}
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new SwingEx();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == sel) {
			try {
				stu.selectAll();
			} catch(SQLException e1) {
				e1.printStackTrace();
			}
		} else if(e.getSource() == del) {
			System.out.println("del 버튼 클릭");
		}
	}
}
