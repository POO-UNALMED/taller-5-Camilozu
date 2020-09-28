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
		this.nombre = null;
		this.edad = 0;
		this.genero = null;
		this.zona = null;
	}
	Pez(String nombre, int edad, String genero, Zona zona) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.zona = zona;
		
	}
	
	public void crearSalmon() {
		Pez pez = new Pez(nombre, edad, genero, zona);
		listado.add(pez);
		salmones++;
		colorEscamas = "rojo";
		cantidadAletas = 6;
		habitad = "oceano";
		
	}
	
	public void crearBacalao() {
		Pez pez = new Pez(nombre, edad, genero, zona);
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
