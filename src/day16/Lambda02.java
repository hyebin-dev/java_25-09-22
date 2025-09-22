package day16;

import java.util.HashMap;
import java.util.Map;

public class Lambda02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> map = new HashMap<>();
		map.put("hong", 89);
		map.put("kim", 96);
		map.put("lee", 68);
		map.put("choi", 45);
		map.put("park", 78);
		map.forEach((a,b)->{
			System.out.println(a+":"+b);
		});
		
		// 람다용 함수형 인터페이스 생성 구현
		Number sum = (a,b) -> { 
			return a+b; 
		};
		// 람다용 함수형 인터페이스 생성 구현
		Number max = (a,b) -> {
			return (a>=b) ? a : b;
		};
		
		int s = sum.add(10, 20);
		System.out.println(s);
		System.out.println(max.add(10, 20));

	}	

}


// 람다용 함수형 인터페이스 생성 => @FunctionalInterface
// 메서드는 반드시 1개여야만 함.
@FunctionalInterface
interface Number{
	// 메서드 추가 : 1개만
	int add(int a, int b);
	//int max(int a, int b); // 메서드가 2개면 error
}
	

