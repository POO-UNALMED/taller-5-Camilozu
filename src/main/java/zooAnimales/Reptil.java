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
	public Reptil() {
		super(null, 0, null, null, null);
	}
	public Reptil(String nombre, int edad, String habitad, String genero, Zona zona) {
		super(nombre, edad, habitad, genero, zona);
	   }
	
	
	public void crearIguana() {
		Reptil reptil = new Reptil(nombre, edad, habitad, genero, zona);
		listado.add(reptil);
		iguanas++;
		colorEscamas = "verde";
		largoCola = 3;
		habitad = "humedal";
		
	}
    public void crearSerpiente() {
    	Reptil reptil = new Reptil(nombre, edad, habitad, genero, zona);
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
