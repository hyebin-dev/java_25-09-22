package day10;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		// Product class : name, price
		// Order class : Product 상속  수량(count), 금액(total)
		// 주문 출력(하나의 주문에 대한 출력)
		// 종료 키워드 (주문종료가 가능하게 생성 => n)
		
		//1. 전체 메뉴 보여주기 
		//2. 주문 > 메뉴 , 수량 받기
		//3. 주문이 완료되었습니다. => 전체 주문 내역보기 출력
		Product[] menu = new Product[5];
		menu[0] = new Product("김밥", 3500);
		menu[1] = new Product("라면", 4000);
		menu[2] = new Product("떡볶이", 3000);
		menu[3] = new Product("볶음밥", 5500);
		menu[4] = new Product("라볶이", 4500);
		
		//주문을 담는 변수가 필요
		Order[] order = new Order[5];
		int cnt = 0;
		
		Scanner scan = new Scanner(System.in);
		
		char ok ='y';
		while(ok !='n') {
			System.out.println("주문하시겠습니까? (y/n) ");
			ok = scan.next().charAt(0);
			
			if(ok == 'y') {
				for(int i=0; i<menu.length; i++) {
					System.out.println((i+1)+"."+menu[i]);
				}
				System.out.println("메뉴를 선택해주세요. >");
				int menuNo = scan.nextInt();
				// 메뉴명, 가격, 수량
				System.out.println("수량 >");
				int count = scan.nextInt();
				Order o = new Order(menu[menuNo-1].getName(), 
						menu[menuNo-1].getPrice() , count);
				order[cnt] = o;	
				cnt++;
				
			} else if(ok == 'n') {
				System.out.println("주문을 종료합니다.");
				break;
			}else {
				System.out.println("y/n을 선택해주세요.");
			}
		}
		
		System.out.println("--주문내역 출력--");
		int sum = 0;
		for(int i=0; i<cnt; i++) {
			System.out.println((i+1)+"."+order[i]);
			sum += order[i].getTotal();
		}
		
		System.out.println("총 지불금액 : "+sum);
		
		scan.close();

	}

}