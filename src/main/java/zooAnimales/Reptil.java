package zooAnimales;

import java.util.LinkedList;

import gestion.Zona;

public class Reptil extends Animal {

	int iguanas;
	int serpientes;
	String colorEscamas;
	int largoCola;
	static LinkedList<Reptil> listado;
	
	static {
		listado = new LinkedList <Reptil>();
	}
	
	public Reptil(String nombre, int edad, String genero, Zona zona) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.zona = zona;
	   }
	
	
	public void crearIguana() {
		Reptil reptil = new Reptil(nombre, edad, genero, zona);
		listado.add(reptil);
		iguanas++;
		colorEscamas = "verde";
		largoCola = 3;
		habitad = "humedal";
		
	}
    public void crearSerpiente() {
    	Reptil reptil = new Reptil(nombre, edad, genero, zona);
		listado.add(reptil);
		serpientes++;
		colorEscamas = "blanco";
		largoCola = 1;
		habitad = "jungla";
		
		
	}
    
    public int cantidadReptiles() {
		return listado.size();
	}
}
