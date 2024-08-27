package DSA;

import java.util.Arrays;

public class BubbleSort {
	public static int[] bubbleSort(int[] nums) {
        for(int i =0;i<nums.length;i++){
            for(int j =i+1;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
	public static void main(String args[]) {
		int[] nums = {5,2,3,1};
		int[] arr = bubbleSort(nums);
		System.out.println("The sorted array is" + Arrays.toString(arr));
		
		
	}
	
}
