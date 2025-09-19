package string;

class AddBinaryStrings2 { // coded by a professional( © imported content)
    public static String addBinary(String a, String b) {

        a = a.replaceFirst("^0+", "");
        b = b.replaceFirst("^0+", "");

        int n1 = a.length() - 1;
        int n2 = b.length() - 1;
        int c = 0;
        int base = 2;
        StringBuilder res = new StringBuilder();

        while (n1 >= 0 || n2 >= 0) {
            int t1 = 0;
            int t2 = 0;

            if (n1 >= 0) {
                t1 = a.charAt(n1--) - '0';
            }
            if (n2 >= 0) {
                t2 = b.charAt(n2--) - '0';
            }

            int sum = t1 + t2 + c;
            c = sum / base;
            res.append(sum % base);
        }

        if (c == 1) {
            res.append(c);
        }

        return res.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("110", "101"));
    }
}