package day05;

import java.util.Arrays;

public class ArrayEx03 {

	public static void main(String[] args) {
		// 정수 배열[10] 생성 후
		// 1~10까지 저장 후 출력
		// 배열 번지는 0~9까지
		
		// 값을 출력 for  Arrays.toString()
		int arr[] = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i]= i+1;
		}
		System.out.println(Arrays.toString(arr));
		
		// 교환에 필요한 랜덤 번지 추출  0~9
		// 섞기		
		for(int i=0; i<arr.length; i++) {
			// 교환에 필요한 번지 추출
			int index = (int)(Math.random()*arr.length);
			//교환
			int tmp = arr[i];
			arr[i] = arr[index];
			arr[index] = tmp;
			
		}
		System.out.println("---------------");
		System.out.println(Arrays.toString(arr));
		
		// [5, 3, 1, 2, 4]
		// 원래대로 정렬
		// 작은 수 부터 정렬 => 오름차순
		// 큰수부터 정렬 => 내림차순
		// [5, 3, 1, 2, 4]
		// [1, 5, 3, 2, 4] - 1pass
		// [1, 2, 5, 3, 4] - 2pass
		// [1, 2, 3, 5, 4] - 3pass
		// [1, 2, 3, 4, 5] - 4pass
		
//		if(앞 > 뒤) {
//			교환
//		}
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) { // 오름차순 
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					
				}
			}
		}
		System.out.println("---------------");
		System.out.println(Arrays.toString(arr));
	}

}