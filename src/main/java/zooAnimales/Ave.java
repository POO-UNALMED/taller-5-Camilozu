package zooAnimales;

import java.util.LinkedList;
import gestion.Zona;

public class Ave extends Animal {
   int halcones;
   int aguilas;
   String colorPlumas;
   
   static LinkedList <Ave> listado;
   
   static {
		listado = new LinkedList <Ave>();
	}
   
   public Ave(String nombre, int edad, String genero, Zona zona) {
	    this.nombre = nombre;
	    this.edad = edad;
		this.genero = genero;
		this.zona = zona;
   }
	

	
	public void crearHalcon() {
		Ave ave = new Ave(nombre, edad, genero, zona);
		listado.add(ave);
		halcones++;
		colorPlumas ="cafe glorioso";
		habitad = "montanas";
		
	}
	
	public void crearAguila() {
		Ave ave = new Ave(nombre, edad, genero, zona);
		listado.add(ave);
		aguilas++;
		colorPlumas ="blanco y amarillo";
		habitad = "montanas";
		
	}
	public int cantidadAves() {
		return listado.size();
	}
}
