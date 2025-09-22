package day08;

public class CardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Card c = new Card();
//		System.out.println(c);
//		
//		//ex) ♥1, ♣J  *13 => ♥K  $20 =>♥1
//		c.setNum(11);
//		c.setShape("♣");
//		System.out.println(c);
//		c.print();
//		System.out.println("----------");
		
		CardPack cp = new CardPack();
		
		System.out.println("------------------------");
		//카드 Test
		System.out.println("딜러가 카드를 섞습니다.");
		cp.shuffle();
		// 배열 출력 코드
		for(int i=0; i< cp.getPack().length; i++) {
			cp.getPack()[i].print();
		}
		// player 4명
		System.out.println();
		System.out.println("딜러가 카드를 나누고 있습니다.");
		Card player1 = cp.pick();
		Card player2 = cp.pick();
		Card player3 = cp.pick();
		Card player4 = cp.pick();
		
		System.out.println();
		System.out.println("각 플레이어 Card open");
		System.out.print("player1 > ");
		player1.print();
		System.out.println();
		System.out.print("player2 > ");
		player2.print();
		System.out.println();
		System.out.print("player3 > ");
		player3.print();
		System.out.println();
		System.out.print("player4 > ");
		player4.print();
		
		System.out.println();
		System.out.println("------------------------");
		
		cp.init();
		
		
		// 배열 출력 코드
//		for(int i=0; i< cp.getPack().length; i++) {
//			cp.getPack()[i].print();
//		}
//		System.out.println();
//		System.out.println("--섞은 후 값 보기--");
//		
//		cp.shuffle();
//		// 배열 출력 코드
//		for(int i=0; i< cp.getPack().length; i++) {
//			cp.getPack()[i].print();
//		}
		
//		System.out.println();
//		System.out.println("--pick()--");
//		cp.pick().print();
//		System.out.println("--pick()--");
//		cp.pick().print();
//		System.out.println("--pick()--");
//		cp.pick().print();
//		System.out.println("--pick()--");
//		cp.pick().print();
		
		
		// shape = 4개 ♥, ◆, ♣, ♠
		// 숫자 = 13개
//		for(int i=1; i<=4; i++) {
//			switch(i) {
//			case 1: c.setShape("♥"); break;
//			case 2: c.setShape("◆"); break;
//			case 3: c.setShape("♣"); break;
//			case 4: c.setShape("♠"); break;
//			}
//			for(int j=1; j<=13; j++) {
//				c.setNum(j);
//				c.print();
//			}
//			System.out.println();
//		}

	}

}