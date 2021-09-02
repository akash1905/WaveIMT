/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vsc.waveimt;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Vishwakarma
 */
public class Database {
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/wave_db", "root", "123456");
            return conn;
        } catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
}
