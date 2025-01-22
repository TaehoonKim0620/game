package d0122;

public class Method2 {
	// return 이 없으면 오류남
	// non-static이면 무조건 메모리를 생성해야됨
	int add(int n1, int n2) {
		return n1+n2;
	}
	void add() {// void는 메서드에서만 사용가능
		
	}
	String add(String s, int n) {
		return s + n;
	}
	public static void main(String[] args) {
		Method2 m = new Method2(); // 메모리 생성!
		int sum = m.add(0, 0); // add의 데이터타입이 int 이므로 int형 변수에 대입가능
		m.add(); // return 값이 없으므로 대입 불가능.
		String str = m.add("1",1);
		System.out.println(); // ()안에 m.add()를 쓸 수 없는 이유는 void 데이터타입이 없어서 그럼
		System.out.println(m.add("1", 1));
	}
}
