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
	
	Mamifero(String nombre, int edad, String genero, Zona zona) {
		pelaje = true;
		patas = 4;
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.zona = zona;
	}
	
	public void crearCaballo() {
		caballos++;
		Mamifero mamifero = new Mamifero(nombre, edad, genero, zona);
		listado.add(mamifero);
		habitad = "pradera";
		
		
		
	}
	public void crearLeon() {
		leones++;
		Mamifero mamifero = new Mamifero(nombre, edad, genero, zona);
		listado.add(mamifero);
		habitad = "selva";
		
	}
	public int cantidadMamiferos() {
		return listado.size();
	}
	

}
