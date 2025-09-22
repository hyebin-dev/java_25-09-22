package day18;

public class Thread01 {

	public static void main(String[] args) {
		// Thread(쓰레드) : 실제 작업을 수행하는 단위
		/* - 프로그램이 실행되면 OS로 부터 메모리를 할당 받아 process의 상태가 됨.
		 * - process안에 작은 작업단위 Thread 단위로 실제 작업을 수행
		 * - Thread가 실제 CPU가 작업을 처리하는 단위
		 * - multi-thread : 여러개의 thread가 동시에 수행되는 프로그램
		 * - CPU는 시간을 잘게 쪼게서 thread를 번갈아 수행함 (시분할 처리)
		 * - 사용자들은 동시에 처리되는 듯한 효과를 가지게 됨.
		 * - thread는 각자의 자신의 작업공간을 가짐 (context)
		 * - 공유된 자원이 있음.
		 * - 여러 thread는 공유자원을 사용하려고 경쟁이 발생함. 
		 * - 그 경쟁 구역을 critical section(임계영역)
		 * - 임계영역의 충돌(교착상태: deadlock)이 발생하지 않도록
		 * - 동기화 (순차처리)를 구현하여 오류를 막음. 
		 * - 스레드의 상태변화
		 * - 생성(New) -> 준비(Runnable) -> 실행(Running) 
		 * 		-> 대기(Waiting/Blocked) -> 종료(Terminated)
		 * */
		
		/* Thread를 구현 방법은 2가지
		 * 1. Thread 클래스를 상속하여 만들기
		 * 2. runnable 인터페이스를 구현하여 만들기
		 * 자바는 다중상속을 허용하지 않기 때문에
		 * 만약 클래스 상속중이라면 인터페이스를 구현해야 함.
		 * */
		
		// 현재 실행중인 스레드 이름
		System.out.println(Thread.currentThread().getName()); // main
		
		MyThread th = new MyThread(); // Thread-0
		// start() 호출 => 스레드 실행
		// run() X => start()
		
		th.start();
		
		MyThread th2 = new MyThread(); //Thread-1
		th2.start();
		
		System.out.println("thead end~!!");

	}

}

class MyThread extends Thread{

	// 반드시 run()메서드를 구현해야 함.
	@Override
	public void run() {
		// 1부터 2000까지 반복 출력하는 구문 실행
		for(int i=0; i<2000; i++) {
			System.out.println(i+". thread > "+ getName());
		}
		
	}
}