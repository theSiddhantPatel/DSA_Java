package striverDsaNotion.strings;

public class CountAndSay38 {
    public String countAndSay(int n) {
        if (n == 1)
            return "1";
        String say = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < say.length(); i++) {
            int count = 1;
            while (i + 1 < say.length() && say.charAt(i) == say.charAt(i + 1)) {
                count++;
                i++;
            }
            result.append(count).append(say.charAt(i));

        }
        return result.toString();
    }

    public static void main(String[] args) {
        CountAndSay38 x = new CountAndSay38();
        System.out.println(x.countAndSay(5));
    }
}
