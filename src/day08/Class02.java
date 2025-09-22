package day08;

public class Class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
//		t.x = 1;
//		t.y = 2;
		t.setX(10);
		t.setY(20);
//		System.out.println("("+t.x+", "+t.y+")");
		System.out.println("("+t.getX()+", "+t.getY()+")");
		// toString() 호출
		System.out.println(t.toString());

	}

}

class Test{
	// 패키지가 다르면 같은 이름의 클래스 사용 가능.
	private int x;
	private int y;
	
	// 출력에 필요한 메서드 toString()
	public String toString() {
		return "("+x+", "+y+")";
	}
	
	
	// private의 멤버변수를 사용하기 위해서는 getter/setter 메서드가 필요
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}