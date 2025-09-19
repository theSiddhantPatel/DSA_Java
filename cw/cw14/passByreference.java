package cw14;

public class passByreference {
    static void arr(int []a){
for (int i = 0; i < a.length; i++) {
    a[i]=0;
}

    }
    public static void main(String[] args) {
        int []a={1,2,3};
        arr(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
