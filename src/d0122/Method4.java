package d0122;

public class Method4 {
	// 메서드를 사용하는 이유는 중복되는 코드를 줄이기 위해서
	//
	static void write() {
		System.out.println();
	}
	static void write(int i) {
		System.out.println(i);
	}
	static void write(double i) {
		System.out.println(i);
	}
	static void write(boolean i) {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		write();
		write(1);
		write(1.1);
		write(true);
	}
}
