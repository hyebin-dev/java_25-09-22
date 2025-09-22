package day17;

public class Company2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Company2.APPLE.getValue());
		
		for(Company2 c : Company2.values()) {
			System.out.println(c.getValue());
		}
		System.out.println(Company2.APPLE.ordinal()); // 0번지부터 순번

	}

}