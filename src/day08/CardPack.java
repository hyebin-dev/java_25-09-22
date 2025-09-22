package day08;

public class CardPack {
	/* Card 클래스를 52장 묶은 pack
	 * ♥A~♥K,◆A~◆K,♣A~♣K,♠A~♠K 
	 * - 총 카드수 52장의 한묶음 (배열)
	 * - 멤버변수 : 총 52장의 Card 담을수 있는 배열
	 *  
	 * 메서드()
	 * - 카드 출력 (Card => print())
	 * - 카드 섞는 기능
	 * - 카드를 한 장 빼내는 기능
	 * - 카드 초기화 기능
	 * 
	 * 생성자
	 * */
	private Card[] pack = new Card[52];
	private int cnt; //번지역할을 하는 변수
	
	// 생성자 CardPack() => 52장의 카드가 생겨서 만들어져야함.
	public CardPack() {
		//pack => Card 객체를 담을 수 있는 배열
		//pack에  Card 객체가 52장 생성(new)되어 담아야 함.
		//숫자 : A(1)~10, J(11), Q(12), K(13)
		//모양 : ♥, ◆, ♣, ♠
		// Card c = new Card();
		String s = "";
		for(int i=1; i<=4; i++) {
			switch(i) {
			case 1: s="♥"; break;
			case 2: s="◆"; break;
			case 3: s="♣"; break;
			case 4: s="♠"; break;
			}
			for(int j=1; j<=13; j++) {
				Card c = new Card();
				c.setNum(j);
				c.setShape(s);
				pack[cnt] = c;
				cnt++;//52
			}
		}
	}
	
	// 카드 섞는 기능
	public void shuffle() {
		for(int i=0; i<pack.length; i++) {
			int random = (int)(Math.random()*pack.length);
			// 교환
			Card tmp = pack[i];
			pack[i] = pack[random];
			pack[random] = tmp;
		}
	}
	
	// 하나씩 나눠주는 기능
	// 리턴 타입 : Card 
	public Card pick() {
		if(cnt==0) {
			return null;
		}
		cnt--;
		return pack[cnt]; 
	}
	
	//초기화 : 카드 회수 기능 cnt를 다시 52로 회복 (섞기)
	public void init() {
		cnt=52;
		shuffle();
	}
	

	public Card[] getPack() {
		return pack;
	}

	public void setPack(Card[] pack) {
		this.pack = pack;
	}
	
}