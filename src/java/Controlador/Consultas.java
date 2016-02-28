/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author OSCAR
 */
public class Consultas extends  Conexion{
    
    public Boolean autenticacion(String usuario,String Contraseña){
        PreparedStatement pst= null;
        ResultSet rs=null;
        
        try {
            String consulta= "select * from usuarios where Usuario = ? and Usucontraseña = ? ";
            pst =getConexion().prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, Contraseña);
            rs=pst.executeQuery();
             System.out.println("LOGIN EXITOSO");
            if (rs.absolute(1)) {
                return true; 
                
            }
        } catch (Exception e) {
            System.err.println("ERROR"+e);
        }finally{
            try {
                if (getConexion() != null)getConexion().close();
                if (pst != null)pst.close();
                if (rs != null)rs.close();
            } catch (Exception e) {
                System.err.println("ERROR"+e);
            }
                
            
        }
        
        return false;
        
    }
    
     public Boolean Registrar(String nombre ,String apellido,String usuario,String contraseña ){
         PreparedStatement pst = null;
         
         try {
             String consulta ="insert into usuarios (Nombre,Apellido,Usuario,Usucontraseña) values (?,?,?,?)";
             pst = getConexion().prepareStatement(consulta);
             pst.setString(1, nombre);
             pst.setString(2, apellido);
             pst.setString(3, usuario);
             pst.setString(4, contraseña);
              
             
             if(pst.executeUpdate()==1){
                 return true;                 
             }
             
         } catch (Exception e) {
             System.err.println("ERROR"+e);
         }finally{
             try {
                 if(getConexion() != null) getConexion().close();
                 if(pst != null) pst.close();
             } catch (Exception e) {
                  System.err.println("ERROR"+e);
             }
         }
         return  false;
     }
     
    //public static void main(String[] args) {
      //  Consultas co = new Consultas();
        // System.out.println(co.autenticacion("oscarcifuentes","millos"));
      // System.out.println(co.Registrar("julian", "cifuentes", "julian23", "toby"));
   // }
     
}
