package d0117;

public class Method1 {
	// 데이터타입을 리턴하는 것, 무언가를 리턴하지 않는 것
	
	static void test() {
		
	}
	static int parseInt(String a) {
		return 1;
	}
	public static void main(String[] args) {
		Method1.test(); 
		Method1.parseInt("1"); // Method1. 을 써주는게 FM
		int i = Integer.parseInt("1"); // 메모리를 생성 안했기 때문에 static이란 소리.
		// parseInt() 의 데이터타입은 int 임.
		// 선생님 이름 박경훈
		
	}

}
