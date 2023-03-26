package it.step;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbManager {

    public Connection getConnection() {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_manager", "root", "ORA123");
            System.out.println("Conexiune cu succes!");
            return connection;

        } catch(SQLException ex) {
            System.out.println("Eroare de conexiune: " + ex.getMessage());
            return null;
        }
    }

    // create
    public void create(Employee emp) {
//        String sql = "INSERT into employee(name, surname, email) values('"
//                + emp.getName()+ "', '"
//                + emp.getSurname() + "', '"
//                + emp.getEmail() + "')";

        try {
            String sql = "INSERT into employee(name, surname, email) values (?, ?, ?)";
            String deleteSql = "DELETE from employee where id=?";
            Connection connection = getConnection();

            if (connection != null) {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, emp.getName());
                preparedStatement.setString(2, emp.getSurname());
                preparedStatement.setString(3, emp.getEmail());
//                statement.setInt(4, emp.getId()); // Pentru update
//                statement.setInt(1, emp.getId()); // Pentru delete

                int rows = preparedStatement.executeUpdate();
                System.out.println("INSERT successfully completed!");
                System.out.println();
            }
        } catch (SQLException ex) {
            System.out.println("Nu am putut face insertul!");
        }

    }

    // update
    public void update(Employee emp) {

        try {
            String updateSql = "UPDATE employee set name = ?, surname = ?, email = ? where id=?";
            Connection connection = getConnection();

            if (connection != null) {
                PreparedStatement preparedStatement = connection.prepareStatement(updateSql);
                preparedStatement.setString(1, emp.getName());
                preparedStatement.setString(2, emp.getSurname());
                preparedStatement.setString(3, emp.getEmail());
                preparedStatement.setInt(4, emp.getId()); // Pentru update

                int rows = preparedStatement.executeUpdate();
                System.out.println("UPDATE successfully completed!");
                System.out.println();
            }
        } catch (SQLException ex) {
            System.out.println("Nu am putut face updateul!");
        }

    }

    // delete employee
    public void delete(Employee emp) {

        try {
            String deleteSql = "DELETE from employee where id=?";
            Connection connection = getConnection();

            if (connection != null) {
                PreparedStatement preparedStatement = connection.prepareStatement(deleteSql);
                preparedStatement.setInt(1, emp.getId()); // Pentru delete

                int rows = preparedStatement.executeUpdate();
                System.out.println("DELETE successfully completed!");
                System.out.println();
            }
        } catch (SQLException ex) {
            System.out.println("Nu am putut face deletul!");
        }

    }

    // delete employee ID
    public void delete(int id) {

        try {
            String deleteSql = "DELETE from employee where id=?";
            Connection connection = getConnection();

            if (connection != null) {
                PreparedStatement preparedStatement = connection.prepareStatement(deleteSql);
                preparedStatement.setInt(1, id); // Pentru delete

                int rows = preparedStatement.executeUpdate();
                System.out.println("DELETE successfully completed!");
                System.out.println();
            }
        } catch (SQLException ex) {
            System.out.println("Nu am putut face deletul!");
        }

    }


    // selectAll
    public List<Employee> selectAll() {
        List <Employee> employees = new ArrayList<>();

        try {
            // SQL - select
            String sql = "SELECT id, name, surname, email from employee";

            // getConnection
            Connection connection = getConnection();

            // statement
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            // ???data
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String email = resultSet.getString("email");

                employees.add(new Employee(id, name, surname, email)) ;
            }

        } catch (SQLException ex) {
            System.out.println("Nu am putut face selectul!");
        }


        return employees;
    }


}
