package d0113;

public class Loop2 {
	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
//			System.out.print(1 + " X " + i + " = " + (1*i));
//			System.out.print(",");
				for(int j=1;j<10;j++) {
					System.out.print(j + " X " + i + " = " + (i*j));
					System.out.print(",");
				
			}
				System.out.println();
		}
		
	}
}
