package day01;

public class Operator {

	public static void main(String[] args) {
		// 연산자(Operator)
		// 사칙연산자 (+ - * / %) : () 우선순위
		// 대입연산자 (= += -=)
		// 왼쪽은 반드시 변수여야 함.
		
		int a = 1;
		int b = 2;
		//a = b; // 1은 사라지고 b의 2값이 a로 저장됨.
		// 누적 +=
		a = a + b;  // a += b
		System.out.println(a);
		
		//1씩 증가 : 증감연산자 ++ --
		int c = 0;
		c = c + 1; // c++  c-- 
		
		// 사칙연산자 : + - * / %(나머지)
		// + : 숫자가 아닐 때는 연결연산자 바뀜. 문자 + 숫자 
		System.out.println("숫자 " + (3+5));
		
		// 나누기( / % )
		// 정수 / 정수 = 정수 ( 10 / 3 = 3)
		// 정수 / 실수 = 실수 ( 10 / 3.0 = 3.3333)
		// 실수 / 정수 = 실수
		// 실수 / 실수 = 실수
		
		// 정수 / 0 => 예외발생(Exception)
		// 실수 / 0 => infinity 발생
		
		System.out.println(10/3.0); // ctrl+space
		System.out.println(10.0/0);
		
		// 비교연산자 : 비교연산의 결과는 반드시 true / false
		// >=(이상), <=(이하), >(초과), <(미만), ==(같다), !=(같지않다)
		// 논리연산자 : &&(and), ||(or), !(not)
		// a && b : a조건과 b조건이 모두 참이여야 true
		// a || b : a조건, b조건 중 하나만 참이여도 true
		// !a : a 조건 결과의 반대
		
		System.out.println(3 > 4);
		System.out.println(3 < 4);
		System.out.println(3>4 || 5>6);
		System.out.println(!(3>4));
		
		// 조건선택 연산자 : (조건식) ? true : false
		System.out.println((3<2) ? "3이 더 큽니다." : "3이 더 작습니다.");
		
		System.out.println(11 % 2); // 10을 3으로 나눈 나머지 리턴
		
		/* 문제
		 * num 정수 변수를 선언하고, 값을 입력
		 * 조건 선택 연산자를 사용하여 num 가 짝수인지 홀수인지 출력
		 * */
		int num = 70;
		System.out.println((num % 2==0) ? num+":짝수" : num+":홀수");
		
		boolean result = num % 2==0;
		System.out.println((result) ? num+":짝수" : num+":홀수");
		
		String even = (result) ? num+":짝수" : num+":홀수";
		System.out.println(even);
		
	
	}

}