package cw50oops;

public class student1Derived {

    public static void main(String[] args) {
        // numberofStudents++;
        student1 s1 = new student1("Patel", 9006, 80);
        System.out.println(s1.numberofStudents);
        student1 s2 = new student1("SPatel", 9007, 80);
        System.out.println(s1.numberofStudents);
        student1 s3=new student1();
        System.out.println(numberofStudents);
        System.out.println(s2.name);
        // s1.setName("Siddhant");
        // // s1.getName();
        // System.out.println(s1.getName());
        // s1.setRno(9006);
        // System.out.println(s1.getRno());
        // // s1.schoolName="UPS"; final can't be assigned again
        // System.out.println(s1.schoolName);
    }
}
