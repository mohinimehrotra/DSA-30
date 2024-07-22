package DSA;
import java.util.*;

public class HappyNum {
    
    public static boolean isHappy(int num) {
        HashSet<Integer> hs = new HashSet<>();
        
        while(num != 1 && !hs.contains(num)) {
            hs.add(num); 
            
            int sum = 0;
            while(num > 0) {
                int digit = num % 10;
                sum += digit * digit;
                num = num / 10;
            }
            
            num = sum;
        }
        
        return num == 1;
    }

    public static void main(String args[]) {
        System.out.println(isHappy(19)); 
        System.out.println(isHappy(2));  
    }
}
