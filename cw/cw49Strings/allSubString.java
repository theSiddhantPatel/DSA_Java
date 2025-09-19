package cw49Strings;

public class allSubString {
    public static void main(String[] args) {
        String str = "siddhant";
        for (int i = 0; i <= str.length(); i++) {
            for (int j = i; j <= str.length(); j++) {
                System.out.print(str.substring(i, j) + " ");
            }

        }
    }
}
