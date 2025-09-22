package day06;

import java.util.Scanner;

public class MultiArray03 {

	public static void main(String[] args) {  //method 메서드 = 기능
		// 성적표
		/* 테스트 참가인원 > 3
		 * 이름		국어		영어		수학		합계		평균	 	등수 \t
		 * hong		89		85		75		00		00		00
		 * kim		89		85		75		00		00		00
		 * lee		89		85		75		00		00		00
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("테스트 참가인원 >");
		int tester = scan.nextInt(); // 참가인원
		int subject = 3;
		
		String[] name = new String[tester];
		int[][] scores = new int[tester][subject]; 
		int[] totals = new int[tester];
		double[] avg = new double[tester];
		int[] ranking = new int[tester];
		
		// 점수입력
		for(int i=0; i<tester; i++) {
			System.out.println((i+1)+"번째 이름>");
			name[i] = scan.next();
			//System.out.println(name[i]+"학생의 성적 (국어 영어 수학) >");
			for(int j=0; j<scores[i].length; j++) {
//				scores[i][j] = scan.nextInt(); // 콘솔에서 직접 입력받기
				scores[i][j] = (int)(Math.random()*50)+50; //랜덤성적
				totals[i] += scores[i][j]; // 합계계산
			}
			avg[i] = (double)totals[i]/subject;
		}
		
		//출력
		System.out.println("이름\t 국어\t 영어\t 수학\t 합계\t 평균\t등수\t");
		for(int i=0; i<tester; i++) {
			System.out.print(name[i]+"\t");
			// 성적만 이차원 배열
			for(int j=0; j<scores[i].length; j++) {
				System.out.print(scores[i][j]+"\t");
			}
			System.out.print(totals[i]+"\t");
			System.out.printf("%.2f \t", avg[i]);
			
			// 순위
			int rank = 1;
			for(int r=0; r<tester; r++) {
				if(totals[i] < totals[r]) {
					rank++;
				}
			}
			ranking[i] = rank;
			System.out.print(ranking[i]+"\t");
			System.out.println();
		}
		
	}

}
