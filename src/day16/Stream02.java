package day16;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Stream02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* - 최종연산 : 마지막에 하나만.
		 * forEach() : 리스트내를 순회하며 요소의 값을 얻어서 구성
		 * findFirst() : 조건에 일치하는 요소중 가장 앞에 있는 요소 리턴
		 * findAny() : 조건에 일치하는 요소중 가장 먼저 탐색되는 요소 리턴
		 * anyMatch() : 조건에 맞는 요소가 하나라도 있다면 true 리턴
		 * allMatch() : 조건에 모든 요소가 맞다면 true
		 * noneMatch() : 조건에 맞는 요소가 없다면 true
		 * count(), min(), max() : 개수, 작은값, 큰값을 리턴
		 * sum(), average() : 요소의 합계, 요소의 평균을 리턴
		 * collect() : 스트림내의 요소를 수집하여 사용자가 원하는 형태로 반환
		 * toArray() : 배열로 리턴
		 * toList() : 리스트로 리턴
		 * 
		 * - 중간연산 : 중간에 이어서 사용(중복사용가능)
		 * filter() : 조건에 맞는 결과값을 필터링
		 * distinct() : 중복된 값 제거
		 * map() : 요소의 값을 원하는 값으로 변환 => 형변환
		 * sorted() : 정렬
		 * peek() : 작업 수행후 스트림 리턴
		 * skip() : 스트림의 일부를 건너 뜀.
		 * limit() : 스트림의 일부를 잘라냄.
		 * */
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<10; i++) {
			list.add((int)(Math.random()*10)+1);
		}
		System.out.println(list);
		
		//list를 스트림으로 구성
		list.stream().forEach(n->System.out.println(n));
		System.out.println();
		
		// 중복제거 => 출력
		list.stream().distinct().forEach(n -> System.out.print(n+" "));
		System.out.println();
		
		// 정렬, 중복제거 => 출력
		list.stream()
			.distinct()
			.sorted()
			.forEach(n->System.out.print(n+" "));
		System.out.println();
		
		// 중복제거 후 합계 Stream<Integer>
		// Stream<Integer> => IntStream 으로 변경
		int sum = list.stream()
			.distinct()
			.mapToInt(n -> n.intValue())
			.sum();
		System.out.println(sum);
		
		// 스트림 객체 생성
		Stream<Integer> stream01 = Stream.of(10,20,30,40,50);
		int total = stream01
				.mapToInt(n -> n.intValue())
				.sum();
		System.out.println(total);
		
		
		// 스트림 객체는 1회성 이미 소모되어서 사용불가
//		OptionalDouble od = stream01
//				.mapToInt(n -> n.intValue())
//				.average();
//		System.out.println(od);
		

	}

}