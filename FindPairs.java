package DSA;
import java.util.Arrays;
public class FindPairs {
	

	    public static int findPair(int n, int x, int[] arr) {
	        Arrays.sort(arr);
	        
	        int i=0;
	        int j = 1;
	        
	        while (i < n && j < n) {
	            int diff = arr[j] - arr[i];
	            
	            if (diff == x && i != j) {
	                return 1;
	            }
	            
	            if (diff < x) {
	                j++;
	            } else {
	                i++;
	            }
	        }
	        
	        return -1;
	    }

	    public static void main(String[] args) {
	       
	       int[] nums = {1,5,3,4,2};
	       int n = 5;
	       int x = 2;
	        
	        System.out.println("Pair of elements in the array with sum x exsist, then retun 1 else return -1: " + findPair(n, x, nums));
	    }
	}


