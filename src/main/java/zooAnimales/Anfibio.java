package zooAnimales;

import java.util.LinkedList;

import gestion.Zona;

public class Anfibio extends Animal {

	int ranas;
	int salamandras;
	String colorPiel;
	boolean venenoso;
	static LinkedList <Anfibio> listado;
	
	static {
		listado = new LinkedList <Anfibio>();
	}
	

	void crearRana(String nombre, int edad, String genero, Zona zona) {
		Anfibio anfibio  = new Anfibio();
		listado.add(anfibio);
		colorPiel = "rojo";
		venenoso = true;
		habitad = "selva";
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.zona = zona;
		
	}
	void crearsalamdra(String nombre, int edad, String genero, Zona zona) {
		Anfibio anfibio  = new Anfibio();
		listado.add(anfibio);
		colorPiel = "negro y amarillo";
		venenoso = false;
		habitad = "selva";
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.zona = zona;
	}
	int cantidadAnfibios() {
		return listado.size();
	}
}
