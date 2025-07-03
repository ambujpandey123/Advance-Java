package employeeManagementSystem;

//Main Application (Controller Layer)
import java.sql.*;
import java.util.*;

public class EmployeeApp {
 public static void main(String[] args) {
     final String DB_URL = "jdbc:mysql://localhost:3306/test";
     final String USER = "root";
     final String PASS = ""; // Replace with your password

     try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
          Scanner sc = new Scanner(System.in)) {

         EmployeeService service = new EmployeeService(conn);

         while (true) {
             System.out.println("\n1. Add Employee\n2. View Employees\n3. Update Employee\n4. Delete Employee\n5. Exit");
             System.out.print("Enter your choice: ");
             int choice = sc.nextInt();

             switch (choice) {
                 case 1:
                     System.out.print("Enter name: ");
                     String name = sc.next();
                     System.out.print("Enter salary: ");
                     double salary = sc.nextDouble();
                     service.addEmployee(name, salary);
                     System.out.println("Employee added.");
                     break;
                 case 2:
                     List<Employee> list = service.viewAllEmployees();
                     System.out.println("ID\tName\tSalary");
                     for (Employee emp : list) {
                         System.out.println(emp.getId() + "\t" + emp.getName() + "\t" + emp.getSalary());
                     }
                     break;
                 case 3:
                     System.out.print("Enter ID: ");
                     int updateId = sc.nextInt();
                     System.out.print("Enter new name: ");
                     String newName = sc.next();
                     System.out.print("Enter new salary: ");
                     double newSalary = sc.nextDouble();
                     if (service.updateEmployee(updateId, newName, newSalary))
                         System.out.println("Employee updated.");
                     else
                         System.out.println("Employee not found.");
                     break;
                 case 4:
                     System.out.print("Enter ID to delete: ");
                     int deleteId = sc.nextInt();
                     if (service.deleteEmployee(deleteId))
                         System.out.println("Employee deleted.");
                     else
                         System.out.println("Employee not found.");
                     break;
                 case 5:
                     System.out.println("Exiting...");
                     return;
                 default:
                     System.out.println("Invalid choice.");
             }
         }
     } catch (SQLException e) {
         e.printStackTrace();
     }
 }
}