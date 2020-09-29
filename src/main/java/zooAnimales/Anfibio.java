package zooAnimales;

import java.util.LinkedList;

import gestion.Zona;

public class Anfibio extends Animal {

	static public int ranas;
	static public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	static LinkedList <Anfibio> listado;
	private static String movimiento;
	static {
		listado = new LinkedList <Anfibio>();
		movimiento = "saltar";
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	public Anfibio() {
		super(null, 0, null, null, null);
	}
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		   super(nombre, edad, habitat, genero, null);
		   this.colorPiel = colorPiel;
		   this.venenoso = venenoso;
	 }
	public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona) {
		super(nombre, edad, habitat, genero, zona);
		
	}
	public Anfibio(String nombre, int edad, String genero) {
		super(nombre, edad, genero);	
    }
	public String movimiento() {
		return movimiento;
   }
	

	public static Anfibio crearRana(String nombre, int edad,String genero) {
		ranas++;
		Anfibio anfibio = new Anfibio(nombre, edad, genero);
		listado.add(anfibio);
		anfibio.colorPiel = "rojo";
		anfibio.venenoso = true;
		anfibio.habitat = "selva";
		return anfibio;
		
	}
	public static Anfibio crearSalamdra(String nombre, int edad,String genero) {
		salamandras++;
		Anfibio anfibio  = new Anfibio(nombre, edad, genero);
		listado.add(anfibio);
		anfibio.colorPiel = "negro y amarillo";
		anfibio.venenoso = false;
		anfibio.habitat = "selva";
		return anfibio;
		
	}
	public int cantidadAnfibios() {
		return listado.size();
	}
}
