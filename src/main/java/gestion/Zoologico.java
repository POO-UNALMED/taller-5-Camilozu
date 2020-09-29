package gestion;
import zooAnimales.*;
import java.util.*;


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

	public LinkedList<Zona> getZona() {
		return zonas;
	}
	public void agregarZonas(Zona zona) {
        zonas.add(zona);
    }
    public int cantidadTotalAnimales() {
    	return Mamifero.caballos+Mamifero.leones+Ave.halcones+Ave.aguilas+Reptil.iguanas+Reptil.serpientes+Pez.salmones+Pez.bacalaos+Anfibio.ranas+Anfibio.salamandras;
    	//return Animal.totalAnimales;
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