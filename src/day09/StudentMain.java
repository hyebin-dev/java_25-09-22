package day09;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		// 학생정보를 관리하기 위한 클래스 생성
		// 학생 기본정보: 이름, 전화번호, 생년월일, 나이
		// 학원 정보: 학원명="KOREAIT", 지점
		// 수강 과목: 수강과목, 기간
		// 		=> 수강과목은 여러과목을 들을 수 있음.[5] / 기간[5]
		
		/* ex) 홍길동,  010-1111-1111, 010101, 25
		 *     KOREAIT, 강남
		 *     java,		2025-08-01~2025-08-30
		 *     웹개발국비, 	2025-08-26~2026-02-14
		 *     DB, 			2025-09-15~2025-10-15
		 * */
		
		// 기본 Student[5] 더 추가되면 배열복사 
		Scanner scan = new Scanner(System.in);
		
		// 등록된 학생 배열
		Student[] std = new Student[5];
				
		String[] gigum = {"강남","신촌","인천","대전","수원"};
		String[] subjectName = {"java","DB","javaScript","python","C","웹국기"};
		String[] subjectDate = {"2025-08-01~2025-08-30","2025-09-15~2025-10-15","2025-07-01~2025-07-31","2025-10-01~2025-10-31",
				"2025-09-01~2025-09-31","2025-08-26~2026-02-14"};
		
		System.out.println("학생명 >");
		String name = scan.next();
		System.out.println("전화번호 >");
		String phone = scan.next();
		Student s = new Student(name, phone);
		
		System.out.println("--지점선택--");
		int gIdx = 0;
		for(String g : gigum) {
			gIdx++;
			System.out.print(gIdx+"."+g+"  ");
		}
		System.out.println();
		System.out.println("지점 > ");
		int gigumIdx = scan.nextInt();
		s.setBranch(gigum[gigumIdx-1]);
		
		System.out.println();
		System.out.println("--과목 선택--");
		for(int i=0; i<subjectName.length; i++) {
			System.out.println((i+1)+"."+subjectName[i]+" / "+subjectDate[i]);
		}
		System.out.println();
		System.out.println("과목 >");
		int subjectIdx = scan.nextInt();
		
		s.insertCourse(subjectName[subjectIdx-1], subjectDate[subjectIdx-1]);
		
		std[0] = s;
//		std[0].printInfo();
//		std[0].printCompany();
//		std[0].printCourse();
		
		std[1] =new Student("kim", "010101", "010-2222-2222", 25, "신촌");
		std[1].insertCourse(subjectName[1], subjectDate[1]);
		std[1].insertCourse(subjectName[0], subjectDate[0]);
		std[1].insertCourse(subjectName[5], subjectDate[5]);
		
		std[2] =new Student("lee", "010103", "010-3333-2222", 25, "강남");
		std[2].insertCourse(subjectName[3], subjectDate[3]);
		std[2].insertCourse(subjectName[0], subjectDate[0]);
		std[2].insertCourse(subjectName[5], subjectDate[5]);
		
		std[3] =new Student("pack", "030801", "010-2222-5555", 22, "인천");
		std[3].insertCourse(subjectName[4], subjectDate[4]);
		std[3].insertCourse(subjectName[5], subjectDate[5]);
		
		std[4] =new Student("choi", "020901", "010-9999-2222", 23, "신촌");
		
//		System.out.println("----전체 학생 정보----");
//		//학생정보와 지점 정보만 출력
//		for(Student tmp : std) {
//			tmp.printInfo();
//			tmp.printCompany();
//			tmp.printCourse();
//		}
		
//		String searchBranch = "강남";
//		//강남 지점 학생 명단 출력
//		for(int i=0; i<std.length; i++) {
//			if(std[i].getBranch().equals(searchBranch)) {
//				std[i].printInfo();
//				std[i].printCompany();
//				std[i].printCourse();
//			}
//		}
//		
//		System.out.println("-------------------");
//		String searchCourse = "웹국기";
//		// java를 수강하고 있는 학생 명단
//		System.out.println("--"+searchCourse+" 수강학생 목록--");
//		
//		int cnt=0;
//		while(cnt<std.length) {
//			for(int i=0; i<std[cnt].getCnt(); i++) {
//				if(std[cnt].getCourse()[i].equals(searchCourse)) {
//					std[cnt].printInfo();
//					std[cnt].printCompany();
//					std[cnt].printCourse();
//				}
//			}
//			cnt++;
//		}
		
		//학생 이름을 입력받아 입력받은 학생의 정보를 출력
		System.out.println("검색 학생명 >");
		String searchName = scan.next();
		for(int i=0; i<std.length; i++) {
			if(std[i].getName().equals(searchName)) {
				std[i].printInfo();
				std[i].printCompany();
				std[i].printCourse();
			}
		}
		
//		System.out.println("사용자가 선택한 지점");
//		System.out.println(gigum[gigumIdx-1]);
//		System.out.println("사용자가 선택한 과목");
//		System.out.println(subjectName[subjectIdx-1]+
//				" / "+subjectDate[subjectIdx-1]);
		
		scan.close();

	}

}