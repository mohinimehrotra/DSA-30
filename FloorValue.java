package DSA;

public class FloorValue {

	public static int findFloor(long arr[], int n, long x) {
		    int low = 0, high = n - 1;
		    int result = -1;

		    while (low <= high) {
		        int mid = low + (high - low) / 2;
		        if (arr[mid] == x) {
		            return mid;
		        } else if (arr[mid] < x) {
		            result = mid;
		            low = mid + 1;
		        } 
		        else {
		            high =mid - 1;
		          }
		    }
		    return result;
		}

    public static void main(String args[]) {
        long[] arr = {1, 2, 8, 10, 11, 12, 19};
        long x = 5;
        int n = arr.length;
        int floorIndex = findFloor(arr, n, x);
        if (floorIndex != -1) {
            System.out.println("The floor of " + x + " is at index: "+ floorIndex);
        } else {
            System.out.println("No floor found for "+ x + " in the array.");
        }
    }
}
