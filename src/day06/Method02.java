package day06;

public class Method02 {
	
	//메서드 생성 위치
	/* 두 정수가 주어지면 두 수의 합을 리턴하는 메서드
	 * 매개변수 : 두정수 int num1, int num2
	 * 리턴타입 : int
	 * */
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	
	/* 두 정수가 주어지면 두수의 합을 출력하는 메서드
	 * 매개변수 : 두정수 int num1, int num2
	 * 리턴타입 : void
	 * */
	public void sum2(int num1, int num2) {
		// 메서드 내부에서 다른 메서드를 호출할 수 있음.
		int sum = sum(10,20);
		System.out.println(sum + num1+num2);
	}
	
	/* 매개변수가 없는 케이스 / 리턴타입도 없음. void
	 * 합을 출력
	 * */
	public void sum3() {
		int num1 = 20;
		int num2 = 30;
		System.out.println(num1 + num2);
	}
	/* 매개변수가 없는 케이스 / 리턴타입은 있는 케이스
	 * */
	public int sum4() {
		int num1 = 20;
		int num2 = 30;
		return num1 + num2;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method02 m2 = new Method02();
		int h = m2.sum(10, 20);
		System.out.println(h);
		m2.sum2(100, 200);
		
		m2.sum3();
		int s4 = m2.sum4();
		System.out.println(s4);

	}

}