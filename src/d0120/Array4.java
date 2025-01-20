package d0120;

public class Array4 {
	public static void main(String[] args) {
		// 1,2,짝,4,5,짝,6,7,8,짝,10
		// 11,23,짝,14,15,짝,17,18,짝,20
		for(int i=0;i<100;i++) {
			int n = (i+1) % 10; //3,6,9
			int n2 = (i+1) / 10; // 3,6, 9
			if((n!=0 && n%3==0) || (i>10 && n2 % 3==0)) {
				System.out.println((i+1) + ": 짝, ");
			}
			
		}
	}
}
