package day10;

public class Static01 {

	public static void main(String[] args) {
		// static : 클래스 멤버변수 / 클래스 메서드라고 부른다.
		/* - 객체 생성없이 클래스가 만들어지면 생성
		 * - 객체 생성 없이 클래스만으로 호출 가능.
		 * - 클래스명.메서드명 / 클래스명.멤버변수 => 사용방법
		 * - 객체 생성 후 사용도 가능하나, 일반적으로 그렇게 사용하지 않음.(노란밑줄)
		 * - 클래스의 멤버변수/메서드는 하나의 멤버변수가 모든 객체에 공유(사용)할 때 사용
		 * 
		 * static이 안붙은 메서드/멤버변수는 객체(인스턴스)의 멤버변수 / 메서드라고 불림.
		 * - 각 객체를 통해 생성되고, 사용된다.
		 * (객체를 생성하지 않으면 생성되지 않고, 사용될수 없다.)
		 * - 객체명.메서드 / 객체명.멤버변수
		 * - 각 객체마다 독립적으로 존재 => 독립적인 멤버변수와/메서드를 생성
		 * 
		 * 클래스와 객체(인스턴스)는 생성되는 시점이 달라서 메서드와 멤벼변수를
		 * 사용할 수 있는 시점이 다르다.
		 * 객체의 멤버는 클래스가 생성되고, 객체를 생성 한 후 사용할 수 있음.
		 * 클래스의 멤버는 클래스가 생성되면 바로 사용가능.
		 *  
		 *  - 클래스 멤버는 클래스멤버변수 / 클래스멤버메서드 둘다 사용 가능.
		 *  - 객체 멤버는 클래스멤버에서 사용이 불가능 (객체 생성 후 사용가능)
		 *  
		 * */
		TV t= new TV();
		t.printBaand(); //객체 생성 후 호출
		t.printBrand();  // 잘안씀 (가능은 함.)
		
		TV.printBrand(); // 클래스로 바로 호출

	}

}


class TV{
	private boolean power;
	static final String BRAND="LG";
	
	public void printBaand() {
		// 객체 메서드에서 static변수나, 객체 변수는 사용가능.
		System.out.println("Brand:"+BRAND);
		System.out.println(power);
	}
	public static void printBrand() { // 생성된 시점에 power 변수는 생성되지 않음
		// static메서드에서 객체변수는 사용불가능.
		System.out.println("Brand:"+BRAND);
		//System.out.println(power); // 호출 불가능
	}
}