package gestion;
import java.util.*;

import zooAnimales.*;


public class Zona {
private String nombre;
private Zoologico zoo;
LinkedList <Animal> animales;

public Zona() {
	this(null, null);
}
public Zona(Zoologico zoo) {
	this(null, zoo);
}
public Zona(String nombre, Zoologico zoo) {
	this.nombre = nombre;
	animales = new LinkedList<Animal>();
}

public void agregarAnimales() {
	Animal animal = new Animal(null, 0, null, null, null);
	animales.add(animal);
}
public void agregarAnimales(Animal animal) {
	animales.add(animal);
}
int cantidadAnimales() {
	return animales.size();
}

void setNombre(String nombre) {
	this.nombre = nombre;
}

public Zoologico getZoo() {
	return zoo;
}

public void setZoo(Zoologico zoo) {
	this.zoo = zoo;
}

public String getNombre() {
	return nombre;
}


}