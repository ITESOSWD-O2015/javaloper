package main.java;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

public class GeneratorGraphicofSales {
	
	
	
	    ArrayList <Carrito> record = new ArrayList<Carrito>();
	    
	    public GeneradorDeEstadiaticasDeVentas (ArrayList <Carrito> record){
	        this.record = record;
	    }
	    
	    public boolean  graficoNumVentasSemana (String ruta){
	        return saveJPG(crearModeloSem(numVentasSemana()), ruta, "Compras por día de la semana", "Día", "Compras");
	    }
	    
	    public boolean graficoGanadoPorDia (String ruta){
	        return saveJPG(crearModeloSem(mediaVendidoDiaSem()), ruta, "Media por compra en los días de la semana",
	                "Día", "Media (€)");
	    }
	    
	    public boolean porcentajeProductosVendidosMes (String ruta){
	        return saveJPG(crearModeloMes(porcentajeProductosVendidosMes()), ruta,
	                "Porcentaje de productos vendidos por mes", "Mes", "Porcentaje (%)");
	    }
	    
	    private int [] numVentasSemana (){
	        int [] numVentasSemana = new int [8];
	        Calendar cal = Calendar.getInstance(Tools.getLocale());
	        for (int i = 0; i < record.size(); i++){
	            String [] fecha = record.get(i).getFecha().split("-");
	            cal.set(Integer.valueOf(fecha[0]), Integer.valueOf(fecha[1]), Integer.valueOf(fecha[2]));
	            numVentasSemana[cal.get(Calendar.DAY_OF_WEEK)] += 1;
	        }
	        return numVentasSemana;

}
