package gestion;
import java.util.*;

import zooAnimales.*;


public class Zona {
public String nombre;
static Zoologico zoo;
LinkedList <Animal> animales;

static {
	zoo = new Zoologico();

}

Zona() {
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