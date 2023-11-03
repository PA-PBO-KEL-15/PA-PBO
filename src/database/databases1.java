/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;


public class databases1  {

    public static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public Connection con;
    public Statement st;
    public ResultSet rs;
    
    public static Connection mysqlconfig;
    public static Connection configDB(){
        try {
            String url = "jdbc:mysql://localhost:3306/pa_dbd";
            String user = "root";
            String password = "";
            databases1.mysqlconfig = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.err.println("Koneksi gagal"+e.getMessage());                    
        }
        return databases1.mysqlconfig;
    }

    public static void main(String[] args) {
        databases1 db = new databases1();
        }




}