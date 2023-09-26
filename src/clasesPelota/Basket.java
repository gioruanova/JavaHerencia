package clasesPelota;

public class Basket extends Pelota {
	
	public Basket() {

	}

	public Basket(String tipoPelota, String tamanio, String color, Integer cantidad) {
		this.tipoPelota=tipoPelota;
		this.tamanio = tamanio;
		this.color = color;
		this.cantidad = cantidad;
	}
	
	public void lanzarPelota() {
		System.out.println("Me toman con las manos y me lanzan al aro");
	}
}
