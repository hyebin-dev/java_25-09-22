package day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamEx02 {

	public static void main(String[] args) {
		/* 여행사 상품
		 * 여행비용이 15세 이상은 100만원, 15세 미만은 80만원 계산
		 * 고객 5명이 패키지 여행을 떠난다고 가정했을 경우
		 * 1. 비용을 계산 => 출력
		 * 2. 고객명단 출력
		 * 
		 * Customer 클래스 생성 ArrayList 관리
		 * 
		 * 예)
		 * 이름:홍길동  나이:40  비용:100
		 * 이름:봉미선  나이:38  비용:100
		 * 이름:짱구   나이:15  비용:100
		 * 이름:짱아   나이:10  비용:80
		 * 이름:흰둥이 나이:3  비용:80
		 * 총 여행경비 : 000
		 * 
		 * 3. 20세 이상 성인 고객 명단 출력 => 이름순으로 정렬
		 * 
		 * */
		
		List<Customer> list = new ArrayList<>();
		list.add(new Customer("홍길동", 40));
		list.add(new Customer("봉미선", 38));
		list.add(new Customer("짱구", 15));
		list.add(new Customer("짱아", 10));
		list.add(new Customer("흰둥이", 3));
		
		list.stream().forEach(System.out::println);
		
		int total = list.stream()
				.mapToInt(n -> n.getPrice())
				.sum();
		System.out.println("총 여행경비:"+total+"만원");
		
		System.out.println("--성인 고객 명단(이름순으로 정렬)--");
		list.stream()
			.filter(n -> n.getAge() >=20)
			.sorted(new Comparator<Customer>() {

				@Override
				public int compare(Customer o1, Customer o2) {
					// 이름 순으로 오름차순
					return o1.getName().compareTo(o2.getName());
				}
			})
			.forEach(s -> System.out.println(s));
		System.out.println("--클래스에서 내림차순으로 구현--");
		// 클래스에서 구현
		list.stream()
			.filter(n->n.getAge() >= 20)
			.sorted()
			.forEach(s -> System.out.println(s));

	}

}
