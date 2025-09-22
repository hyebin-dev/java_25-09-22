package day03;

import java.util.Scanner;

public class For07 {

	public static void main(String[] args) {
		// 숫자를 입력받아 그 수가 소수인지 아닌지 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자>");
		int num = scan.nextInt();
		int cnt=0;
		
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				System.out.println("소수가 아닙니다.");
				return;
			}
		}
		System.out.println("소수입니다.");
		
//		if(cnt==2) {
//			System.out.println("소수입니다.");
//		}else {
//			System.out.println("소수가 아닙니다.");
//		}

	}

}