package animalesTest;

import animales.Gato;
import animales.Leon;
import animales.Perro;

public class AnimalTest {

	public static void main(String[] args) {

		Perro perro1 = new Perro("Soy un Perro, \nRaza: Callejero", "\nAlimento: balanceado", "\nTamaño: Mediano",
				"\nVive: En la calle");
		System.out.println(perro1);
		perro1.comer("Mi comida se basa en la carne tambien");
		perro1.hacerRuido();
		perro1.rugir();
		perro1.vacunar();
		
		
		System.out.println("\n------------------\n");
		
		Gato gato1 = new Gato("Soy un Gato, \nRaza: Callejero", "\nAlimento: balanceado", "\nTamaño: Mediano",
				"\nVive: En la calle");
		System.out.println(gato1);
		gato1.comer();
		gato1.hacerRuido();
		gato1.rugir();
		gato1.vacunar();
		
		System.out.println("\n------------------\n");
		
		Leon l1 = new Leon("Soy un Leon, \nRaza: Gris", "\nAlimento: Carne", "\nTamaño: Grande",
				"\nVive: Africa");
		System.out.println(l1);
		l1.comer();
		l1.hacerRuido();
		l1.rugir();
		l1.vacunar("Nunca deben vacunarme");

	}

}
