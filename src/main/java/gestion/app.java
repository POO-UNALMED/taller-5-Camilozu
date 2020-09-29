package gestion;
import zooAnimales.*;
public class app {

	public static void main(String[] args) {
				
		new Anfibio();
		new Anfibio();
		new Mamifero();
		new Mamifero();
		new Mamifero();
		new Reptil();
		new Pez();
		new Ave();
		new Ave();
		System.out.println(Animal.totalPorTipo());
		System.out.println("Mamiferos: 4\n" + 
				"Aves: 4\n" + 
				"Reptiles: 2\n" + 
				"Peces: 2\n" + 
				"Anfibios: 3");
	}

}
