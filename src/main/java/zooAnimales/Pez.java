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
	public Pez() {
		super(null, 0, null, null, null);
	}
	public Pez(String nombre, int edad, String habitad, String genero, Zona zona) {
		super(nombre, edad, habitad, genero, zona);
		
	}
	
	public void crearSalmon() {
		Pez pez = new Pez(nombre, edad, habitad, genero, zona);
		listado.add(pez);
		salmones++;
		colorEscamas = "rojo";
		cantidadAletas = 6;
		habitad = "oceano";
		
	}
	
	public void crearBacalao() {
		Pez pez = new Pez(nombre, edad, habitad, genero, zona);
		listado.add(pez);
		bacalaos++;
		colorEscamas = "gris";
		cantidadAletas = 6;
		habitad = "oceano";
		
	}
	
	public int cantidadPeces() {
		return listado.size();
	}
}
