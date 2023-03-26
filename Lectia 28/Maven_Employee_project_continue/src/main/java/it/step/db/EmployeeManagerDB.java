package it.step.db;

import it.step.model.Person;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManagerDB {
    public EmployeeManagerDB() {
    }

    public Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_manager", "root", "ORA123");
            return connection;
        } catch (SQLException var2) {
            System.out.println("Eroare de conexiune: " + var2.getMessage());
            return null;
        }
    }

    public void create(Person emp) {
        try {
            String sql = "INSERT into employee(name, surname, email) values (?, ?, ?)";
            Connection connection = this.getConnection();
            if (connection != null) {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, emp.getName());
                preparedStatement.setString(2, emp.getSurname());
                int rows = preparedStatement.executeUpdate();
                preparedStatement.close();
                connection.close();
            }
        } catch (SQLException var6) {
            System.out.println("Nu am putut face insertul!");
        }

    }

    public List<Person> selectAll() {
        List<Person> result = new ArrayList();
        String sql = "SELECT id, name, surname, email from employee ORDER BY id";

        try {
            Connection connection = this.getConnection();
            Throwable var4 = null;

            try {
                Statement statement = connection.createStatement();
                Throwable var6 = null;

                try {
                    ResultSet resultSet = statement.executeQuery(sql);
                    Throwable var8 = null;

                    try {
                        while(resultSet.next()) {
                            int id = resultSet.getInt("id");
                            String name = resultSet.getString("name");
                            String surname = resultSet.getString("surname");
                            String email = resultSet.getString("email");
                            result.add(new Person(id, name, surname));
                        }
                    } catch (Throwable var58) {
                        var8 = var58;
                        throw var58;
                    } finally {
                        if (resultSet != null) {
                            if (var8 != null) {
                                try {
                                    resultSet.close();
                                } catch (Throwable var57) {
                                    var8.addSuppressed(var57);
                                }
                            } else {
                                resultSet.close();
                            }
                        }

                    }
                } catch (Throwable var60) {
                    var6 = var60;
                    throw var60;
                } finally {
                    if (statement != null) {
                        if (var6 != null) {
                            try {
                                statement.close();
                            } catch (Throwable var56) {
                                var6.addSuppressed(var56);
                            }
                        } else {
                            statement.close();
                        }
                    }

                }
            } catch (Throwable var62) {
                var4 = var62;
                throw var62;
            } finally {
                if (connection != null) {
                    if (var4 != null) {
                        try {
                            connection.close();
                        } catch (Throwable var55) {
                            var4.addSuppressed(var55);
                        }
                    } else {
                        connection.close();
                    }
                }

            }
        } catch (SQLException var64) {
            System.out.println("Nu am putut face selectul!");
        }

        return result;
    }

    public void update(Person emp) {
        String updateSql = "UPDATE employee set name = ?, surname = ?, email = ?, birthdate = ? where id=?";
        Connection connection = this.getConnection();
        if (connection != null) {
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(updateSql);
                preparedStatement.setString(1, emp.getName());
                preparedStatement.setString(2, emp.getSurname());
                preparedStatement.setInt(5, emp.getId());
                int var5 = preparedStatement.executeUpdate();
            } catch (SQLException var6) {
                System.out.println("Nu am putut face update!");
            }
        }

    }

    public void delete(Person emp) {
        try {
            String deleteSql = "DELETE from employee where id=?";
            Connection connection = this.getConnection();
            if (connection != null) {
                PreparedStatement preparedStatement = connection.prepareStatement(deleteSql);
                preparedStatement.setInt(1, emp.getId());
                int var5 = preparedStatement.executeUpdate();
            }
        } catch (SQLException var6) {
            System.out.println("Nu am putut face delete!");
        }

    }
}
