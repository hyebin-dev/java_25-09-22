package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListEx01 {

	public static void main(String[] args) {
		// 두 배열을 합쳐 하나의 list로 생성
		// 정렬 해서 출력
		
		String[] arr1 = {"a","t","y","s","d"};
		String[] arr2 = {"b","u","c","z","g"};
		
		List<String> list1 = new ArrayList<>(Arrays.asList(arr1)); // 복사하여 가져오기
		List<String> list2 = new ArrayList<>(Arrays.asList(arr2)); // 복사하여 가져오기
		
		//list = Arrays.asList(arr1); //배열의 값을 연결해서 리스트로 가져오기
		
		// addAll(list) : 모든 요소 추가
		list1.addAll(list2);
		System.out.println(list1);
		
//		for(String s : arr1) {
//			list.add(s);
//		}
//		for(String s : arr2) {
//			list.add(s);
//		}
//		Collections.sort(list);
//		System.out.println(list);
//		
//		System.out.println(list);
		
		
		
		

	}

}