package striverDsaNotion.strings;

public class integerToRoman12 {
    String intToRoman(int num) {
        final int[] val = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        final String[] symbol = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        // int []res=""; in cpp
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 13; i++) {
            if (num == 0)
                break;
            int times = num / val[i];
            while (times-- > 0) {
                // res += symbol[i]; in cpp
                res.append(symbol[i]);
            }
            num = num % val[i];
        }
        return res.toString();
    }

    public static void main(String[] args) {
        integerToRoman12 x = new integerToRoman12();
        System.out.println(x.intToRoman(138));
    }
}
