package d0115;

public class Variable3 {
	int i=10;
	
	public static void main(String[] args) {
		Variable3 v = new Variable3(); // 메모리를 생성해야지 사용 가능
		System.out.println(v.i);
		
		v.i=20;
		Variable3 v2 = new Variable3();
		System.out.println(v2.i); 
	}
}
