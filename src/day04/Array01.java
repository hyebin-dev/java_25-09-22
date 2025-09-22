package day04;

import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
		// 배열 : 같은 타입, 같은 의미를 가지는 변수들의 집합 (참조변수)
		/* new 키워드로 생성
		 * - 배열 선언 방법
		 * 타입[] 배열명;
		 * 타입 배열명[];
		 * 
		 * 타입[] 배열명 = new 타입[길이];
		 * 배열안의 변수값은 초기화가 자동으로 이루어진다.
		 * int[] arr = new int[10]; // 가장 많이 사용하는 방법
		 * int[] arr = new int[]{1,2,5,4,7,8,6};
		 * int[] arr = {2,5,4,7,8,6};
		 * 
		 * - 배열의 길이는 0이상이여야 한다. (-는 허용안됨)
		 * - 배열의 index 는 0부터 시작
		 * - 배열[5] => 0 1 2 3 4
		 * - 배열의 총길이 => length
		 * */
		
		int[] arr1; //null 선언만
		int[] arr = new int[5];
		int[] arr2 = new int[] {1,2,3,4,5};
		int[] arr3 = {10,20,30,40,50};
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println(arr3[3]);
		System.out.println(arr3[4]);
		System.out.println("------------");
		// arr배열에 값을 추가
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
//		arr[5] = 600;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.println("-------");
		
		int[] arr5 = new int[10];
		for(int i=0; i<arr5.length; i++) {
			arr5[i] = i+1;
		}
		//출력
		arr5[0]=100;
		for(int a : arr5) {
			System.out.println(a);
		}
		
		// int[] arr6 을 생성하여[5] 랜덤으로 값 5개를 넣고 출력 
		// 랜덤 값의 범위는 1~10
		
		System.out.println("-----");
		int[] arr6 = new int[5];
		for(int i=0; i<arr6.length; i++) {
			arr6[i] = (int)(Math.random()*10)+1;
		}
		// 향상된 for문
		// 번지(index)로 접근이 불가능한 경우 사용
		// 전체 탐색만 가능
		// 배열의 내부값을 변경하는 건 불가능.
		
		for(int a : arr6) {
			System.out.println(a);
		}
		
		System.out.println(Arrays.toString(arr6));
		
	}

}