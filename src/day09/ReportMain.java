package day09;

import java.util.Scanner;

public class ReportMain {

	public static void main(String[] args) {
		// 레포트 배열
		// 데이터 스케너로 받기
		// 순위계산
		Scanner scan = new Scanner(System.in);
		System.out.println("테스트 참가인원 >");
		int count = scan.nextInt(); 
		Report[] report = new Report[count];
		
		for(int i=0; i<count; i++) {
			System.out.println(i+1+"번째 이름/국어/영어/수학 순으로 입력 >");
			String name = scan.next();
			int kor = scan.nextInt();
			int eng = scan.nextInt();
			int math = scan.nextInt();
//			Report r = new Report();
//			r.setName(name);
//			r.setKorScore(kor);
//			r.setEngScore(eng);
//			r.setMathScore(math);
//			r.total();
			Report r = new Report(name, kor, eng, math); // sum, avg
			report[i] = r;
		}
		
		// 순위계산
		for(int i=0; i<count; i++) {
			int rank = 1;
			for(int j=0; j<count; j++) {
				if(report[i].getSum() < report[j].getSum()) {
					rank++;
				}
			}
			report[i].setRank(rank);
		}
		
		
		// 출력
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t순위");
		System.out.println("---------------------------------------------------");
		for(Report r : report) {
			System.out.println(r);
		}
		
		
		
		//소수점 형식 맞춤
//		DecimalFormat df = new DecimalFormat("##.00");
//		double a = 3;
//		System.out.println(df.format(a));
		
		
		scan.close();

	}

}