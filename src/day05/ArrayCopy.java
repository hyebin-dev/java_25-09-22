package day05;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		// 배열은 길이가 정해져 있음. 
		// 처음 배열을 생성할 때 정해서 생성
		// 이후 배열을 증가할 수 없음. (필요해서 늘릴 수가 없음.)
		// 배열을 증가해야 할 경우 arraycopy를 사용
		// System.arraycopy(이전배열, 시작번지, 새배열, 시작번지, 개수);
		
		int[] arr = new int[5];
		arr[0]=15;
		arr[1]=78;
		arr[2]=98;
		arr[3]=78;
		arr[4]=56;
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
			
		
		int[] arr2 = new int[arr.length+5];  //arr + 5개추가
		
		// arraycopy
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		
		
		arr = arr2;  // 기존 배열을 버리고 arr2의 주소를 공유
		System.out.println(arr);
		// 값을 출력 for  Arrays.toString()
		System.out.println(Arrays.toString(arr));
		
		

	}

}