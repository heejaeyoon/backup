package chap18;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Win extends JFrame {
	JButton jb1 = new JButton("새 창");
	JButton jb2 = new JButton("검 색");
	JTextArea ta =  new JTextArea(7, 20);
	JFrame fr1;
	
	Win() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(jb1);
		c.add(jb2);
		c.add(ta);
		this.setSize(700,350);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jb1.setEnabled(false);
				fr1 = new JFrame("새 창");
				JButton bt1 = new JButton("닫기");
				Container c = fr1.getContentPane();
				c.setLayout(new FlowLayout());
				c.add(bt1);
				fr1.setSize(700,350);
				fr1.setLocationRelativeTo(null);
				fr1.setVisible(true);
				bt1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						StudentDao dao = new StudentDao();
						dao.connect();
						List<Student> list = dao.select();
						for(Student stu : list) {
							ta.append(stu.name+"\n");
					
						
						}
					}
				});
			}
		});
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	};
	
	public static void main(String[] args) {
		new Win();
	
	}
}
