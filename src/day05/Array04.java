package day05;

public class Array04 {

	public static void main(String[] args) {
		// 배열
		// 5개의 숫자 값을 가지는 배열을 생성
		// 1 2 3 4 5 입력하고 / 출력
		int[] arr = new int[5];
		System.out.println(arr[0]);
		System.out.println("-----");
		arr[0]=1;
		arr[1]=2;
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int a : arr) {
			System.out.println(a);
		}
			
			
			

	}

}
