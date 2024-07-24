package DSA;

public class FindDuplicate {
	public static int findDuplicate(int nums[]){
		int fast = nums[0];
		int slow = nums[0];
		  do {
	            slow = nums[slow];
	            fast = nums[nums[fast]];
	        } while (slow != fast);
			int slow0 = nums[0];
		while(slow != slow0) {
			{
				slow = nums[slow];
				slow0 = nums[slow0];
			
		}
			}
		
			return slow;
		
	}
public static void main(String args[]) {
	int[] nums1 = {1, 3, 4, 2, 2};
    int[] nums2 = {3, 1, 3, 4, 2};
    System.out.println("Duplicate in nums1: " + findDuplicate(nums1));
    System.out.println("Duplicate in nums1: " + findDuplicate(nums2));
    
}
}
