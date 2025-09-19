package cw50oops;

public class student {
    // creating a new data type
     static class Student {
        String name;
        int Class;
        double rollno;
        double percentage;
    }
    public static class Car {
        String name;
        int Class;
        double hP;  
        double price;
    }

    public static void main(String[] args) {
        Student x = new Student(); // declaration a new box
        // object creation;- class-name object-name=new class-name();
        x.name = "Siddhnt Patel";
        x.Class = 17;
        x.percentage = 07.45;
        x.rollno = 9006;
        System.out.println(x.rollno);
        Student s = new Student();
        s.name = "patel";
        System.out.println(s.name);
       Car abc=new Car();
       abc.name="hover";
       System.out.println(abc.name);
    }
}
/*
 * access modifiers
 * public-all packages
 * private- same class
 * default-same package
 */