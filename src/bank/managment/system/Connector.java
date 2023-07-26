package bank.managment.system;

import com.sun.jdi.connect.spi.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

public class Connector {
    public Connector(){
        Connection connection;
        Statement statement;

        try{
        connection = (Connection) DriverManager.getConnection(" jdbc:mysql://localhost:3306/bankSystem",
                "root", "Stromgard_77");
        statement = connection.createStatement();


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
