package d0103;

public class DataType2 {
	public static void main(String[] args) {
		int i = 1;
		System.out.println(i);
		byte b = (byte)i;
		int j = 1;
		i =  b;
		
		String str1 = i + "";		
		System.out.println(str1);	
		i = Integer.parseInt(str1);	
		System.out.println(i); 		// . 은 ~의
	}
}
