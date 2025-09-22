package day07;

public class Method05 {
	
	// 두 정수를 입력받아, 최대공약수를 리턴하는 메서드
	/* 리턴타입: 최대공약수 => int
	 * 매개변수: 두 정수 => int num1, int num2
	 * 메서드명: gcd
	 * */
	public int gcd(int num1, int num2) {
		int result=0;
		for(int i=1; i<=num2; i++) {
			if(num1 % i ==0 && num2 % i ==0) {
				result = i;
			}
		}
		return result;
	}
	
	// 두 정수를 입력받아, 최소공배수를 리턴하는 메서드
	/* 리턴타입: 최소공배수 => int
	 * 매개변수: 두정수 => int num1, int num2
	 * 메서드명: lcm
	 * */
	public int lcm(int num1, int num2) {
//		int result = 0;
		for(int i=num1; ; i=i+num1) {
			if(i % num1 == 0 && i % num2 == 0) {
				return i;
//				result = i;
//				break;
			}
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1= 16;
		int num2 = 20;
		Method05 m5 = new Method05();
		
		//최대공약수
		int gcd = m5.gcd(num1, num2);
		System.out.println(gcd);
		
		//최소공배수
		int lcm = m5.lcm(num1, num2);
		System.out.println(lcm);
		
	}

}
