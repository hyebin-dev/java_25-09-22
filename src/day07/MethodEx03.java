package day07;

public class MethodEx03 {
	
	// 1. 배열을 매개변수로 받아 랜덤수를 채워주는 메서드
	// 매개변수 : 배열 => int[] arr
	// 리턴타입 : 없음 => void
	public void randomArray(int[] arr) {
		int cnt=0;
		while(cnt < arr.length) {
			int random = (int)(Math.random()*45)+1;
			if(!isContains(arr, random)) {
				arr[cnt] = random;
				cnt++;
			}
		}
	}
	
	// 1-1. 중복 확인 메서드 
	// 배열과 랜덤값을 매개변수로 받아 배열에 랜덤값이 존재하면 true / false
	// 매개변수 : 배열, 랜덤값 => int[] arr, int random
	// 리턴타입 : boolean
	public boolean isContains(int[] arr, int random) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == random) {
				return true;
			}
		}
		return false;
	}
	
	// 2. 배열을 출력하는 메서드
	// user : 1 2 3 4 5 6
	// 당첨  : 1 2 3 4 5 6 [7]
	public void printArray(int[] arr) {
		for(int i=0; i<6; i++) {
			System.out.print(arr[i]+" ");
		}
		if(arr.length == 7) {
			System.out.print("["+arr[arr.length-1]+"]");
		}
		System.out.println();
	}
	
	
	// 3. 당첨을 확인하는 메서드
	// 매개변수 : 배열 2개 => int[] user, int[] lotto
	public int lottoRank(int[] user, int[] lotto) {
		// user / lotto의 위치가 바뀌어서 들어온다면...
		if(user.length >= lotto.length) {
			System.out.println("배열이 잘못되었습니다.");
			return -999;
		}
		int count = 0; // 일치 개수 카운트 (보너스는 제외)
		for(int i=0; i<user.length; i++) {
			if(isContains(user, lotto[i])) {
				count++;
			}
		}
		
		int bonus = lotto[lotto.length-1]; // 보너스 번호 추출
		
		switch(count) {
		case 6 :
			return 1;
		case 5 :
			if(isContains(user, bonus)) {
				return 2;
			}
			return 3;
		case 4 :
			return 4;
		case 3 :
			return 5;
			default :
				return -1;
		}
	}
	
	
	public static void main(String[] args) {
		/* 로또 번호 생성
		 * user 번호 6개
		 * 1~45까지 중 6개 번호를 랜덤 생성 (자동)
		 * 당첨 번호 7개 (보너스번호+1)
		 * 
		 * 당첨번호와 유저 번호를 비교하여 등수 추출
		 * 6개 일치 : 1등  (보너스제외)
		 * 5개 일치 + 보너스 : 2등
		 * 5개 일치 : 3등
		 * 4개 일치 : 4등
		 * 3개 일치 : 5등
		 * 나머지 꽝!
		 * */
		
		int[] user = new int[6]; // 로또자동번호 배열
		int[] lotto = new int[7]; // 당첨번호 배열
		
		MethodEx03 me3 = new MethodEx03();
		// 로또번호 생성
		me3.randomArray(user); 
		me3.randomArray(lotto);
		
		// 출력
		System.out.print("내번호: ");
		me3.printArray(user);
		System.out.print("당첨번호: ");
		me3.printArray(lotto);
		
		int rank = me3.lottoRank(user, lotto);
		if(rank == -999) {
			System.out.println("배열 오류");
		}else if(rank == -1) {
			System.out.println("꽝");
		}else {
			System.out.println("축~!!"+ rank+"등 당첨!!!");
		}
		
	}

}