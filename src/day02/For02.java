package day02;

public class For02 {

	public static void main(String[] args) {
		// 1~10까지의 랜덤수 5개 출력
		
		for(int i=0; i<5; i++) {
			System.out.println((int)(Math.random()*10)+1);
		}
	}

}