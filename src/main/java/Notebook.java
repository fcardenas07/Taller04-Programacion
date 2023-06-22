public class Notebook extends Dispositivo {
	private final double bateriamAh;
	private final String teclado;
	private final Resolucion resolucion;

	protected Notebook(String marca,
					   int ramGB,
					   int almacenamientoGB,
					   String procesador,
					   String modelo,
					   int year,
					   int precio,
					   int stock,
					   double bateriamAh,
					   String teclado,
					   Resolucion resolucion) {
		super(marca, ramGB, almacenamientoGB, procesador, modelo, year, precio, stock);
		this.bateriamAh = bateriamAh;
		this.teclado = teclado;
		this.resolucion = resolucion;
	}

	public String getTipo() {
		return "Notebook";
	}

	@Override
	public String getTablaEspecificacion() {
		return "Notebook{" +
				"bateriamAh=" + bateriamAh +
				", teclado='" + teclado + '\'' +
				", resolucion=" + resolucion +
				", marca='" + marca + '\'' +
				", ramGB=" + ramGB +
				", almacenamientoGB=" + almacenamientoGB +
				", procesador='" + procesador + '\'' +
				", modelo='" + modelo + '\'' +
				", year=" + year +
				", precio=" + precio +
				", stock=" + stock +
				'}';
	}
}