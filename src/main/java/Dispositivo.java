public abstract class Dispositivo {
    protected final String marca;
    protected final int ramGB;
    protected final int almacenamientoGB;
    protected final String procesador;
    protected final String modelo;
    protected final int year;
    protected final int precio;
    protected final int stock;

    protected Dispositivo(String marca,
                          int ramGB,
                          int almacenamientoGB,
                          String procesador,
                          String modelo,
                          int year,
                          int precio,
                          int stock) {
        this.marca = marca;
        this.ramGB = ramGB;
        this.almacenamientoGB = almacenamientoGB;
        this.procesador = procesador;
        this.modelo = modelo;
        this.year = year;
        this.precio = precio;
        this.stock = stock;
    }

    protected abstract String getTablaEspecificacion();

    protected abstract String getTipo();

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}