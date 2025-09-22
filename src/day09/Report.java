package day09;

import java.text.DecimalFormat;

public class Report {
	// 이름	 국어	 영어	 수학	 합계	 평균	등수
	// 생성자 (이름, 국어, 영어, 수학)
	// 기본생성자()
	// 합계 평균 계산메서드
	// 출력메서드
	// getter/setter
	
	private String name;
	private int korScore;
	private int engScore;
	private int mathScore;
	private int sum;
	private double avg;
	private int rank;
	
	public Report() {}
	
	public Report(String name, int kor, int eng, int math) {
		this.name = name;
		this.korScore = kor;
		this.engScore = eng;
		this.mathScore = math;
		this.sum = kor+eng+math;
		this.avg = (double)sum / 3;
	}
	
	//합계, 평균 계산 메서드
	public void total() {
		this.sum = korScore+engScore+mathScore;
		this.avg = (double)sum / 3;
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("##.00");
		return name + "\t" + korScore + "\t" + engScore + "\t" + mathScore
				+ "\t" + sum + "\t" + df.format(avg) + "\t" + rank;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorScore() {
		return korScore;
	}
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	

}