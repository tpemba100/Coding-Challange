package Java.Strings;

import java.util.LinkedHashSet;

public class RemoveSpaceAndDuplicate {
    public static void main(String[] args) {

        // EX 1  Remove spaces from string
               // strSpace.trim()   -->     trims only space at start and end
        String strSpace = "j a va s ta r";
        String trimmedStr = strSpace.replaceAll("\\s", "");  // \\s --> unicode of single space and remove
        System.out.println(trimmedStr);





        // EX 2 Remove any duplicate character

        String strDuplicate = "Mississippi";
        System.out.println("Mississippi");

        //Approach 1        distinct()
        StringBuilder sb1 = new StringBuilder();
        strDuplicate.chars().distinct().forEach(c -> sb1.append((char)c));
        // char() --> reads each char, distinct() -->  displays a letter in stream once, appends that c (char) to sb1
        System.out.println(sb1);


        // Approach 2       indexOf()
        StringBuilder sb2 = new StringBuilder();
        for(int i = 0;i<strDuplicate.length();i++) {            //itterate thru each char
            char ch = strDuplicate.charAt(i);                   // each char is initalized as char ch
            int idx = strDuplicate.indexOf(ch, i+1);   //indexOf --> identify first occurance of a char
            if(idx == -1) {                                     // idx = -1 means it that character didnt repeat/ occur
                sb2.append(ch);                                 // if char did not occur then add to StringBuilder sb2
            }
        }
        System.out.println(sb2);



        //Approach 3        inner forLoop
        char[] arr = strDuplicate.toCharArray();            //add each character to char Array
        StringBuilder sb3 = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            boolean repated = false;                        // initialize boolen false

            for (int j = i +1; j < arr.length; j++) {       //need to learn this j = i +1
                if (arr[i] == arr[j]) {                     // if the array value of i equals to array value of j
                    repated = true;                         // if repeated stay boolen true and do nothing
                    break;
                }
            }
            if (!repated) {                     // if reapeted and boolen is true then add that value of array i to sb3
                sb3.append(arr[i]);
            }
        }

        System.out.println(sb3);


        // Approach 4       LinkedHashSet()
        StringBuilder sb4 = new StringBuilder();
        LinkedHashSet set = new LinkedHashSet();        //Creating a integer capacity, and grow automatically as its added
        for (int i = 0; i < strDuplicate.length(); i++) {
            set.add(strDuplicate.charAt(i));            // uses add to add to linkedhasset and wont add when its repeated
        }
        set.forEach(c -> sb4.append((char)c));          // append each

        System.out.println(sb4);

        //Set<Character> set = new LinkedHashSet();
        // ...
        // for(Charatcer c: set) {
        //      sb4.append(c);
        // }

    }
}
