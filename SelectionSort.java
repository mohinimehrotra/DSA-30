package DSA;

public class SelectionSort {
	public static int[] selectionSort(int[] nums) {
        int n = nums.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        
        return nums;
    }

    public static void main(String[] args) {
        int[] nums1 = {5, 2, 3, 1};
        int[] sortedNums1 = selectionSort(nums1);
        System.out.println("Sorted array: ");
        for (int num : sortedNums1) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Test case 2
        int[] nums2 = {5, 1, 1, 2, 0, 0};
        int[] sortedNums2 = selectionSort(nums2);
        System.out.println("Sorted array: ");
        for (int num : sortedNums2) {
            System.out.print(num + " ");
        }
    }
}
