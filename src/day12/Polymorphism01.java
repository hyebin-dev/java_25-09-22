package day12;

public class Polymorphism01 {

	public static void main(String[] args) {
		// 다형성(Polymorphism) - 다양한 객체로 형변환 가능
		/* - 하나의 클래스가(부모객체) 여러 자료형(자식 객체)으로 구현되어 실행되는 형태
		 * - 코드는 같은데, 들어오는 객체에 따라 다른 실행결과를 얻을 수 있음.
		 * - 다형성을 잘 활용하면 유연하고, 확장성있고, 유지보수가 편리한 프로그램을 만들 수 있음.
		 * */
		// Human, Tiger, Eagle, Dog 객체를 각자 생성 각자의 메서드 호출 => 출력
		Human h = new Human();
		h.move();
		h.readBook();
		Tiger t = new Tiger();
		t.move();
		t.hunting();
		Eagle e = new Eagle();
		e.move();
		e.flying();
		Dog d =  new Dog();
		d.move();
		d.walk();
		Cat c = new Cat();
		c.move();
		
		// 자식 타입으로 부터 부모객체를 생성하는 건 불가능.
		// Human h2 = new Animal(); // 불가능
		
		System.out.println("--부모타입으로 자식 객체를 생성--");
		// 조상객체에서 상속받은 것만 사용가능.
		// 자식객체가 독립적으로 가지고 있는 값은 사용불가능.
		Animal h1 = new Human();
		h1.move();
//		h1.readBook(); // 호출 불가능.
		Animal t1 = new Tiger();
		t1.move();
		Animal e1 = new Eagle();
		e1.move();
		Animal d1 = new Dog();
		d1.move();
		//Animal c1 = new Cat(); // 상속 안받은 객체는 사용불가능.
		
		
		// Animal 객체의 배열을 생성 객체 추가
		Animal[] aniList = new Animal[5];
		int cnt=0;
		aniList[cnt] = h1; cnt++;
		aniList[cnt] = t1; cnt++;
		aniList[cnt] = e1; cnt++;
		aniList[cnt] = d1; cnt++;
		aniList[cnt] = h; cnt++; // animal 타입으로 형변환 (업케스팅)
		
		System.out.println("--Animal 배열 출력--");
		// 해당 배열에 객체의 move() 호출
		for(int i=0; i<cnt; i++) {
			aniList[i].move();
		}
		
		// 자식 객체가 가지고 있는 고유의 값을 사용하려면 자신의 객체로 다운케스팅해야 가능.
		System.out.println();
		System.out.println("--다운케스팅--");
		// 다운 케스팅은 자동으로 이루어지지 않음.
		Human human1 = (Human)aniList[0];
		human1.readBook();
		
		System.out.println(aniList[1] instanceof Tiger);
	
		if(aniList[1] instanceof Eagle) {
			Eagle eagle = (Eagle)aniList[1]; // Tiger 객체
			eagle.flying();			
		}else if(aniList[1] instanceof Tiger) {
			Tiger tiger = (Tiger)aniList[1];
			tiger.hunting();
		}else if(aniList[1] instanceof Human) {
			Human human = (Human) aniList[1];
			human.readBook();
		}else {
			Dog dog = (Dog)aniList[1];
			dog.walk();
		}
		System.out.println();
		System.out.println("--다형성 메서드 활용--");
		// 다형성 메서드 사용
		Polymorphism01 p1 = new Polymorphism01();
		p1.moveAnimal(t1);
		for(int i=0; i<cnt; i++) {
			p1.moveAnimal(aniList[i]);
		}
		

	}
	
	// 각 객체의 move() 실행해주는 메서드
	public void moveAnimal(Human human) {
		human.move();
	}
	public void moveAnimal(Tiger tiger) {
		tiger.move();
	}
	
	// 다형성을 활용한 메서드
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}

class Cat {
	public void move() {
		System.out.println("고양이는 살금살금 걷습니다.");
	}
}

class Dog extends Animal{
	
	@Override
	public void move() {
		System.out.println("강아지가 아장아장 걷습니다.");
	}
	
	public void walk() {
		System.out.println("강아지가 산책을 합니다.");
	}
	
}

class Tiger extends Animal{
	
	@Override
	public void move() {
		System.out.println("호랑이가 네발로 어슬렁거립니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal{
	
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아다닙니다.");
	}
	
	public void flying() {
		System.out.println("독수리는 하늘에서 날아다니며 사냥을 합니다.");
	}
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("사람은 두발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람은 책을 읽을 수 있습니다.");
	}
	
}

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}