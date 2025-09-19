import java.util.Scanner;

public class chartoAscii {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter " + "string");
        String str = s.next();
        // String str1 = new String(new char[n1]).replace('\0', ' ');
        char[] chars = str.toCharArray();

        // Iterate through the array, swapping adjacent characters
        for (int i = 0; i < chars.length - 1; i += 2) {
            // Swap chars[i] and chars[i+1]
            char temp = chars[i];
            chars[i] = chars[i + 1];
            chars[i + 1] = temp;
        }

        // Convert the character array back to a string
        // System.out.println(str);
        str = new String(chars);
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                // Reverse lowercase letters
                // if (Character.isLowerCase(ch)) {
                ch = (char) ('z' - (ch - 'a'));
                // }
                // Reverse uppercase letters
                // else if (Character.isUpperCase(ch)) {
                // ch = (char) ('Z' - (ch - 'A'));
                // }
            }
            result.append(ch);
        }

        System.out.println(result.toString());
        s.close();
        // System.out.println(str);
    }

}