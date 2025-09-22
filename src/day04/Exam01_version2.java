package day04;

import java.util.Scanner;

public class Exam01_version2 {

	public static void main(String[] args) {
		// 가위바위보 게임
		/* 컴퓨터와 유저가 가위바위보 게임을 진행
		 * 가위 = 0, 바위 = 1, 보 = 2 
		 * 컴퓨터도 랜덤으로 0 1 2 중 선택
		 * ex)
		 * com = 0 / me = 0
		 * com(가위) / me(가위) => 무승부
		 * com = 0  / me = 2
		 * com(가위) / me(보) => me 패배..
		 * 
		 */
		

        
		String choice[] = { "가위", "바위", "보" };
		
		System.out.println("가위 바위 보 게임 시작>");
		int comNum = (int)(Math.random()*3);
		System.out.println("컴퓨터 결정 완료!!"+comNum+" "+choice[comNum]);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("가위(0) 바위(1) 보(2) 중 선택>");
		int myNum = scan.nextInt();
		
		System.out.println("user 결정 완료!!"+myNum+" "+choice[myNum]);


	}

}
