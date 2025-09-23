package day03;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		/* --- menu ---
		 * 1. + | 2. - | 3. * | 4. / | 5. % | 6. 종료
		 * 두 수를 입력해주세요. > 3 2 / menu = 1
		 * menu 1 => 3 2 => 3+2=5
		 * menu 2 => 3 2 => 3-2=5
		 * menu 4 => 3 0 => 3/0 = num2를 다시 입력해주세요.
		 * menu 5 => 3 0 => 3%0 = num2를 다시 입력해주세요.
		 * 
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		do {
			System.out.println("--- menu ---");
			System.out.println("1. + | 2. - | 3. * | 4. / | 5. % | 6. 종료");
			System.out.println("menu>");
			menu = scan.nextInt();
			
			System.out.println("두 수를 입력해주세요. >");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			
			while((menu==4 || menu==5) && num2==0) {
				System.out.println("num2를 다시 입력해주세요.");
				num2 = scan.nextInt(); 
			}
			switch(menu){
				case 1: int plus = num1+num2;
					System.out.println(num1+"+"+num2+"="+plus); break;	
				case 2:
					int minus = num1-num2;
					System.out.println(num1+"-"+num2+"="+minus); break;
				case 3: int mul = num1*num2;
				System.out.println(num1+"*"+num2+"="+mul); break;
				case 4:
					double div = (double)num1/num2;
					System.out.println(num1+"/"+num2+"="+div); 
				case 5:
					int rem = num1%num2;
					System.out.println(num1+"%"+num2+"="+rem); break;
				case 6:System.out.println("종료합니다."); break;
				default:
					System.out.println("잘못된 메뉴입니다.");
			}
			
		} while(menu != 6);
	}
}
