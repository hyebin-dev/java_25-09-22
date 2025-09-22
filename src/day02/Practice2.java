package day02;

public class Practice2 {

	public static void main(String[] args) {
		/* 2. 랜덤수 10개 받아서 합계,최대값,최소값,평균구하기 (1~100숫자)
		 * 힌트: max,min 변수 만들고 처음 입력한 랜덤수로 초기화
		 */
		
        int r = (int)(Math.random()*100+1);
		int max = r; // 첫번째 랜덤값으로 변수 초기화!
		int min = r;
		int sum = r;
		System.out.println(r); // 첫번째 랜덤값 출력
		for (int i = 1; i<10; i++) {
			r=(int)(Math.random()*100+1);
			System.out.println(r);
			sum += r;
			if (max<r) {
				max = r;
			}
			else if(min>r) {
				min = r;
			}
		}
		System.out.println("합계:"+sum);
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		System.out.println("평균:"+(double)sum/10);
		
		
	}
}
