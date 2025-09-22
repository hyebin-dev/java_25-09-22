package day06;

import java.util.Scanner;

public class MethodEx01 {
	
	public static void main(String[] args) {
		/* 계산기 만들기
		 * --menu--
		 * 1.덧셈|2.뺄셈|3.곱셈|4.나눗셈|5.나머지|6.종료
		 * >> 메뉴선택 > 1
		 * >> 숫자 입력(두 정수) > 1 5
		 * >> 결과 : 1 + 5 = 6
		 * 
		 * 덧셈, 뺄셈, 곱셈 나눗셈, 나머지는 Method03에서 만든 메서드를 호출
		 * 
		 * */
		// Method03의 클래스에 있는 메서드를 사용하기 위해서는 클래스의 객체화를 해야함.
		// 객체로 생성하는 키워드 new
		Method03 m3 = new Method03();
		// 메서드 호출  객체명.메서드명(매개변수)
		
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		do {
			System.out.println("--menu--");
			System.out.println("1.덧셈|2.뺄셈|3.곱셈|4.나눗셈|5.나머지|6.종료");
			System.out.println(">> 선택 >");
			menu = scan.nextInt();
			
			int num1=0, num2=0;
			
//			if(menu == 6) {
//				System.out.println("종료합니다.");
//				break;
//			}
			
			if(menu <6 && menu >0) {
				System.out.println("연산할 두 수 입력>");
				num1 = scan.nextInt();
				num2 = scan.nextInt();
			}
			switch(menu) {
			case 1:
				int sum = m3.sum(num1, num2);
				m3.print(num1, num2, "+", sum);
				//System.out.println(num1+"+"+num2+"="+sum);
				break;
			case 2:
				int sub = m3.sub(num1, num2);
				m3.print(num1, num2, "-", sub);
				break;
			case 3:
				int mul = m3.mul(num1, num2);
				m3.print(num1, num2, "*", mul);
				break;
			case 4: 
				double div = m3.div(num1, num2);
				m3.print(num1, num2, "/", div);
				break;
			case 5:
				int mod = m3.mod(num1, num2);
				m3.print(num1, num2, "%", mod);
				break;
			case 6: System.out.println("종료합니다.");
				break;
				default:
					System.out.println("잘못된 메뉴입니다.");
			}
			
			
		}while(menu != 6);
		
		scan.close();
		
	}

}