package day10;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/* Product 클래스를 생성 : 상품을 등록할 때 사용하는 클래스
		 * 상품명, 가격
		 * 상품명과 가격을 출력하는 메서드
		 * 상품을 추가하는 메서드
		 * */
		
		/* main에서 Product[10]
		 * 스케너를 통해서 상품을 등록받기
		 * 등록한 상품을 출력
		 * */
		Scanner scan = new Scanner(System.in);
		
		Product[] menu = new Product[10];
		
		//상품등록(y/n)
		char c ='y';
		int cnt = 0; //index역할
		
		while(c != 'n') {
			System.out.println("상품등록(y/n) >");
			c = scan.next().charAt(0);
			
			if(c=='y') {
				System.out.println("상품명 >");
				String name = scan.next();
				System.out.println("가격 >");
				int price = scan.nextInt();
				
				//객체 생성
				Product p = new Product(name, price);
				menu[cnt] = p;
				cnt++;
				
			}else {
				if(c=='n') {
					System.out.println("상품등록을 종료합니다.");
					break;
				}else {
					System.out.println("y/n만 가능합니다.");
				}
			}
		}
		
		//출력
		System.out.println("--등록된 상품 리스트--");
		for(int i=0; i<cnt; i++) {
			System.out.println((i+1)+"."+menu[i]);
		}
				
		scan.close();

	}

}