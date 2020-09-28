package zooAnimales;
import gestion.*;


public class Animal {
public static int totalAnimales;
String nombre;
int edad;
String habitad;
String genero;
Zona zona;

static {
	totalAnimales = 0;
}

public Animal() {
	totalAnimales++;
}
public String movimiento(Mamifero animal) {
	return "desplazarce";	
}
public String movimiento(Ave animal) {
	return "volar";	
}
public String movimiento(Reptil animal) {
	return "Reptar";	
}
public String movimiento(Pez animal) {
	return "nadar";	
}
public String movimiento(Anfibio animal) {
	return "saltar";	
}

public void totalPorTipo() {

	System.out.print("Mamiferos: "+Mamifero.listado.size());
	System.out.print("Aves: "+Ave.listado.size());
	System.out.print("Reptiles: "+Reptil.listado.size());
	System.out.print("Peces: "+Pez.listado.size());
	System.out.print("Anfibios: "+Anfibio.listado.size());
}


public String toString() {
	if (zona == null) {
		return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitad+" y mi genero es "+genero;
	}
	else 
	    return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitad+" y mi genero es "+genero+", la zona es la que me ubcio es "+zona.nombre+", en el"+zona.zoo.nombre;
}

}