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
	public String movimiento() {
		return movimiento;
   }
	
	public Pez crearSalmon(String nombre, int edad,String genero) {
		Pez pez = new Pez(nombre, edad, habitat, genero, zona);
		listado.add(pez);
		salmones++;
		colorEscamas = "rojo";
		cantidadAletas = 6;
		habitat = "oceano";
		return pez;
		
	}
	
	public Pez crearBacalao(String nombre, int edad,String genero) {
		Pez pez = new Pez(nombre, edad, habitat, genero, zona);
		listado.add(pez);
		bacalaos++;
		colorEscamas = "gris";
		cantidadAletas = 6;
		habitat = "oceano";
		return pez;
		
	}
	
	public int cantidadPeces() {
		return listado.size();
	}
}
