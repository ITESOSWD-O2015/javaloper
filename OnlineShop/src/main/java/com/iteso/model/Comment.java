package com.iteso.model;

import java.io.Serializable;

/**
 * Created by GGGK4 on 06/11/2015.
 */
public class Comment implements Serializable {

    String codeComment;
    String date;
    String hour;
    String codeProduct;
    String Email;
    String name;
    String comment;

    public Comment(String codeComment, String date, String hour, String codeProduct, String Email, String name, String comment) {
        this.codeComment = codeComment;
        this.date = date;
        this.hour = hour;
        this.codeProduct = codeProduct;
        this.Email = Email;
        this.name = name;
        this.comment = comment;
    }

    public String getEmail() {
        return Email;
    }

    public String getCodigoComentario() {
        return codeComment;
    }

    public String getCodigoProducto() {
        return codeProduct;
    }

    public String getComentario() {
        return comment;
    }

    public String getFecha() {
        return date;
    }

    public String getHora() {
        return hour;
    }

    public String getNombre() {
        return name;
    }

    public String getFechaHora (){
        return date + " " + hour;
    }
}
