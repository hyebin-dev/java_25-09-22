package day02;

public class For01 {

	public static void main(String[] args) {
		// 반복문 : 규칙적인 작업을 반복적으로 할 대 사용하는 문법
		/* for, while, do~while
		 * - for, while 동작 방식이 같음.
		 * => 조건에 맞지 않으면 한번도 실행되지 않을 수 도 있음.
		 * - do~while
		 * => 조건에 맞지 않아도 무조건 1번은 실행함.
		 * 
		 * - 조건식에 맞으면 실행
		 * for(1초기화; 258조건식; 47증감식){
		 * 	36실행문;
		 * }
		 * - 초기화 : 실행문을 반복하기위한 변수를 초기화, 처음 한번만 실행 => 생략가능
		 * - 조건식 : 반복을 결정하는 식 (true => 반복) => 생략가능
		 * - 증감식 : 조건식에서 사용할 변수를 증가 / 감소시켜 반복횟수를 조절 => 생략가능
		 * */
//		int i=0; 
//		for(i=0; i<10; i++) {
//			System.out.println("Hello~!!");
//			System.out.println(i);
//		}
//		System.out.println(i);
		
		System.out.println("--------");
		// i++  => i = i + 1 
		// i가 짝수인 수만 출력
		// 0 2 4 6 8만 출력
		for(int i=0; i<10; i++) {
			if(i % 2 == 0) {
				System.out.println(i);				
			}
		}
		
		System.out.println("----------");
		
		// 1부터 10까지 출력
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("---------");
		// 1부터 10까지의 합계 출력
		// 기본 8 자료형 무조건 초기화가 되어야만 사용가능
		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum = sum + i;
			System.out.println(i+" / "+sum);
			
		}
		
		// 1부터 10까지 짝수합 / 홀수합
//		int evenSum = 0;
//		int oddSum = 0;
//		for(int i=1; i<=10; i++) {
//			if(i % 2 == 0) {
//				// 짝수
//				evenSum = evenSum + i;
//			}else {
//				//홀수
//				oddSum = oddSum + i;
//			}
//		}
//		System.out.println("evenSum:"+evenSum);
//		System.out.println("oddSum" + oddSum);
		


	}

}