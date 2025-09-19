package cw50oops;

public class gettersetter101 {
    // public class student{
    String name;
    public static int rno;
    double id;

    // }
    public static int getrono() {// getter
        return rno;
    }

    public void setrno(int rno) {// setter
        this.rno = rno;
        // return rno;
    }

    public static void main(String[] args) {
        // int rno=10;
        // setrno(150);
        // System.out.println(setrno(160));
        System.out.println(getrono());
        int rno = 140;
        System.out.println(rno);
    }
}
