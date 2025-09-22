package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/* 야구게임
		 * 컴퓨터가 랜덤으로 3자리의 숫자를 생성
		 * (각 자리의 수는 0~9)(중복 불가능)
		 * => 배열로 저장 (랜덤)(중복 불가능)
		 * 유저가 3자리를 맞추는 게임.
		 * 자리와 숫자가 같이 일치하면 strike
		 * 자리는 불일치 숫자만 일치하면 ball
		 * 자리도 숫자도 안맞으면 out
		 * 
		 * ex) com: 1 2 3
		 * user : 1 5 9  => 1s
		 * user : 2 5 8  => 1b
		 * user : 7 8 9  => out
		 * user : 1 9 5  => 1s
		 * user : 1 2 8  => 2s
		 * user : 1 3 2 => 1s 2b
		 * user : 1 2 3 => 3s 정답!!
		 * */
		
		int[] comNum = new int[3];
		int[] userNum = new int[3];
		
		Scanner scan = new Scanner(System.in);
		
		// comNum를 중복없이 생성(랜덤)
		for(int i=0; i<comNum.length; i++) {
			comNum[i] = (int)(Math.random()*10); //0 ~ 9
			// 배열에 중복값이 있는지 확인
			for(int j=0; j<i; j++) {
				if(comNum[i] == comNum[j]) {
					i--;
					break;
				}
			}
			
		}
		//System.out.println(Arrays.toString(comNum));
		//userNum를 String으로 받아서 배열로 split으로 나눠서 저장
		// 숫자로 변환하여 저장
		while(true) {
			//userNum 입력
			System.out.println("숫자입력>");
			String myNum = scan.next();
			//한글자씩 나누어 배열에 저장
			String[] myNumStr = myNum.split("");//한글자씩 잘라 배열로 리턴
			for(int i=0; i<myNumStr.length; i++) {
				//문자를 숫자로 변환
				userNum[i] = Integer.parseInt(myNumStr[i]);
			}
			System.out.println(Arrays.toString(userNum));
			
			//비교
			int stk=0, ball=0;
			
			for(int i=0; i<comNum.length; i++) {
				for(int j=0; j<userNum.length; j++) {
					if((comNum[i] == userNum[j]) && i == j) {
						// 값도 같고 위치도 같다면 스트라이크 하나증가
						stk++;
					}else if((comNum[i] == userNum[j]) && i != j) {
						// 값만 같다면... 
						ball++;
					}
				}
			}
			
			// 출력
			if(stk == 0 && ball == 0) {
				System.out.println("out");
			}else {
				System.out.println("> "+stk+"s "+ball+"b");
			}
			
			if(stk==3) {
				System.out.println("정답!!");
				break;
			}
			
		}	
		
		
	}

}

