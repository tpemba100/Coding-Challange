package Java.Strings;

public class RemoveSpace {
    public static void main(String[] args) {



        // EX 1  Remove spaces from string
        // strSpace.trim()   -->     trims only space at start and end
        String strSpace = "j a va s ta r";
        String trimmedStr = strSpace.replaceAll("\\s", "");  // \\s --> unicode of single space and remove


        System.out.println(trimmedStr);

    }
}
