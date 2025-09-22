package day14;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PasswordTest pt = new PasswordTest();
//		String password = null;
//		String password = "abc";
		String password = "abcdefg1";
		
		try {
			pt.setPassword(password);
			System.out.println(pt.getPassword());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("test 종료");

	}

}

class PasswordTest{
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		// exception 처리
		/* - 비밀번호는 null일수 없다.
		 * - 비밀번호의 길이는 5자 이상
		 * - 비밀번호는 문자로만 이루어지면 안됨. (문자+(숫자+특수))
		 * - regex : 정규표현식 [a-zA-Z]+
		 * */
		if(password == null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		}
		if(password.length() < 5) {
			throw new PasswordException("비밀번호는 5글자 이상이여야 합니다.");
		}
		if(password.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
		}
		
		this.password = password;
	}
	
	
}