package d0115;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("원하는 구구단을 입력해주세요 : ");
		String numStr = s.nextLine();
		System.out.println("니가 원하는 구구단은 " + numStr + "단입니다.");
		
		int num = Integer.parseInt(numStr);
		for(int i=1;i<=9;i++) {
			System.out.println(num + " X " + i + " = " + num*i);
		}
	}
}
