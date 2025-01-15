package d0115;
// 변수는 영역 안이면 뭐든지 사용 가능
// 클래스 안에서 변수를 선언하면 이름 : 멤버변수
// 다른 영역 안에서 사용하면 멤버변수가 아님.

public class Variable {
	int i; // 멤버변수 o
	public static void main(String[] args) {
		int i; // 멤벼변수 x
		System.out.println("adf"); // out 은 멤버변수
	}

}
