package day07;

import java.util.Arrays;

public class Method06 {
	
	// 랜덤수(0~100) 정수 5개를 담는 배열을 생성하여 리턴하는 메서드 int[]
	// 매개변수 : 없음.
	// 리턴타입 : 배열 int[]
	// 메서드명 : makeRandom()
	public int[] makeRandom() {
		int arr[] = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i]= (int)(Math.random()*100);
		}
		return arr;
	}
	
	// 2. 배열을 입력받아 평균을 리턴하는 메서드
	// 리턴타입 : 평균 => double
	// 매개변수 : 배열 => int[] arr
	// 메서드명 : average
	public double average(int[] arr) {
		double avg = 0;
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		avg = (double)sum/arr.length;
		return avg;
	}
	
	//3. 배열 출력, 평균 출력 메서드
	// 리턴타입 : void
	// 매개변수 : 배열 (평균은 메서드 호출)
	public void print(int[] arr) {
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("평균:"+average(arr));
	}
	
	// 3-1 배열 출력, 평균 출력 메서드
	// 리턴타입 : void
	// 매개변수 : 받지않고, 상단메서드를 호출하여 출력
	public void print() {
		int arr[] = makeRandom();
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("평균:"+average(arr));
	}
	

	public static void main(String[] args) {
		// 메서드의 배열활용
		/* 1. 랜덤수(0~100) 정수 5개를 담는 배열을 생성하여 리턴하는 메서드 int[]
		 * 2. 1에서 만든 배열을 입력받아 평균을 리턴하는 메서드
		 * 3. 1에서 만든 배열을 출력하고,
		 *    2에서 만든 평균을 출력하는 메서드
		 *    
		 * main에서 호출
		 * */
		Method06 m6 = new Method06();
		m6.print();
		
		System.out.println("---------------");
		
		// 1. 메서드 호출
		int[] arr = m6.makeRandom();
		System.out.println(Arrays.toString(arr));
		// 3. 출력 메서드 호출
		m6.print(arr);
		
		// 2. 평균만 리턴
		double avg = m6.average(arr);
		System.out.println(avg);
		
		
		
		
	}

}