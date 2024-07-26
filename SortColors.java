package DSA;

public class SortColors {

    public static void sortColors(int[] nums) {
        int start = 0;
       int middle = 0;
        int end = nums.length - 1;

        
        while (middle <= end) {
            if (nums[middle] == 0) {
             
                int temp = nums[start];
                nums[start] = nums[middle];
                nums[middle] = temp;
                start++;
                middle++;
            } else if (nums[middle] == 1) {
                middle++;
            } else if(nums[middle] == 2){
            
                int temp = nums[middle];
                nums[middle] = nums[end];
                nums[end] = temp;
                end--;
            }
          }
     }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
      }
}
