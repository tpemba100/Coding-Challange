import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        
        /*
        1. make all string lower case
        2. check if the length is equal, if so true; else false
        3. if length is equal then creare a new Int Array of total Ascii character for both string
        4. itterate thru each Char in String to find its ascii number 
            - add 1 to that index (ascii number) for each time that char occurance  
        5. itterate thru total ascii characters
            - if the 2 int arrays are not equal at any point, return false. else true.
        */
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        if ( a.length() == b.length()) {
            
            int [] aInt = new int[256];    
            int [] bInt = new int[256];    
            
            for (int i=0; i<a.length(); i++) {
                int aTemp = (int) a.charAt(i);
                int bTemp = (int) b.charAt(i);
                
                aInt[aTemp] += 1;
                bInt[bTemp] += 1;

               // a[(int) s1.charAt(i)] += 1;
               // b[(int) s2.charAt(i)] += 1;
            }
            
            for (int i=0; i<256; i++) {
                if(aInt[i] != bInt[i]) {
                    return false;
                }
                
            }
            
            return true;
        }
        
        else {
            return false;
        }
        
       
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
