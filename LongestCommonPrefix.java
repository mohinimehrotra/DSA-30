package DSA;
import java.util.*;


public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        if (strs == null || strs.length == 0) return "";
        Arrays.sort(strs);
        System.out.println("Sorted array is:" + Arrays.toString(strs));
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();
        for(int i=0;i<first.length;i++){
            if(first[i] != last[i]){
                break;
            }
            else{
                sb.append(first[i]);
            }
            }
            return sb.toString();
        }
	public static void main(String args[]) {
		String[] str1 = {"flower","flow","flight"};
		String[] str2 = {"club","clue","clumsy","cluster","clutch"};
		System.out.println("Longest common prefix for String1 is:"+longestCommonPrefix(str1));
		System.out.println("Longest common prefix for String2 is:"+longestCommonPrefix(str2));
	

}
}
