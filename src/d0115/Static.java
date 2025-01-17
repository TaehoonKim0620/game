package d0115;
	
// 영역이 달라서 다른 영역이 아님 Static과 main은
// static이 아닌건 nonstatic이라 부름
public class Static {
	
	static int i;
	static int test() {
		return 1;
	}
	public static void main(String[] args) { // 메모리를 생성하려면 무조건 new
		System.out.println(i); // 메모리를 생성 안해도 되는 건 static임.
		test(); // static은 메모리를 만들어도 되고 안만들어도 되는데 nonstatic은 무조건 만들어야됨
	}
}
