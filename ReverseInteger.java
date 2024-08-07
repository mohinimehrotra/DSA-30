package DSA;

public class ReverseInteger {
	public class Main {}

	
	    public static int reverse(int x) {
	        int rev = 0;
	        while (x != 0) {
	           int rem = x % 10;
	          if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
	                return 0;
	            }
	          if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && rem < -8)) {
	                return 0;
	            }
	            
	            rev = rev*10+rem;
	            x = x/10;
	          }
	        return rev;
	       }

	    public static void main(String[] args) {
	   
	        System.out.println("Input: 123, Output: " + reverse(123)); 
	        System.out.println("Input: -123, Output: " + reverse(-123));
	        System.out.println("Input: 120, Output: " + reverse(120));
	        System.out.println("Input: 0, Output: " + reverse(0)); 
	        System.out.println("Input: 1534236469, Output: " + reverse(1534236469));
	    }
	
	

}
