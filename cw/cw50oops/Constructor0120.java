package cw50oops;

public class Constructor0120 {
    public static class Student {
        String name;
        int rno;
        double percentage;
        static int numberOfStudent; // if we make it static it will take only one address for initialization

        // Parameterized constructor
        public Student(String name, int rno, double percentage) {
            this.name = name;
            this.rno = rno;
            this.percentage = percentage;
        }

        // Default constructor
        public Student() {
        }
        
    }

    public static void main(String[] args) {
        // Creating an instance of Student
        Student s2 = new Student("Siddhant", 10, 85.5);
        System.out.println("Name: " + s2.name);
        System.out.println("Roll Number: " + s2.rno);
        System.out.println("Percentage: " + s2.percentage);
        // s2.numberOfStudent
        System.out.println(++s2.numberOfStudent);
        ;
        System.out.println(++Student.numberOfStudent);
    }
}
