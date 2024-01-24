package basic_java;

// abstract class
abstract class Main1 {
    public String fname = "John";
    public int age = 24;
    public abstract void study(); // abstract method
}
// Subclass (inherit from Main)
class Student extends Main1 {
    public int graduationYear = 2018;

    public void study() { // the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Student student = new Student();
        int studentAge = student.age;
        System.out.println(studentAge);
        String studentFname = student.fname;
        System.out.println(studentFname);
        student.study();
        int studentgraduationYear = student.graduationYear;
        System.out.println(studentgraduationYear);

    }
}
