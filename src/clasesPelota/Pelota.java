package clasesPelota;

public  class Pelota {
	public static final String PELOTAS_DISPONIBLES = "Hay pelotas para jugar";
	public static final String PELOTAS_NO_DISPONIBLES = "No hay pelotas para jugar";

	protected String tipoPelota;
	protected String tamanio;
	protected String color;
	protected Integer cantidad;

	
	
	public Pelota() {

	}

	public Pelota(String tipoPelota, String tamanio, String color, Integer cantidad) {
		this.tipoPelota = tipoPelota;
		this.tamanio = tamanio;
		this.color = color;
		this.cantidad = cantidad;
	}

	public String pelotasDisponibles() {
		String disponibles = PELOTAS_NO_DISPONIBLES;
		if (this.cantidad < 1) {
			disponibles = PELOTAS_NO_DISPONIBLES;
		} else {
			disponibles = PELOTAS_DISPONIBLES;
		}
		return disponibles;

	}
	
	public void lanzarPelota() {
		System.out.println("Me lanzan como una pelota");
	}

	@Override
	public String toString() {
		return "Tipo: " + tipoPelota + "\nTamaño: " + tamanio + "\nColor: " + color + "\nCantidad: " + cantidad + "\n"
				+ pelotasDisponibles();
	}

}
