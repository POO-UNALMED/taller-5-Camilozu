package gestion;
import zooAnimales.*;
public class app {

	public static void main(String[] args) {
		Zoologico zoo1 = new Zoologico();
		Zona zona1 = new Zona();
		Zona zona2 = new Zona("salvaje", zoo1);
		System.out.println(zona2.getZoo());
	}

}
