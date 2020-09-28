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
	

	
	void crearHalcon(String nombre, int edad, String genero, Zona zona) {
		Ave ave = new Ave();
		listado.add(ave);
		halcones++;
		colorPlumas ="cafe glorioso";
		habitad = "montañas";
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.zona = zona;
	}
	
	void crearAguila(String nombre, int edad, String genero, Zona zona) {
		Ave ave = new Ave();
		listado.add(ave);
		aguilas++;
		colorPlumas ="blanco y amarillo";
		habitad = "montañas";
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.zona = zona;
	}
	int cantidadAves() {
		return listado.size();
	}
}
