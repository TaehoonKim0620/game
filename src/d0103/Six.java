package d0103;

public class Six {
	public static void main(String[] args) {
		// 6이 들어가면 짝
		for(int i = 1;i <= 100;i++) {
			if(i % 10 == 6 || i / 10 == 6) {
				System.out.println(i + " 짝");
			}
			else {
				System.out.println(i);
			}
		}
	}
}
