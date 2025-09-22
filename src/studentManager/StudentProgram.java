package studentManager;

import java.util.Scanner;

public interface StudentProgram {
	/*1. 학생 등록 
	2. 학생리스트 출력
	3. 학생검색(학생정보, 수강정보)
	4. 수강신청(한 학생에 대한)
	5. 수강철회(한 학생에 대한)
	*/
	void insertStudent(Scanner scan);
	void printStudent();
	void searchStudent(Scanner scan); // int studentNum
	void insertSubject(Scanner scan); // int subjectNum
	void deleteSubject(Scanner scan); // int subjectNum
	
}