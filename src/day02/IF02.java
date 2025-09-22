package day02;

import java.util.Scanner;

public class IF02 {

	public static void main(String[] args) {
		/* 국어, 영어, 수학점수를 입력받아
		 * 합계, 평균, pass여부를 출력
		 * pass 기준은 평균이 80이상 - if
		 * return; : 리턴 값을 주고 메서드 종료
		 * 
		 * method return void => 리턴 값이 없음.
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("국어/영어/수학 순으로 입력>");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		// 모든 조건은 하나씩 구분해서 사용 
		//조건들 간의 연결은 and (&&)  or (||)
//		if((kor>100 || kor<0) || (eng>100 || eng<0) || (math>100 || math<0)) {
//			System.out.println("잘못된 점수입니다.");
//		}else {
//			int sum = kor+eng+math;
//			double avg = (double)sum / 3;
//			System.out.println("sum:"+sum+"/avg:"+avg);
//			
//			if(avg>=80) {
//				System.out.println("pass");
//			}
//		}
		
		if((kor>100 || kor<0) || (eng>100 || eng<0) || (math>100 || math<0)) {
			System.out.println("잘못된 점수입니다.");
			return;
		}
		
		int sum = kor+eng+math;
		double avg = (double)sum / 3;
		System.out.println("sum:"+sum+"/avg:"+avg);
		
		if(avg>=80) {
			System.out.println("pass");
		}
		

	}

}
