package animales;

public class Perro extends Canino{

	public Perro() {
		
	}
	
	public Perro(String ta, String tc, String tam, String loc) {
		super (ta,tc,tam,loc);
	}
	
	public void comer(String tipoAlimento) {
		System.out.println(tipoAlimento);
	}
	
	public void hacerRuido() {
		System.out.println("Emito ruido como un perro");
	}
	
	public void vacunar() {
		System.out.println("Deben vacunarme regularmente");
	}
	
	
	@Override
	public void verComportamiento() {
		// TODO Auto-generated method stub
		
	}
}
