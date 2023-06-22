public class Cliente {
	private final String nombre;
	private final String apellido;
	private final String correo;
	private final int nroContacto;
	private final String ciudad;
	private final EstadoCivil estadoCivil;

	public Cliente(String nombre, String apellido, String correo, int nroContacto, String ciudad, EstadoCivil estadoCivil) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.nroContacto = nroContacto;
		this.ciudad = ciudad;
		this.estadoCivil = estadoCivil;
	}

	public int getNroContacto() {
		return nroContacto;
	}
}