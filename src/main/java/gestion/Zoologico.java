package gestion;
import java.util.*;

import zooAnimales.*;

public class Zoologico {
    private String nombre;
    private String ubicacion;
	LinkedList <Zona> zonas;

	
	
	
	public Zoologico() {
		this(null, null);				
	}
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		zonas = new LinkedList<Zona>();					
	}

	void agregarZonas(Zoologico zoo) {
    	Zona zona = new Zona(nombre,zoo);
        zonas.add(zona);
    }
    int cantidadTotalAnimales() {
    	return Animal.totalAnimales;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
    

}