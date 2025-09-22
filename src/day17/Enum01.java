package day17;

public class Enum01 {
	
	enum Company{
		SK, LG, KT
	}

	public static void main(String[] args) {
		// enum (열거형)
		/* 프로그램에서 서로 관련있는 상수들의 집합을 나타내는 자료형
		 * 코드 가독성을 높이고, 안정성을 높이기 위해 사용
		 * - 특정 값의 집합을 명명된 형태로 정의하여 해당 값들로만 변수를 제한
		 * */
		Enum01 en = new Enum01();
		en.testCompany(Company.KT);
		

	}
	
	public void testCompany(Company company) {
		switch(company) {
		case SK:
			System.out.println("통신사:SK");
			break;
		case LG:
			System.out.println("통신사:LG");
			break;
		case KT:
			System.out.println("통신사:KT");
			break;
		}
	}

}
