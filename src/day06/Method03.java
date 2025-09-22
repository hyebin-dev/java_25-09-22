package day06;

import java.util.Scanner;

public class Method03 {
	// 메서드 정의
	// 기능을 정의하는 역할 (함수)
	// 접근제어자 (public : 누구나 접근가능.) 리턴타입 메서드명(매개변수){
	//  구현;
	// }
	// - 리턴타입 : 기능을 구현 한 후 결과로 반환할 값
	// - 매개변수 : 기능을 구현하기 위해서 외부에서 필요한값을 전달
	// - 메서드명 : 의미있게 소문자로 작성
	
	
	// 두 정수의 합을 리턴하는 메서드
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	// 두 정수의 차를 리턴하는 메서드
	public int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	// 두 정수의 곱을 리턴하는 메서드
	public int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	// 두 정수의 / 을 리턴하는 메서드 (double)
	public double div(int num1, int num2) {
		if(num2 == 0) {
			return -9999999;
		}
		return (double)num1 / num2;
	}
	
	// 두 정수의 % 를 리턴하는 메서드
	public int mod(int num1, int num2) {
		if(num2 == 0) {
			return -9999999;
		}
		return num1 % num2;
	}
	
	// num1, num2, 연산결과, 연산자(String) 값을 매개변수로 받아
	// System.out.println(num1+"+"+num2+"="+sum); 
	// 모양으로 출력하는 메서드를 생성
	// 메서드명 : print
	public void print(int num1, int num2, String op, int result) {
		if(result == -9999999 && (op.equals("/") || op.equals("%"))) {
			System.out.println("0으로 나눌수 없습니다.");
			return;
		}
		System.out.println(num1+op+num2+"="+result);
	}
	
	// 메서드 오버로딩 : 같은 기능을 하는 이름이 같은 메서드를 여러개 정의하는 것.
	// 메서드 오버로딩의 조건 : 매개변수의 타입이 다르거나, 매개변수의 개수가 달라야 함. 
	// result 값이 double일 경우
	public void print(int num1, int num2, String op, double result) {
		if(result == -9999999 && (op.equals("/") || op.equals("%"))) {
			System.out.println("0으로 나눌수 없습니다.");
			return;
		}
		System.out.printf("%d%s%d=%.2f\n",num1,op,num2,result);
	}
	
	

//	public static void main(String[] args) {
//		// + - * / % 기능을 하는 메서드를 생성
//		// main에서 호출 => 출력
//		Method03 m3 = new Method03();
//		
//		// 다른 클래스에서 생성한 메서드 호출
//		Method02 m2 = new Method02();
//		int s = m2.sum(100, 200);
//		System.out.println(s);
//		
//		
//		int num1 = 10, num2 = 0;
//		// 두 수의 + - * / %의 결과를 메서드를 호출하여 출력
//		
//		// + 
//		int sum = m3.sum(num1, num2);
//		System.out.println(sum);
//		// - 
//		int sub = m3.sub(num1, num2);
//		System.out.println(sub);
//		
//		int mul = m3.mul(num1, num2);
//		System.out.println(mul);
//		
//		double div = m3.div(num1, num2);
//		if(div == -9999999) {
//			System.out.println("피연산자는 0일수 없습니다.");
//		}else {
//			System.out.println(div);			
//		}
//		
//		int mod = m3.mod(num1, num2);
//		if(div == -9999999) {
//			System.out.println("피연산자는 0일수 없습니다.");
//		}else {
//			System.out.println(mod);			
//		}
//		
//	}

}