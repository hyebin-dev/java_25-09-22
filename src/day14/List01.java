package day14;

import java.util.ArrayList;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		// List => ArrayList
		List<Integer> list = new ArrayList<>();
		
		// add() : 요소를 추가
		list.add(1); // 오토박싱 int=>Integer 로 박싱되서 저장
		list.add(new Integer(2)); // 직접 객체 생성 후 저장
		list.add(3);
		
		System.out.println(list); // 자체 toString() 호출
		
		// get(index) : index 번지의 값을 가져오기
		// arr[0] 와 같은 의미 
		// index는 0번지 시작
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		// set(index, 값) : index 번지에 값을 저장
		// arr[0] = 10;
		list.set(0, 10);
		System.out.println(list);
		
		System.out.println("--for문으로 리스트 출력--");
		// 배열의 length = list.size()
		// size() : list의 총개수
		int sum = 0;
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			sum += list.get(i); // 오토 언박싱 Integer => int
		}
		System.out.println(sum);
		
		//remove(index) : index 번지의 값을 삭제
		//remove(object) : object 값을 삭제
		System.out.println(list.remove(0));
//		list.remove(0);
		Integer r = 3;
		list.remove(r);
		System.out.println(list.remove(r));
		
		System.out.println(list);
		
		//list1 1~10까지 추가하고 출력 (for문 사용)
		ArrayList<Integer> list1 = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			list1.add(i+1);
		}
		System.out.println(list1);
		
		// index 4에 있는 값을 11로 변경 arr[4] = 11;
		list1.set(4, 11);
		System.out.println(list1);
		
		//contains(object) : list object가 있는지 체크
		System.out.println(list1.contains(1));
		
		//clear() : 리스트 비우기 (요소 전부 삭제)
		list1.clear();
		System.out.println(list1);
		
		//isEmpty() : 리스트가 비어있는지 체크
		System.out.println(list1.isEmpty());
		System.out.println(list.isEmpty());
		
		
	}

}