package main.java;

import java.io.Serializable;



	public class Product implements Serializable{

		private static final long serialVersionUID = 1L;
	private String code;
    private String name;
    private double price;
    private int stock;
    private String desc;
    private String details;

    public Product (){        
    }

    public Product(String code, String name, double price, int stock) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    
    public Product(String code, String name, double price, int stock, String desc, String details) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.desc = desc;
        this.details = details;
    }

    public String getDesc() {
        return desc;
    }

    public String getDetails() {
        return details;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public String getCode() {
        return code;
    }

    public String getDisponibilidad (){
        if (stock > 0){
            return "Stock avaliable";
        }else{
            return "Sould Out";
        }
    }
}