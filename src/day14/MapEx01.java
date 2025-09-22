package day14;

import java.util.Scanner;

public class MapEx01 {

	public static void main(String[] args) {
		// map을 활용한 단어장 프로그램 작성
		/* 1.단어등록|2.단어검색|3.단어수정|4.단어출력|5.단어삭제|6.종료
		 * WordController 생성하여 Map을 멤버변수로 선언하여
		 * 메서드로 구현
		 * 기본단어 5가지 등록
		 * 
		 * 기본적인 CRUD
		 * C : create (생성) => 등록, 추가
		 * R : read (읽기) => 조회, 전체 출력
		 * U : update (수정) 
		 * D : delete(삭제) 
		 * */
		
		Scanner scan = new Scanner(System.in);
		WordController wc = new WordController();
		
		wc.addWord(); // 기본 단어 추가.
		
		int menu = 0;
		
		do {
			System.out.println("1.단어등록|2.단어검색|3.단어수정|\n"
					+ "4.단어출력|5.단어삭제|6.종료");
			System.out.println("선택 >");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: wc.insertWord(scan); break;
			case 2: wc.searchWord(scan); break;
			case 3: wc.modifyWord(scan); break;
			case 4: wc.printWord(scan); break;
			case 5: wc.deleteWord(scan); break;
			case 6: System.out.println("종료"); break;
			default: System.out.println("잘못된 메뉴입니다.");
			}
				
		}while(menu != 6);
		
		scan.close();

	}

}