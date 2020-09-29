package zooAnimales;

import java.util.LinkedList;
import gestion.Zona;

public class Ave extends Animal {
   static public int halcones;
   static public int aguilas;
   static public int aves;
   private String colorPlumas;
   private static String movimiento;
   static LinkedList <Ave> listado;
   
   static {
		listado = new LinkedList <Ave>();
		movimiento = "volar";
   }
    public String getColorPlumas() {
	    return colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
   public Ave() {
	   super(null, 0, null, null, null);
	   aves++;
   }
   public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
	   super(nombre, edad, habitat, genero, null);
	   this.colorPlumas = colorPlumas;
	   aves++;
   }
   public Ave(String nombre, int edad, String habitat, String genero, Zona zona) {
	   super(nombre, edad, habitat, genero, zona);
	   aves++;
   }
   public Ave(String nombre, int edad, String genero) {
		super(nombre, edad, genero);
		aves++;
   }
   public String movimiento() {
		return movimiento;
   }
   
	public static Ave crearHalcon(String nombre, int edad,String genero) {
		Ave ave = new Ave(nombre, edad, genero);
		listado.add(ave);
		halcones++;
		ave.colorPlumas ="cafe glorioso";
		ave.habitat = "montanas";
		return ave;
	}
	
	public static Ave crearAguila(String nombre, int edad,String genero) {
		Ave ave = new Ave(nombre, edad,genero);
		listado.add(ave);
		aguilas++;
		ave.colorPlumas ="blanco y amarillo";
		ave.habitat = "montanas";
		return ave;
	}
	public int cantidadAves() {
		return listado.size();
	}
}
