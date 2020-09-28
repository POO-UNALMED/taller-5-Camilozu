package zooAnimales;

import java.util.LinkedList;

import gestion.Zona;



public class Mamifero extends Animal {

	
	int caballos;
	int leones;
	boolean pelaje;
	int patas;
	static LinkedList <Mamifero> listado;
	
	static {
		listado = new LinkedList <Mamifero>();
	}
	
	Mamifero() {
		pelaje = true;
		patas = 4;
	}
	
	void crearCaballo(String nombre, int edad, String genero, Zona zona) {
		caballos++;
		Mamifero mamifero = new Mamifero();
		listado.add(mamifero);
		habitad = "pradera";
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.zona = zona;
		
		
	}
	void crearLeon(String nombre, int edad, String genero, Zona zona) {
		leones++;
		Mamifero mamifero = new Mamifero();
		listado.add(mamifero);
		habitad = "selva";
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.zona = zona;
	}
	int cantidadMamiferos() {
		return listado.size();
	}
	

}
