package DSA;

public class DuplicatesInString {
  

   public static int sameChar(String A, String B) 
    {
        
        int count=0;
       String AA= A.toLowerCase(); 
        String BB=B.toLowerCase(); 
        for(int i=0;i<AA.length();i++){
            if(AA.charAt(i)==BB.charAt(i)){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]) {
    	String A = "choice"; 
    	String B = "chancE";
    	
    	System.out.println("The number of similar charathers in string A and B are " + sameChar(A,B));
    }
} 

