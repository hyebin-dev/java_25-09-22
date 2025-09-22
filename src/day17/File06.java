package day17;

import java.io.File;

public class File06 {

	public static void main(String[] args) {
		// File 객체 : 경로+파일명+확장자 + 내용
		// D:\web_0826_omr\memo\test.txt
		// 파일 구분자 \ / => 운영체제마다 다름 (윈도우, 맥, linux, unix)
		// File.separator : 파일 구분자 생성
		
		File file = new File("D:\\web_0826_omr\\memo");
		System.out.println(File.separator);
		File f = new File(file, File.separator+"test.txt"); // D:\web_0826_omr\memo\test.txt
		
		String name = f.getName();
		System.out.println(name); // 파일명.확장자
		System.out.println(f.getPath()); // 경로+파일명+확장자
		System.out.println(f.getParent()); // 경로만
		
		System.out.println(f.toString());
		// String 제공 메서드를 활용하여 분해
		String fileName = f.toString();
		String f2 = fileName.substring(fileName.lastIndexOf(File.separator)+1);
		System.out.println(f2);
		
	}

}

