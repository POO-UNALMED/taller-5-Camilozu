package zooAnimales;

import java.util.LinkedList;

import gestion.Zona;

public class Reptil extends Animal {

	static public int iguanas;
	static public int serpientes;
	static public int reptiles;
	private String colorEscamas;
	private int largoCola;
	static LinkedList<Reptil> listado;
	private static String movimiento;
	static {
		listado = new LinkedList <Reptil>();
		movimiento = "reptar";
	}
	
	public Reptil() {
		super(null, 0, null, null, null);
		reptiles++;
	}
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		   super(nombre, edad, habitat, genero, null);
		   this.colorEscamas = colorEscamas;
		   this.largoCola = largoCola;
		   reptiles++;
	   }
	public Reptil(String nombre, int edad, String habitat, String genero, Zona zona) {
		super(nombre, edad, habitat, genero, zona);
		reptiles++;
	   }
	public Reptil(String nombre, int edad, String genero) {
		super(nombre, edad, genero);
		reptiles++;
		
    }
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	public String movimiento() {
		return movimiento;
    }	
	
	public static Reptil crearIguana(String nombre, int edad,String genero) {
		Reptil reptil = new Reptil(nombre, edad, genero);
		listado.add(reptil);
		iguanas++;
		reptil.colorEscamas = "verde";
		reptil.largoCola = 3;
		reptil.habitat = "humedal";
		return reptil;
		
	}
    public static Reptil crearSerpiente(String nombre, int edad,String genero) {
    	Reptil reptil = new Reptil(nombre, edad, genero);
		listado.add(reptil);
		serpientes++;
		reptil.colorEscamas = "blanco";
		reptil.largoCola = 1;
		reptil.habitat = "jungla";
		return reptil;
		
	}
    
    public int cantidadReptiles() {
		return listado.size();
	}
}
