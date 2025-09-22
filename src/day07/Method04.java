package day07;

public class Method04 {
	
	// 정수 하나를 매개변수 입력받아 (2~9까지의 숫자)
	// 해당 정수의 구구단을 출력하는 메서드
	// 리턴타입 : void
	// 매개변수 : 정수 1개 (int num)
	// 메서드명 : multi
	public void multi(int num) {
		// 1~9까지 반복해서 곱셈 출력
		for(int i=1; i<=9; i++) {
			System.out.println(num+"*"+i+"="+(num * i));
		}
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method04 m4 = new Method04();
		m4.multi(9);
		
		System.out.println("-----------");
		
		for(int i=2; i<=9; i++) {
			System.out.println("--"+i+"단--");
			m4.multi(i);
		}
		
		
		
		

	}

}