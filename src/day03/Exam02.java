package day03;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// up/down 게임
		/* 1~50까지의 랜덤수 하나를 생성
		 * 유저가 맞추는 게임
		 * ex) 컴퓨터가 랜덤수를 생성했습니다. 23
		 * 입력> 20 up!
		 * 입력> 30 down!
		 * 입력> 25 down!
		 * 입력> 23 정답!!  종료
		 * 
		 * 랜덤수 > 유저수  up!!
		 * 랜덤수 < 유저수  down!!
		 * 랜덤수 = 유저수  정답!!
		 * */
		
		Scanner scan = new Scanner(System.in);
		// 5회 안에 맞춰야 함.
		// 5회가 넘어가면 횟수제한 실패!
		
		int random = (int)(Math.random()*50)+1;
		System.out.println("컴퓨터가 랜덤수를 생성하였습니다.");
		int count=0;
		
		while(true) {
			System.out.println("입력>");
			int num = scan.nextInt();
			count++;
			if(random == num) {
				System.out.println("정답!!");
				break;
			}
			
			if(count == 5) {
				System.out.println("횟수제한 실패!!");
				break;
			}
			
			if(random > num) {
				System.out.println("UP!!");
			}else {
				System.out.println("DOWN!!");
			}
		}
		
	}

}
