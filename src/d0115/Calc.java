package d0115;

public class Calc {
	// 매개변수 : add가 받는 변수
	// Calc이 JVM이 어디있는지 아는 순간 add는 메모리에 올라감
	static int add(int n1,int n2) {
		return n1 + n2;
	}
	public static void main(String[] args) {
		int result = add(1,2);
		System.out.println(result);
	}
}
