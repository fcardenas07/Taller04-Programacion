public class Pantalla {
	private final String marca;
	private final String modelo;
	private final int year;

	public Pantalla(String marca, String modelo, int year) {
		this.marca = marca;
		this.modelo = modelo;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Pantalla{" +
				"marca='" + marca + '\'' +
				", modelo='" + modelo + '\'' +
				", year=" + year +
				'}';
	}
}