import java.util.Arrays;
import java.util.Scanner;

public class q9HelpfulMaths2 {

    public static String sortNumbersInString(String str) {
        // Split the string into parts based on '+'
        String[] parts = str.split("\\+");
        // Convert the parts to integers
        int[] numbers = Arrays.stream(parts).mapToInt(Integer::parseInt).toArray();
        // Sort the numbers
        Arrays.sort(numbers);
        // Join the sorted numbers back into a string with '+'
        StringBuilder sortedStr = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            sortedStr.append(numbers[i]);
            if (i < numbers.length - 1) {
                sortedStr.append("+");
            }
        }
        return sortedStr.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String sortedStr = sortNumbersInString(str);
        System.out.println(sortedStr); // Output: "1+2+3+5"
        s.close();
    }
}
