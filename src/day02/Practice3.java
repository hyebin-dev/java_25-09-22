package day02;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		/* 1. 사용자에게 정수 N을 입력받는다.
		 * 단 6이상 45 이하 그렇지 않으면 잘못된 입력입니다. 출력
		 * 1~n 사이 랜덤 정수 6개 생성
		 * 사용자에게 다시 1~N 정수 6개를 입력 받아 내 번호로 사용
		 * 일치하는 숫자 개수 구하기
		 * 6개 1등, 5개 2등, 4개 3등, 3개 4등, 2개 5등, 1개 꽝
		 * <출력예시>
		 * 점수를 입력하세요: 10
		 * 당첨 번호 : 1 3 5 7 9 
		 * 내 번호를 입력하세요: 3 4 5 6 7 8
		 * 일치 개수 : 3
		 * 결과 : 4
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요.>");
		int num1 = scan.nextInt();
		while(6>num1 || num1>45) {
			System.out.println("번호를 잘못입력하셨습니다");
			System.out.println("정수를 다시 입력하세요.>");
			num1 = scan.nextInt();
		}
		for(int i=1; i<=6; i++) {
//			System.out.print(" "+(int)(Math.random()*num1)+1);
		}

		
			}

	}


