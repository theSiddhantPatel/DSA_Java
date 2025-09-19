package cw35;

public class Substrings {
    // print all substrings of a string.
    public static void main(String[] args) {
        String input = "abc";
        int count = 0;
        for (int start = 0; start < input.length(); start++) {
            for (int end = start + 1; end <= input.length(); end++) {
                System.out.println(input.substring(start, end));
                count++;
            }
        }
        System.out.println();
        System.out.println(count);

    }
}
