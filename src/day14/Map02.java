package day14;

import java.util.HashMap;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {
		// 과목과 점수를 입력받아 map에 저장
		// 종료 키워드가 나올 때까지 반복 (1=계속 / 0=종료)
		// 출력 / 합계 / 평균
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();

		int num = 1;
		int sum = 0; 
		
		while(num != 0) {
			System.out.println("과목/점수 >");

			try {
				String subject = scan.next();
				int score = scan.nextInt();
				map.put(subject, score);
				
				System.out.println("1=계속 / 0=종료 >");
				num = scan.nextInt();
				
			} catch (Exception e) {
				System.err.println("입력값이 잘못되었습니다.");
				scan.nextLine(); // 버퍼남아있는 값 비우는 역할
			}
			if(num == 0) {
				break;
			}
		}
		
		for(String key : map.keySet()) {
			System.out.println(key+":"+map.get(key));
			sum += map.get(key);
		}
		
		
		System.out.println("합계:"+sum +" / 평균:"+((double)sum/map.size()));
		scan.close();
		

	}

}