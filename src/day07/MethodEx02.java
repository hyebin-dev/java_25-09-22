package day07;

public class MethodEx02 {
	
	// 1. 배열을 받아 배열을 출력하는 메서드
	// 매개변수 : 배열 => int[] arr
	// 리턴타입 : void
	public void printArray(int[] arr) {
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	// 2. 배열을 받아 배열을 오름차순으로 정렬하는 메서드
	// 매개변수 : 배열 => int[] arr
	// 리턴타입 : void
	public void sortArray(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) { // 오름차순  < 내림차순
					//교환
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	// 3. 배열을 받아 배열의 합계와, 평균, 최대, 최소를 출력하는 메서드
	// 매개변수 : 배열 => int[] arr
	// 리턴타입 : void
	public void totalPrint(int[] arr) {
		int sum = 0;
		int max = arr[0];
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		System.out.println("합계:"+sum+" / 평균:"+((double)sum/arr.length)+
				" / 최대:"+max+" / 최소:"+min);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {78,56,96,85,75,42,63,59,65,45,39,97};
		
		// 메서드 생성
		// 1. 배열을 받아 배열을 출력하는 메서드
		// 2. 배열을 받아 배열을 오름차순으로 정렬하는 메서드
		// 3. 배열을 받아 배열의 합계와, 평균, 최대, 최소를 출력하는 메서드
		
		MethodEx02 me2 = new MethodEx02();
		System.out.println("--배열 출력--");
		me2.printArray(arr);
		// 정렬
		
		System.out.println("--배열(정렬) 출력--");
		me2.sortArray(arr);
		me2.printArray(arr);
		
		System.out.println("--통계출력--");
		me2.totalPrint(arr);
		
		// makeRandom 메서드 호출 배열 생성 Method06
		// 출력 => 정렬 => 출력
		System.out.println("-Method06에서 생성한 makeRandom-");
		
	}

}