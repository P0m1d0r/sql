package org.example;
import java.sql.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        try(Connection connection=DriverManager.getConnection ("jdbc:mysql://127.0.0.1/new_schema","root","root")) {
            Statement stat=connection.createStatement();
            String sqlCommand = "CREATE TABLE animal"+("id INTEGER not NULL,"+"name VARCHAR (255),"+"kind VARCHAR(255),"+"age INTEGER,"+"PRIMARY KEY(id)");
            String name="'asdf','Riba',20);drop table animal;";
            String insertCommand="INSERT INTO animal(id,name,kind,age) VALUES(1,'+name+','Riba',20);";
            int i=stat.executeUpdate(sqlCommand);
            System.out.println("Успешно применена"+i+"строка");
            String selectCommand="SELECT FROM animal";
            ResultSet resultSet=stat.executeQuery(selectCommand);
            System.out.println(resultSet.toString());
            int num=0;
            while (resultSet.next()){
                System.out.println(resultSet.getString(1)+" ");
                System.out.println(resultSet.getString(2)+" ");
                System.out.println(resultSet.getString(3)+" ");
                System.out.println(resultSet.getString(4)+" ");
                System.out.println(resultSet.next());
            }
            connection.setAutoCommit(false);
            stat.execute("DELETE FROM animal WHERE kind='Riba';");
            System.out.println("Выполение удаления");
            stat.execute("ADASdasdasd");
            connection.commit();
            System.out.println("Удаление успешно");
        } catch (SQLException e) {
            System.out.println("Удаление отменено");
            e.printStackTrace();

        }
    }
}