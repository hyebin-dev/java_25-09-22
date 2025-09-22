package day03;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		// do~while();
		// 실행문을 먼저 실행하고, 조건식을 나중에 비교하는 구문
		/* 한글자를 입력받아 그 한글자를 출력
			char     scan.next().charAt(0)
			'y'면 종료
		 * */
		Scanner scan = new Scanner(System.in);
		char ch;
		do {
			System.out.println("한글자 입력>");
			ch = scan.next().charAt(0);
			System.out.println(ch);
			
		}while(ch != 'y');
		
		System.out.println("종료");
		
		
	}

}