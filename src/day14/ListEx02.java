package day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx02 {

	public static void main(String[] args) {
		/* 숫자를 입력받아서 입력받은 숫자로 list 생성
		 * 출력 => 전체 합계 출력
		 * 
		 * ex)입력 > 45,78,98,68,51,23,56,94,75,65 enter
		 * split "," => String[]
		 * 숫자로 변환하여 => ArrayList<Integer>
		 * 합계 출력
		 * */
		Scanner scan = new Scanner(System.in);
//		String str = scan.next();
		String str = "45,78,98,68,51,23,56,94,75,65";
		
		String[] num = str.split(",");
		List<Integer> list = new ArrayList<>();
		int sum=0;
		for(String n : num) {
			int number = Integer.parseInt(n); 
			list.add(number);
			sum += number;
		}
		
		System.out.println(list);
		System.out.println(sum);
		
		scan.close();

	}

}