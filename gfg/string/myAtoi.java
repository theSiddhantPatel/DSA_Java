
package string;

class myAtoi { // atoi means ascii to integer(a function in c)
    public static int solution(String s) {
        s = s.trim(); // Returns a new string with all whitespace characters removed from the
                      // beginning and end of the original string s.

        boolean neg = false;
        int i = 0;
        if (s.charAt(0) == '-') {
            neg = true;
            i = 1;
        }

        long res = 0;

        for (; i < s.length(); i++) {
            // if (s.charAt(i)==' ') {
            // break;
            // } this code will not work for spaces before str, it will give wrong answer
            if (!Character.isDigit(s.charAt(i))) { // Checks whether the current character at position i in the string s
                                                   // is not a digit.If the character isn't a digit, then if block
                                                   // executes.
                return neg ? (int) (res) * -1 : (int) res; // Returns the current result res with appropriate sign based
                                                           // on the neg flag. If neg (negative flag) is true, res is
                                                           // multiplied by -1.If neg is false, res is returned as it
                                                           // is. result is typecasted here into int
            }

            res = res * 10 + (s.charAt(i) - '0');
        }
        if (neg && res * -1 < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (res > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        return neg ? (int) (res) * -1 : (int) res;
    }

    public static void main(String[] args) {
        // System.out.println(myAtoi());
        System.out.println(solution(" -4  121jhl-8jhb  f"));
    }
}