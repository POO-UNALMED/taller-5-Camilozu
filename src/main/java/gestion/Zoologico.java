package gestion;
import java.util.*;

import zooAnimales.*;

public class Zoologico {
public static String nombre;
	static String ubicacion;
	static LinkedList <Zona> zonas;
	Zoologico() {
		nombre = "Zoologico y centro de rehabilitacion";
		ubicacion = "Oriente Antioqueno";
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