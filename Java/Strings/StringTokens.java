import java.io.*;
import java.util.*;

public class StringTokens {
    /*
        1. create a new string array then split the sprint using split("regex"). regex are [^a-zA-Z]. any time these are not read, it splits
        2. create a int to count the tokens
        3. itterate thru the arrays
            - if the token at index is not empty then add one to int tokens. only adds if there is a token.
        4.  we print the token total
        5. another for loop thru the string array
            - same if statement with same conditions
            - print each token from string array
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] tokens = s.split("[^a-zA-Z]");     // splitting string using split and adding to string array. only split letters.
        int numTokens = 0;                                 // a int for counting tokens

        for (int i=0; i<tokens.length; i++) {               //for loop to check the tokens amount
            if (tokens[i].length() > 0) {                   // only add token if the array at that index is not empty
                numTokens++;
            }
        }
        System.out.println(numTokens);                      // print the total amount of tokens

        for (int i=0; i<tokens.length; i++) {               //same for loops
            if (tokens[i].length() > 0)                       // same if conditions
                System.out.println(tokens[i]);                 // print the tokens
        }
        scan.close();
    }
}

