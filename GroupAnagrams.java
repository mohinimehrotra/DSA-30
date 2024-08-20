package DSA;
import java.util.*;
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(str);
    } return new ArrayList<>(map.values());
}
    public static void main(String args[]) {
    	String[] strs =  {"eat","tea","tan","ate","nat","bat"};
    	
    	System.out.println("Grouped Anagrams are"+ groupAnagrams(strs));
    	
    }
}
