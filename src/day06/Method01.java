package day06;

public class Method01 {
	
	// 메서드 생성 가능 위치
	// 두 정수 주면(매개변수) 합을 리턴하는 메서드
	// 매개변수 : 두정수 (int num1, int num2)
	// 리턴타입 : 합 => int
	// 메서드명 : sum
	// 메서드에서 리턴값을 리턴할 때 쓰는 키워드 : return 값;
	public int sum(int num1, int num2) {
		int hap = num1 + num2;
		return hap;
	}
	
	// 두 정수를 주면 차를 리턴하는 메서드
	// 매개변수 : 두 정수(int num1, int num2)
	// 리턴타입 : 차 => int
	// 메서드명 : sub
	public int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	
	public static void main(String[] args) {  // method = 기능 = 함수 = function
		
		// static 메서드 호출
//		int s = sum(100, 220);
//		System.out.println(s);
		
		// static이 아닌 메서드 호출
		// 1. 클래스를 객체화 => new 키워드
		// 클래스타입 객체명 = new 클래스(생성자);
		Method01 me = new Method01();
		int me2 = me.sum(1000, 2000);
		System.out.println(me2);
		int sub = me.sub(5000, 3200);
		System.out.println(sub);
		
		
		// class : 변수(가지는 요소), 메서드(해야하는 기능)
		// main : 컴파일러가 실행을 위해 가장 먼저 찾는 메서드
		// method 구조
		// 접근제어자 리턴타입 메서드명(매개변수){
		//  구현;
		// }
		/* - 접근제어자 : 접근할 수 있는 주체의 제한범위
		 * - 리턴타입 : 기능이 실행 된 후 반환 값 (반환할 값의 자료형) => 반드시 1개
		 * - void : 리턴할 값이 없음을 의미
		 * - 메서드명 : 소문자로 시작
		 * - 매개변수 : 파라미터 기능을 하기위해서 외부에서 반드시 들어와야하는 값 => 여러개가능
		 * 메서드는 중복이 안됨 (메서드 안에 메서드가 있을 수 없음.)
		 * 메서드 선언 위치
		 * - 클래스 안, 다른 메서드 밖
		 * - 메서드는 독립적 기능.
		 * - 메서드의 순서는 아무 상관이 없음.
		 * - 메서드는 호출되어야만 실행됨.
 		 * */
		

	}
	
	// 메서드 생성 가능 위치

}
