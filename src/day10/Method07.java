package day10;

public class Method07 {
	
	// 두 정수를 입력받아 두 수의 합을 리턴하는 메서드
	public int sum(int num1, int num2) {
		return num1+num2;
	}
	
	// 3 정수를 입력받아 세수의 합을 리턴하는 메서드
	public int sum(int num1, int num2, int num3) {
		return num1+ num2+num3;
	}
	
	public double sum(double num1, double num2) {
		return num1+num2;
	}
	
	public long sum(long num1, long num2) {
		return num1+num2;
	}

	public static void main(String[] args) {
		/* 메서드 오버로딩
		 * - 동일한 이름의 메서드를 여러개 만드는 케이스
		 * - 오버로딩 조건
		 * 1. 매개변수의 개수가 다르면 가능.
		 * 2. 매개변수의 타입이 다르면 가능.
		 * - 리턴 타입은 상관없음. 매개변수의 이름도 상관없음.
		 * */
		
		Method07 m7 = new Method07();
		System.out.println(m7.sum(10, 10));
		System.out.println(m7.sum(1.5, 3.9));
		System.out.println(m7.sum(10, 20, 30));
		
		

	}

}