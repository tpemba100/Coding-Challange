package Java.Strings;

public class StringUpperCaseFirst {

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
       // String A = scan.next();
       // String B = scan.next();

        String A = "apple";
        String B = "orange";

        System.out.println("The Sum of the length of A and B is " + A.length()+B.length());
        System.out.println("Is String A lexicographically greater than String B? ");
        System.out.println( A.compareTo(B)>0 ? "Yes" : "No" );

        String a = A.substring(0,1).toUpperCase() + A.substring(1, A.length());
        String b = B.substring(0,1).toUpperCase() + B.substring(1, B.length());

        System.out.println(a +" "+ b);
    }
}
