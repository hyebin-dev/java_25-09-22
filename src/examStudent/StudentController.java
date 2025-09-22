package examStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentController {
	private List<Student> studentList = new ArrayList<>();
	private List<Subject> subList = new ArrayList<>();

	public void addSubject() {
		// 과목목록 미리 생성
		//과목코드, 과목명, 수강기간, 시수, 강사명, 강의장
		subList.add(new Subject("111","C","250315~250415",3,"홍길동","A강의장"));
		subList.add(new Subject("222","C++","250415~250515",5,"김길동","B강의장"));
		subList.add(new Subject("333","JAVA","250515~250615",2,"박길동","C강의장"));
		subList.add(new Subject("444","Python","250615~250715",8,"최길동","D강의장"));
		subList.add(new Subject("555","HTML","250715~250815",3,"길동","E강의장"));
		
	}

	public void addStudent() {
		// test 학생 미리 생성
		studentList.add(new Student("1", "이순신", 20, "010-1111-1111", "서울시"));
		studentList.add(new Student("2", "박철수", 20, "010-1111-2222", "수원시"));
		studentList.add(new Student("3", "김영이", 20, "010-1111-3333", "서울시"));
	}

	public int menuPrint(Scanner scan) {
		// 컨트롤러에 메서드 추가하기
		// 리턴 int / 매개변수(scan)
		System.out.println("--menu--");
		System.out.println("1.학생 등록|2.학생리스트|3.학생검색");
		System.out.println("4.학생수정|5.학생삭제");
		System.out.println("6.수강신청|7.수강철회|8.과목별명단조회");
		System.out.println("9.종료");
		System.out.println("menu > ");
		return scan.nextInt();
	}

	public void insertStudent(Scanner scan) {
		// 학생등록
		System.out.println("학번>");
		String num = scan.next();
		
		// 학번 중복 불가처리
		if(studentList.contains(new Student(num))) {
			System.out.println("이미 있는 학번입니다.");
			return;
		}
		
//		//만약 equals 오버라이딩 부분이 없다면...
//		for(Student s : studentList) {
//			if(s.getStdNum().equals(num)) {
//				System.out.println("이미 있는 학번입니다.");
//				return;
//			}
//		}
		
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
		studentList.add(s);
		System.out.println("학생등록완료!");
	}

	public void printStudent() {
		// 학생목록
		System.out.println("--학생목록--");
		for(Student s: studentList) {
			s.printInfo();
			s.printSubject();
		}
		System.out.println("-----------------");
		
	}

	public void searchStudent(Scanner scan) {
		// 학생검색
		System.out.println("학번>");
		String num = scan.next();
		//indexOf(object) : 해당 객체가 몇번지에 있는지 확인
		int index = studentList.indexOf(new Student(num));
		if(index == -1) {
			System.out.println("검색 학생이 없습니다.");
			return;
		}
		System.out.println("--Search Result--");
		studentList.get(index).printInfo();
		studentList.get(index).printSubject();
	}

	public void insertSubject(Scanner scan) {
		// 수강신청
		System.out.println("학번>");
		String num = scan.next();
		int index = studentList.indexOf(new Student(num));
		if(index == -1) {
			System.out.println("신청 학생이 없습니다.");
			return;
		}
		System.out.println("--수강신청 목록--");
		int cnt = 1;
		for(Subject s : subList) {
			System.out.print(cnt+".");
			s.printSubject();
			cnt++;
		}
		System.out.println("--------------");
		System.out.println("수강신청 번호>");
		String subNum = scan.next();
		int subNumInt = Integer.parseInt(subNum);
		if(subNumInt > subList.size() || subNumInt <=0) {
			System.out.println("과목코드를 확인해주세요.");
			return;
		}
		//내가 선택한 과목
		Subject mySub = subList.get(subNumInt-1);
		studentList.get(index).insertSubject(mySub);
		
	}

	public void deleteSubject(Scanner scan) {
		// 수강삭제
		System.out.println("학번>");
		String num = scan.next();
		int index = studentList.indexOf(new Student(num));
		if(index == -1) {
			System.out.println("신청 학생이 없습니다.");
			return;
		}
		System.out.println("--삭제 과목번호 선택--");
		studentList.get(index).printSubject();
		String subNum = scan.next();
		studentList.get(index).deleteSubject(subNum);
		
	}

	public void modifyStudent(Scanner scan) {
		// 학생정보수정
		// 학번을 입력받아 해당 학번을 삭제하고, 다시 등록
		System.out.println("학번>");
		String num = scan.next();
		//studentList.remove(new Student(num)); // 삭제 진행
		if(!studentList.remove(new Student(num))) {
			System.out.println("학번을 확인해주세요.");
			return;
		}
		
		insertStudent(scan); //다시 등록
	}

	public void deleteStudent(Scanner scan) {
		// 학생 삭제
		System.out.println("학번>");
		String num = scan.next();
		//studentList.remove(new Student(num)); // 삭제 진행
		if(!studentList.remove(new Student(num))) {
			System.out.println("학번을 확인해주세요.");
			return;
		}
		System.out.println("학생삭제완료!");
		
	}

	
public void subjectStudentList(Scanner scan) {
		// 과목별 학생 리스트
		System.out.println("과목번호>");
		String subNum = scan.next();
		int index = subList.indexOf(new Subject(subNum));
		if(index == -1) {
			System.out.println("과목번호가 없습니다.");
			return;
		}
		String name = subList.get(index).getSubName();
		System.out.println("--"+name+" 수강자 명단--");
		int cnt = 0;
		for(Student s : studentList) {
			if(s.getSubject().contains(new Subject(subNum))) {
				// 해당 객체가 존재하면... 
				s.printInfo();
				cnt++;
			}
		}
		
		if(cnt == 0) {
			System.out.println("수강자가 없습니다.");
		}
		
	}

}