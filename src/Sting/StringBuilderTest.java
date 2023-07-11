package Sting;

public class StringBuilderTest {
		public static void main(String[] args) throws InterruptedException {
			StringBuilder stringBuilder = new StringBuilder();

			Thread thread1 = new Thread(() -> {
				for (int i = 0; i < 100; i++) {
					stringBuilder.append("A");
				}
			});

			Thread thread2 = new Thread(() -> {
				for (int i = 0; i < 100; i++) {
					stringBuilder.append("B");
				}
			});

			thread1.start();
			thread2.start();

			// 스레드가 모두 실행 완료될 때까지 대기
			thread1.join();
			thread2.join();

			// 결과 출력
			System.out.println(stringBuilder.toString());

	}

}
