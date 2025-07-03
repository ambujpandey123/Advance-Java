package employeeManagementSystem;

import java.sql.*;
import java.util.*;

public class EmployeeService {
    private EmployeeDAO employeeDAO;

    public EmployeeService(Connection conn) {
        this.employeeDAO = new EmployeeDAO(conn);
    }

    public void addEmployee(String name, double salary) throws SQLException {
        Employee emp = new Employee();
        emp.setName(name);
        emp.setSalary(salary);
        employeeDAO.addEmployee(emp);
    }

    public List<Employee> viewAllEmployees() throws SQLException {
        return employeeDAO.getAllEmployees();
    }

    public boolean updateEmployee(int id, String name, double salary) throws SQLException {
        Employee emp = new Employee(id, name, salary);
        return employeeDAO.updateEmployee(emp);
    }

    public boolean deleteEmployee(int id) throws SQLException {
        return employeeDAO.deleteEmployee(id);
    }
}
