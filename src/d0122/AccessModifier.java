package d0122;

public class AccessModifier {
	// public, protected, default, private
	
	static void test() {// default
		// default 는 같은 패키지에서만 사용가능
		// private 는 같은 클래스에서만 사용가능
		// public 은 다른 클래스,패키지에서 사용가능
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.println(); // 접근제어자가 없으면 default
	}
}
