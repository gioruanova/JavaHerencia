package animales;

public abstract class Felino extends Animal{
	public Felino() {

	}

	public Felino(String ta, String tc, String tam, String loc) {
		super (ta,tc,tam,loc);
	}
	
	public void rugir() {
		System.out.println("Emito un rugido como un Felino");
	}
	
	public void comer() {
		System.out.println("Me alimento como un Gato");
	}
	
	public void vacunar() {
		System.out.println("Deben vacunarme 1 vez por año");
	}
}
