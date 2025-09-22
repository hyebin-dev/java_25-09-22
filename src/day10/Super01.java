package day10;

public class Super01 {

	public static void main(String[] args) {
		// 상속 : 부모의 것을 자식에게 물려주는 것.
		/* - 멤버변수 / 메서드만 상속가능.
		 * - 클래스의 확장 개념.
		 * - 상속을 하는 이유 : 재사용을 해서 코드의 중복을 제거, 유지보수를 쉽게하기 위해
		 * 
		 * class A(자식) extends B(부모) {
		 *   구현
		 * }
		 * 
		 * 상속 키워드 : extends
		 * - 상속을 받으면 부모의 멤버변수와 메서드를 사용할 수 있다. 
		 * - 접근제어자가 private이면 자식도 접근 불가능.
		 * - 접근제어자 protected : 상속받는 자식에게 허용하는 제어자
		 * - 단일 상속이 원칙.
		 * 
		 * */
		B b = new B();
		b.setA(1000);
		b.setB(2000);
		b.num = 10000;
		b.print();
		
		System.out.println("----------");
		
		A a = new A();
		a.setA(10);
		a.setB(20);
		a.num = 10; // 접근제어자가 protected라서 직접 접근이 가능.
		a.print();
		System.out.println();
		a.setC(100);
		a.setD(200);
		a.setE(300);
		a.print();

	}

}

class A extends B{
	//자식클래스
	private int c,d,e;
	
	// override(오버라이드) : 부모의 메서드를 재정의하여 사용하는 것.
	// super : 부모의 값을 가져올때 키워드 (부모의 멤버, 메서드를 지칭할 때 사용)
	// this : 내 멤버, 메서드를 지칭할 때 사용하는 키워드

	@Override
	public void print() {
		// 부모의 print는 a,b,num만 출력가능.
		// 자식 print는 a,b,num + c,d,e 다 출력
		super.print(); // a,b,num만 출력가능.
		System.out.println("c:"+c+", d:"+d+", e:"+e);
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}
	
	
	
}

class B{
	//부모클래스
	private int a,b; //나만 사용가능.
	protected int num; //상속 가능한 변수
	
	public void print() {
		System.out.println("a=>"+a+", b=>"+b);
		System.out.println("num =>"+num);
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}