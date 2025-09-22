package day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousClass02 {

	public static void main(String[] args) {
		// list의 sort
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			list.add((int)(Math.random()*10)+1);
		}
		System.out.println(list);
		
		List<String> list2 = new ArrayList<String>();
		
		list2.add("apple");
		list2.add("banana");
		list2.add("kiwi");
		list2.add("dog");
		list2.add("cat");
		
		// sort
//		System.out.println("--정렬 후--");
//		Collections.sort(list);
//		System.out.println(list);
		
		// list.sort(Comparator를 구현한 객체); : 정렬이 가능
		// Comparator 인터페이스를 구현한 구현체를 넣어야 함 (익명클래스 사용)
		// compare:숫자  compareTo:문자
		// compareTo: 사전상 앞에 있으면 - 같으면 0 뒤에 있으면 +
		
		System.out.println("--list.sort()--");
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// 오름차순 : o1 - o2  / 내림차순 : o2 - o1
				// 연산의 결과가 - 면 앞으로 보내고, +면 뒤로 보내는 역할
				return o2 - o1;
			}
			
		});
		System.out.println(list);
		
		
		System.out.println(list2);
		System.out.println("--list2.sort()--");
		
		list2.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// compareTo 
				// o1.compareTo(o2):오름차순 / o2.compareTo(o1):내림차순
				// 연산의 결과가 -면 앞으로 보내고, +면 뒤로 보내는 역할
				return o2.compareTo(o1);
			}
			
		});
		System.out.println(list2);
		

	}

}