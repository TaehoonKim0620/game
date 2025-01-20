package d0120;

public class Array3 {
	
	public static void main(String[] args) {
		String[] strs = new String[100];
		// 1, 2, 짝, 4, 만세, 짝, 7, 8, 짝, 만세
		// 11, 12, 짝, 14, 만세, 짝, 17, 18, 짝, 만세
		// 21, 22, 짝, 24, 만세, 짝, 27, 28, 짝, 짝만세
		for(int i=0;i<strs.length;i++) {
			int n1 = i % 10;
			int n2 = i/ 10;
			
			if((n1!=0 && n1 % 3 == 0) || (i>10 && n2 % 3 == 0)) {
				strs[i] = "짝";
				if(i % 5 == 0) {
					strs[i] = "짝만세";
				}
				
			}
			
		}
		for(int i=0;i<strs.length;i++) {
			System.out.println(i + " : " + strs[i]);
		}
	}
}
