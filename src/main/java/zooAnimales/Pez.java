package zooAnimales;

import java.util.LinkedList;

import gestion.Zona;

public class Pez extends Animal {

	int salmones;
	int bacalaos;
	String colorEscamas;
	int cantidadAletas;
	static LinkedList <Pez> listado;
	
	static {
		listado = new LinkedList <Pez>();
	}
	
	Pez() {
		
	}
	
	void crearSalmon(String nombre, int edad, String genero, Zona zona) {
		Pez pez = new Pez();
		listado.add(pez);
		salmones++;
		colorEscamas = "rojo";
		cantidadAletas = 6;
		habitad = "oceano";
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.zona = zona;
	}
	
	void crearBacalao(String nombre, int edad, String genero, Zona zona) {
		Pez pez = new Pez();
		listado.add(pez);
		bacalaos++;
		colorEscamas = "gris";
		cantidadAletas = 6;
		habitad = "oceano";
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.zona = zona;
	}
	
	int cantidadPeces() {
		return listado.size();
	}
}
