package DSA;

public class ReverseString {

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Original: " + String.valueOf(s1));
        reverseString(s1);
        System.out.println("Reversed: " + String.valueOf(s1));

        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        System.out.println("Original: " + String.valueOf(s2));
        reverseString(s2);
        System.out.println("Reversed: " + String.valueOf(s2));
    }
}
