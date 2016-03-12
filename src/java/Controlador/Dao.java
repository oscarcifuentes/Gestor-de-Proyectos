/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author OSCAR
 */
public class Dao extends Conexion {

    public Boolean CreateProyect(String nombre, String fechacomienso, String fechafinal, String responsable1, String responsable2, String responsable3, String responsable4, String descripcion) {
        PreparedStatement pst = null;

        try {
            String consulta = "insert into proyectos (NOMproyecto,FECHAinicio,FECHAfinal,PROresponsable1,PROresponsable2,PROresponsable3,PROresponsable4,Prodescripcion) "
                    + "values ('" + nombre + "','" + fechacomienso + "','" + fechafinal + "','" + responsable1 + "','" + responsable2 + "','" + responsable3 + "','" + responsable4 + "','" + descripcion + "')";

            pst = getConexion().prepareStatement(consulta);

            if (pst.executeUpdate() == 1) {
                return true;
            }

        } catch (Exception e) {
            System.err.println("ERROR" + e);
        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }

            } catch (Exception e) {
                System.err.println("ERROR" + e);
            }
        }
        return false;
    }

    public boolean borrar(int id) {                                         
        boolean borrar=false;
                try {
                 Conexion c=new Conexion();
                 Connection con= c.getConexion();
                                Statement st;
                                st = con.createStatement();
                                st.executeUpdate("DELETE FROM proyectos WHERE idPROYECTOS ='"+id+'"');
                                st.close();
                    }
                catch (SQLException e) {
                 borrar=false;
                 e.printStackTrace();
                }
                return borrar;
               }

    public static Proyecto consultarProyecto(String Proyectos) {
        Proyecto bproyecto = null;
//        try {
//            Conexion c=new Conexion();
//            Connection con=c.getConexion();
//            Statement st=con.createStatement();
//            ResultSet rs=st.executeQuery("SELECT * FROM proyecto WHERE NOMproyecto='"+Proyectos+"'");
////            Statement s = getConexion().createStatement();
////            ResultSet rs = s.executeQuery("SELECT * FROM proyectos WHERE NOMproyecto='" + proyecto);
////            rs.getStatement();
//            while(rs.next()){
//            bproyecto=new Proyecto(rs.getString("nombrep"),rs.getInt("id"),rs.getString("fechai"),rs.getString("fechaf"), rs.getString("encargado1"),rs.getString("descripcion"));
//           }
//             rs.close();
//             st.close();
//        } catch (SQLException e) {
//            System.err.println("ERROR" + e);
//        }

    return bproyecto;
    }

}

//   public static void main(String[] args) {
//    Dao da = new Dao();
//       System.out.println(da.CreateProyect("Gestor de proyectos","07/02/20016","07/06/20016","marcela casa diego","oscar cifuentes","cristian diaz","hola","software para la gestion seguimiento y control de los proyectos realizados por una empresa "));
////         System.out.println(da.delete(1));
//   }
//}
