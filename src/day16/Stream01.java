package day16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream01 {

	public static void main(String[] args) {
		// Stream(스트림)
		/* - 자료구조를 복사하여 스트림 객체로 생성
		 * - 스트림을 이용한 연산을 수행
		 * - 연산을 수행한 스트림은 소모됨.
		 * - 스트림은 기존 자료를 변경할 수 없음.
		 * - 메서드 체이닝 방식을 사용
		 * - 스트림만의 연산을 가지고 있음.
		 * 
		 * 중간연산 / 최종연산
		 * 
		 * - 최종연산 : 마지막에 하나만.
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
		int arr[] = {1,2,4,5,7,8,9,6,5,8,4,2,5,3,6,2};
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println("--stream을 이용한 합계구하기--");
		// 배열을 스트림으로 구성
		int s = Arrays.stream(arr).sum();
		System.out.println(s);
		
//		IntStream is = Arrays.stream(arr);
//		System.out.println(is.sum());
//		System.out.println(is.count()); // 소모되어서 사용할수 없음.
		
		// count()
		long l = Arrays.stream(arr).count();
		System.out.println(l);
		
		// average()
		// Optinal : null 방지용
		OptionalDouble od =  Arrays.stream(arr).average();
		System.out.println(od.getAsDouble());
		
		int s2 = Arrays.stream(arr).filter(n -> n>=5).sum();
		System.out.println(s2);
		
		// IntStream을 조건에 맞는 값만 추출하여 List로 리턴
		List<Integer> list2 = Arrays.stream(arr)
				.filter(n->n>=5)
				.boxed() // IntStream => Stream<Integer>
				.collect(Collectors.toList());
		System.out.println(list2);
		
		// IntStream을 조건에 맞는 값만 추출하여 배열로 리턴
		int arr2[] = Arrays.stream(arr)
				.filter(n->n>=5)
				.toArray();
		System.out.println(Arrays.toString(arr2));
				
		boolean any = Arrays.stream(arr).anyMatch(n -> n == 5);
		System.out.println(any);
		
		OptionalInt oi = Arrays.stream(arr)
				.filter(n->n>=5)
				.findFirst();
		System.out.println(oi);
		
	}

}