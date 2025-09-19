class Solution1 {
    public static int minOperations(int x, int y) {
        // code here
        int move = 0;
        x = Math.abs(x);
        System.out.println(x);
        y = Math.abs(y);
        System.out.println(y);
        if (x % 2 != 0 || y % 2 != 0)
            return -1;
        if (x % 4 == 0)
            move += x / 4;
        else
            move += x / 4 + 1;
        if (y % 4 == 0)
            move += y / 4;
        else
            move += y / 4 + 1;
        return move;
    }

    public static void main(String[] args) {
        System.out.println(minOperations(-11, -8));
    }
}