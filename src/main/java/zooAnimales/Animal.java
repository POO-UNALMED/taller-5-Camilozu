package zooAnimales;
import gestion.*;


public class Animal {
public static int totalAnimales;
protected String nombre;
protected int edad;
protected String habitat;
protected String genero;
protected Zona zona;

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public String getHabitat() {
	return habitat;
}
public void sethabitat(String habitat) {
	this.habitat = habitat;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public Zona getZona() {
	return zona;
}
public void setZona(Zona zona) {
	this.zona = zona;
}


private String movimiento;

static {
 totalAnimales = 0;

}
public Animal() {
	this(null, 0, null, null, null);
	totalAnimales++;
}
public Animal(String nombre, int edad, String habitat, String genero) {
	this(nombre, edad, habitat, genero, null);
	totalAnimales++;
}

public Animal(String nombre, int edad, String habitat, String genero, Zona zona) {
	this.nombre = nombre;
	this.edad = edad;
	this.genero = genero;
	this.zona = zona;
	totalAnimales++;
}
public String movimiento() {
	return movimiento;
}

public static String totalPorTipo() {
	return "Mamiferos: "+Mamifero.listado.size()+
	" Aves: "+Ave.listado.size()+
	" Reptiles: "+Reptil.listado.size()+
	" Peces: "+Pez.listado.size()+
	" Anfibios: "+Anfibio.listado.size();
	
}


public String toString() {
	if (zona == null) {
		return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero;
	}
	else 
	    return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero+", la zona es la que me ubcio es "+zona.getNombre()+", en el"+zona.getZoo().getNombre();
}

}