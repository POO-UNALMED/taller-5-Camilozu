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
	Anfibio() {
		this(null, 0, null, null);
	}
	Anfibio(String nombre, int edad, String genero, Zona zona) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.zona = zona;
		
	}
	

	public void crearRana() {
		Anfibio anfibio;
		anfibio = new Anfibio();
		listado.add(anfibio);
		colorPiel = "rojo";
		venenoso = true;
		habitad = "selva";
		
		
	}
	public void crearsalamdra() {
		Anfibio anfibio  = new Anfibio();
		listado.add(anfibio);
		colorPiel = "negro y amarillo";
		venenoso = false;
		habitad = "selva";
		
	}
	public int cantidadAnfibios() {
		return listado.size();
	}
}
