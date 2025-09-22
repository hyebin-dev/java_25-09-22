package day02;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		// Input
		/* 콘솔 입력
		 * console input : 콘솔에서 값을 입력받는 것을 의미
		 * Scanner 클래스 : 객체를 생성시 new 키워드 사용
		 * 클래스타입 객체명 = new 클래스명(값);
		 * 객체명.next() : 한 단어를 입력 (공백포함 안함)
		 * 객체명.nextLine() : 여러단어를 입력 (공백 포함) Enter 인지
		 * 객체명.nextInt() : 정수입력
		 * 객체명.next자료형() : 자료형에 맞는 값을 입력
		 * */
		
		// 워낙 많이 쓰는 클래스라서 new 키워드 없이 생성 가능.
//		String str = "abc"; // 특별한 클래스
//		System.out.println(str);
//		
//		
//		String str2 = new String(); 
//		str2 = "bcd";
//		System.out.println(str2);
		
		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자입력>");
//		int inputNum = scan.nextInt();
//		System.out.println(inputNum+10);
//		
//		System.out.println("문자입력>");
//		String inputStr = scan.next(); // 공백 전까지 입력
//		System.out.println("입력받은문자:"+inputStr);
//		
//		scan.nextLine();  // 버퍼에 남아있는 값을 처리용
//		
//		System.out.println("여러문자입력>");
//		String inputStr2 = scan.nextLine(); // enter 전까지만 인지
//		System.out.println("입력받은문자열:"+inputStr2);
		
		
		// 입력받은수가 짝수인지 홀수인지 판별하세요.
		System.out.println("숫자입력>");
		int num = scan.nextInt();
		String result = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.println(num+"는 "+result);
		
		
	}

}