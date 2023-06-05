package tms.vagazzi.lesson_20;

import java.sql.*;

public class SQLExample {
    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8477/test_db","root", "root")){
            connection.prepareStatement("SELECT * FROM Developers WHERE AGE > 15").execute();
            ResultSet rs = connection.prepareStatement("SELECT * FROM Developers WHERE AGE > 15").executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt("ID") + " " + rs.getString("NAME") + " " + rs.getInt("AGE"));
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
