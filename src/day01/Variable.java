package day01;

public class Variable {

	public static void main(String[] args) {
		// 변수(Variable)
		/* 타입 변수명;  선언 후 사용
		 * 선언 + 초기값 
		 * int num = 0;
		 * 중복선언 불가능
		 * 같은 타입일 경우 동시 선언 가능.
		 * 초기값은 각자 지정
		 * 
		 * 기본 데이터 타입은 초기화 해야 사용가능.
		 * = (대입연산자) : 오른쪽의 값을 왼쪽의 변수에 저장(덮어쓰기)
		 * 왼쪽의 값은 반드시 변수여야만 함.
		 * */
		int num;
//		int num = 0; //중복선언 안됨.
		int num1=100, num2=0, num3=0;
		num = 0;  // = (대입연산자)
		num1 = 100;
		
		// char : 아스키 코드(유니코드) 표에 따른 한글자만 저장 가능. ''
		// String : 문자열 표현 클래스
		char ch = '가';
		System.out.println(ch);
		System.out.println((int)ch); //char -> int로 형변환
		
		// double
		double dou = 3.1;
		System.out.println(dou);
		
		// byte 
		byte b = 1;
		System.out.println(b);
		
		// boolean
		boolean boo = true;  // true /false 만 저장가능.
		System.out.println(boo);
		
		// float / long  접미사 붙여야 함.
		// float(f F) / long(l L)
		float f = 1.2f;
		System.out.println(f);
		
		long l = 1L;
		System.out.println(l);
		
		num1 = 020; // 8진법으로 인식(0~7 10 =>8)
		System.out.println(num1);
		
		num2 = 0x10; //16진법으로 인식 (0~9ABCDEF)
		System.out.println(num2);
		
		// 지역변수의 범위(scope) { }
		
		{
			int a = 100;
			System.out.println(a);
		}
		
			int a = 200;
			System.out.println(a);

	}
	
}