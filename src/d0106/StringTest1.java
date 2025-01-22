package d0106;

public class StringTest1 {
	public static void main(String[] args) {
		String str = null;
		System.out.println(str);
		String str1 = "안녕하세요";
		System.out.println(str1.length());
		System.out.println(str.length());
		String s1 = "1";
		String s2 = "1";
		System.out.println(s1 == s2); //true
		String s3 = new String("1");
		System.out.println(s1.equals(s3)); // false equals()의 데이터 타입은 boolean
	}
}
