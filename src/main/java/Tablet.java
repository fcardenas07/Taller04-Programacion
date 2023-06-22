import java.util.List;

public class Tablet extends Dispositivo {
	private final List<String> accesorios;
	private final Resolucion resolucion;

	public Tablet(String marca,
				  int ramGB,
				  int almacenamientoGB,
				  String procesador,
				  String modelo,
				  int year,
				  int precio,
				  int stock,
				  List<String> accesorios,
				  Resolucion resolucion) {
		super(marca, ramGB, almacenamientoGB, procesador, modelo, year, precio, stock);
		this.accesorios = accesorios;
		this.resolucion = resolucion;
	}


	public String getTipo() {
		return this.getClass().toString();
	}


	@Override
	public String getTablaEspecificacion() {
		return "Tablet{" +
				"accesorios=" + accesorios +
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