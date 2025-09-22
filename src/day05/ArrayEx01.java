package day05;

import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		// 파일명을 저장하고 있는 배열이 주어졌을 때
		// 검색어를 입력하면 해당 검색어를 포함하고 있는 파일을 출력
		// 검색 결과 없다면 => 일치하는 항목이 없습니다. 출력
		
		String[] fileName = {
				"이것이자바다.java", "java의정석.java","Array.txt",
				"array.java","String.png", "StringMethod.jpg",
				"ArrayMethod.java", "method.png", "javaMethod.jpg"
		};
		
		// 대소문자 구분없이 검색어 출력
		// 1. 검색어를 입력받기
		Scanner scan = new Scanner(System.in);
		
		System.out.println("검색어 입력>");
		
		String search = scan.next();
		
		// 2. 배열명에 검색어가 있는지 확인
		// 문자열 속에 단어가 포함되어 있는지 확인 => contains
		// 소문자 변환 toLowerCase()
		
		// 3. 일치하는 개수 파악
		int count=0;
		
		for(int i=0; i<fileName.length; i++) {
			if(fileName[i].toLowerCase().contains(search.toLowerCase())) {
				System.out.println(fileName[i]);
				count++;
			}
		}
		
		if(count==0) {
			System.out.println("일치하는 항목이 없습니다.");			
		}else {
			System.out.println("------------");
			System.out.println("검색결과 "+count+"개");
		}
		
	}

}
