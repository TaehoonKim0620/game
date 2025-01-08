package d0103;

public class Test {
	public static void main(String[] args) {
		for(int i = 2; i <= 100; i+=2) {
			System.out.print(i);
			if(i % 10 == 0) {
				System.out.println();
			}else {
				System.out.print(",");
			}
		}
	}
}
