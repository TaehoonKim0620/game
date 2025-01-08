package d0106;

public class StringTest2 {
	public static void main(String[] args) {
		String str1 = "안녕";
		String str2 = "안녕";
		System.out.println(str1 == str2);
		String str3 = new String("안녕");
		String str4 = new String("안녕");
		System.out.println(str3.equals(str4)); // 값이 있는 주소값 저장
	}
}
