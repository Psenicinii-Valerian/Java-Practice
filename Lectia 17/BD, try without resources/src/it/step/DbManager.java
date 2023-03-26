package it.step;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbManager {

    public Connection getConnection() {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_manager", "root", "ORA123");
            return connection;

        } catch(SQLException ex) {
            System.out.println("Eroare de conexiune: " + ex.getMessage());
            return null;
        }
    }

    // create
    public void create(Employee emp) {
        try {
            String sql = "INSERT into employee(name, surname, email) values (?, ?, ?)";
            Connection connection = getConnection();

            if (connection != null) {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, emp.getName());
                preparedStatement.setString(2, emp.getSurname());
                preparedStatement.setString(3, emp.getEmail());

                int rows = preparedStatement.executeUpdate();
                preparedStatement.close();
                connection.close();
            }
        } catch (SQLException ex) {
            System.out.println("Nu am putut face insertul!");
        }
    }

    // selectAll
    public List<Employee> selectAll() {
        List<Employee> result = new ArrayList<>();
        String sql = "SELECT id, name, surname, email from employee ORDER BY id";

        try(Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql) ) {

            // data
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String email = resultSet.getString("email");

                result.add(new Employee(id, name, surname, email)) ;
            }


        } catch (SQLException ex) {
            System.out.println("Nu am putut face selectul!");
        }

        return result;
    }

    // update
    public void update(Employee emp) {

            String updateSql = "UPDATE employee set name = ?, surname = ?, email = ?, birthdate = ? where id=?";
            Connection connection = getConnection();

            if (connection != null) {
                try {
                    PreparedStatement preparedStatement = connection.prepareStatement(updateSql);
                    preparedStatement.setString(1, emp.getName());
                    preparedStatement.setString(2, emp.getSurname());
                    preparedStatement.setString(3, emp.getEmail());
                    preparedStatement.setString(4, emp.getBirthdate());
                    preparedStatement.setInt(5, emp.getId());

                    int rows = preparedStatement.executeUpdate();
                } catch (SQLException ex) {
                    System.out.println("Nu am putut face update!");
                }
        }

    }

    // delete employee
    public void delete(Employee emp) {

        try {
            String deleteSql = "DELETE from employee where id=?";
            Connection connection = getConnection();

            if (connection != null) {
                PreparedStatement preparedStatement = connection.prepareStatement(deleteSql);
                preparedStatement.setInt(1, emp.getId());

                int rows = preparedStatement.executeUpdate();
            }
        } catch (SQLException ex) {
            System.out.println("Nu am putut face delete!");
        }
    }

}
