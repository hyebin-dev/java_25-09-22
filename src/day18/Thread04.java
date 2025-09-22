package day18;

class Bank{
	private int money = 500000;
	
	//입금 (동기화) synchronized
	public synchronized void saveMoney(int money) {
		int m = this.money;
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		this.money = m + money;
	}
	
	//출금 (동기화) synchronized
	public synchronized void minusMoney(int money) {
		int m = this.money;
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		this.money = m - money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}

public class Thread04 {
	
	//계좌의 객체 생성 : 공유영역에 생성
	public static Bank myBank = new Bank();

	public static void main(String[] args) {
		/* critical section(임계영역 : 공유영역)
		 * 두개 이상의 thread가 동시에 접근할 수 있는 구역
		 * 동시 여러개의 thread가 공유영역의 값을 가지려고하면 
		 * 충돌이 발생할 수 있음. 
		 * 교착상태(deadlock)
		 * 한 순간에 하나의 thread만 사용가능 : 세마포어(semaphore)
		 * 세마포어를 얻은 스레드만 접근가능 / 나머지는 대기상태가 됨.
		 * 
		 * 동기화(순서화) : synchronized
		 * 동기화가 필요한 메서드 앞에 키워드로 선언
		 * */
		
		/* Bank 클래스 생성
		 * 계좌 1개 생성 : 급여통장 => 공유영역 (static)
		 * 홍길동 : hong / 부인: hongwife
		 * 잔액 : 500000
		 * 
		 * 입금 : saveMoney (동기화)
		 * 출금 : minusMoney (동기화)
		 * */
		System.out.println("--Bank시작--");
		System.out.println("잔액:"+Thread04.myBank.getMoney());
		HongWife wife = new HongWife();
		Hong hong = new Hong();
		wife.start();
		hong.start();

	}

}

class Hong extends Thread{

	// 입금
	@Override
	public void run() {
		System.out.println("홍길동님 > 10,000원 입금시작 ~!!");
		Thread04.myBank.saveMoney(10000);
		System.out.println("잔액 : >"+Thread04.myBank.getMoney());
		System.out.println("홍길동님 > 입금종료 ~!!");
	}
		
}

class HongWife extends Thread{

	// 출금
	@Override
	public void run() {
		System.out.println("홍길동부인님 > 20,000원 출금시작 ~!!");
		Thread04.myBank.minusMoney(20000);
		System.out.println("잔액 : >"+Thread04.myBank.getMoney());
		System.out.println("홍길동부인님 > 출금종료 ~!!");
	}
	
	
}
