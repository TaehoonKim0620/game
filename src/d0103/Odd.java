package d0103;

public class Odd {
	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 1) {
				System.out.print(i);
				System.out.print(", ");
			}
			
			if(i % 10 == 0) {
				System.out.println();
			}
		}
	}

}
