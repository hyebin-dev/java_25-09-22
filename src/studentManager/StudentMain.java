package studentManager;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. 학생 등록 
		2. 학생리스트 출력
		3. 학생검색(학생정보, 수강정보)
		4. 수강신청(한 학생에 대한)
		5. 수강철회(한 학생에 대한)
		6. 종료*/
		
		Scanner scan = new Scanner(System.in);
		
		StudentController sc = new StudentController();
		
		sc.addSubject(); //과목목록 미리 생성
		sc.addStudent(); //test 학생 미리 생성
		
		int menu = 0;
		do {
			// 컨트롤러에 메서드 추가하기
			// 리턴 int / 매개변수(scan)
			
			menu = sc.menuPrint(scan);
			
			switch(menu) {
			case 1: sc.insertStudent(scan); break;
			case 2: sc.printStudent(); break;
			case 3: sc.searchStudent(scan); break;
			case 4: sc.insertSubject(scan); break;
			case 5: sc.deleteSubject(scan); break;
			case 6: System.out.println("종료합니다."); break;
			default: System.out.println("잘못된 메뉴");
			}
			
			
		}while(menu != 6);
		
		scan.close();
		
	}

}

