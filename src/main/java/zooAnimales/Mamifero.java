package zooAnimales;

import java.util.LinkedList;

import gestion.Zona;



public class Mamifero extends Animal {

	
	static public int caballos;
	static public int leones;
	private boolean pelaje;
	private int patas;
	private static String movimiento;
	static LinkedList <Mamifero> listado;
	
	static {
		listado = new LinkedList <Mamifero>();
		movimiento = "desplazarce";
	}
	
	public Mamifero() {
		super(null, 0, null, null, null);
	}
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		   super(nombre, edad, habitat, genero, null);
		   this.pelaje = pelaje;
		   this.patas = patas;
	   }
	public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona) {
		super(nombre, edad, habitat, genero, zona);
		pelaje = true;
		patas = 4;
	}
	public String movimiento() {
		return movimiento;	
	}
	
	public Mamifero crearCaballo(String nombre, int edad,String genero) {
		caballos++;
		habitat = "pradera";
		Mamifero mamifero = new Mamifero(nombre, edad, habitat, genero, zona);
		listado.add(mamifero);
		return mamifero;
	}
	public Mamifero crearLeon(String nombre, int edad,String genero) {
		leones++;
		habitat = "selva";
		Mamifero mamifero = new Mamifero(nombre, edad, habitat, genero, zona);
		listado.add(mamifero);	
		return mamifero;
	}
	public int cantidadMamiferos() {
		return listado.size();
	}
	public boolean isPelaje() {
		return pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	

}
