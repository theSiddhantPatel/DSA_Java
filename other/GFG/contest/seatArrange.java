package contest;
public class seatArrange {
    public static int findMax(int k, int n, int m) {
        // code here
        if(k*m<n)return -1;
        if(k>=n)return n;
        int t=k;
        n=n-k;
        m=m-1;
        while(n>=0){
           n=n-m;
        //   m--;
           t--;
        }
            return t;
    
    }
    public static void main(String[] args) {
        System.out.println(findMax(4, 20, 5));
    }
}
