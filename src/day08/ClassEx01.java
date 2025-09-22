package day08;

public class ClassEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t = new Tv("LG");
		System.out.println(t);
		t.power();
		t.chUP();
	
		t.chUP();
//		t.setCh(19);
		t.chUP();

		t.chUP();
		t.chDown();
		t.chDown();
		
		t.pick();
		
		t.chDown();
		t.chDown();

		t.chDown();
		t.chDown();
		t.volUp();
		t.volUp();
		t.volDown();
		t.volDown();
		t.volDown();
		
		t.pick();
		t.faverPrint();

	}

}