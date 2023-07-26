package bank.managment.system;


import java.sql.*;

public class Connector {
    Connection connection; // instance which is used to establish connection
    Statement statement; // instance for statement execution (check SignUp class 240+ code rows)

    public Connector(){
        try{
        connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem",
                "root", "Stromgard_77"); // 3306 - port for MySQL connection
        statement = connection.createStatement(); // via statement instance the query will executed


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
