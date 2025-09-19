package cw50oops;

// import aapractice.solution2;

public class pbvPassByRef {
    public static class Student {
        String name;
        int Class;
        double rollno;
        double percentage;
    }

    public static int change(int x) {
        x = x+7;
        return x;
    }
    public static void change(Student s) {
        s.name="Siddhant";

        
    }

    public static void main(String[] args) {
        int y = 10;
        System.out.println(y);
        // y=5;
        change(y);
        System.out.println(change(y));
        System.out.println(y);
        // System.out.print(change(y));

        Student z=new Student();
        z.name="Patel";
        System.out.println(z.name);
        change(z);
        System.out.println(z.name);  //pass by reference value changed

     //we use import keyword to access a file in another package
    } 

}
