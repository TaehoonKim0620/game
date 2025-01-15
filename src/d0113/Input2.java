package d0113;

import java.util.Random;
import java.util.Scanner;

public class Input2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int targetNum = r.nextInt(100)+1;
		
		while(true) {
		System.out.println("원하는 숫자를 적으세요");
		String numStr = s.nextLine();
		int num = Integer.parseInt(numStr);
		
		
		
		
		if(num < targetNum) {
			System.out.println("Up");continue;
		}else if(num > targetNum) {
			System.out.println("Down");continue;
		}else {
			System.out.println("정답");break;
		}
				
		
		
		
		}
	}
}
