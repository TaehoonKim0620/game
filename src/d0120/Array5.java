package d0120;

public class Array5 {
	public static void main(String[] args) {
		// 1-45까지의 난수를 6개 생성하여
		// nums의 0번째부터 5번째 방까지 대입해주세요.
		int[] nums= new int[6];
		for(int i=0;i<nums.length;i++) {
			nums[i] = (int)(Math.random()*45) + 1;
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println("num" + "[" + i + "]" + " : " + nums[i]);
		}
	}
}
