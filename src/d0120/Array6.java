package d0120;

public class Array6 {
	public static void main(String[] args) {
		int[] nums = new int[6];
		// 1-45까지의 난수를 6개 생성해서
		// nums의 각각 대입을 하는데 짝수일때는 0
		for(int i=0;i<nums.length;i++) {
			int rNum = (int)(Math.random()*45) + 1;
			if(rNum % 2 ==1) {
				nums[i] = rNum;
			}
			
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
}
