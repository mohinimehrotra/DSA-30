package DSA;

public class CountBinaryString {
    public static int countBinarySubstrings(String s) {
        int previousGroupCount = 0, currentGroupCount = 1, result = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentGroupCount++;
            } else {
                result += Math.min(previousGroupCount, currentGroupCount);
                previousGroupCount = currentGroupCount;
                currentGroupCount = 1;
            }
        }
        
        result += Math.min(previousGroupCount, currentGroupCount);
        return result;
    }

    public static void main(String[] args) {
        String s1 = "00110011";
        String s2 = "0100110101";
        String s3 = "0111100010";
        System.out.println("Output: " +countBinarySubstrings(s1));
        System.out.println("Output: " +countBinarySubstrings(s2));
        System.out.println("Output: " +countBinarySubstrings(s3));
    }
}
