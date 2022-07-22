/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ahsika
 */
public class db {
    
    public boolean check(String uname, String password){
        
           String url = "jdbc:mysql://localhost:3307/java_rst_db?useSSL=false";
           String un = "root";
           String pws = "1234";
        try{
            
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, un, pws);
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        return false;
    }
    
}
