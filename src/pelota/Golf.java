package pelota;

public class Golf extends Pelota {

	protected String marca;

	public Golf() {

	}

	public Golf(String tipoPelota, String tamanio, String color, Integer cantidad, String marca) {
		this.tipoPelota = tipoPelota;
		this.tamanio = tamanio;
		this.color = color;
		this.cantidad = cantidad;
		this.marca = marca;
	}

	public String lanzarPelota(String formaJugar) {
		return formaJugar;
	}

	public String reglamentar() {
		return "No pueden tocarme con la mano, solo pegarme con el palo";
	}

	public String medirVelocidad() {
		return "Mi velocidad puede alcanzar los 40 kph";
	}

	public void mostrarInfoGolf(String formaJugar) {
		System.out.println(lanzarPelota(formaJugar) + ", " + reglamentar() +". "+ medirVelocidad());
	}

	public String toString() {
		return "Tipo: " + tipoPelota + "\nTamaño: " + tamanio + "\nColor: " + color + "\nCantidad: " + cantidad + "\n"
				+ pelotasDisponibles() + "\nmi marca es >>>> " + marca;
	}
}
