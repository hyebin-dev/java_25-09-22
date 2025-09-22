package day18;

public class Thread02 {

	public static void main(String[] args) {
		// Runnable을 구현하는 방법
		System.out.println(Thread.currentThread().getName());
		System.out.println("main Thread start!!");
		
		// interface로 구현한 스레드 객체는 Thread의 객체가 없어서 
		// 실행이 안됨. 
		// Thread 객체를 생성해서 넣어줘야 함.
		MyThread2 th2 = new MyThread2();
		Thread t = new Thread(th2);
		t.start();
		
		// join() : 스레드가 실행을 마칠 때까지 다른 스레드를 대기 상태로 만듬.
		// sleep(): 일정시간동안 스레드를 중지하고 대시상태로 만듬
		try {
			t.join();
			Thread.sleep(1000); // 단위는 밀리세컨드 ms
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Thread t2 = new Thread(new MyThread2());
		t2.start();
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main Thread end!!");
		
	}

}

class MyThread2 implements Runnable{

	@Override
	public void run() {
		// 1부터 2000까지 반복 출력하는 구문 실행
		for(int i=0; i<2000; i++) {
			System.out.println(i+". thread > "+ Thread.currentThread().getName());
		}
	}
	
}