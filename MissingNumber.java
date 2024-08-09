package DSA;

public class MissingNumber {
	public static int missingNumber(int[] nums) {
		 // Arrays.sort(nums);
        // for(int i =0;i<nums.length;i++){
        //     if(nums[i] != i){
        //         return i;
        //     }
        // }
        // return nums.length;
        int natural_sum = 0;
        int array_sum =0;
        int n = nums.length;
        natural_sum = n*(n+1)/2;
        for(int i =0;i<n;i++){
        array_sum = array_sum + nums[i];
        }
        return natural_sum - array_sum;
	}
	public static void main(String args[]) {
		int[] nums1 = {0,1,3};
		int[] nums2 = {0,1};
		int[] nums3 = {9,6,4,2,3,5,7,0,1};
		System.out.println("Missing number in nums1 is " + missingNumber(nums1));
		System.out.println("Missing number in nums2 is " + missingNumber(nums2));
		System.out.println("Missing number in nums3 is " + missingNumber(nums3));
	}
}
