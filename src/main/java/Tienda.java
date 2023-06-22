import java.util.ArrayList;

public class Tienda {
	private String direccion;
	private ArrayList<Dispositivo> catalogo = new ArrayList<Dispositivo>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public Tienda(String direccion, List<Dispositivo> catalogo) {
		throw new UnsupportedOperationException();
	}

	public void registrarCliente(Cliente cliente) {
		throw new UnsupportedOperationException();
	}

	public void agregarDispositivo(Dispositivo dispositivo) {
		throw new UnsupportedOperationException();
	}

	public String obtenerInformacion(Dispositivo dispositivo) {
		throw new UnsupportedOperationException();
	}

	public List<Dispositivo> buscarDispositivo(String marca) {
		throw new UnsupportedOperationException();
	}

	public List<Dispositivo> buscarDispositivo(String modelo, String tipo) {
		throw new UnsupportedOperationException();
	}
}