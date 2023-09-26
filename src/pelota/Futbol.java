package pelota;

public class Futbol extends Pelota{

	public Futbol() {

	}

	public Futbol(String tipoPelota, String tamanio, String color, Integer cantidad) {
		this.tipoPelota=tipoPelota;
		this.tamanio = tamanio;
		this.color = color;
		this.cantidad = cantidad;
	}
	
	public void lanzarPelota() {
		System.out.println("Me patean para entrar al arco");
	}
	
	public void reglamentar() {
		System.out.println("No pueden tocarme con la mano");
	}
	
}
