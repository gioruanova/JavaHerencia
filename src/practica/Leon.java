package practica;

public class Leon extends Felino {
	public Leon() {

	}

	public Leon(String ta, String tc, String tam, String loc) {
		super(ta, tc, tam, loc);
	}

	public void comer() {
		System.out.println("Me alimento con carne de otros animales");
	}

	public void hacerRuido() {
		System.out.println("Emito ruido como un leon");
	}

	public void vacunar(String vacunacion) {
		System.out.println(vacunacion);
	}

	@Override
	public void verComportamiento() {
		// TODO Auto-generated method stub

	}
}
