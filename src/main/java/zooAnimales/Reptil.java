package zooAnimales;

import java.util.LinkedList;

import gestion.Zona;

public class Reptil extends Animal {

	static public int iguanas;
	static public int serpientes;
	private String colorEscamas;
	private int largoCola;
	static LinkedList<Reptil> listado;
	private static String movimiento;
	static {
		listado = new LinkedList <Reptil>();
		movimiento = "reptar";
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
	public Reptil() {
		super(null, 0, null, null, null);
	}
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		   super(nombre, edad, habitat, genero, null);
		   this.colorEscamas = colorEscamas;
		   this.largoCola = largoCola;
	   }
	public Reptil(String nombre, int edad, String habitat, String genero, Zona zona) {
		super(nombre, edad, habitat, genero, zona);
	   }
	public String movimiento() {
		return movimiento;
   }	
	
	public void crearIguana(String nombre, int edad,String genero) {
		Reptil reptil = new Reptil(nombre, edad, habitat, genero, zona);
		listado.add(reptil);
		iguanas++;
		colorEscamas = "verde";
		largoCola = 3;
		habitat = "humedal";
		
	}
    public void crearSerpiente(String nombre, int edad,String genero) {
    	Reptil reptil = new Reptil(nombre, edad, habitat, genero, zona);
		listado.add(reptil);
		serpientes++;
		colorEscamas = "blanco";
		largoCola = 1;
		habitat = "jungla";
		
		
	}
    
    public int cantidadReptiles() {
		return listado.size();
	}
}
