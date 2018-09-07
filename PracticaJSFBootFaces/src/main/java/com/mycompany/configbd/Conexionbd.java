/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.configbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexionbd {
    Connection con; 
    Statement st;
    ResultSet rs;
    public Conexionbd() {
        try {
            
            try { 
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
            }
          
            con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/ventasdb",
                    "postgres", "123");
            st=(Statement) con.createStatement(); 
            boolean valid = con.isValid(50000);
            System.out.println(valid ? "TEST OK" : "TEST FAIL");
        } catch (java.sql.SQLException sqle) {
            System.out.println("Error: " + sqle);
        }
    } 
    public ResultSet executeQuery(String sql){
        try {
            rs = st.executeQuery(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexionbd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public boolean executeInsertUpdate(String sql){
        boolean e;
        try {            
            st = con.createStatement();
            st.executeUpdate(sql);
            e = true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexionbd.class.getName()).log(Level.SEVERE, null, ex);
            e = false;
        }
        return e;
    }
    
}