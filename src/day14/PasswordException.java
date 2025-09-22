package day14;

public class PasswordException extends IllegalArgumentException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/* 사용자 정의 Exception 생성할 때 조건
	 * IllegalArgumentException : 매개변수를 잘못 사용했을 때 발생하는 익셉션
	 * 사용자 정의 excetion 정의시 상속을 받아서 사용해야 함.
	 * */
	public PasswordException(String message) {
		super(message);
	}

}