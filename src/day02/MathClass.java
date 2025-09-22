package day02;

public class MathClass {

	public static void main(String[] args) {
		// 수학관련 기능이 있는 클래스
		// Math.ramdom() : 0~1사이의 아무수를 리턴
		// Math.round(값) : 반올림 소수 자리수는 0
		// Math.ceil(값) : 올림 소수 자리수는 0
		// Math.floor(값) : 버림 소수 자리수는 0
		
		double num = 3.64159;
		// long roundNum = Math.round(num); // return long
		int roundNum = (int)Math.round(num);
		System.out.println(roundNum);
		
		int ceilNum = (int)Math.ceil(num); // return double
		System.out.println(ceilNum);
		
		int floorNum = (int)Math.floor(num);
		System.out.println(floorNum);
		
		System.out.println("------------");
		// Math.max(값1, 값2) / Math.min(값1, 값2)
		
		System.out.println(Math.max(10, 20));
		System.out.println(Math.min(10, 20));
		
		System.out.println("------------");
		// Math.random() : 0~1사이의 아무값을 리턴 
		// 0 <= random < 1
		// (int)(Math.random()*개수)+시작값
		System.out.println(Math.random()*10);
		System.out.println((int)(Math.random()*10)); // 0~9
		System.out.println((int)(Math.random()*10)+1); // 1~10
		System.out.println("---------");
		// 주사위의 값을 랜덤으로 출력 1~6
		System.out.println((int)(Math.random()*6)+1);
			

	}

}