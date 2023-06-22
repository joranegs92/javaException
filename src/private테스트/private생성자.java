package private테스트;

public class private생성자 {


		private int test;
		private final int test2;

		public private생성자(int test,int test2){
			this.test = test;
			this.test2 = test2;
		}


	public static void main(String[] args) {
		// Circle 클래스의 정적 메서드를 사용해 Circle 인스턴스를 생성
		Circle circle = Circle.createInstance();

		// 생성한 Circle 인스턴스의 make 메서드를 호출
		String text = circle.make();

		CircleNoPrivate circleNoPrivate = new CircleNoPrivate();
		String make = circleNoPrivate.make();

		System.out.println(make);
	}
/*

//Circle의 생성자 테스트
	public static void main(String[] args) {
		CircleNoPrivate circleNoPrivate = new CircleNoPrivate();

		Circle circle = new Circle();
	}
*/

}
