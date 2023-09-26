package animales;

public abstract class Animal {
	protected String tipoAnimal;
	protected String tipoComida;
	protected String localizacion;
	protected String tamanio;

	public Animal() {
		super();
	}

	public Animal(String ta, String tc, String loc, String tam) {
		super();
		this.tipoAnimal = ta;
		this.tipoComida = tc;
		this.localizacion = loc;
		this.tamanio = tam;
	}

	@Override
	public String toString() {
		return tipoAnimal + tipoComida + localizacion + tamanio;
	}

	public void comer() {
		System.out.println("Me alimenot como un...");
	}
	
	public void rugir() {
		System.out.println("Emito rugido como un...");
	}
	
	
	public void hacerRuido() {
		System.out.println("Emito ruido como un...");
	}
	
	public void dormir() {
		System.out.println("Duermo como un Animal");
	}
	
	public abstract void verComportamiento();

}
