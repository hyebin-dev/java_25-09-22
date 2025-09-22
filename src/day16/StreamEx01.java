package day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamEx01 {

	public static void main(String[] args) {
		// class 생성 Student (이름, 점수)
		
		//Student class List 생성  객체를 추가 (10명)
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동",100));
		list.add(new Student("김순이",100));
		list.add(new Student("이영이",78));
		list.add(new Student("박순철",51));
		list.add(new Student("이철수",53));
		list.add(new Student("홍순이",89));
		list.add(new Student("박길동",97));
		list.add(new Student("최수지",73));
		
		// 학생 출력 => 홍길동 : 56
		// toString 사용
		list.stream().forEach(n -> System.out.println(n));
		
		System.out.println("-------------------");
		// toString 없이 출력
		list.stream().forEach(n -> {
			String name = n.getName();
			int score = n.getScore();
			System.out.println(name + ":"+score);
		});
		
		System.out.println("---------");
		// 점수합계 출력
		int sum = list.stream()
				.mapToInt(n -> n.getScore())
				.sum();
		System.out.println("학생 점수 합:"+sum);
		
		// 전체 인원수
		long count = list.stream().count();
		System.out.println("전체 학생 수:"+count);
		
		// 점수가 80점 이상인 학생의 인원수
		long count80 = list.stream()
				//.map(n -> n.getScore())
				.filter(n -> n.getScore() >=80)
				.count();
		
		System.out.println("80점 이상 학생수:"+count80);
		
		System.out.println("--이름순으로 정렬--");
		// 정렬 : 이름순으로 가나다라 정렬 (이름순으로 오름차순)
		list.stream()
			.sorted(new Comparator<Student>() {

				@Override
				public int compare(Student o1, Student o2) {
					// name 기준으로 오름차순 정렬
					return o1.getName().compareTo(o2.getName());
				}
				
			})
			.forEach(n -> System.out.println(n));
			
		// 정렬 : 점수가 높은 순으로 정렬 (점수기준 내림차순)
		System.out.println("--점수기준 내림차순--");
		
		Comparator<Student> byScore = 
				Comparator.comparing(Student::getScore).reversed()
						.thenComparing(Student::getName);
		list.sort(byScore);
		System.out.println(list);
		
		list.stream().sorted(Comparator.comparing(Student::getScore).reversed())
		.forEach(System.out::println);
		
		
		// 클래스 구현용 : Comparable
		// 익명클래스 용 : Comparator 
		System.out.println("--Comparable 구현--");
		
		list.stream().sorted().forEach(System.out::println);


	}

}