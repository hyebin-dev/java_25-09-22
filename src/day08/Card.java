package day08;

public class Card {
	/* 숫자 : 1(A)~10, J(11), Q(12), K(13)
	 * 모양 : ♥, ◆, ♣, ♠
	 * ex) ♥1, ♣J  *13 => ♥K  $20 =>♥1
	 * 해당 범위에 벗어나는 숫자는 => 1
	 * 해당 범위에 벗어나는 모양은 => ♥
	 * 
	 * - 멤버변수 : 숫자(num), 모양(shape)
	 * - toString
	 * - 생성자 => 기본생성자만 => ♥A
	 * - print()
	 *    => A(1), J(11), Q(12), K(13)
	 * */
	private int num;
	private String shape;
	
	public Card() {
		this.num = 1;
		this.shape = "♥";
	}
	
	//print()
	public void print() {
		System.out.print(shape);
		switch(num) {
		case 1: System.out.print("A "); break;
		case 11: System.out.print("J "); break;
		case 12: System.out.print("Q "); break;
		case 13: System.out.print("K "); break;
		default:
			System.out.print(num+" ");
		}
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		// 범위제한 1~13
		if(num < 1 || num > 13) {
			this.num = 1;
			return;
		}
		this.num = num;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		// 범위제한 ♥, ◆, ♣, ♠
		switch(shape) {
		case "♥" : case "◆" : case "♣" : case "♠" :
			this.shape = shape;
			break;
			default:
				this.shape = "♥";
		}
	}

	@Override
	public String toString() {
		return shape + num;
	}
	
	
}