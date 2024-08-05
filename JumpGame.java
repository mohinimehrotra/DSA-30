package DSA;

public class JumpGame {
	public static boolean canJump(int[] nums) {
		   int max=0;
	        for(int i =0;i<nums.length; i++){
	           
	            if(i>max){
	                return false;
	            }
	            max = Math.max(max, nums[i]+i);

	        }
	        return true;
	    }
		
		
	
	public static void main(String args[]) {
		int[] nums1 = {2,3,1,1,4};		
		int[] nums2 = {3,2,1,0,4};
		System.out.println("Nums1 can reach last index?"+ canJump(nums1));
		System.out.println("Nums1 can reach last index?"+ canJump(nums2));

	}

}
