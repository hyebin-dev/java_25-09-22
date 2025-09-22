package day04;

public class String02 {

	public static void main(String[] args) {
		
		// toLowerCase() / toUpperCase() : 대소문자 변환
		System.out.println("--toLowerCase / toUpperCase--");
		System.out.println("abc".toUpperCase()); //대문자로 변환
		System.out.println("ABc".toLowerCase());//소문자로
		
		// isEmpty() : 값이 비었는지 확인
		System.out.println("--isEmpty()--");
		System.out.println("".isEmpty());  // true
		
		//trim() : 불필요한 공백 제거
		System.out.println("--trim--");
		System.out.println("     hello    ".trim());
		
		//replace() : 글자를 치환(변환)
		System.out.println("--replace--");
		String str = "apple, banana, kiwi, orange";
		System.out.println(str.replace(",", "/"));
		
		// split : 특정 값을 기준으로 나누기 => 배열로 리턴
		System.out.println("--split--");
		String[] strArr = str.split(", ");
		System.out.println(strArr[2]);
		
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		System.out.println("--향상된 for문---");
		// 향상된 for문
		for(String s : strArr) {
			System.out.println(s);
		}
		
		// 문자를 숫자로 Integer.parseInt()
		String num = "123";
		int num2 = Integer.parseInt(num);
		System.out.println(num2+10);
		
		// 숫자를 문자로 변경  String.valueOf()
		
		String as = String.valueOf(num2);
		System.out.println(as);
		//instanceof : 같은 클래스가 맞는지 확인하는 연산자(클래스 타입만 가능)
		System.out.println(as instanceof String);
		
	}

}