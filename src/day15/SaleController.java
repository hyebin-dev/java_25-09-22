package day15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaleController {
	//멤버변수로 메뉴에 대한 List
	private List<Sale<String, Integer>> menu = new ArrayList<>();
	//멤버변수로 주문에 대한 List
	private List<Order<String, Integer>> order = new ArrayList<>();
	
	public void addMenu() {
		// 메뉴 미리 추가
		menu.add(new Sale<String, Integer>("김밥", 4500));
		menu.add(new Sale<String, Integer>("라면", 4000));
		menu.add(new Sale<String, Integer>("떡볶이", 5000));
		menu.add(new Sale<String, Integer>("음료수", 200));
	}
	
	public void add(Scanner scan) {
		// 메뉴 추가
		System.out.println("메뉴 > ");
		String menu = scan.next();
		System.out.println("가격 >");
		int price = scan.nextInt();
		
		// 객체 생성 후 추가
		Sale<String, Integer> s = new Sale<String, Integer>(menu, price);
		this.menu.add(s);
		System.out.println("메뉴 추가 완료!");
	}

	public void print() {
		// 메뉴 출력
		int cnt = 1;
		System.out.println("--전체메뉴출력--");
		for(Sale s : menu) {
			System.out.println(cnt+"."+s);
			cnt++;
		}
		
	}

	public void orderPrint() {
		// 주문 출력
		int cnt = 1, sum=0;
		System.out.println("--주문내역출력--");
		for(Order o : order) {
			System.out.println(cnt+"."+o);
			sum += o.getTotal();
			cnt++;
		}
		System.out.println("-----------");
		System.out.println("전체 주문 금액 : "+sum);
		System.out.println();
	}

	public void order(Scanner scan) {
		// 주문
		/* 메뉴와 수량을 입력받아 menuList에서 메뉴의 가격을 찾아와
		 * order 메뉴 / 수량  total 값을 저장 
		 * */
		print();
		System.out.println("-----------");
		System.out.println("주문메뉴 > ");
		int menuNum = scan.nextInt();
		System.out.println("수량 >");
		int count = scan.nextInt();
		
		Sale<String, Integer> s = menu.get(menuNum-1);
		
		Order<String, Integer> o = new Order<String, Integer>(s, count);
		order.add(o);
		System.out.println("주문완료!");

	}

}