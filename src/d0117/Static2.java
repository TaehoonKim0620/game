package d0117;

public class Static2 {
	int age = 1;
	static int height; // 0으로 초기화가 됨 / 이텔릭(기울어진거는)
	// boolean 은 false로 초기화가 됨 (아무것도 안넣을 시)
	// 무한루프 밑에 코드 작성시 오류가 남.
	// 하지만 조건부에 값이 있을 시 오류가 안남.
	// static은 메모리를 생성해도되고 안해도 됨
	// non static은 메모리를 반드시 생성해야됨
	void test(int n) {
		System.out.println("테스트 시작");
		if(n==1) {
			return;
		}
		System.out.println("테스트 종료");
		// return이 안된다는게 아니라 아무것도 리턴하지 않는다는 뜻.
		// return은 해당 메소드를 나가겠다는 의미
		// return 밑에 코드 작성시 오류가 남
	}
	
	public static void main(String[] args) {
		System.out.println(height); // 메모리 생성 전에도 사용가능
		Static2 s = new Static2();
		System.out.println(s.age);
		System.out.println(s.height); //1
		// static은 new를 한다고 해서 다른영역에다가 만들어놓지 않음
		// height랑 s.height는 같은 height 임
		s.test(1);
	}
	// main 은 static임
	// main 이랑 메서드는 특별한 역할을 함 main 메서드는 프로그램을 
	// 시작했을 때 맨 처음 실행되는 구간
	// static 을 붙여놓는 이유가 있음 static을 붙였기 때문에 최초로 실행됨
	// '로딩'과 '시작'은 다른 의미임
	// 시작점은 main 메서드가 맞는데 로딩은 그 전에 됨
	
}
