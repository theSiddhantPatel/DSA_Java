public class charToAscii2 {

    public static String optimizedTransform(String str) {
        char[] chars = str.toCharArray();

        // Single loop for both swapping and reversing
        for (int i = 0; i < chars.length; i++) {
            // Swap adjacent characters
            if (i % 2 == 0 && i + 1 < chars.length) {
                char temp = chars[i];
                chars[i] = chars[i + 1];
                chars[i + 1] = temp;
            }

            // Reverse alphabet position
            if (Character.isLetter(chars[i])) {
                // if (Character.isLowerCase(chars[i])) {
                chars[i] = (char) ('z' - (chars[i] - 'a')); // typecast and reverse(a->z)
                // } else if (Character.isUpperCase(chars[i])) {
                // chars[i] = (char) ('Z' - (chars[i] - 'A'));
                // }
            }
        }
        // str=new String (chars); in case of string return
        return new String(chars);
    }

    public static void main(String[] args) {
        String str = "ay";
        System.out.println(optimizedTransform(str));
    }
}