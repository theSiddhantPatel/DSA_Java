package contest;

      class seat {
        public static int findMax(int k, int n, int m) {
            // code here
            if (n / k < 0)
                return -1;
            if (k >= n)
                return n;
            int l = k;
            for (int i = 0; i < l; i++) {
                if (n - 7 < k) {
                    n = n - (k - 1);
                    return k - 1;

                }
                n -= 7;
                k--;
            }
            return k;

        }
    

    public static void main(String[] args) {
        System.out.println(findMax(15, 50, 7));
    }
      }