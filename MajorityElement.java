package DSA;

public class MajorityElement {
	public static int majorityElement(int[] nums) {
        int majority = nums[0];
        int vote = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == majority) {
                vote++;
            } else {
                vote--;
                if ( vote == 0) {
                    majority = nums[i];
                    vote = 1;
                }
            }
        }

        return majority;
    }
public static void main(String args[]) {
	int[] nums1 = {2,2,1,3,1,2,2};
	int[] nums2 = {3,2,3};
	int[] nums3 = {2,2,1,1,1,2,2};
	System.out.println("Majority element in nums1 is " + majorityElement(nums1));
	System.out.println("Majority element in nums2 is " + majorityElement(nums2));	
	System.out.println("Majority element in nums3 is " + majorityElement(nums3));
} 
}
