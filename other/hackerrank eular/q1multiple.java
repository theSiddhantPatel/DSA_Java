import java.util.Scanner;

class q1multiple {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a = 0; a < t; a++) {
            int n = in.nextInt();
            int t3 = (n - 1) / 3;
            int t5 = (n - 1) / 5;
            int t15 = (n - 1) / 15;
            int total = 3 * (t3 * (t3 + 1) / 2); // 3+6+9+12+15 =3 (1+2+3+4+5)=3*5*6/2=45
            total += 5 * (t5 * (t5 + 1) / 2);
            total -= 15 * (t15 * (t15 + 1) / 2);
            System.out.println(total);
        }
    }
}

/*
 * url =
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler001/problem?
 * isFullScreen=true
 * question = If we list all the natural numbers below that are multiples of 3
 * or
 * 5, we get 3,6,5 and 9. The sum of these multiples is 23 .
 * 
 * Find the sum of all the multiples of 3 or 5 below n.
 * 
 * Input Format
 * 
 * First line T contains that denotes the number of test cases. This is followed
 * by T lines, each containing an integer,N .
 * 
 * Constraints
 * 
 * Output Format
 * 
 * For each test case, print an integer that denotes the sum of all the
 * multiples of 3 or 5 below n .
 * 
 * Sample Input 0
 * 
 * 2
 * 10
 * 100
 * Sample Output 0
 * 
 * 23
 * 2318
 * Explanation 0
 * 
 * For n= 10 , if we list all the natural numbers below 10 that are multiples of
 * 3 or 5, we
 * get3,5,6,9 and . The sum of these multiples is 23 .
 * 
 * Similarly for 100 , we get 2318.
 */