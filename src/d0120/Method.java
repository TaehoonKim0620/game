package d0120;

public class Method {
	int i = 1; // i가 static일때는 사용 가능!
	// 메서드는 선언,실행
	// 초기화는 값을 대입하는게 성립되야됨
	
	void test() {
		// body 정의값
		// i 는 non-static 이므로
		System.out.println(i); // 이므로 가능 , 멤버변수는 파란색이므로 5번라인에 있는 i
		// i랑 test랑 같은 non -static이므로 사용 가능
		// static일때는 사용 불가능.
		int i; // 다시 선언 가능
		// 같은 영역에서 같은 메서드는 사용 가능?
		// 자바는 매개변수까지 테스트명으로 쳐야됨
	}
}
