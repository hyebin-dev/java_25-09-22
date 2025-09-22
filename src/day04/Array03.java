package day04;

public class Array03 {

	public static void main(String[] args) {
		// arr 배열의 최대값, 최소값, 합계, 평균 출력
		 
		int arr[] = {67,89,56,86,26,85,64,26,75,57,78,73,90};
		int max = arr[0];
		int min = arr[0]; // 잊지말기!
		int sum = 0;
		double avg=0;
		
		for(int i=0; i<arr.length;i++) {
		
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
//			if (max<arr[i]) {
//				max = arr[i];
//			}
//			else if(min>arr[i]) {
//				min = arr[i];
//			}
			
			sum = sum+arr[i];
			}
		avg = (double)sum/arr.length;
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		System.out.println("합계"+sum);
		System.out.println("평균:"+(double)sum/arr.length);
		System.out.printf("avg: %.2f", avg);
		
	}

}
