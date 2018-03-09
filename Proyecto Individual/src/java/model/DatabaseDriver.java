/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angelo
 */
public class DatabaseDriver {

    protected Connection connection;

    public void connect() {
        connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/comica", "root", "xbox360elite");
            //out.println("Conexión realizada con éxito a: " + conexion.getCatalog());
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    public void disconnect(){
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseDriver.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
