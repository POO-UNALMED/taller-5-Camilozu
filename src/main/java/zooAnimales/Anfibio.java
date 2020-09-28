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
	public Anfibio() {
		super(null, 0, null, null, null);
	}
	public Anfibio(String nombre, int edad, String habitad, String genero, Zona zona) {
		super(nombre, edad, habitad, genero, zona);
		

	}
	

	public void crearRana() {
		ranas++;
		Anfibio anfibio = new Anfibio(nombre, edad, habitad, genero, zona);
		listado.add(anfibio);
		colorPiel = "rojo";
		venenoso = true;
		habitad = "selva";
		
		
	}
	public void crearsalamdra() {
		salamandras++;
		Anfibio anfibio  = new Anfibio(nombre, edad, habitad, genero, zona);
		listado.add(anfibio);
		colorPiel = "negro y amarillo";
		venenoso = false;
		habitad = "selva";
		
	}
	public int cantidadAnfibios() {
		return listado.size();
	}
}
