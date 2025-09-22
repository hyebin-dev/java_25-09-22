package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/* 숫자를 입력받아 입력받은 숫자의 합계와 평균을 출력
		 * (0이나 -숫자를 입력하면 종료)
		 * 출력 : 3+5+4+8+9 0 = 합, 평균
		 * */
		Scanner scan = new Scanner(System.in);
		
		int num=0, sum=0, count=0;
		// 배열로 입력받아서 출력
		int[] number = new int[3];
		
		do {
			System.out.println("숫자입력(0또는 음수면 종료) >");
			num = scan.nextInt();
			if(num <= 0) {
				System.out.println("종료합니다.");
				break;
			}
			// 배열에 공간이 남았는지 확인
			if(number.length == count) {
				// 새 배열 생성 => arraycopy
				int[] newNumber = new int[number.length+3];
				System.arraycopy(number, 0, newNumber, 0, number.length);
				number = newNumber; // 새배열을 기존 배열로 바꿔치기.
			}
			number[count] = num;
			sum += num;
			count++;
			
		}while(num > 0);
		
		if(count==0) {
			System.out.println("입력한 숫자가 없습니다.");
		}else {
			System.out.println("--계산식--");
			for(int i=0; i<count-1; i++) {
				System.out.print(number[i]+"+");
			}
			System.out.println(number[count-1]);
			System.out.println("합계:"+sum+" / 평균:"+((double)sum/count));
			System.out.println(Arrays.toString(number));
		}
		
	
		// 출력 형식을 String으로 출력
//		String total="";
//		
//		do {
//			System.out.println("숫자입력(0또는 음수면 종료) >");
//			num = scan.nextInt();
//			if(num > 0) {
//				sum = sum + num;
//				count++;	
//				total = total.concat("+")
//						.concat(String.valueOf(num)); // +1+2+3
//			}
//		}while(num > 0);
//		
//		if(count==0) {
//			System.out.println("입력한 숫자가 없습니다.");
//		}else {
//			System.out.println("--계산식--");
//			System.out.println(total.substring(1));
//			System.out.println("합계:"+sum+" / 평균:"+((double)sum/count));
//		}
			

	}

}