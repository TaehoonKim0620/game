package d0108;

import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		Random r = new Random();
		int[] nums = new int[6];
		for(int i=0;i<nums.length;i++) {
			nums[i] = r.nextInt(45) + 1;
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
}
