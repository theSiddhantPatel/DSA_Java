public class digitCount {

    static double dc(int n) {
        return Math.log10(n + 1);
    }

    public static void main(String[] args) {
        System.out.println((int) Math.ceil(dc(999)));

    }
}
// I think this is a type of O(1) TC code