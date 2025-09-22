package day02;

public class Switch01 {

	public static void main(String[] args) {
		// 조건문 
		// switch(변수 / 식){
		// case 값1 : 실행문; break;
		// case 값2 : 실행문; break;
		// case 값3 : 실행문; break;
		// case 값4 : 실행문; break;
		// default: 실행문;
		// }
		// break;  구문을 빠져나갈때 사용
		
		int num = 10;
		// 짝수인지 홀수인지 판별
//		int mod = num % 2;
//		System.out.println(mod); // 0 or 1
		
		switch(num % 2) {
		case 0: 
			System.out.println("짝수"); 
			break;
		case 1: 
			System.out.println("홀수"); 
			break;
		default: 
			System.out.println("이상한 값");
		}
		
		// num1 변수에 1,2,3 중 하나라고 가정하고,
		// num1에 따라 1이면 1칸전진, 2면 2칸전진, 3이면 3칸전진 출력
		// 나머지는 이상한 값
		int num1 = 2;
		switch(num1) {
		case 1: System.out.println("1칸전진"); break;
		case 2: System.out.println("2칸전진"); break;
		case 3: System.out.println("3칸전진"); break;
		default:
			System.out.println("이상한 값");
		}
		
		switch(num1) {
		case 1: System.out.println(num1+"칸전진"); break;
		case 2: System.out.println(num1+"칸전진"); break;
		case 3: System.out.println(num1+"칸전진"); break;
		default:
			System.out.println("이상한 값");
		}
		// 여러 케이스를 하나로 묶기
		switch(num1) {
		case 1: case 2: case 3:
			System.out.println(num1+"칸전진"); break;

		default:
			System.out.println("이상한 값");
		}
		System.out.println("---------");
		
		// 3 4 5 (봄) 6 7 8(여름) 9 10 11(가을) 12 1 2(겨울)
		// 잘못된 월입니다.
		int month = 8;
		switch(month) {
		case 3: case 4: case 5:
			System.out.println("봄"); break;
		case 6: case 7: case 8:
			System.out.println("여름"); break;
		case 9: case 10: case 11:
			System.out.println("가을"); break;
		case 12: case 1: case 2:
			System.out.println("겨울"); break;
			default:
				System.out.println("잘못된 월입니다.");
		}
		
//		jdk 17버전 이후로 추가된 문법
//		switch(month) {
//		case 3, 4, 5 -> System.out.println("봄"); break;
//		}
		

	}

}