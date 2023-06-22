package private테스트;

public class Circle {

	private Circle() {

	}
	// Circle 인스턴스를 생성하고 반환하는 정적 팩토리 메서드
	public static Circle createInstance() {
		return new Circle();
	}
	public String make() {
		String result = "만들어라";
		return result;
	}
}
