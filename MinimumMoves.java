package DSA;

public class MinimumMoves {
	  public static int minMoves(int[] nums) {
	        int min = nums[0];
	        int result = 0;
	        for(int i =0;i<nums.length;i++){
	            if(nums[i]< min){
	                min = nums[i];
	            }
	        }
	        for( int i =0;i<nums.length;i++) {
	            result = result + nums[i] - min;
	        }
	        return result;
	    }
	  public static void main(String args[]) {
		  int[] nums1 = {1,2,3};
		  int[] nums2 = {4,4,4};
		  System .out.println("Minimum moves required to equal nums1 array elements are " + minMoves(nums1));
		  System .out.println("Minimum moves required to equal nums2 array elements are " + minMoves(nums2));
		  
	  }
}
