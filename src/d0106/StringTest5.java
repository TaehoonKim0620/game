package d0106;

public class StringTest5 {
	public static void main(String[] args) {
		String str1 = "안녕하십니까?";
		
		System.out.println(str1.substring(0,2));
		for(int i = 0; i < str1.length(); i++) {
			if("하".equals(str1.substring(i,i+1))) {
				System.out.println(str1.substring(i,i+1));
			}
		}
	}
}
