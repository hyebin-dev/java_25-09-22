package day03;

public class Exam01 {

	public static void main(String[] args) {
		// 소수 : 약수가 1과 나자신 외에 없는 수
		// 범위는 2~100까지
		// 3 5 7 11 13 
		// 소수만 출력
		
		// 약수의 개수를 확인해야 하는 숫자가 (2~100) 때문에 반복문
		
		for(int i=2; i<=100; i++) {
			// num의 역할을 하는 수 i
			int cnt=0;
			for(int j=1; j<=i; j++) {
				if(i % j == 0) {
					cnt++; // 약수의 개수 세어 저장
					
				}
			}
			
			// 해당 약수 개수가 2개인지 확인
			if(cnt == 2) {
				System.out.println(i);
			}
		}
		
		

	}

}