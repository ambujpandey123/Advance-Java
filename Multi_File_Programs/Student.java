package Multi_File_Programs;

public class Student {
    private int rollNo;
    private String name;
    private int marks;
    private String course;

    // Setters
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // Display method
    public void display() {
        System.out.println("Student Details:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Course: " + course);
    }
    public static void main(String[] args) {
      System.out.println("Welcome to Student Management System");
      System.out.println("Please Run StudentImp");
    }
    // Constructor
}
