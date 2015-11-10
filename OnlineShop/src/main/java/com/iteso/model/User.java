package com.iteso.model;

import java.io.Serializable;

/**
 * Created by GGGK4 on 29/10/2015.
 */
public class User implements Serializable{

    public String name;
    public String dir;
    public String mail;
    private String pass;
    public char role;

    public User(){

    }

    public User(String name, String dir, String mail, String pass, char role){
        this.name = name;
        this.dir = dir;
        this.mail = mail;
        this.pass = pass;
        this.role = role;
    }

    public String getDir(){
        return dir;
    }

    public String getMail(){
        return mail;
    }

    public String getName(){
        return name;
    }

    public String getPass(){
        return pass;
    }

    public char getRole(){
        return role;
    }
}
