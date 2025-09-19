import java.util.Scanner;

@SuppressWarnings("resource")
public class SequenceOfComparisons {
    // https://codeforces.com/problemset/problem/1571/A
    @SuppressWarnings("resources")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            // HashMap<Character,Integer>map=new HashMap<>();
            String str = s.next();
            if (str.contains("<") && str.contains(">")) {
                System.out.println("?");
            } else if (str.contains("<")) {
                System.out.println("<");
            } else if (str.contains(">")) {
                System.out.println(">");
            } else if (str.contains("=")) {
                System.out.println("=");
            }
        }
    }
}

/*
 * // equivalent kotlin code
 * import java.util.Scanner
 *
 * fun main() {
 * val scanner = Scanner(System.`in`)
 * var t = scanner.nextInt()
 * while (t-- > 0) {
 * val str = scanner.next()
 * when {
 * str.contains("<") && str.contains(">") -> println("?")
 * str.contains("<") -> println("<")
 * str.contains(">") -> println(">")
 * str.contains("=") -> println("=")
 * }
 * }
 * }
 */