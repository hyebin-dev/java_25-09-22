package day05;

public class Array05 {

	public static void main(String[] args) {
		// 10개의 숫자 값을 가지는 배열 생성
		// 1~50까지의 랜덤 수를 배열에 저장 => 출력
		// 최대, 최소, 합계, 평균 출력
		
		//1. 배열생성
		int[] arr = new int[10];
		
		//2. 배열에 랜덤값을 저장 => 배열의 수만큼
		//3. 구하기
		int sum=0, max=0, min=51;
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*50)+1;
			sum += arr[i];
//			max = Math.max(max, arr[i]);
//			min = Math.min(min, arr[i]);
			if(max < arr[i]) {
				max=arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		// 4. 출력
		for(int a : arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("sum:"+sum+" avg:"+((double)sum/arr.length));
		System.out.println("max:"+max+" min:"+min);
		
		

	}

}