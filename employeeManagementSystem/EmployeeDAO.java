package employeeManagementSystem;

import java.sql.*;
import java.util.*;

public class EmployeeDAO {
    private Connection conn;

    public EmployeeDAO(Connection conn) {
        this.conn = conn;
    }

    public void addEmployee(Employee emp) throws SQLException {
        String query = "INSERT INTO employees (name, salary) VALUES (?, ?)";
        PreparedStatement pst = conn.prepareStatement(query);
        pst.setString(1, emp.getName());
        pst.setDouble(2, emp.getSalary());
        pst.executeUpdate();
    }

    public List<Employee> getAllEmployees() throws SQLException {
        List<Employee> list = new ArrayList<>();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM employees");

        while (rs.next()) {
            Employee emp = new Employee(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getDouble("salary")
            );
            list.add(emp);
        }
        return list;
    }

    public boolean updateEmployee(Employee emp) throws SQLException {
        String query = "UPDATE employees SET name=?, salary=? WHERE id=?";
        PreparedStatement pst = conn.prepareStatement(query);
        pst.setString(1, emp.getName());
        pst.setDouble(2, emp.getSalary());
        pst.setInt(3, emp.getId());
        return pst.executeUpdate() > 0;
    }

    public boolean deleteEmployee(int id) throws SQLException {
        String query = "DELETE FROM employees WHERE id=?";
        PreparedStatement pst = conn.prepareStatement(query);
        pst.setInt(1, id);
        return pst.executeUpdate() > 0;
    }
}