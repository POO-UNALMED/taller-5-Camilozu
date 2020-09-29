package gestion;
import zooAnimales.*;
public class app {

	public static void main(String[] args) {
				
		Animal a1 = new Anfibio();
		Animal a2 = new Ave();
		Animal a3 = new Mamifero();
		Animal a4 = new Pez();
		Animal a5 = new Reptil();
		System.out.println(a1.movimiento());
		System.out.println(a2.movimiento());
		System.out.println(a3.movimiento());
	    System.out.println(a4.movimiento());
	    System.out.println(a5.movimiento());
	}

}
