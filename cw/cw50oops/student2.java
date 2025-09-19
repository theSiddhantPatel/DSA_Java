package cw50oops;


public class student2 {
    public static void change (student1 s){
        s.name="Rohan";

    }
    public static void main(String[] args) {
       student1 s1=new student1();
       s1.name="Patel";
       s1.percentage=81.33;
    //    s1.rno=6;
       System.out.println(s1.getRno());

    }
}
