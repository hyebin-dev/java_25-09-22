package day04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 가위바위보 게임
		/*
		 * 컴퓨터와 유저가 가위바위보 게임을 진행 
		 * 가위 = 0, 바위 = 1, 보 = 2 
		 * 컴퓨터도 랜덤으로 0 1 2 중 선택 
		 * ex) com = 0 / me = 0 
		 * com(가위) / me(가위) => 무승부 
		 * com = 0 / me = 2 
		 * com(가위) / me(보) => me 패배!!
		 * 
		 */
		String choice[] = { "가위", "바위", "보" };
		//System.out.println(choice[0]);
		//user 입력값은 0~2 사이의 값만 가능
		Scanner scan = new Scanner(System.in);
		
		System.out.println("가위 바위 보 게임 시작>");
		
		while(true) {
			
			int comNum = (int)(Math.random()*3); //0 1 2
			System.out.println("컴퓨터 결정 완료!!"+ comNum + " "+choice[comNum]);
			
			System.out.println("가위(0) 바위(1) 보(2) 종료(3) 중 선택  >");
			int myNum = scan.nextInt();
			
			//System.out.println("user 결정 완료!!"+ myNum + " "+choice[myNum]);
			if(myNum == 3) {
				System.out.println("종료합니다.");
				break; // 반복문을 벗어나는 구문
			}
			// 승패 비교
			if(myNum <0 || myNum >2) {
				System.out.println("입력오류 입니다.");
				return;  // 메서드 종료 구문
			}
			
			String result="";
			
			if(comNum == myNum) {
				result = "무승부";
			}else {
				if(myNum == 0) { // 가위
					result = (comNum == 2)? "승" : "패";
				}else if(myNum == 1) { //바위
					result = (comNum == 0) ? "승" : "패";
				}else {
					result = (comNum == 1) ? "승" : "패";
				}
			}
			
			// 출력
			System.out.println("Com("+choice[comNum]+") / User("+
					choice[myNum]+") => "+result);
			System.out.println();
		}
		
	}

}