package dailyproblem;

public class myPow50 {
    public double myPow(double  x, int n){
        long binForm=n;
        if(n<0){
            binForm=-binForm;
            x=1/x;
        }double ans=1;
        while(binForm>0){
            if(binForm%2==1){
                ans*=x;
            }
            x*=x;
            binForm/=2;
        }
    }
}
