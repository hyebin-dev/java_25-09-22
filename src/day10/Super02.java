package day10;

public class Super02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog("뽀삐","개과");
		d.printInfo();
		d.howl();

	}

}

class Dog extends Animal{
	
	public Dog(String name, String category) {
		//부모의 생성자 호출
		super(name, category);
		
		//부모의 setter를 호출하여 멤버변수의 값 생성
		//super.setName(name);
		//super.setCategory(category);
	}

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("멍멍~!!");
	}
	
}

class Animal{ //부모클래스
	private String name; // 이름
	private String category; // 종
	
	//생성자
	public Animal() {}
	
	public Animal(String name, String category) {
		this.name=name;
		this.category = category;
	}
	
	// 출력메서드
	public void printInfo() {
		System.out.println("이름:"+name+"("+category+")");
	}
	
	//울음소리출력 메서드
	public void howl() {
		System.out.println("--"+name+"울음소리--");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}