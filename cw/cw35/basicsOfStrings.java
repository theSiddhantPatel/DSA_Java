package cw35;

public class basicsOfStrings {
    public static void main(String[] args) {

        String s = "Siddhant";
        char curr = s.charAt(0);
        System.out.println(s + curr);
        String p = "Patel";
        System.out.println(s + " " + p.substring(0, p.length()));

        int[] arr = { 1, 2, 3, 4, 5, 6 };
        for (int i : arr) {
            System.out.print(i + " ");
        }
        String str = "abcd";

        System.out.println(str.substring(2));
    }
}