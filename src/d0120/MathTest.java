package d0120;

public class MathTest {
	public static void main(String[] args) {
		// public private 는 접근제어자
		// public은 공공의 private는 개인의
		// private는 접근 불가능
//		Math m = new Math();
		double db = Math.random(); // datatype은 double 0.0 ~ 1.0이 되기 전 까지(0.9999999)
		int i = (int)(db * 10) + 1; // 0-9
		System.out.println(i); // 1 - 10
	}
}
