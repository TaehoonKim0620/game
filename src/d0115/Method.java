package d0115;

public class Method {
	int test() {
		return 0;
	}
	
	String test1() {
		return "";
	}
	// 기본형, 참조형
	// 메서드는 데이터 타입을 리턴하는것 , 아무것도 리턴하지 않는 것 (void) 2가지가 있음
	// void 는 리턴은 됨.
	// str.indexOf("4") 에서 -1이 나옴
	public static void main(String[] args) {
		String str = new String("123");
		System.out.println(str);
		int idx = str.indexOf("4");
		String str2 = str.substring(1); //23
		System.out.println(str2);
		
		Method m = new Method();
		int i = m.test();
		String str3 = m.test1();
		System.out.println(i);
		System.out.println(str3);
	}
}
