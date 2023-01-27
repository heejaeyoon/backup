package bus;
import java.awt.*;             // 폰트 등 그래픽 처리를 위한 클래스들의 경로명
import java.awt.event.*;       // 이벤트 처리에 필요한 기본 클래스들의 경로명
import java.sql.SQLException;

import javax.swing.*;          // 스윙 컴포넌트 클래스들 경로명

class MyDialog extends JDialog{
    JLabel comment = new JLabel();
    JTextField pw = new JTextField(10);
    JButton ok = new JButton("ok");
    public MyDialog(마이페이지 frame, String id){
        comment = new JLabel("비밀번호를 입력해주세요");
        add(comment);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        add(pw);
        add(ok);
        setSize(200,100);
        ok.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                String pw = pw.getText();
                데이터 db = new 데이터();
                int n = db.login(id, pw);
                if (n==1){
                    int key = db.login(String id,pw);
                    if (key==1){
                        JOptionPane.showMessageDialog(null, "삭제되었습니다.");
                        setVisible(false);
                        new 로그인화면();
                        //JFrame frames = (JFrame)e.getSource();

                        frame.dispose();  // 화면이 안 닫히는 에러.
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "db오류.");
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "비밀번호 미일치");
                }
            }
        });
    }
}
class Back extends JPanel {
    마이페이지 frame;
    public Back(마이페이지 frame, String id) {
        Color mycor=new Color(189,215,238);
        setBackground(mycor);
        this.frame = frame;

        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 5));

        // 뒤로가기 버튼 이미지
        ImageIcon backIcon = new ImageIcon("../project__java/buspj/image/back.png");
        Image backImg = backIcon.getImage();
        Image backUpdate = backImg.getScaledInstance(100,50, Image.SCALE_SMOOTH);
        ImageIcon backUpdateIcon = new ImageIcon(backUpdate);

        ImageIcon backIcon2 = new ImageIcon("../project__java/buspj/image/back2.png");
        Image backImg2 = backIcon2.getImage();
        Image backUpdate2 = backImg2.getScaledInstance(100,50, Image.SCALE_SMOOTH);
        ImageIcon backUpdateIcon2 = new ImageIcon(backUpdate2);

        JButton back = new JButton(backUpdateIcon);
        back.setPreferredSize(new Dimension(100,50));
        back.setRolloverIcon(backUpdateIcon2); // 버튼에 마우스가 올라갈떄 이미지 변환
        back.setBorderPainted(false); // 버튼 테두리 설정해제
        back.setFocusPainted(false);
        back.setContentAreaFilled(false);
        back.setOpaque(false);
        add(back);

        back.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                new Main(id);
                frame.dispose();
            }
        });
    }
}

class MyNorthPanel extends JPanel {
    마이페이지 frame;

    public MyNorthPanel(마이페이지 frame, String id) {
        Color mycor=new Color(189,215,238);
        setBackground(mycor);
        this.frame = frame;

        setLayout(new BorderLayout());
        add(new Title(), BorderLayout.WEST);
        add(new Back(this.frame, id), BorderLayout.EAST);
    }
}

class MyCenterPanel extends JPanel {
    DB_connect DB = new DB_connect();
    JLabel hi = new JLabel();
    JTextField score = new JTextField(); // 마일리지 네모 칸
    MyDialog dialog;
    마이페이지 frame;
    public MyCenterPanel(마이페이지 frame, String id) {
        setLayout(null);
        this.frame = frame;
        Color bgmycor=new Color(166,222,249);
        setBackground(bgmycor);
        hi = new JLabel(id + " 고객님");
        // 프로필 이미지 삽입
        ImageIcon profile = new ImageIcon("../project__java/buspj/image/profile.png");
        Image img = profile.getImage();
        Image updateImg = img.getScaledInstance(50,50,Image.SCALE_DEFAULT);
        ImageIcon updateIcon = new ImageIcon(updateImg);

        JButton image = new JButton(updateIcon);
        image.setBounds(80,100,100,100);
        image.setHorizontalAlignment(JLabel.CENTER);
        image.setBorderPainted(false); // 버튼 테두리 설정해제
        image.setFocusPainted(false);
        image.setContentAreaFilled(false);
        image.setOpaque(false);
        image.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon easteregg = new ImageIcon("../project__java/buspj/image/winter.jpg");
                Image easteregg_img = easteregg.getImage();
                Image egg = easteregg_img.getScaledInstance(500,500,Image.SCALE_DEFAULT);
                ImageIcon eggimg = new ImageIcon(egg);
                Frame newf = new Frame();
                newf.setLayout(null);
                JLabel ac = new JLabel(eggimg);
                ac.setSize(500,500);
                JButton quit = new JButton("닫기");
                quit.setSize(80,80);
                newf.add(quit);
                newf.add(ac);
                quit.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        newf.dispose();
                    }
                });
                newf.setSize(500,500);
                newf.setVisible(true);
            }
        });
        add(image);

        // 구분 선 삽입
        ImageIcon line = new ImageIcon("../project__java/buspj/image/line.png");
        Image img2 = line.getImage();
        Image updateImg2 = img2.getScaledInstance(350,50,Image.SCALE_DEFAULT);
        ImageIcon updateIcon2 = new ImageIcon(updateImg2);

        JLabel image2 = new JLabel(updateIcon2);
        image2.setBounds(90,160,350,100);
        image2.setHorizontalAlignment(JLabel.CENTER);
        add(image2);

        // 마일리지 내역 삽입
        int usermileage= DB.mileage(id); // 마일리지 받아오기
        JLabel mileage = new JLabel(" 마일리지 :");
        mileage.setBounds(80,210,200,100);
        mileage.setHorizontalAlignment(JLabel.CENTER);
        mileage.setFont(new Font("맑은 고딕", Font.BOLD, 25));
        add(mileage);
        // 마일리지 칸
        JLabel mileages = new JLabel("" + usermileage);
        mileages.setBounds(280,235,100,50);
        mileages.setFont(new Font("맑은 고딕", Font.BOLD, 25));
        add(mileages);

        // 환영 메시지 삽입
        hi.setBounds(190,130,200,50);
        hi.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        add(hi);

        // 세로 선 삽입
        ImageIcon line2 = new ImageIcon("../project__java/buspj/image/line2.png");
        Image img3 = line2.getImage();
        Image updateImg3 = img3.getScaledInstance(50,600,Image.SCALE_DEFAULT);
        ImageIcon updateIcon3 = new ImageIcon(updateImg3);

        JLabel image3 = new JLabel(updateIcon3);
        image3.setBounds(470,40,50,600);
        image3.setHorizontalAlignment(JLabel.CENTER);
        add(image3);

//        // 결재내역
//        JButton paymentHistory = new JButton("결재내역");
//        paymentHistory.setBounds(540, 80, 400, 100);
//        paymentHistory.setFont(new Font("고딕", Font.BOLD, 30));
//        add(paymentHistory);

        // 카드관리
        ImageIcon my = new ImageIcon("../project__java/buspj/image/cardmanagement1.png");
        Image my1 = my.getImage();
        Image remy = my1.getScaledInstance(400,120, Image.SCALE_SMOOTH);
        ImageIcon reUpdateIcon1 = new ImageIcon(remy);
        ImageIcon my2 = new ImageIcon("../project__java/buspj/image/cardmanagement2.png");
        Image my11 = my2.getImage();
        Image remy1 = my11.getScaledInstance(400,120, Image.SCALE_SMOOTH);
        ImageIcon reUpdateIcon2 = new ImageIcon(remy1);
        JButton card = new JButton(reUpdateIcon1);
        card.setBorderPainted(false); // 버튼 테두리 설정해제
        card.setRolloverIcon(reUpdateIcon2); // 버튼에 마우스가 올라갈떄 이미지 변환
        card.setFocusPainted(false);
        card.setContentAreaFilled(false);
        card.setOpaque(false);
        card.setBounds(540, 160, 400, 100);
        //card.setFont(new Font("고딕", Font.BOLD, 30));
        add(card);

        card.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
					new MyCard(id);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });

        // 회원탈퇴
        ImageIcon my3 = new ImageIcon("../project__java/buspj/image/toleave1.png");
        Image my4 = my3.getImage();
        Image remy4 = my4.getScaledInstance(400,120, Image.SCALE_SMOOTH);
        ImageIcon reUpdateIcon4 = new ImageIcon(remy4);
        ImageIcon my5 = new ImageIcon("../project__java/buspj/image/toleave2.png");
        Image my55 = my5.getImage();
        Image remy5 = my55.getScaledInstance(400,120, Image.SCALE_SMOOTH);
        ImageIcon reUpdateIcon5 = new ImageIcon(remy5);

        JButton membershipBye = new JButton(reUpdateIcon4);
        membershipBye.setRolloverIcon(reUpdateIcon5); // 버튼에 마우스가 올라갈떄 이미지 변환
        membershipBye.setBounds(540, 390, 400, 100);
        membershipBye.setBorderPainted(false); // 버튼 테두리 설정해제
        membershipBye.setFocusPainted(false);
        membershipBye.setContentAreaFilled(false);
        membershipBye.setOpaque(false);
        //membershipBye.setFont(new Font("고딕", Font.BOLD, 30));
        add(membershipBye);
        dialog = new MyDialog(this.frame, id);
        membershipBye.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int answer = JOptionPane.showConfirmDialog(null, "탈퇴 하시겠습니까?","회원탈퇴",JOptionPane.YES_NO_OPTION);
                if(answer==0){
                    dialog.setVisible(true);
                    //new login_interface();
                    //frame.dispose();
                }
            }
        });
        setVisible(true);
    }
}
public class my extends JFrame {
    public my(String id) {
        setTitle("버스타슈~");
        setSize(1000,800);
        setResizable(false);
        setLocationRelativeTo(null);  // 프레임을 화면 정중앙에 뜨도록 설정
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        Container mainContainer = getContentPane();
        mainContainer.setLayout(new BorderLayout());

        mainContainer.add(new MyNorthPanel(this, id), BorderLayout.NORTH);
        mainContainer.add(new MyCenterPanel(this, id), BorderLayout.CENTER);

        addWindowListener(new JFrameWindowClosingEventHandler());

        setVisible(true);
    }
}
