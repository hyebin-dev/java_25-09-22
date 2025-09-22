package day13;

import java.util.Arrays;

public class Exception06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((int)(Math.random()*5)+10);
		
		int size = 0, start = 1, count = 10;
		Exception06 ex06 = new Exception06();
		
		// 익셉션이 발생하더라고 그 후 구문이 정상 작동하도록 만들어주는 것이 이유
		
		try {
			int arr[] = ex06.createArray(size, start, count);
			System.out.println(Arrays.toString(arr));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		

	}
	
	/* size를 입력받아 size의 길이를 가지는 배열을 생성
	 * 랜덤값을 채워 배열을 리턴하는 메서드
	 * 랜덤값의 범위는 start(시작), count(개수)
	 * - size가 0보다 작으면 예외발생
	 * - count가 0보다 작으면 예외발생 
	 * 리턴타입 : 배열 => int[]
	 * 매개변수 : int size, int start, int count
	 * (Math.random()*count)+start
	 * (Math.ramdom()*45)+10 // 10부터 45개
	 * */
	public int[] createArray(int size, int start, int count) throws RuntimeException {
		
		if(size <=0) {
			throw new RuntimeException("배열의 길이가 0보다 작습니다.");
		}
		
		if(count <=0) {
			throw new RuntimeException("radom의 범위가 0보다 작습니다.");
		}
		
		int arr[] = new int[size];
		for(int i=0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*count)+start;
		}
		return arr;
	}
	
	

}