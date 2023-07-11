package Sting;

public class StringTest {

	public static void main(StringTest[] args) throws InterruptedException {
		String string = "Hello";

		Thread thread1 = new Thread(() -> {
			string.concat(", Thread 1!");
		});

		Thread thread2 = new Thread(() -> {
			string.concat(", Thread 2!");
		});

		thread1.start();
		thread2.start();

		// 스레드가 모두 실행 완료될 때까지 대기
		thread1.join();
		thread2.join();

		// 결과 출력
		System.out.println(string);
	}
}
