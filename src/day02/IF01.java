package day02;

import java.util.Scanner;

public class IF01 {

	public static void main(String[] args) {
		// 조건문 : IF, Switch
		// if(조건식) { true일 때 실행; }
		// 실행문이 한줄이면 중괄호 생략 가능.
		// 실행문이 두 줄 이상이면 반드시 중괄호 있어야 함.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자입력>");
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num+"는 짝수");
		}else {
			System.out.println(num+"는 홀수");
		}
		
		if(num == 0) {
			System.out.println(num+"는 0");
		}else if(num % 2 == 0){
			System.out.println(num+"는 짝수");
		}else {
			System.out.println(num+"는 홀수");
		}
		
		// 나이를 입력받아 어린이(13세까지) / 청소년(19세까지) / 성인
		
		System.out.println("나이를 입력해주세요>");
		int age = scan.nextInt();
		if(age <= 13) {
			System.out.println("어린이입니다.");
		} else if(age <=19) {
			System.out.println("청소년입니다.");
		}else {
			System.out.println("성인입니다.");
		}
		
	}

}