package DSA;
import java.util.*;

public class KthFactor {
    public static int kthFactor(int n, int k) {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i<= n; i++) {
            if (n %i == 0) {
                list.add(i);
                count++;
            }
            if (count == k) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 12, k = 3;
        System.out.println("The " + k + "th factor of " + n + " is: " +kthFactor(n, k));
    }
}
