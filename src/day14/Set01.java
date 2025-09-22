package day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Set01 {

	public static void main(String[] args) {
		/* Set : index가 없음. (순서보장 X, 중복불가능)
		 * 정렬은 list 만 가능.
		 * HashSet(대표적인 Set 구현 클래스) / TreeSet(정렬)
		 * */
		
		Set<String> set = new HashSet<String>();
		
		// add() : set에 추가
		set.add("사과");
		set.add("배");
		set.add("귤");
		set.add("포도");
		set.add("복숭아");
		
		System.out.println(set);
		set.add("배");
		System.out.println(set);
		
		// get(i) / set(i, value) : index가 없어서 
		// index를 사용하는 메서드가 없음.
		
		//contains() clear() equals() isEmpty()		
		
		for(String tmp : set) {
			System.out.println(tmp);
		}
		
		//Iterator 출력가능
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String t = it.next();
			System.out.println(t);
		}
		
		// 정렬 불가능.
		// set => list로 변경가능
		List<String> list = new ArrayList<String>(set);
		System.out.println(list);
		System.out.println(list.get(0));
		
		Collections.sort(list);
		System.out.println(list);
		
		

	}

}