package day04;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		/* 5명의 점수를 입력받기.
		 * 1. 배열을 생성
		 * 2. 배열에 점수를 입력받기 (0~100)
		 * 3. 배열의 점수를 출력
		 * 4. 점수의 합계/ 평균을 출력
		 * */
		Scanner scan = new Scanner(System.in);
		int[] arr = new int [5];
		int sum=0;
		
		System.out.println("학생점수 5명을 입력해주세요.");
		for(int i=0; i<arr.length; i++) {
			int score = scan.nextInt();
			while(score < 0 || score > 100) {
				System.out.println("점수가 범위를 벗어났습니다.");
				System.out.println("점수를 다시 입력해주세요.");
				score = scan.nextInt();
			}
			System.out.println("점수입력성공!");
			arr[i] = score;				
			sum = sum + arr[i];  // sum += arr[i]
		}
		
		for(int a : arr) {
			System.out.print(a+" ");
		}
		
		System.out.println();
		System.out.println("합계:"+sum);
		System.out.println("평균:"+ ((double)sum/arr.length));
		
		

	}

}