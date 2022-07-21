package Java.Strings;

public class SortAlphabeticalOrder {
    public static void main(String[] args) {

        // Sorting charcter in aphabetical order
        String str = "rock";

        // Method 1     not using sort Method
        char arr[] = str.toCharArray();         // putting each character in array

        char temp;                          //temporary character variable

        for (int i = 0; i<arr.length;i++) {             // nested for loop
            for (int j = i + 1; j<arr.length; j++) {
                if (arr[i] > arr[j]) {                  //if i value is greater than j value
                    temp = arr[i];                      // basically switching values in array
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(new String(arr));        //creating a new string from array


        //Method 2      using Sort Method
    }
}
