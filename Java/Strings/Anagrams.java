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
        

        
        a = a.toLowerCase();            // makes the Strings lower case   
        b = b.toLowerCase();
        
        if ( a.length() == b.length()) {                //checks if both string shave equal length
            
            int [] aInt = new int[256];                 //creates a new array int with the total amount of char ascii
            int [] bInt = new int[256];    
            
            for (int i=0; i<a.length(); i++) {          // itterates thru each character 
                int aTemp = (int) a.charAt(i);          // find the ascii code of each character at current itteration 
                int bTemp = (int) b.charAt(i);
                
                aInt[aTemp] += 1;                       //pinpoints index (ascii of char) of int Array and adds 1 to that index. 
                bInt[bTemp] += 1;

               // a[(int) s1.charAt(i)] += 1;
               // b[(int) s2.charAt(i)] += 1;
            }
            
            for (int i=0; i<256; i++) {                 // itterates thru all the index of int Array
                if(aInt[i] != bInt[i]) {                // checks if 1 int Array is not equal to 2nd int Array if so, flse. 
                    return false;                          // else, false.
                }
                
            }
            
            return true;                                // if both int Array are equal at all index, then true
        }
        
        else {                                          // if the lengths are not equal, return false
            return false;
        }
        
       
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);                  //When isAnagram is run, it outputs true or false.
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );  // if ret boolen is true -> "anagram", if false -> not anagram 
    }
}
