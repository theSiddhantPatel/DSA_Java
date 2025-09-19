package cw50oops;
// import cw50oops.constructor0120.Student;
// public  class constructor0127 {
    
//     Student s3=new Student("patel",10,20);
    
//      public static void main(String[] args) {
//         System.out.println(s3.name);
//      }
// }
import cw50oops.Constructor0120;

public class Constructor0127 {
    public static void main(String[] args) {
        // Create an instance of Constructor0120
        Constructor0120 outer = new Constructor0120();

        // Create an instance of the inner Student class
        Constructor0120.Student s3 = outer.new Student("Patel", 10, 20);

        // Access and print the name
        System.out.println("Name: " + s3.name);
    }
}
