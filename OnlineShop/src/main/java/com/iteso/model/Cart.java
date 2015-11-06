package com.iteso.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by GGGK4 on 02/11/2015.
 */
public class Cart {

    public String code;
    public String user;
    public Map<String, Integer> items = new HashMap<String, Integer>();
    public double price;
    public String date;
    public String hour;
    public String payForm;

    public Cart(){
    }

    public Cart (String code, String user){
        this.code = code;
        this.user = user;
    }

    public Cart(String code, String user, double price){
        this.code = code;
        this.user = user;
        this.price = price;
    }

    public Cart(String code, String user, double price, String date, String hour, String payForm){
        this.code = code;
        this.user = user;
        this.price = price;
        this.date = date;
        this.hour = hour;
        this.payForm = payForm;
    }

    public void addProduct(String newProd, int quant, double prodPrice){
       if(this.items.containsKey(newProd) == true){
           int newQuant = this.items.get(newProd) + quant;
           this.items.put(newProd,newQuant);
           this.price += (quant * prodPrice);
       }
        else{
           this.items.put(newProd, quant);
           this.price += (prodPrice * quant);
       }
    }

    public boolean editCant(String prod, int quant, double prodPrice){
       if(this.items.containsKey(prod)== true){
           if(quant == 0){
               removeProd (prod, prodPrice);
               return true;
           }

           int Currentquantity = this.items.get(prod);
           this.price += ((quant-Currentquantity) * prodPrice);
           this.items.put(prod, quant);
           return true;
       }
        else
           return false;
    }

    public void removeProd(String prod, double prodPrice){
        this.price -= (prodPrice * this.items.get(prod));
        this.items.remove(prod);
    }

    public void ofProduct (String prod){this.items.remove(prod);}

    public Map <String, Integer> getItems(){return items;}

    public int getLength(){return items.size();}

    public double getPrice(){return price;}

    public String getUser(){return user;}

    public String getCode(){return code;}

    public void setPrice(double price){this.price = price;}

    public void setItems(Map <String, Integer> items){this.items = items;}

    public String getDate(){return date;}

    public String getHour(){return hour;}

    public String getPayForm(){return payForm;}

    public void setUser(String user){this.user = user;}

    public void setPayForm(String payForm){this.payForm = payForm;}

    public void setDate(String date){this.date = date;}

    public void setHour(String hour){this.hour = hour;}
}


