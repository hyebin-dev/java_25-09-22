package day17;

import java.io.FileWriter;
import java.io.IOException;

public class File04 {

	public static void main(String[] args) throws IOException {
		// D:\web_0826_omr\memo
		// 경로를 적지 않으면, 내 프로젝트 내에 생성 (현재폴더)
		
		String fileName = "D:\\web_0826_omr\\memo\\writer.txt";
		// 파일이름 (경로 + 파일명 + 확장자)
		FileWriter fw = new FileWriter(fileName);
		for(int i=1; i<=10; i++) {
			String data = i+". test \n";
			fw.write(data);
		}
		fw.close();

	}

}