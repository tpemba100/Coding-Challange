package Java.Strings;

public class ReverseString {

    // Reverse the String "hello" and output "olleh"
    public static void main(String[] args) {
        String str = "hello";

        //Approach 1   toCharArray() put each char in array
        char[] chArr = str.toCharArray(); //takes each char and put them in an array
        for(int i = chArr.length-1; i>=0; i--) { // starts from the back (array length) and itterates minus array
            System.out.print(chArr[i]);
        }
        System.out.println();

        //Approach 2        reading straight form string
        for(int i = str.length()-1; i>=0; i--) { //finds out how many char is at string(5), start look at 4(-1), iterate minus
            System.out.print(str.charAt(i)); //print out each char of the string being read
        }
        System.out.println();

        //Approach 3        StringBuffer and reverse()
        StringBuffer sb = new StringBuffer(str); //
        System.out.println(sb.reverse());

        //Approach 4        StringBuilder and reverse()
        StringBuilder sbuilder = new StringBuilder(str);
        System.out.println(sbuilder.reverse());
    }
}
