package Java.Strings;

// remove all special character
//input: $ja!va$&st*ar   output: javastar
public class RemoveSpecialChar {
    public static void main(String[] args) {

        String str = "$ja!va$&st%ar";

        //Approach 1        replaceAll("values you want to keep", " ") if anything else than keep replace with empty

        String plainStr = str.replaceAll("[^a-zA-Z0-9]", "");
        //reads each string and if special char, then replace with empty

        System.out.println(plainStr);



    }

}
