package day14;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx01 {

	public static void main(String[] args) {
		// set에 1~45까지 중복되지 않은 숫자 6자리 생성 => 출력
		// set은 중복값이 나오면 버림
		// set이 6이 될때까지 반복
		
		Set<Integer> set = new HashSet<>();
		
		while(set.size() < 6) {
			int random = (int)(Math.random()*45)+1;
			set.add(random);
		}
		
		System.out.println(set);
		
		System.out.println("----------------");
		
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		while(treeSet.size() < 6) {
			int random = (int)(Math.random()*45)+1;
			treeSet.add(random);
		}
		System.out.println(treeSet);
		
		// first(): 가장 앞에 있는 값 / last() : 가장뒤에 있는값
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
		
		// headSet(값) / tailSet(값) : 기준값의 앞쪽 / 뒷쪽 값을 출력
		System.out.println(treeSet.headSet(20));
		System.out.println(treeSet.tailSet(20));
		
		// subSet(start, end) : 범위값 출력 (끝값은 미포함)
		System.out.println(treeSet.subSet(10, 20));
		
		
	}

}