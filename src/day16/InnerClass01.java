package day16;

public class InnerClass01 {

	public static void main(String[] args) {
		// InnerClass : 내부 클래스
		/* 클래스 내부에 선언한 클래스
		 * 외부클래스가 쓰려고 직접 선언하는 경우가 많고, 다른 클래스에서
		 * 해당 내부 클래스를 사용할일이 없고, 외부 클래스만이 사용하려고 할 때
		 * - 중첩 클래스 라고도 함.
		 * 
		 * 내부적으로 내용할 경우 클래스를 private으로 선언하고 사용하는 것을 권장
		 * 내부 클래스는 외부 클래스가 생성 된 후 생성됨.
		 * private이 아닌 내부 클래스는 외부에서 접근 가능함.
		 * */
		OutClass outclass = new OutClass();
		System.out.println("내부 클래스의 호출");
		outclass.usingClass();
		
		//getter/setter 생성 후 
		System.out.println();
		outclass.getInClass().inTest();
		
		System.out.println();
		OutClass.InClass inclass = outclass.new InClass();
		
		inclass.inTest(); // 직접 inTest에 접근
		

	}

}


class OutClass{
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() { 
		// 외부 클래스의 생성자로 내부 클래스의 객체 생성
		inClass = new InClass();
	}
	
	class InClass{
		int inNum = 100;
		//static int sinNum = 200; // 에러가 남
		
		void inTest() {
			System.out.println("OutClass num = "+num);
			System.out.println("OutClass sNum = "+sNum);
			System.out.println("InClass inNum = "+inNum);
		}
		
	}
	
	// InClass를 사용하기 위한 내부 메서드
	public void usingClass() {
		inClass.inTest();
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public static int getsNum() {
		return sNum;
	}

	public static void setsNum(int sNum) {
		OutClass.sNum = sNum;
	}

	public InClass getInClass() {
		return inClass;
	}

	public void setInClass(InClass inClass) {
		this.inClass = inClass;
	}
	
	
}