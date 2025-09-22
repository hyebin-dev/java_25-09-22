package day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class List03 {

	public static void main(String[] args) {
		/* 과일 5개 정도 저장하고 list 출력
		 * */
		ArrayList<String> list = new ArrayList<>();
		list.add("사과");
		list.add("바나나");
		list.add("오렌지");
		list.add("귤");
		list.add("배");
		list.add("감");
		list.add("참외");
		
		System.out.println(list);
		
		// 일반 for 출력
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 향상된 for 출력
		for(String s : list) {
			System.out.println(s);
		}
		
		// Iterator 출력
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp);
		}
		System.out.println("--------");
		Collections.sort(list);
		System.out.println(list);

	}

}