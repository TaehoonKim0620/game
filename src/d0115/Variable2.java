package d0115;

import java.util.Random;
import java.util.Scanner;

//main과 Variable2는 서로 다른 영역(중요)
public class Variable2 {
	int i; // 멤버변수
	// i를 그냥 쓰면 0으로 초기화가 됨
	String str;
	// str을 그냥 쓰면 null로 초기화가 됨
	// void 는 자료형, main 은 변수 이름
	// arg 는 argument의 약자
	public static void main(String[] args) {
		int i; // 변수를 사용하려면 선언과 초기화를 해야됨
		// 멤버변수를 사용하려면 반드시 메모리를 생성해야됨
		String str = new String("asdf");
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		Variable2 v = new Variable2();
		
		// String과 Scanner, Random은 클래스 그리고 
		// Variable2도 클래스이므로 메모리를 생성하려면 new를 사용해야됨
		// new -> 메모리 생성하기
		// 기본형 변수는 정해져있음 참조형은 그렇지 않음
		// 자바의 장점 : dataType을 사용자가 만들 수 있음
		// 구조체는 동사를 표현할 수 없음
		// 메서드는 동사를 표현할 수 있음
		// 존재하든 존재하지않든 정의할 수 있는 무언가 -> 객체(명사)
		
		System.out.println(v.i);
		System.out.println(v.str);
	}
}
