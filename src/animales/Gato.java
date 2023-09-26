package animales;

public class Gato extends Felino{
	public Gato() {
		
	}
	
	public Gato(String ta, String tc, String tam, String loc) {
		super (ta,tc,tam,loc);
	}
	
	public void comer(String tipoAlimento) {
		System.out.println(tipoAlimento);
	}
	
	public void hacerRuido() {
		System.out.println("Emito ruido como un gatito");
	}

	@Override
	public void verComportamiento() {
		// TODO Auto-generated method stub
		
	}
	
	

}
