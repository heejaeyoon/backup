package chap02;




public class TestEx {

	public static void main(String[] args) {
	boolean run = true;
		
		Test bank = new Test();
		
		
		
		while (run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.현재 체중 | 2.감량해야하는 체중 | 3.목표 체중 | 4.목표 달성");
			System.out.println("---------------------------------------------------");
			System.out.println("선택> ");
			
			
			int num = bank.ab.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("현제 체중>");
				bank.balance += bank.ab.nextInt();
				break;
			case 2:
				System.out.println("감량해야하는 체중>");
				bank.balance -= bank.ab.nextInt();;
				break;
			case 3:
				System.out.println("목표 체중>");
				System.out.println(bank.balance);
				break;
			case 4:
				run = false;
				break;
			}
			
			System.out.println();
		}
		
		System.out.println("프로그램 종료");
	}

}
