package day13;

public class Exception03 {

	public static void main(String[] args) {
		// 0으로 나누었을 때 발생하는 예외 처리
		
		Exception03 ex03 = new Exception03();
		
		try {
			System.out.println(ex03.calc(4, 0, '+'));
			System.out.println(ex03.calc(4, 0, '-'));
			System.out.println(ex03.calc(4, 0, '*'));
			System.out.println(ex03.calc(4, 0, '/'));
			System.out.println(ex03.calc(4, 0, '%'));
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(4*0);
		System.out.println(4+0);
		

	}
	
	// 메서드에서 예외 처리 / 예외 넘기기 : throws
	/* 두 정수를 입력받고, 연산자를 입력받아
	 * 4칙연산의 결과를 리턴하는 메서드
	 * 매개변수 : 두정수와 연산자 int num1, int num2, char op
	 * 리턴타입 : double
	 * 
	 * 예외 발생시키기 : throw new
	 * */
	
	/* 연산자가 / % 이고, num2 == 0이면 
	 * num2는 0이 될수 없습니다.
	 * */
	public double calc(int num1, int num2, char op) throws RuntimeException {
		double result = 0;
		
		if((op=='/' || op=='%') && num2==0) {
			throw new RuntimeException("num2는 0이 될수 없습니다.");
		}
		
		switch(op) {
		case '+': result = num1 + num2; break;
		case '-': result = num1 - num2; break;
		case '*': result = num1 * num2; break;
		case '/': result = num1 / num2; break;
		case '%': result = num1 % num2; break;
		default:
			// 예외 발생시키기
			throw new RuntimeException("산술연산자가 아닙니다.");
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}