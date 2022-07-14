package Java.Strings;

public class PalindromeStringReverse {
    public static void main(String[] args) {

                //Approach 1        itterate from start to half way and compare to itteration from back to half way
                String A = "kayak";
                //String A = "apple";
                boolean valid = true;       //setting bollen default to true


                for(int i = 0; i<(A.length() /2); i++) {                //iterat thru only half length of word b/s this is palindrome, other half should be came
                    if (A.charAt(i) != A.charAt((A.length()-1)-i) ) {       // if character at array of first is not equal to array of last
                        valid = false;                                      // break
                        break;
                    }
                }

                if(valid) System.out.println("Yes");
                else System.out.println("No");
    }

}
