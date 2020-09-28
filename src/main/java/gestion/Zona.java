package gestion;
import java.util.*;

import zooAnimales.*;


public class Zona {
public String nombre;
public Zoologico zoo;
LinkedList <Animal> animales;

Zona() {
	nombre = null;
	animales = new LinkedList<Animal>();
}

Zona(String nombre, Zoologico zoo) {
	this.nombre = nombre;
	animales = new LinkedList<Animal>();
}

void agregarAnimales() {
	Animal animal = new Animal();
	animales.add(animal);
}
int cantidadAnimales() {
	return animales.size();
}

void setNombre(String nombre) {
	this.nombre = nombre;
}

}