package org.example;
import java.sql.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/new_schema", "root", "P1i9l8a2")) {
            Statement stmt = connection.createStatement();
//            String sqlCommand = "CREATE TABLE studenty" +
//                    "(id INTEGER not NULL, " +
//                    " name VARCHAR(255), " +
//                    " pol VARCHAR(255), " +
//                    " age INTEGER, " + "nomer INTEGER," +
//                    " PRIMARY KEY ( id ))";
//            stmt.executeUpdate(sqlCommand);
//            String insertCommand = "INSERT INTO studenty(id, name, pol, age, nomer) VALUES (10,'pila','W',20,3323);";
//            int i = stmt.executeUpdate(insertCommand);
//            System.out.println("Успешно применена " + i + " строка");
            String selectCommand = "SELECT * FROM animal ;";
            ResultSet resultSet = stmt.executeQuery(selectCommand);
//            System.out.println(resultSet.toString());
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}