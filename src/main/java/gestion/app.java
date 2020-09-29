package gestion;
import zooAnimales.*;
public class app {

	public static void main(String[] args) {
		Mamifero mamifero = new Mamifero();
		Reptil reptil = new Reptil();
		Animal a2 = new Ave();
		System.out.println(Animal.totalPorTipo());
		System.out.println(a2.movimiento());
		System.out.println(a2.toString());
	}

}
