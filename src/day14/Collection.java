package day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collection {

	public static void main(String[] args) {
		/* 컬렉션 프레임워크 : 표준화된 방식의 자료구조
		 * List, Set, Map => 인터페이스. 반드시 구현 클래스로 객체를 생성
		 * 배열처럼 데이터를 묶어서 관리할 때 사용
		 * 배열 대신 사용
		 * 
		 * List(배열과 동일)
		 * - 같은 타입의 값을 하나씩 저장
		 * - 순서를 보장 (index)
		 * - 중복 허용 (index가 있다)
		 * - 배열 대신에 가장 많이 사용하는 구조
		 * 
		 * Set
		 * - 같은 타입의 값을 하나씩 저장
		 * - index가 없음. => 순서를 보장하지 않음.
		 * - 중복을 허용하지 않음. => 같은 값이 들어오면 덮어쓰기
		 * 
		 * Map
		 * - 값을 두개씩 저장 key / value 쌍으로 묶어서 저장
		 * - 순서를 보장하지 않음(index가 없음)
		 * - key는 중복 불가능 / value는 중복가능
		 * - key가 중복되면 덮어쓰기 (value도 같이 덮어쓰기 됨.)
		 * - 물건/가격  아이디/패스워드  학생/성적
		 * - 두값을 하나로 묶어서 사용할 때 map을 씀.
		 * 
		 * 배열은 기본자료형, 클래스 자료형 배열의 생성이 가능
		 * int arr[], String arr[], Student[] ...
		 * 
		 * Collection 에서는 기본자료형은 불가능. 클래스 자료형만 가능.
		 * 기본자료형에 맞는 클래스 자료형(Wrapper Class)을 사용하면 됨.
		 * 
		 * Wrapper Class(래퍼클래스)
		 * 기본타입에 대응되는 클래스 타입을 래퍼 클래스 라고 함.
		 * 기본타입 		클래스 타입
		 * int			Integer
		 * char			Character
		 * double		Double
		 * long			Long
		 * byte			Byte
		 * boolean		Boolean
		 * 
		 * int char를 제외한 다른 자료형은 
		 * 첫글자만 대문자로 변환하면 래퍼클래스가 됨.
		 * 
		 * 기본타입 => 클래스타입 (박싱 : boxing)
		 * 클래스타입 => 기본타입 (언박싱 : unBoxing)
		 * 
		 * - 언박싱 이유
		 * - 래퍼 클래스는 산술연산을 위해 정의된 클래스가 아님.
		 * - 객체의 값만 참조할 수 있기 때문에 그안에 저장된 값은 직접 변경이 불가능
		 * - 그래서 래퍼 클래스로 언박싱해서 기본타입으로 변경한 후 값 변경을 하고
		 *    다시 박싱 해야함.
		 *    
		 * List<클래스명> 객체명 = new 구현클래스<클래스명>();
		 * 
		 * List => ArrayList(조회), LinkedList(추가, 삭제) ...
		 * Set => HashSet, TreeSet(정렬) ...
		 * Map => HashMap, TreeMap ...
		 * 
		 * ArrayList : 검색이 빠르다 (배열과 비슷)
		 * - 미리 길이를 지정하지 않음.
		 * - 추가되면 자동으로 늘어남.
		 * - 삭제되면 자동으로 줄어듦.
		 * - 추가, 삭제 쉽다. (속도가 느림), 검색이 빠름
		 * 
		 * LinkedList : 추가 삭제가 빠름. 검색이 느림
		 * 
		 * TreeSet : 트리 구조에 맞게 정렬 알고리즘을 사용함.
		 * */
		
		// List 기준으로 생성
		List<Integer> list = new ArrayList<Integer>();
		
		// ArrayList기준으로 생성
		ArrayList<Integer> list2 = new ArrayList<>();
		
		// 클래스명을 생략하고 생성 => object로 생성
		ArrayList list3 = new ArrayList();
		
		// 앞쪽 클래스명은 반드시 지정, 뒷쪽 클래스명은 생략가능.
		
		Map<String, Integer> map = new HashMap<String,Integer>();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}