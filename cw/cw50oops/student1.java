package cw50oops;

public class student1 {
    String name;
     int rno;
    double percentage;
     String schoolName = "BIET"; // final attribute can't be changed
    static int numberofStudents;

    // public student1(String Name, int Rno, double Percentage) { // constructor (no
    // //problem for again and again
    // // initialization objects)
    // name = Name;
    // rno = Rno;
    // percentage = Percentage;
    // }
    public student1(String name, int rno, double percentage) { // constructor (no problem for again and again
        // initialization objects)
        this.name = name; // this keyword
        this.rno = rno;
        this.percentage = percentage;
        numberofStudents++;
    }

    public student1() {
    }
    // { default constructor when no value

    // }

    // public student1(String Name, int Rno, double Percentage) {

    // }

    public int getRno() {
        // getter
        return rno;

    }

    public void setRno(int rno) {
        // setter
        this.rno = rno; // use this keyword when passed value and written value are same
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        name = Name;
    }

}

class Private {
    public static void main(String[] args) {
        student1 s3 = new student1("", 9006, 60.5);
        student1 s1 = new student1("Patel", 9006, 80);
        student1 s2 = new student1("SPatel", 9007, 80);
        System.out.println(s2.name);
        s1.setName("Siddhant");
        // s1.getName();
        System.out.println(s1.getName());
        s1.setRno(9006);
        System.out.println(s1.getRno());
        // s1.schoolName="UPS"; final can't be assigned again
        System.out.println(s1.schoolName);
        // student1("siddhant",6,8);
        // System.out.println(cw50oops.student1.schoolName);
    }
}
