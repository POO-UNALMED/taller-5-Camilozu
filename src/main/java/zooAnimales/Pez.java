package zooAnimales;

import java.util.LinkedList;

import gestion.Zona;

public class Pez extends Animal {

	static public int salmones;
	static public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	static LinkedList <Pez> listado;
	private static String movimiento;
	static {
		listado = new LinkedList <Pez>();
		movimiento = "nadar";
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	public Pez() {
		super(null, 0, null, null, null);
	}
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		   super(nombre, edad, habitat, genero, null);
		   this.colorEscamas = colorEscamas;
		   this.cantidadAletas = cantidadAletas;
	   }
	public Pez(String nombre, int edad, String habitat, String genero, Zona zona) {
		super(nombre, edad, habitat, genero, zona);
		
	}
	public Pez(String nombre, int edad, String genero) {
		super(nombre, edad, genero);	
    }
	public String movimiento() {
		return movimiento;
   }
	
	public static Pez crearSalmon(String nombre, int edad,String genero) {
		Pez pez = new Pez(nombre, edad, genero);
		listado.add(pez);
		salmones++;
		pez.colorEscamas = "rojo";
		pez.cantidadAletas = 6;
		pez.habitat = "oceano";
		return pez;
		
	}
	
	public static Pez crearBacalao(String nombre, int edad,String genero) {
		Pez pez = new Pez(nombre, edad, genero);
		listado.add(pez);
		bacalaos++;
		pez.colorEscamas = "gris";
		pez.cantidadAletas = 6;
		pez.habitat = "oceano";
		return pez;
		
	}
	
	public int cantidadPeces() {
		return listado.size();
	}
}
