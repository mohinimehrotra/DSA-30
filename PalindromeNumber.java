package DSA;

public class PalindromeNumber {
        public static boolean isPalindrome(int x) {
            if (x < 0) {
                return false;
            }

            long reversed = 0;
            long temp = x;

            while (temp != 0) {
                long digit = temp % 10;
                reversed = reversed * 10 + digit;
                temp /= 10;
            }

            return (reversed == x);
        }
    

    public static void main(String[] args) {
        int num1 = 121;  
//        int num2 = 123;
        boolean result = isPalindrome(num1);
//        boolean result2 = isPalindrome(num2);
        System.out.println(num1 + " is palindrome " + result);
//        System.out.println(num2 + " is palindrome " + result2);
    }
}
