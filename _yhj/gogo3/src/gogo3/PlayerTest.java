package gogo3;

abstract class Player { //추상 클래스(미완성 클래스, 미완성 설계도)
	abstract void play(int pos); // 추상 메서드(미완성 메서드)
	abstract void stop(); // 추상 메서드(선언부만 있고 구현부{}가 없는 메서드)
}

// 추상 클래스는 상속을 통해 완성해야 객체 생성 가능
abstract class AudioPlayer extends Player{
	void play(int pos) {System.out.println(pos + "위치부터 play 합니다.");}
//	void stop( ) {System.out.println("재생을 멈춥니다.");} 
	// 위의 코드가 주석 처리나 안적었을시 아래처럼 적어주거나 ↓  class 앞에 abstract를 적어준다
//	abstract void stop();    // 그렇게 되면 아래 mian 메서드에 객체 생성을 할 수 없다 
								// why? AudioPlayer 가 미완성 추상 클래스가 되어버려서
	// 추상메서드 (선언부만 있고 구현부 {}가 없는 메서드)
}

public class PlayerTest {
	
	public static void main(String[] args) {
//		Player p = new player(); // 추상 클래스의 객체 생성
//		AudioPlayer ap = new AudioPlayer(); // 아래 코드와 같다
		Player ap = new AudioPlayer(); // 다형성
		ap.play(100);
		ap.stop();
	}
}
