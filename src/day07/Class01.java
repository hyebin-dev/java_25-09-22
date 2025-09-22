package day07;

public class Class01 {
	
	/* 클래스의 구성요소 : 멤버변수, 메서드, (생성자)
	 * 멤버변수를 먼저, (생성자), 메서드
	 * 
	 * 클래스 - 객체를 생성하기 위한 설계도
	 * 객체 - 제품(클래스로부터 생성된 제품)
	 * 메서드 - 제품의 기능
	 * 멤버변수 - 속성(메서드에서 필요한 값들을 저장 정보값)
	 * 
	 * 프린트 클래스
	 * - 속성(멤버변수) : 크기, 색, 제조사, 제품명, 종류 
	 * - 기능(메서드) : 인쇄, 복사, 스캔, 팩스
	 * 
	 * 클래스는 다른 클래스와 겹치지 않게 정의
	 * 클래스 선언
	 * class 클래스명 {
	 * 
	 * }
	 * - public class => 파일명과 같은 이름의 클래스에게만 부여
	 * 
	 * 객체 선언 > 생성
	 * 클래스타입 객체명 = new 클래스명() =>클래스타입 객체명 = new 생성자() 
	 * 
	 * 클래스타입 객체명;  => 값은 null
	 * 객체명 = new 클래스명();
	 * 
	 * 메서드 사용방법(static이 안붙은 일반 메서드)
	 * - 다른 클래스에서 호출할 경우 => 객체를 선언 후 객체명.메서드명();
	 * - 같은 클래스에서 호출할 경우 => 메서드명();
	 * 
	 * 접근제어자
	 * public : 모두 사용가능
	 * protected : 나 + 패키지 + 자식클래스 사용가능 (상속시 사용)
	 * (default) : 나 + 패키지
	 * private : 나
	 * 
	 * private < default < protected < public
	 * 
	 * - 하나의 파일안에 하나의 클래스만 있을 수 있는 건 아님.
	 * - 하지만 일반적으로 하나의 파일에 하나의 클래스를 사용
	 * - 클래스에서 public을 붙일 수 있는 건 파일명 == 클래스명 같을 경우만 가능.
	 * - 멤버변수, 메서드, 클래스 모두 접근제어자를 사용
	 * - 멤버변수는 private, 메서드는 public 선언이 일반적.
	 * - 멤버변수가 private면 다른 클래스에서 접근 불가능.
	 * - 멤버변수를 다른 클래스에서 접근 가능하도록 메서드를 만들어 사용 (getter/setter)
	 * 
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.setX(10);
		t.setY(20);
		System.out.println("("+t.getX()+", "+t.getY()+")");
		System.out.println("--print메서드 사용--");
		t.print();
		t.print(100, 200);
		System.out.println("toString출력");
		System.out.println(t.toString());
	}

}

// 다른 클래스 정의 가능

class Test {
	// 클래스의 멤버변수는 초기값을 설정하지 않아도 자동 설정
	// int = 0 / String = null
	private int x;
	private int y;
	
	// toString()
	public String toString() {
		return "("+this.x+", "+this.y+")";
	}
	
	//print메서드
	public void print() {
		System.out.println("("+this.x+", "+this.y+")");
	}
	
	public void print(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("("+this.x+", "+this.y+")");
	} 
	
	//getter
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	//setter
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
