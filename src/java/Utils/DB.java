/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author tqtr
 */
public class DB {
    public static Connection conn;
    
    public static void Connect( String username, String password)
    {
        Properties infor = new Properties();
        infor.setProperty("characterEncoding", "utf8");
        infor.setProperty("user", username);
        infor.setProperty("password", password);
        String connection = "jdbc:mysql://localhost:8081/qldact";
        try 
        {
            conn = DriverManager.getConnection(connection, infor);
            if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void Disconnect()
    {
        try 
        {
            if(conn != null)
            { 
               conn.close();   
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static ResultSet Select(String sql)
    {
        try 
        {
           Statement statement = conn.createStatement();
        
            ResultSet rs = statement.executeQuery(sql);

            return rs;
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
