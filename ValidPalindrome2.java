package DSA;

public class ValidPalindrome2 {

      public static boolean validPalindrome(String s) {
        for (int l = 0, r = s.length() - 1; l < r; ++l, --r) {
          if (s.charAt(l) != s.charAt(r)) {
               return validPalindrome(s, l + 1, r) || validPalindrome(s, l, r - 1);
            }
            }
         return true;
    }

    public static boolean  validPalindrome(final String s, int l, int r) {
          while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) {
               return false;
            }
     }
       return true;
  }

    public static void main(String[] args) {
        String s1 = "abca";
        String s2 = "aba";
        String s3 = "cba";
        System.out.println("String s1 is a valid palindrome? " + validPalindrome(s1)); 
        System.out.println("String s2 is a valid palindrome? " + validPalindrome(s2)); 
        System.out.println("String s3 is a valid palindrome? " + validPalindrome(s3));
  }
}
