package DSA;

public class PowerOfTwo {
	public static boolean powerOf2(int num) {
		        if (num <= 0) {
		            return false;
		        }
		        while (num != 1) {
		            if (num% 2 == 0) {
		                num = num / 2;
		            } else {
		                return false;
		          }
		      }
		        
		        return true;
		    }
	public static void main(String args[]) {
		System.out.println("64 is the power of 2? " + powerOf2(64));
		System.out.println("12 is the power of 2? " + powerOf2(12));
		System.out.println("13 is the power of 2? " + powerOf2(13));
	}
		
	}


