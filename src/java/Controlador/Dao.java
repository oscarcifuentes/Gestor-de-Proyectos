/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.PreparedStatement;

/**
 *
 * @author OSCAR
 */
public class Dao extends  Conexion{
     public Boolean CreateProyect(String nombre ,String fechacomienso,String fechafinal,String responsable1,String responsable2,String responsable3,String responsable4, String descripcion ){
         PreparedStatement pst = null;
         
         try {
             String consulta ="insert into proyectos (NOMproyecto,FECHAinicio,FECHAfinal,PROresponsable1,PROresponsable2,PROresponsable3,PROresponsable4,Prodescripcion) values (?,?,?,?,?,?,?,?)";
             pst = getConexion().prepareStatement(consulta);
             pst.setString(1, nombre);
             pst.setString(2, fechacomienso);
             pst.setString(3, fechafinal);
             pst.setString(4, responsable1);
             pst.setString(5, responsable2);
             pst.setString(6, responsable3);
             pst.setString(7, responsable4);
             pst.setString(8, descripcion); 
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
     
     public  Boolean delete(int id) {
         PreparedStatement pst = null;
        try {
            String consulta=("DELETE FROM proyectos WHERE idPROYECTOS =?");
            pst = getConexion().prepareStatement(consulta);
            
            pst.setInt(1,id);
             if(pst.executeUpdate()==1){
                 return true;  
             }
 
        } catch (Exception e) {
           System.err.println("ERROR"+e);
        }
        return  false;
    }

   public static void main(String[] args) {
    Dao da = new Dao();
       System.out.println(da.CreateProyect("Gestor de proyectos","07/02/20016","07/06/20016","marcela casa diego","oscar cifuentes","cristian diaz","hola","software para la gestion seguimiento y control de los proyectos realizados por una empresa "));
//         System.out.println(da.delete(1));
   }
}
