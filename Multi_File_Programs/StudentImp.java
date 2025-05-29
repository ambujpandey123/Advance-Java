package Multi_File_Programs;

public class StudentImp {
    public static void main(String[] args) {
        Student student = new Student();
        student.setRollNo(101);
        student.setName("John Doe");
        student.setMarks(85);
        student.setCourse("Computer Science");
        
        student.display();
    }
}

// This code creates a Student object, sets its properties, and displays the student's details.
// To run this code, compile the Student.java file first and then run this StudentImp.java file.
// In VS Code terminal, you can compile and run it as follows:
// 1. Compile: javac .\Multi_File_Programs\Student.java 
// 2. Run: java .\Multi_File_Programs\StudentImp.java