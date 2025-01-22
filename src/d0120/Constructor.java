package d0120;


public class Constructor { 
	// 자바를 실행하려면 컴파일을 한 다음에 그때 자동으로 생성자가 만들어짐
	// 컴파일을 해야지 클래스 파일이 만들어짐
	// 컴파일된 얘는 디컴파일이 안됨
	// public 생성자가 있음
	public Constructor() { // 메모리를 생성할 때 실행됨
		System.out.println("어? 내 메모리를 생성했구나~");
	} // 이게 자동으로 들어가있음
	// c가 대문자면 생성자임 void c(대문자)는 메서드임
	public static void main(String[] args) {
		Constructor c = new Constructor();
		
		c = new Constructor();// 생성자는 데이터 타입이 없음 Constructor 호출
		// 호출할때는 반드시 new
		// 반드시 클래스이름과 똑같아야됨
		// 생성자가 있으면 소멸자가 있어야됨
		// 소멸자는 자바에 없음
		// 자바는 얼마나 생성되어있는지 알음
		// 몇명이 죽었는지는 모름.
		
	}
}
