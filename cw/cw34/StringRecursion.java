package cw34;

public class StringRecursion {
    // remove all the occurrences of "a" from string s="abcax"
    static String removeA(String s, int idx ) {
        // base case
        if (idx == s.length()) {
            return "";
        }
        // recursive work
        String smallAns = removeA(s, idx + 1);
        char currChar = s.charAt(idx);
        // self work
        if (currChar != 'a') {
            return currChar + smallAns;
        }
        else return smallAns;
    }
    public static void main(String[] args) {
        System.out.print(removeA("abcax", 0));
        String b="siddhant";
        String c="Patel";
        System.out.println(b+c);
        char f='q';   //char holds only one character
        String g="q";
    }

}
