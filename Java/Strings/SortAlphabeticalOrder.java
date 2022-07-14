package Java.Strings;

public class SortAlphabeticalOrder {
    public static void main(String[] args) {

        // Sorting charcter in aphabetical order
        String str = "rock";

        // Method 1     not using sort Method
        char arr[] = str.toCharArray();

        char temp;

        for (int i = 0; i<arr.length;i++) {
            for (int j = i + 1; j<arr.length; j++) {
                if (arr[i] > arr[j]) {           //i-0[r], j-1[o]. r > o
                    temp = arr[i];              //temp = r
                    arr[i] = arr[j];            // r => o
                    arr[j] = temp;              // o => r
                }
            }
        }
        System.out.println(new String(arr));


        //Method 2      using Sort Method
    }
}
