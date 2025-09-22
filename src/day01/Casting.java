package day01;

public class Casting {

	public static void main(String[] args) {
		// 자료형변환 : casting
		/* 양쪽 변의 자료형이 맞지 않다면 오류
		 * a = b;
		 * 자료형의 변환을 주어서 자료형을 맞추는 역할
		 * 자동 자료형 변환 : auto casting
		 * byte < short < char < int < long 
		 * float < double
		 * 
		 * 명시적 자료형 변환 : 리터럴 값 앞에 (타입)
		 * */
		
		byte a = 10;
		short sh = a; // 자동형변환 가능
		
		int in = 1;
		a = (byte)in; // 명시적 형 변환
		System.out.println(a);
		
		double num = 3.1;
		int num1 = (int)num; // 소수점을 날림.
		System.out.println(num1);
		
		// 문자를 숫자로 String
		String str = "1234";
		int strNum = Integer.parseInt(str);
		System.out.println(strNum + 10);
		System.out.println(str + 10);
		
		// 숫자를 문자로
		int numstr = 1234;
		String numStr2 = String.valueOf(numstr);
		System.out.println(numstr+10);
		System.out.println(numStr2+10);
		
	}

}