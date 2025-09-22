package day04;

public class StringEx02 {

	public static void main(String[] args) {
		/* fileName.suffix
		 * 파일명과 확장자를 분리하여 출력
		 * 확장자가 "java"면 자바파일입니다. / 기타파일입니다.
		 * */
		String file = "자바의정석.java";
		
		String[] fileArr = file.split("\\.");
		
		for(String f : fileArr) {
			System.out.println(f);
		}
		if(fileArr[1].equals("java")) {
			System.out.println("자바파일입니다.");
		}else {
			System.out.println("기타파일입니다.");
		}

	}

}