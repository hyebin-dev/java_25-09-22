package day15;

import java.util.Scanner;

public class SaleMain {

	public static void main(String[] args) {
		/* Sale 클래스 생성 => 제네릭으로 생성
		 * main
		 * 1.메뉴추가|2.메뉴보기|3.제품주문|4.주문내역보기|5.종료
		 * */
		Scanner scan = new Scanner(System.in);
		SaleController sc = new SaleController();
		
		sc.addMenu(); // 미리 메뉴 추가
		
		int menu = 0;
		while(true) {
			
			System.out.println("1.메뉴추가|2.메뉴보기|3.제품주문|4.주문내역보기|5.종료");
			System.out.println("선택>");
			menu = scan.nextInt();
			if(menu == 5) {
				System.out.println("종료");
				break;
			}
			
			switch(menu) {
			case 1: sc.add(scan); break;
			case 2: sc.print(); break;
			case 3: sc.order(scan); break;
			case 4: sc.orderPrint(); break;
			case 5:  break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
			
		}
		
		scan.close();
		

	}

}