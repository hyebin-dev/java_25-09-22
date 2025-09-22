package day04;

public class For08 {

	public static void main(String[] args) {
		// 구구단 2~9단까지  
		// 2*1=2 ... 2*9=18
		// ...
		// 9*1=9 ... 9*9=81
		
		int dan = 9; 
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
		System.out.println("--------------");
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+" ");
			}
			System.out.println();//줄바꿈
		}
		

	}

}