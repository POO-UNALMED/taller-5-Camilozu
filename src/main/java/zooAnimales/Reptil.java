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
	
	
	void crearIguana(String nombre, int edad, String genero, Zona zona) {
		Reptil reptil = new Reptil();
		listado.add(reptil);
		iguanas++;
		colorEscamas = "verde";
		largoCola = 3;
		habitad = "humedal";
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.zona = zona;
	}
    void crearSerpiente(String nombre, int edad, String genero, Zona zona) {
    	Reptil reptil = new Reptil();
		listado.add(reptil);
		serpientes++;
		colorEscamas = "blanco";
		largoCola = 1;
		habitad = "jungla";
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.zona = zona;
    
		
	}
    
    int cantidadReptiles() {
		return listado.size();
	}
}
