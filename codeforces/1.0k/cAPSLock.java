import java.util.Scanner;

//https://codeforces.com/problemset/problem/131/A
public class cAPSLock {
    public static String main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine(); // next line also considers a string word after space
        if (Character.isUpperCase(str.charAt(0))) {
            if (Character.isUpperCase(str.substring(1).charAt(0)) && !Character
                    .isLowerCase(str.substring(1).charAt(0)) == true) {
                String result = str.substring(0, 1).toUpperCase();
                return result;

            }
            else if () {

            }
        }
        System.out.println(result);
        s.close();
    }

}
