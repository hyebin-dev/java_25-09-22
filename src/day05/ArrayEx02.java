package day05;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 그림파일만 출력 확장자가 jpg, png
		
		String[] fileName = {
				"이것이자바다.java", "java의정석.java","arrayjpg.txt",
				"array.java","String.Png", "String.Method.jpg",
				"Array.Method.java", "method.png", "java.Method.jpg"
		};
		
		boolean check = false;
		// 파일의 확장자만 추출 
		for(int i=0; i<fileName.length; i++) {
			String suffix = fileName[i].substring(fileName[i].lastIndexOf(".")+1);
			if(suffix.toLowerCase().equals("jpg") || suffix.toLowerCase().equals("png")) {
				System.out.println(fileName[i]);
				check = true;
			}
		}
		if(!check) {
			System.out.println("그림파일이 없습니다.");
		}

	}

}