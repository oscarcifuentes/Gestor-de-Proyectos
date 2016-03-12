/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author OSCAR
 */
public class Proyecto {

    private String nombrep;
    private int id;
    private String fechai;
    private String fechaf;
    private String encargado1;
//    private String encargado2;
//    private String encargado3;
//    private String encargado4;
    private String descripcion;


    

 

   
    public String getNombrep() {
        return nombrep;
    }

    public int getId() {
        return id;
    }

    public String getFechai() {
        return fechai;
    }

    public String getFechaf() {
        return fechaf;
    }

    public String getEncargado1() {
        return encargado1;
    }

//    public String getEncargado2() {
//        return encargado2;
//    }
//
//    public String getEncargado3() {
//        return encargado3;
//    }
//
//    public String getEncargado4() {
//        return encargado4;
//    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFechai(String fechai) {
        this.fechai = fechai;
    }

    public void setFechaf(String fechaf) {
        this.fechaf = fechaf;
    }

    public void setEncargado1(String encargado1) {
        this.encargado1 = encargado1;
    }

//    public void setEncargado2(String encargado2) {
//        this.encargado2 = encargado2;
//    }
//
//    public void setEncargado3(String encargado3) {
//        this.encargado3 = encargado3;
//    }
//
//    public void setEncargado4(String encargado4) {
//        this.encargado4 = encargado4;
//    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    public Proyecto(String nombrep, String fechai,String fechaf, String encargado1,String descripcion) {
        super();
        this.nombrep = nombrep;
        this.id = id;
        this.fechai = fechai;
        this.fechaf = fechaf;
        this.encargado1 = encargado1;
//        this.encargado2 = encargado2;
//        this.encargado3 = encargado3;
//        this.encargado4 = encargado4;
        this.descripcion = descripcion;
    }
}


