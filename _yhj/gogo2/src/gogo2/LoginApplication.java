package gogo2;

import java.util.Scanner;

public class LoginApplication {
	private static int usernum = 0;
	private static User user[] = new User[10];
	private static Scanner scanner = new Scanner(System.in);
	private static String inputId, inputPassword, inputNickname;

	public static void start(String[] args) {
		for (int i = 0; i < 10; i++) {
			user[i] = new User();
			user[7] = new User("홍길동", "01011111111", "허수아비", "1000");
			user[8] = new User("윤희재", "01012341234", "맛집 사냥꾼", "3500");
			user[9] = new User("방현수", "01011112222", "맛집 킬러", "7600");
		} // NullpointerException방지 배열 초기화

		boolean run = true;

		while (run) {
			System.out.println("1.포인트 적립");
			System.out.println("2.회원가입");
			System.out.println("3.관리자모드");
			System.out.println("4.회원탈퇴");
			System.out.println("5.종료");
			System.out.print("선택 > ");

			int select = scanner.nextInt();
			if (select == 2) { // 회원가입 선택
				if (usernum == 10) {
					System.out.println("용량 초과 회원가입 실패");
					break;
				} else
					createAccount();
			} else if (select == 1) { // 로그인 선택
				loginAccount();
			} else if (select == 3) { // 사용자조회 선택
				lookAccount();
			} else if (select == 4) { // 탈퇴 선택
				deleteAccount();
			} else if (select == 5) { // 종료 선택
				System.out.println("프로그램 종료");
				run = false;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

	private static void createAccount() { // 회원가입 선택
		System.out.print("이름을 입력하세요 : ");
		inputId = scanner.next();
		user[usernum].setId(inputId);
		System.out.print("전화번호를 입력하세요 : ");
		inputPassword = scanner.next();
		user[usernum].setPassword(inputPassword);
		System.out.print("닉네임을 입력하세요 : ");
		inputNickname = scanner.next();
		user[usernum].setNickname(inputNickname);

		usernum++;
	}

	private static void loginAccount() { // 로그인 선택
		System.out.println("포인트를 적립하려면 로그인을 해주세요.");
		System.out.println("이름 : ");
		inputId = scanner.next();
		System.out.println("전화번호 : ");
		inputPassword = scanner.next();

		int loginSuccess = 0;
		for (int i = 0; i < user.length; i++) {
			if (inputId.equals(user[i].getId()) && inputPassword.equals(user[i].getPassword())) {
				System.out.println("포인트 적립 성공");

//            System.out.println(user[i].getId() + " " + user[i].getNickname()+" "+user[i].getPoint());
				System.out.println("이름 :" + user[i].getId());
				System.out.println("닉네임 :" + user[i].getNickname());
				System.out.println("적립금 :" + 10000);
				loginSuccess = 1;
				break;
			}
		}
		if (loginSuccess == 0)
			System.out.println("로그인 실패");
	}

	private static void lookAccount() { // 사용자조회 선택
		for (User users : user) {
			if (users.getNickname() != null)
				System.out.println(users.getNickname());
		}
	}

	private static void deleteAccount() { // 탈퇴 선택
		System.out.print("아이디를 입력하세요 : ");
		inputId = scanner.next();
		System.out.print("비밀번호를 입력하세요 : ");
		inputPassword = scanner.next();
		int deleteSuccess = 0;
		for (int i = 0; i < user.length; i++) {
			if (inputId.equals(user[i].getId()) && inputPassword.equals(user[i].getPassword())) {
				System.out.println("탈퇴 성공");
				user[i].setId(null);
				user[i].setPassword(null);
				user[i].setNickname(null);
				deleteSuccess = 1;
			}
		}
		if (deleteSuccess == 0)
			System.out.println("일치하는 정보 없음");
	}
}