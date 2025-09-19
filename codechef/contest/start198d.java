package contest;

//https://www.codechef.com/START198D/problems/DECDISC
class start198d {
    public static void main(String[] args) throws java.lang.Exception {
        try (// your code goes here
                Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t-- > 0) {
                int n = s.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = s.nextInt();
                }
                int min = Integer.MAX_VALUE;
                for (int i = 0; i < n - 1; i++) {
                    int x = arr[i] + arr[i + 1] / 2;
                    min = Math.min(min, x);
                }
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (j != i + 1) { // not adjacent element counted
                            int cost = arr[i] + arr[j];
                            min = Math.min(min, cost);
                        }
                    }
                }
                System.out.println(min);
            }
        }
    }

    // https://www.codechef.com/START198D/problems/CUREX
{

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int a1 = s.nextInt();
            int b1 = s.nextInt();
            int a2 = s.nextInt();
            int b2 = s.nextInt();
            int initial = a1 * 5 + b1;
            int last = a2 * 5 + b2;
            if (last > initial)
                System.out.println("No");
            else {
                while (last < initial) {
                    initial -= 6;
                }
                System.out.println(initial == last ? "Yes" : "No");
            }

        }

    }

    // https://www.codechef.com/problems/MINMAXMEX

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            int[] brr = new int[n];
            for (int i = 0; i < n; i++) {
                brr[i] = s.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] > brr[i]) {
                    int temp = arr[i];
                    arr[i] = brr[i];
                    brr[i] = temp;
                }

            }
            int mex1 = 0;
            HashSet<Integer> set = new HashSet<>();
            for (int num : arr) {
                set.add(num);
            }
            int i = 0;
            while (true) {
                if (!set.contains(i)) {
                    mex1 = i;
                    break;
                }
                i++;
            }

            int mex2 = 0;
            HashSet<Integer> set = new HashSet<>();
            for (int num : brr) {
                set.add(num);
            }
            int i = 0;
            while (true) {
                if (!set.contains(i)) {
                    mex2 = i;
                    break;
                }
                i++;
            }
            int ans = Math.max(mex1, mex2);
            System.out.println(ans);

        }

    // corrected code is here

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            int[] brr = new int[n];
            for (int i = 0; i < n; i++) {
                brr[i] = s.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] > brr[i]) {
                    int temp = arr[i];
                    arr[i] = brr[i];
                    brr[i] = temp;
                }

            }
            int mex1 = 0;
            HashSet<Integer> set = new HashSet<>();
            for (int num : arr) {
                set.add(num);
            }
            int i = 0;
            while (true) {
                if (!set.contains(i)) {
                    mex1 = i;
                    break;
                }
                i++;
            }

            int mex2 = 0;
            HashSet<Integer> set2 = new HashSet<>();
            for (int num : brr) {
                set2.add(num);
            }
            i = 0;
            while (true) {
                if (!set2.contains(i)) {
                    mex2 = i;
                    break;
                }
                i++;
            }
            int ans = Math.max(mex1, mex2);
            System.out.println(ans);

        }
    }
}