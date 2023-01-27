package chap02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Random2 {
	
	public static void main(String[] args) {
		
//		야구게임: 컴퓨터가뽑은임의의숫자(중복X)3개를맞추세요0~9까지
//		컴퓨터가 뽑은 숫자 중 한개의 종류와 위치를 함께 맞추면 스트라이트, 
//		한개의 종류를 맞췄지만 위치가 잘못된 경우는 볼을 선언해서
//		3스트라이크가 나올때까지 반복
//		몇번만에맞췄는지최종기록을출력하세요.
		
		//랜덤과 스캐너 
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		int[] comNum = new int[3]; //컴퓨터가 뽑은 랜덤을 담을 배열
		int[] userNum = new int[3]; // 사용자가 입력한 숫자를 담을 배열
		
		int count = 0; //입력횟수 
		int ball =0;  
		int strike = 0; 
		
		
		System.out.println("★★★★★★야구게임 시작 ★★★★★★");
		
		//컴퓨터의 숫자 
		for(int i=0;i<comNum.length;i++) {
			comNum[i] = r.nextInt(10);
			
			for(int j=0;j<i;j++) {
				if(comNum[i]==comNum[j]) {
					i--;
					break;
				}
			}
		}
		//컴퓨터가 뽑은 숫자 확인
//		System.out.println(Arrays.toString(comNum));
		
		
		System.out.println(" 숫자 세개를 입력하세요 ");
		while(strike<3) { //while문의 조건 
			ball = 0;
			strike = 0;
			
			//유저가 입력한 숫자를 배열에 담기
			for(int i=0; i<userNum.length;i++) {
				System.out.println((i+1)+"번째 숫자");
				userNum[i] = Integer.parseInt(s.nextLine());
			}
			
			//컴퓨터의 숫자와 유저가 입력한 숫자 비교하기
			
			for(int i=0; i<userNum.length;i++) {
				for(int j=0;j<comNum.length;j++) {
					if(userNum[i]==comNum[j] && i==j ) {
						//숫자값과 순서가 같을때
						strike++;
					}else if(userNum[i]==comNum[j] && i!=j){
						ball++;
					}
				} 
			}
			System.out.println(strike + "스트라이트　& " + ball +"볼");
			count++;
		}
	
		System.out.println("플레이횟수 : " + count);
		

	}
}


