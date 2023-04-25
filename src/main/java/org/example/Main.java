package org.example;
import java.sql.*;
public class Main {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/new_schema", "root", "P1i9l8a2")) {
            Statement stmt = connection.createStatement();
//            stmt.execute("DROP TABLE students;");
//            String sqlCommand = "CREATE TABLE studenty" +
//                    "(id INTEGER not NULL, " +
//                    " name VARCHAR(255), " +
//                    " pol VARCHAR(255), " +
//                    " age INTEGER, " +
//                    "nomer VARCHAR(255)," +
//                    " PRIMARY KEY ( id ))";
//            stmt.executeUpdate(sqlCommand);
//            String insertCommand = "INSERT INTO studenty(id, name, pol, age, nomer) VALUES(1,'Pavel','M',17,'88005553555')," +
//                    "(2,'Nastya','W',19,'88005553556')," +
//                    "(3,'Vadim','M',18,'88005553557')," +
//                    "(4,'Nikita', 'M',18,'88005553558')," +
//                    "(5, 'Dima', 'M',17,'88005553559')," +
//                    "(6, 'Liza', 'W',18,'88005553561')," +
//                    "(7, 'Daniil', 'M',19,'88005553562')," +
//                    "(8, 'Slava', 'M',20,'88005553563')," +
//                    "(9, 'Alya', 'W',18,'88005553564')," +
//                    "(10, 'Vova', 'M',19,'88005553565');";
//            int i = stmt.executeUpdate(insertCommand);
//            System.out.println("Успешно применена " + i + " строка");
            String selectCommand = "SELECT * FROM studenty ;";
            ResultSet resultSet = stmt.executeQuery(selectCommand);
            while (resultSet.next()) {
                System.out.print(resultSet.getString(1) + " ");
                System.out.print(resultSet.getString(2) + " ");
                System.out.print(resultSet.getString(3) + " ");
                System.out.print(resultSet.getString(4) + " ");
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}