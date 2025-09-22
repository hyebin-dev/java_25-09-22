package day02;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 카페에 제출
		/* 정수 2개와 연산자 1개를 입력받아 두 정수를 연산결과를 출력
		 * + - * / % 다른 종류의 특수문자가 들어오면 잘못된 연산자로 출력
		 * 
		 * ex) 2 3 + => 2+3=5
		 * ex) 3 2 - => 3-2=1
		 * ex) 3 2 ! => 잘못된 연산자
		 * ex) 2 0 + => 2+0=2
		 * ex) 2 0 / => 0으로 나눌수 없습니다. / % => 피연산자가 0일수 없음.
		 * 
		 * String 클래스는 == 로 비교할 수 없음.
		 * equals(값)  return boolean
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 2개와 연산자를 순서대로 입력> (2 3 +)");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		String op = scan.next();
		
		char ch = scan.next().charAt(0); // '+'
		
		switch(ch) {
		case '+': System.out.println(""+num1+ch+num2+"="+(num1+num2));
		break;
		}
		
//		switch(op) {
//		case "+" : 
//			System.out.println(num1+op+num2+"="+(num1+num2));
//			break;
//		case "-" : 
//			System.out.println(num1+op+num2+"="+(num1-num2));
//			break;
//		case "*" : 
//			System.out.println(num1+op+num2+"="+(num1*num2));
//			break;
//		case "/" :
//			if(num2 == 0) {
//				System.out.println("0으로 나눌수 없습니다.");
//			}else {
//				System.out.println(num1+op+num2+"="+((double)num1/num2));				
//			}
//			break;
//		case "%" : 
//			if(num2 == 0) {
//				System.out.println("0으로 나눌수 없습니다.");
//			}else {
//				System.out.println(num1+op+num2+"="+(num1%num2));				
//			}
//			break;
//			default:
//				System.out.println("잘못된 연산자입니다.");
//		}
		
		
		System.out.println("-------------------------");
		//미리 0으로 나눌수 없는 부분을 빼기
		// char ==로 비교 가능.  String 은 equals() 메서드로 같은지 확인가능.
		if((ch == '/' || ch == '%') && num2 == 0 ) {
			
		}
		
		if((op.equals("/") || op.equals("%")) && num2==0) {
			System.out.println("0으로 나눌수 없습니다.");
		}else {
			switch(op) {
			case "+" : 
				System.out.println(num1+op+num2+"="+(num1+num2));
				break;
			case "-" : 
				System.out.println(num1+op+num2+"="+(num1-num2));
				break;
			case "*" : 
				System.out.println(num1+op+num2+"="+(num1*num2));
				break;
			case "/" :
				System.out.println(num1+op+num2+"="+((double)num1/num2));				
				break;
			case "%" : 
				System.out.println(num1+op+num2+"="+(num1%num2));				
				break;
				default:
					System.out.println("잘못된 연산자입니다.");
			}
			
		}
		
		
	}

}