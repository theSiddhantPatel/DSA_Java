package string;

public class str {
    public static void main(String[] args) {
        String s = "2";
        if (+s.charAt(0) - '0' > 1) {
            System.out.println("yes");
            // return;
        }
        System.out.println(+'1');
        System.out.println("no");
    }

    public static char[] toCharArray() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toCharArray'");
    }
}
