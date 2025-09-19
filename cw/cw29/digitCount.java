package cw29;

//digit count using recursion
public class digitCount {
    
    static  int count = 0;
    public static int dc(int n) {
        if (n != 0)// base case
        {
            // count++;
           count= dc(n / 10)+1;// recursive work+self work
        }
        return (count);

    }

    public static void main(String[] args) {
        System.out.println(dc(100));
    }
}
