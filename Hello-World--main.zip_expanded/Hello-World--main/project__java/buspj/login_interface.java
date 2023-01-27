package buspj;
import java.awt.*;             // 폰트 등 그래픽 처리를 위한 클래스들의 경로명
import java.awt.event.*;       // 이벤트 처리에 필요한 기본 클래스들의 경로명
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.*;
import javax.swing.JPanel;
import javax.swing.*;          // 스윙 컴포넌트 클래스들 경로명
import javax.imageio.*;

class BoxPanel extends JPanel implements ActionListener {
    //BufferedImage img = null;
    login_interface frame;
    JTextField id = new JTextField();
    JPasswordField pw = new JPasswordField();

    public BoxPanel(login_interface frame) {
        setLayout(null);
        this.frame = frame;

//       JLabel idText = new JLabel("아이디");
//       idText.setBounds(80,50,50,30);
//       add(idText);

        // '아이디' 글자 설정
        id.setBounds(93,70,150,30);
        add(id);

//       JLabel pwText = new JLabel("비밀번호");
//       pwText.setBounds(80,100,50,30);
//       add(pwText);

        // '비밀번호' 글자 설정
        pw.setBounds(93,125,150,30);
        add(pw);

        JLabel question = new JLabel("회원이 아니신가요?");
        question.setBounds(124, 205,100,20);
        question.setFont(new Font("맑은 고딕", Font.BOLD, 10));
        add(question);

        JLabel signinPage = new JLabel("<HTML><U>회원가입</U></HTML>");
        signinPage.setBounds(148, 225, 100, 20);
        signinPage.setFont(new Font("맑은 고딕", Font.BOLD, 10));
        add(signinPage);

        // 메인 버스 이미지
        ImageIcon background = new ImageIcon("project__java/buspj/image/login_bus.png");
        Image img = background.getImage();
        Image updateImg = img.getScaledInstance(330,400,Image.SCALE_DEFAULT);
        ImageIcon updateIcon = new ImageIcon(updateImg);
        JLabel image2 = new JLabel(updateIcon);
        image2.setBounds(-7,-60,350,450);
        add(image2);

        // '확인' 버튼 이미지 삽입
        ImageIcon checkbutton = new ImageIcon("project__java/buspj/image/bus_number1.png");
        Image checkImg = checkbutton.getImage();
        Image checkUpdate = checkImg.getScaledInstance(70,30, Image.SCALE_SMOOTH);
        ImageIcon updateIcon2 = new ImageIcon(checkUpdate);

        ImageIcon checkbutton2 = new ImageIcon("project__java/buspj/image/bus_number2.png");
        Image checkImg2 = checkbutton2.getImage();
        Image checkUpdate2 = checkImg2.getScaledInstance(70,30, Image.SCALE_SMOOTH);
        ImageIcon updateIcon3 = new ImageIcon(checkUpdate2);

        JButton check = new JButton(updateIcon2);
        check.setBounds(141,323,70,30);
        check.setFocusPainted(false);
        check.setContentAreaFilled(false);
        check.setRolloverIcon(updateIcon3); // 버튼에 마우스가 올라갈떄 이미지 변환
        check.setBorderPainted(false); // 버튼 테두리 설정해제
        image2.add(check);

        ImageIcon right1 = new ImageIcon("project__java/buspj/image/light1.png");
        Image right11 = right1.getImage();
        Image right111 = right11.getScaledInstance(70,40, Image.SCALE_SMOOTH);
        ImageIcon right1111 = new ImageIcon(right111);

        ImageIcon right2 = new ImageIcon("project__java/buspj/image/light2.png");
        Image right22 = right2.getImage();
        Image right222= right22.getScaledInstance(70,40, Image.SCALE_SMOOTH);
        ImageIcon right2222 = new ImageIcon(right222);

        JButton right1_btn = new JButton(right1111);
        JButton right2_btn = new JButton(right1111);
        right1_btn.setFocusPainted(false);
        right1_btn.setContentAreaFilled(false);
        right1_btn.setRolloverIcon(right2222); // 버튼에 마우스가 올라갈떄 이미지 변환
        right1_btn.setBorderPainted(false); // 버튼 테두리 설정해제
        image2.add(right1_btn);

        right2_btn.setFocusPainted(false);
        right2_btn.setContentAreaFilled(false);
        right2_btn.setRolloverIcon(right2222); // 버튼에 마우스가 올라갈떄 이미지 변환
        right2_btn.setBorderPainted(false); // 버튼 테두리 설정해제
        image2.add(right2_btn);
        right1_btn.setBounds(230,280,80,35);
        right2_btn.setBounds(40,280,80,35);

        check.addActionListener(this);

        // 회원가입 글자 클릭 시 이벤트
        signinPage.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                new join_interface();
                frame.dispose();
            }
        });
    }

    // '확인' 버튼 클릭시
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        String idt = id.getText();
        String pwt = pw.getText();
        DB_connect DB = new DB_connect(); // DB 객체 불러오기
        if (button.getText().equals("")) {
            if (id.getText().equals("") && pw.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "아이디와 비밀번호를 입력하세요.");
            }
            else if (id.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "아이디를 입력하세요.");
            }
            else if (pw.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "비밀번호를 입력하세요.");
            }
            else {
                int value = DB.login(idt, pwt);
                System.out.println(value);
                if(value == 1){
                    JOptionPane.showMessageDialog(null, "로그인 성공");
                    new Main(idt);
                    this.frame.dispose();
                }
                else if(value == 2){
                    JOptionPane.showMessageDialog(null, "관리자 로그인 성공");
                    new AdministratorMain();
                    this.frame.dispose();
                }
                else if(value == -1){
                    JOptionPane.showMessageDialog(null, "일치하는 아이디가 없습니다.");
                }
                else if(value == 0){
                    JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.");
                }
                else{
                    JOptionPane.showMessageDialog(null, "시스템 오류");
                }
            }
        }
    }
}

class JFrameWindowClosingEventHandler extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        JFrame frame = (JFrame)e.getWindow();

        if (frame instanceof login_interface) {
            int answer = JOptionPane.showConfirmDialog(null, "종료하시겠습니까?","System", JOptionPane.YES_NO_OPTION);
            if (answer == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
        else if (frame instanceof join_interface) {  // 회원가입 창의 X 단추를 누른 경우
            new login_interface(); // 회원가입 창이 꺼지고 로그인 창이 켜져야 하는데 씹힘
            frame.dispose();
        }
        else if (frame instanceof Main || frame instanceof MyPage || frame instanceof AdministratorMain ||
                frame instanceof ReservationMain || frame instanceof SeatsSelect || frame instanceof Payment) {
            int answer = JOptionPane.showConfirmDialog(null, "로그아웃 하시겠습니까?","로그아웃",JOptionPane.YES_NO_OPTION);
            if (answer == JOptionPane.YES_OPTION) {
                new login_interface();
                frame.dispose();
            }
        }
    }
}

public class login_interface extends JFrame {
    public login_interface() {
        setTitle("버스타슈~");
        setResizable(false);
        setSize(350,400);
        setLocationRelativeTo(null);  // 프레임을 화면 정중앙에 뜨도록 설정
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        Container mainContainer = getContentPane();

        mainContainer.setLayout(new BorderLayout());

        mainContainer.add(new BoxPanel(this), BorderLayout.CENTER);

        addWindowListener(new JFrameWindowClosingEventHandler());

        setVisible(true);
    }
    public static void main(String[] args) {
        new login_interface();
        System.out.println("종료");
    }
}