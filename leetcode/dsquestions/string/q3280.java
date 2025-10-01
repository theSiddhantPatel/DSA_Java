package dsquestions.string;
//https://leetcode.com/problems/convert-date-to-binary/description/

public class q3280 {
    public String convertDateToBinary(String date) {
        String[] str = date.split("-");
        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[1]);
        int num3 = Integer.parseInt(str[2]);

        return (decToBinary(num1)) + "-" + (decToBinary(num2)) + "-"
                + (decToBinary(num3));

    }

    public String decToBinary(int n) {
        if (n == 0)
            return "0";
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            /*
             * Use bit shifting (n >> 1 instead of n / 2)
             * Use bit masks (n & 1 instead of n % 2)
             */
            binary.insert(0, n & 1);
            n = n >> 1;
        }
        return binary.toString();
    }

    // 2nd method builtin
    public static String convertDateToBinary2(String date) {
        String[] parts = date.split("-");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < parts.length; i++) {
            if (i > 0)
                result.append("-");
            result.append(Integer.toBinaryString(Integer.parseInt(parts[i])));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        q3280 x = new q3280();
        System.out.println(x.convertDateToBinary("2002-05-09"));
    }
}
