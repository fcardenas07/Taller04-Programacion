import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Tienda {
	private final String direccion;
	private final List<Dispositivo> catalogo;
	private final List<Cliente> clientes;

	public Tienda(String direccion, List<Dispositivo> catalogo, List<Cliente> clientes) {
		this.direccion = direccion;
		this.catalogo = catalogo;
		this.clientes = clientes;
	}

	public void registrarCliente(Cliente cliente) {
		if(clienteExistente(cliente)) throw new RuntimeException("Cliente Existente");

		clientes.add(cliente);
	}

	private boolean clienteExistente(Cliente clienteBuscado) {
		return clientes.stream()
				.anyMatch(cliente -> cliente.getNroContacto() == clienteBuscado.getNroContacto());
	}

	public void agregarDispositivo(Dispositivo dispositivo) {
		catalogo.add(dispositivo);
	}

	public String obtenerInformacion(Dispositivo dispositivo) {
		return dispositivo.getTablaEspecificacion();
	}

	public List<Dispositivo> buscarDispositivo(String marca) {
		return catalogo.stream()
				.filter(dispositivo -> dispositivo.getMarca().equals(marca))
				.collect(toList());
	}

	public List<Dispositivo> buscarDispositivo(String modelo, String tipo) {
		return catalogo.stream()
				.filter(dispositivo -> compararDispositivos(modelo, tipo, dispositivo))
				.collect(toList());
	}

	private boolean compararDispositivos(String modelo, String tipo, Dispositivo dispositivo) {
		return dispositivo.modelo.equals(modelo) && dispositivo.getTipo().equals(tipo);
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public List<Dispositivo> getCatalogo() {
		return catalogo;
	}
}