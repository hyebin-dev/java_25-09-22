package day04;

public class StringEx01 {

	public static void main(String[] args) {
		// 주민등록번호를 참고하여 생년월일과 성별 나이를 출력
		
		String regNum = "990101-1234567";  // 1900년대생 => 1(남) 2(여)
//		String regNum = "000101-4456789"; // 2000년대생 => 3(남) 4(여)
		int today = 2025;
		
		int i = regNum.indexOf("-");
		
		String birth = regNum.substring(0,i);
		System.out.println("생년월일:"+birth);
		
		String rNum = regNum.substring(i+1, i+2);
		//System.out.println(rNum);
		char ch = regNum.charAt(i+1);
		System.out.println(ch);
		
		String gender = (ch == '1' || ch == '3')? "남" : "여";
		
		if(rNum.equals("1") || rNum.equals("3")) {
			System.out.println("성별:남");
		}else {
			System.out.println("성별:여");
		}
		
		String year = regNum.substring(0,2);
		if(rNum.equals("1")||rNum.equals("2")) {
			year = "19".concat(year);
//			System.out.println(year);
		}else {
			year = "20".concat(year);
//			System.out.println(year);
		}
		
		int age = today - Integer.parseInt(year);
		System.out.println("나이:"+age);
		
		
	}

}