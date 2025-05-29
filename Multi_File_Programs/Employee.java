package Multi_File_Programs;
public class Employee {
    private int empId;
    private String empName;
    private String empDepartment;
    private double empSalary;

    // Setters
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }
    // Getters
    public int getEmpId() {
        return empId;  
    }
    public String getEmpName() {
        return empName;
    }
    public String getEmpDepartment() {
        return empDepartment;
    }
    public double getEmpSalary() {
        return empSalary;
    }
    
    
        // Display method
        public void display() {
            System.out.println("Employee Details:");
            System.out.println("Employee ID: " + empId);
            System.out.println("Employee Name: " + empName);
            System.out.println("Department: " + empDepartment);
            System.out.println("Salary: " + empSalary);
        }
    
        public static void main(String[] args) {
            System.out.println("Welcome to Employee Management System");
            System.out.println("Plese Run EmployeeImp");
        }
}