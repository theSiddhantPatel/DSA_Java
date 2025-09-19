package string;

// import java.util.*;

public class AddBinaryStrings {
    // algo:-
    // 1. Initialize carry = 0 and result = "".
    // 2. Loop through both strings from rightmost to leftmost bit:
    // a. Convert corresponding characters to integers (bit1 and bit2).
    // b. Calculate sum = bit1 + bit2 + carry.
    // c. Append (sum % 2) to result.
    // d. Update carry = sum / 2.
    // 3. If carry > 0 after the loop, prepend it to the result.
    // 4. Reverse result and return.
    public static String solution(String a, String b) {
        a = a.replaceFirst("^0+", "");// The line s= s.replaceFirst("^0+", ""); is used to remove leading zeros
                                      // from the string a. Here's a detailed breakdown: chatgpt
        b = b.replaceFirst("^0+", "");
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        int sum = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            // if ((+b.charAt(j) - '0' )> 1 || (+a.charAt(i) - '0' )> 1) {
            // // i wanna handle if string is not a binary number
            // return "-1";
            // }
            int bitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int bitB = (j >= 0) ? b.charAt(j) - '0' : 0;
            sum = bitA + bitB + carry;
            result.append(sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }
        // System.out.println(a.charAt(i));
        return result.reverse().toString();// used to reverse a String
    }

    public static void main(String[] args) {
        System.out.println(solution("111", "101"));
    }
}
