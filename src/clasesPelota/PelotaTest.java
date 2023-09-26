package clasesPelota;

public class PelotaTest {
	public static void main(String[] args) {

		System.out.println("\n----\n");
		Basket pelota1 = new Basket("Basket", "80cm", "Roja", 5);
		System.out.println(pelota1.toString());
		pelota1.lanzarPelota();

		System.out.println("\n----\n");
		Futbol pelota2 = new Futbol("Futbol", "70cm", "Naranja", 23);
		System.out.println(pelota2.toString());
		pelota2.lanzarPelota();
		pelota2.reglamentar();

		System.out.println("\n----\n");
		Golf pelota3 = new Golf("Golf", "8cm", "Naranja", 0, "Nike");
		System.out.println(pelota3.toString());
		pelota3.lanzarPelota();
		pelota3.mostrarInfoGolf("Me pegan con el palo");


	}
}
