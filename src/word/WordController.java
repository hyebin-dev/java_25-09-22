package word;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordController {
	private List<Word> wordBook = new ArrayList<>();
	
	public void addWord() {
		// 기본 단어 추가
	Word w = new Word("dog");
	List<String> tmp = new ArrayList<>();
	tmp.add("강아지");
	tmp.add("개");
	tmp.add("뽀삐");
	w.setMean(tmp);
	wordBook.add(w);

	List<String> tmp2 = new ArrayList<>();
	tmp2.add("고양이");
	tmp2.add("야옹이");
	tmp2.add("냥이");
	Word w2 = new Word("cat", tmp2);
	wordBook.add(w2);
	
	List<String> tmp3 = new ArrayList<>();
	tmp3.add("돼지");
	tmp3.add("꿀꿀이");
	Word w3 = new Word("pig", tmp3);
	wordBook.add(w3);
	
	}

	public int menuPrint(Scanner scan) {
		// 메뉴 출력 > 입력받기
		System.out.println("1.단어등록|2.단어검색|3.단어수정|\n"
				+ "4.단어출력|5.단어삭제|6.단어파일로출력|7.종료");
		System.out.println("menu>");
		return scan.nextInt();
	}

	public void insertWord(Scanner scan) {
		// 단어 등록
		System.out.println("단어>");
		String word = scan.next();
		List<String> tmp = new ArrayList<>();
		
		String end = "a";
		while(!end.toLowerCase().equals("y")) {
			System.out.println("뜻>");
			tmp.add(scan.next());
			System.out.println("종료(y)>");
			end = scan.next();
		}
		wordBook.add(new Word(word,tmp));
		System.out.println("등록완료!");
	}

	public void searchWord(Scanner scan) {
		// 단어 검색
		System.out.println("단어>");
		String word = scan.next();
		int index = wordBook.indexOf(new Word(word));
		if(index == -1) {
			System.out.println("검색 단어가 없습니다.");
			return;
		}
		System.out.println(wordBook.get(index));
	}

	public void modifyWord(Scanner scan) {
		// 단어 수정
		System.out.println("단어>");
		String word = scan.next();
		int index = wordBook.indexOf(new Word(word));
		if(index == -1) {
			System.out.println("수정 단어가 없습니다.");
			return;
		}
		List<String>mean = wordBook.get(index).getMean();
		int cnt=1;
		for(String m : mean) {
			System.out.println(cnt+". "+m);
			cnt++;
		}
		System.out.println("수정할 뜻 번호 선택 >");
		int i = scan.nextInt();
		System.out.println("변경 뜻 >");
		String modify = scan.next();
		mean.set(i-1, modify);
		wordBook.set(index, new Word(word,mean));
		System.out.println("수정완료!");
		
	}

	public void printWord() {
		// 전체 단어장 출력
		System.out.println("---단어장---");
		for(Word w : wordBook) {
			System.out.println(w);
		}
		System.out.println("----------------------");
		
	}

	public void deletetWord(Scanner scan) {
		// 단어 삭제
		System.out.println("단어>");
		String word = scan.next();
		if(wordBook.remove(new Word(word))) {
			System.out.println("삭제완료!");
			return;
		}
		System.out.println("삭제단어가 없습니다.");
	}

	public void fileWord() throws IOException {
		// 파일로 출력
		// StringBuffer 객체 사용 => 추가기능 append
		// String 객체의 확장 버전 
		// StringBuffer 객체를 => String으로 변환하여 저장
		
		String fileName = "D:\\web_0826_omr\\memo\\word.txt";

		BufferedWriter bw = 
				new BufferedWriter(new FileWriter(fileName));
			
		StringBuffer sb = new StringBuffer();

		sb.append("--단어장--\r\n");
		
		for(Word w : wordBook) {
			sb.append(w);
			sb.append("\r\n");
		}
		
		bw.write(sb.toString());
		System.out.println(sb.toString());
		bw.close();
		
	}

}
