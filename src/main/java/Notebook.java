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


	public String getTablaEspecificacion() {
		throw new UnsupportedOperationException();
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}