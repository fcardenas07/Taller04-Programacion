public abstract class Dispositivo {
	protected String marca;
	protected int ramGB;
	protected int almacenamientoGB;
	protected String procesador;
	protected String modelo;
	protected int a�o;
	protected int precio;
	protected int stock;

	protected abstract String getTablaEspecificacion();

	protected abstract String getTipo();
}