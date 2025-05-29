package Multi_File_Programs;

public class EmployImp {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpId(101);
        emp.setEmpName("John Doe");
        emp.setEmpDepartment("IT");
        emp.setEmpSalary(75000.00);
        
        // Display employee details
        emp.display();
    }
}

// how to run this code in vs code terminal:
// first compile the Employee.java file and then run the EmployImp.java file.
// 1. Compile: javac .\Multi_File_Programs\Employee.java
// 2. Run:  java .\Multi_File_Programs\EmployImp.java 