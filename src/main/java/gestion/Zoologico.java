package gestion;
import java.util.*;

import zooAnimales.*;

public class Zoologico {
public String nombre;
    String ubicacion;
	LinkedList <Zona> zonas;
	Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		zonas = new LinkedList<Zona>();					
	}


 
	void agregarZonas() {
    	Zona zona = new Zona();
     zonas.add(zona);
    }
    int cantidadTotalAnimales() {
    	return Animal.totalAnimales;
    }

}