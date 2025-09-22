package day10;

public class Class04 {

	public static void main(String[] args) {
		/* 객체 생성시 값을 초기화 하는 방법
		 * - 기본값, 명시적 초기값, 초기화 블럭, 생성자
		 * 1. 기본값 : 멤버변수 선언시 기본적으로 주는 값 int =0, String = null
		 * 2. 명시적 초기값 : 기본값을 직접 명시하여 주는 값
		 *   brand = "LG"
		 * 3. 초기화 블럭 : { 초기값 지정 } => 멤버변수의 초기화
		 * 4. 생성자 : 객체를 생성할 때 호출하여 초기값을 지정 
		 * 
		 * 초기값 우선순위
		 * 기본값 > 명시적 초기값 > 초기화블럭 > 생성자(가장 우선순위가 높음.)
		 * */
		Student s = new Student();
		System.out.println(s);

	}

}

class Student{
	private String gigum = "강남";  //명시적 초기값
	private String name;  // 기본값 null
	private int age; // 기본값 0
	
	{
		//초기화 블럭 영역
		 //this.gigum="수원";
		 this.name = "미정";
		 this.age = 20;
	}
	
	public Student() {}

	public Student(String gigum, String name, int age) {
//		super(); //부모생성자
		this.gigum = gigum;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [gigum=" + gigum + ", name=" + name + ", age=" + age + "]";
	}

	public String getGigum() {
		return gigum;
	}

	public void setGigum(String gigum) {
		this.gigum = gigum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}