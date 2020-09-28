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
	
	public Mamifero() {
		super(null, 0, null, null, null);
	}
	public Mamifero(String nombre, int edad, String habitad, String genero, Zona zona) {
		super(nombre, edad, habitad, genero, zona);
		pelaje = true;
		patas = 4;
		
	}
	
	public void crearCaballo() {
		caballos++;
		habitad = "pradera";
		Mamifero mamifero = new Mamifero(nombre, edad, habitad, genero, zona);
		listado.add(mamifero);
		
		
		
		
	}
	public void crearLeon() {
		leones++;
		habitad = "selva";
		Mamifero mamifero = new Mamifero(nombre, edad, habitad, genero, zona);
		listado.add(mamifero);
		
		
	}
	public int cantidadMamiferos() {
		return listado.size();
	}
	

}
