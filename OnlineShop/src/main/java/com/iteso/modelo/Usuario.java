package com.iteso.modelo;

/**
 * Created by GGGK4 on 29/10/2015.
 */
public class Usuario {

    public String nombre;
    public String dir;
    public String mail;
    private String pass;
    public char permisos;

    public Usuario(){

    }

    public Usuario(String nombre, String dir, String mail, String pass, char permisos){
        this.nombre = nombre;
        this.dir = dir;
        this.mail = mail;
        this.pass = pass;
        this.permisos = permisos;
    }

    public String getDir(){
        return dir;
    }

    public String getMail(){
        return mail;
    }

    public String getNombre(){
        return nombre;
    }

    public String getPass(){
        return pass;
    }

    public char getPermisos(){
        return permisos;
    }
}
