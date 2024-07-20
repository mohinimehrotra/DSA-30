package DSA;

public class findString {
 public static int findStartIndexOfSubstr(String needle,String haystack){
	 if (needle.isEmpty()) {
         return 0; 
     }
     
     for (int i = 0; i <= haystack.length() - needle.length(); i++) {
         if (haystack.charAt(i) == needle.charAt(0)) {
             if (haystack.substring(i, i + needle.length()).equals(needle)) {
                 return i;
             }
         }
     }
     return -1;
	 
 }
 public static void main() {
	  String haystack = "sadbutsad";
      String needle = "sad";
      
      int result = findStartIndexOfSubstr(haystack, needle);
      System.out.println("Start index is"+ result);
 }
}
