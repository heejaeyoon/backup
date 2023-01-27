package gogo;
import java.util.Scanner;

public class MembershipTest {
public static void main(String[] args) {
	Membership[] customer = new Membership[100];
	Scanner sc = new Scanner(System.in);


	System.out.print("이름:");
	String name = sc.nextLine();

	System.out.print("핸드폰번호:");
	int phoneNumber = sc.nextInt();

	System.out.print("포인트:");
	int point = sc.nextInt();

for(int i = 0; i<100; i++) {
		customer[i]=new Membership(name, phoneNumber, point);
		break;
		}
	



	for(Membership cus: customer) {  //가입하는 창 구현
		if (cus != null) {
			System.out.println(cus.name);
			System.out.println(cus.phoneNumber);
		}

	}


}

}
