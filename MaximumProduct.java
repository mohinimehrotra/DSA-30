package DSA;
import java.util.*;
public class MaximumProduct {
	
	public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int max1 = nums[n-1] * nums[n-2] * nums[n-3];
        int max2 = nums[0] * nums[1] * nums[n-1];
        return Math.max(max1, max2);
    }
	
	 public static void main(String[] args) {
	        int[] nums1 = {1, 2, 3};
	        int[] nums2 = {1, 2, 3, 4};
	        int[] nums3 = {-1, -2, -3, -4};

	        System.out.println("Maximum product of nums1: " + maximumProduct(nums1)); 
	        System.out.println("Maximum product of nums2: " + maximumProduct(nums2)); 
	        System.out.println("Maximum product of nums3: " + maximumProduct(nums3));
	    }

}
