package zooAnimales;

import java.util.LinkedList;

import gestion.Zona;



public class Mamifero extends Animal {

	
	static public int caballos;
	static public int leones;
	static public int mamiferos;
	private boolean pelaje;
	private int patas;
	private static String movimiento;
	static LinkedList <Mamifero> listado;
	
	static {
		listado = new LinkedList <Mamifero>();
		movimiento = "desplazarse";
	}
	
	public Mamifero() {
		super(null, 0, null, null, null);
		mamiferos++;
		
	}
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		   super(nombre, edad, habitat, genero, null);
		   this.pelaje = pelaje;
		   this.patas = patas;
		   mamiferos++;
	   }
	public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona) {
		super(nombre, edad, habitat, genero, zona);
		mamiferos++;
	}
	public Mamifero(String nombre, int edad, String genero) {
		super(nombre, edad, genero);
		mamiferos++;
	}
	
	public String movimiento() {
		return movimiento;	
	}
	
	public static Mamifero crearCaballo(String nombre, int edad,String genero) {
		caballos++;
		Mamifero mamifero = new Mamifero(nombre, edad, genero);
		listado.add(mamifero);
		mamifero.habitat = "pradera";
		mamifero.pelaje = true;
		mamifero.patas = 4;
		return mamifero;
	}
	public static Mamifero crearLeon(String nombre, int edad,String genero) {
		leones++;
		Mamifero mamifero = new Mamifero(nombre, edad, genero);
		listado.add(mamifero);
		mamifero.habitat = "selva";
		mamifero.pelaje = true;
		mamifero.patas = 4;
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
