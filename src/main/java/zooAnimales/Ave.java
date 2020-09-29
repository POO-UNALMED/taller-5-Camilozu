package zooAnimales;

import java.util.LinkedList;
import gestion.Zona;

public class Ave extends Animal {
   public int halcones;
   public int aguilas;
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
   }
   public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
	   super(nombre, edad, habitat, genero, null);
	   this.colorPlumas = colorPlumas;
   }
   public Ave(String nombre, int edad, String habitat, String genero, Zona zona) {
	   super(nombre, edad, habitat, genero, zona);
   }
   public String movimiento() {
		return movimiento;
   }
   
	public void crearHalcon(String nombre, int edad,String genero) {
		Ave ave = new Ave(nombre, edad, habitat, genero, zona);
		listado.add(ave);
		halcones++;
		colorPlumas ="cafe glorioso";
		habitat = "montanas";
		
	}
	
	public void crearAguila(String nombre, int edad,String genero) {
		Ave ave = new Ave(nombre, edad, habitat, genero, zona);
		listado.add(ave);
		aguilas++;
		colorPlumas ="blanco y amarillo";
		habitat = "montanas";
		
	}
	public int cantidadAves() {
		return listado.size();
	}
}
