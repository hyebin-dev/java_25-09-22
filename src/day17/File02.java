package day17;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class File02 {

	public static void main(String[] args) throws IOException {
		// FileWriter => 추가모드 가능. 
		
		FileWriter fw = new FileWriter("test.txt");
		for(int i=1; i<=10; i++) {
			String data = i+". test!!\n";
			fw.write(data);
			fw.write("I/O Test File Output!!\n");
		}
		fw.close();
		
		// 추가모드 : 기존 파일에 데이터를 쓰려고 할 때
		FileWriter fw2 = new FileWriter("test.txt", true);
		
		for(int i=11; i<=20; i++) {
			String data = i+". test!!\n";
			fw2.write(data);
		}
		fw2.close();
		
		// PrintWriter
		PrintWriter pw = new PrintWriter("writer.txt");
		
		for(int i=1; i<=10; i++) {
			String data = i+". printWriter Test!!\n";
			pw.write(data);
			pw.write("I/O Test File Output!!\n");
		}
		pw.close();
		
		// PrintWriter 파일 내용 추가하기
		PrintWriter pw2 = new PrintWriter(new FileWriter("writer.txt", true));
		for(int i=11; i<=20; i++) {
			String data = i+". append mod!!\n";
			pw2.write(data);
		}
		pw2.close();
		
		// 바이트 기반 스트림
		FileOutputStream output = new FileOutputStream("out.txt");
		
		for(int i=1; i<=10; i++) {
			String data = i+". 바이트 기반 스트림 테스트 \n";
			output.write(data.getBytes());
		}
		output.close();
		
	}

}
