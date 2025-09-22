package day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class List02 {

	public static void main(String[] args) {
		// List를 생성후 1~10까지 채운 후 출력
		// for문을 사용해서 요소를 직접 출력
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1; i<=10; i++) {
			list.add(i);
		}
		
		System.out.println(list);
		
		//for문으로 요소를 출력
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//향상된 for문으로 출력 가능
		for(Integer i : list) {  // Integer int 둘다 가능 
			System.out.println(i);
		}
		
		System.out.println("--------");
		// Iterator(반복자) : index가 없는 구조를 출력하기 위해 사용
		// set map 은 index가 없음. => 일반 For문은 사용불가.
		// 순서와 상관없이 값을 가져올 수 있는 구문을 사용
		System.out.println("iterator 출력");
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) { // hasNext() : 다음 요소가 있는 지 확인
			int tmp = it.next();
			System.out.println(tmp); // next():다음요소 가져오기
		}
		
		// indexOf(값) : 해당 값의 번지를 리턴 / 없으면 -1
		System.out.println(list.indexOf(10));
		
		list.clear();
		list.add(45);
		list.add(12);
		list.add(78);
		list.add(65);
		list.add(86);
		list.add(20);
		System.out.println(list);
		
		//Collections.sort(list)
		Collections.sort(list); //오름차순만 가능.
		System.out.println(list);
		
	}

}