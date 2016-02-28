/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author OSCAR
 */
public class Conexion {
    
    private String USERNAME ="root";
    private String PASSWORD ="OSCARgiovany12345678";
    private String HOST ="localhost";
    private String PORT ="3306";
    private String DATABASE="proyectos";
    private String CLASSNAME="com.mysql.jdbc.Driver";
    private String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
    private Connection con;
    
    public  Conexion(){
        try {
           Class.forName(CLASSNAME);
           con = (Connection) DriverManager.getConnection(URL,USERNAME,PASSWORD);
            System.out.println("CONEXION EXITOSA ");
           
        } catch (ClassNotFoundException e) {
            System.err.println("ERROR"+e);
        }catch(SQLException e){
            System.err.println("ERROR"+e);
        }
    }
    
    public Connection getConexion(){
        return con;
    }
    
   //public static void main(String[] args){
     //   Conexion con=new Conexion();
    //}
    
    
}
