package studentManager;

import java.util.Scanner;

public class StudentController implements StudentProgram {
	
	// 학생을 등록하기 위한 배열 Student[] (내부에 subject[])
	private Student[] studentList = new Student[5];
	private int cnt; // studentList index 처리하기 위한 변수
		
	// 수강신청을 위한 과목 목록 배열 : 수강신청이 가능한 모든 과목의 목록
	// Subject[]
	private Subject[] subList = new Subject[5];
	
	// 미리 학생 등록
	public void addStudent() {
		studentList[cnt] = new Student("1", "이순신", 20, "010-1111-1111", "서울시");
		cnt++;
		studentList[cnt] = new Student("2", "박철수", 20, "010-1111-2222", "수원시");
		cnt++;
		studentList[cnt] = new Student("3", "김영이", 20, "010-1111-3333", "서울시");
		cnt++;
	}
	
	public void addSubject() {
		//과목코드, 과목명, 수강기간, 시수, 강사명, 강의장
		subList[0] = new Subject("111","C","250315~250415",3,"홍길동","A강의장");
		subList[1] = new Subject("222","C++","250415~250515",5,"김길동","B강의장");
		subList[2] = new Subject("333","JAVA","250515~250615",2,"박길동","C강의장");
		subList[3] = new Subject("444","Python","250615~250715",8,"최길동","D강의장");
		subList[4] = new Subject("555","HTML","250715~250815",3,"길동","E강의장");
	}
	
	public void printSubList() {
		int i=1;
		System.out.println("--수강신청목록--");
		for(Subject s : subList) {
//			System.out.println(i+"."+s);  //toString으로 출력
			System.out.print(i+".");
			s.printSubject();
			i++;
		}
		System.out.println("--------------");
	}
		
	public int menuPrint(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("--menu--");
		System.out.println("1.학생 등록|2.학생리스트|3.학생검색");
		System.out.println("4.수강신청|5.수강철회|6.종료");
		System.out.println("menu > ");
		return scan.nextInt();
	}

	@Override
	public void insertStudent(Scanner scan) {
		// 학생등록 
		System.out.println("학번>");
		String num = scan.next();
		// 학번 중복 불가처리
		for(int i=0; i<cnt; i++) {
			if(studentList[i].getStdNum().equals(num)) {
				System.out.println("학번이 중복됩니다.");
				return;
			}
		}
		System.out.println("이름>");
		String name = scan.next();
		System.out.println("나이>");
		int age = scan.nextInt();
		System.out.println("전화번호>");
		String phone = scan.next();
		System.out.println("주소>");
		scan.nextLine();  //윗쪽 공백처리용
		String address = scan.nextLine();
		
		// 학생 객체 생성
		Student s = new Student(num, name, age, phone, address);
		studentList[cnt] = s;
		cnt++;
		
	}

	@Override
	public void printStudent() {
		// 전체 학생 목록 출력 (수강정보X)
		System.out.println("--전체 학생명단--");
		for(int i=0; i<cnt; i++) {
			studentList[i].printInfo(); //출력메서드로 출력
//			System.out.println(studentList[i]); //toString으로 출력
		}
		
	}
	
	// 학생의 학번을 입력받아 그학생의 번지를 리턴하는 메서드 
	public int indexSearch(String stdNum) {
		int index = -1;
		for(int i=0; i<cnt; i++) {
			if(studentList[i].getStdNum().equals(stdNum)) {
//				return i;
				index = i;
			}
		}
//		return -1;
		return index;
	}
	
	public String inputStdNum(Scanner scan) {
		System.out.println("학번>");
		return scan.next();
	}

	@Override
	public void searchStudent(Scanner scan) {
		// 한 학생의 정보 출력 (기본정보, 수강정보)
		// 검색할 학생의 학번을 입력받아 정보를 출력
		//String stdNum = inputStdNum(scan);
		int index = indexSearch(inputStdNum(scan));
		if(index == -1) {
			System.out.println("학생정보가 없습니다.");
			return;
		}
		studentList[index].printInfo();
		studentList[index].printSubject();
	}

	@Override
	public void insertSubject(Scanner scan) {
		// 수강신청
		// 수강신청할 학생의 학번을 입력받아 학생의 번지를 리턴 
		int index = indexSearch(inputStdNum(scan));
		if(index == -1) {
			System.out.println("학생정보가 없습니다.");
			return;
		}
		// 수강신청과목을 입력받고, 등록
		printSubList();
		System.out.println("수강과목 선택(번호로 선택)>");
		int subIndex = scan.nextInt(); // [subIndex -1]
		if(subIndex <0 || subIndex > subList.length) {
			System.out.println("없는 과목입니다.");
			 return;
		}
		
		// 수강신청 학생에게 과목을 추가 insertSubject()
		studentList[index].insertSubject(subList[subIndex-1]);
	}

	@Override
	public void deleteSubject(Scanner scan) {
		// 수강철회
		// 수강신청할 학생의 학번을 입력받아 
		int index = indexSearch(inputStdNum(scan));
		if(index == -1) {
			System.out.println("학생정보가 없습니다.");
			return;
		}
		System.out.println("--수강과목리스트--");
		studentList[index].printSubject();
		
		// 수강철회과목을 입력받고, 철회
		System.out.println("철회과목 선택(과목코드로 선택)>");
		String subNum = scan.next(); 
		studentList[index].deleteSubject(subNum);
		
	}

}
