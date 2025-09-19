package cw35;

public class subsequenceRec {
    public static void printSsq(String s, String currAns) {
        if (s.length() == 0) {
            System.out.print(currAns + " ");
            return;
        }
        char currChar = s.charAt(0);
        String remString = s.substring(1);
        printSsq(remString, currAns + currChar);
        printSsq(remString, currAns);
    } 

    public static void main(String[] args) {
        printSsq("abc", " ");
    }
}
