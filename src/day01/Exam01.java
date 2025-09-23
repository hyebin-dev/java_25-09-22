package day01;

public class Exam01 {
	
	public static void main(String[] args) {
		// 카페에 제출
		/* 국어, 영어, 수학 변수로 선언 값을 할당.
		 * 합계와 평균을 출력
		 * 국어:89, 영어:79, 수학:69
		 * 합계:XXX, 평균:XXX, 결과:합격
		 * 조건선택 연산자를 이용하여 평균이 80이상이면 합격, 아니면 불합격
		 * */
		
		/*int korean = 90;
		int english = 80;
		int math = 70;
		int avg;
		
		System.out.println("합계:"+ (korean+english+math));
		System.out.println( "평균:" + (avg = (korean+english+math)/3));
		System.out.println(avg>=80 ? "합격" : "불합격");
		->내가 만든 코드
		*/
		
		int kor = 78;
		int eng = 98;
		int math = 80;
		int sum = kor + eng + math;
		// 정수 / 정수 = 정수
		double avg = (double)sum / 3;
		System.out.println("국어:"+kor+", 영어:"+eng+", 수학"+math);
		System.out.println("합계:"+sum+",평균"+avg);
		System.out.println("결과:"+(avg>=80 ? "합격":"불합격"));
		
		
	}

}
