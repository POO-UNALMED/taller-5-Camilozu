package zooAnimales;
import gestion.*;


public class Animal {
public static int totalAnimales;
protected String nombre;
protected int edad;
protected String habitad;
protected String genero;
protected Zona zona;
protected String getNombre() {
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
public String getHabitad() {
	return habitad;
}
public void setHabitad(String habitad) {
	this.habitad = habitad;
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
public Animal(String nombre, int edad, String habitad, String genero) {
	this(nombre, edad, habitad, genero, null);
	totalAnimales++;
}

public Animal(String nombre, int edad, String habitad, String genero, Zona zona) {
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
		return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitad+" y mi genero es "+genero;
	}
	else 
	    return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitad+" y mi genero es "+genero+", la zona es la que me ubcio es "+zona.getNombre()+", en el"+zona.getZoo().getNombre();
}

}