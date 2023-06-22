public class PCEscritorio extends Dispositivo {
    private final String tarjetaVideo;
    private final String fuenteDePoder;
    private final String chasis;
    private final Pantalla pantalla;

    protected PCEscritorio(String marca,
                           int ramGB,
                           int almacenamientoGB,
                           String procesador,
                           String modelo,
                           int year,
                           int precio,
                           int stock,
                           String tarjetaVideo,
                           String fuenteDePoder,
                           String chasis,
                           Pantalla pantalla) {
        super(marca, ramGB, almacenamientoGB, procesador, modelo, year, precio, stock);
        this.tarjetaVideo = tarjetaVideo;
        this.fuenteDePoder = fuenteDePoder;
        this.chasis = chasis;
        this.pantalla = pantalla;
    }


    @Override
    public String getTipo() {
        return this.getClass().toString();
    }

    @Override
    public String getTablaEspecificacion() {
        return "PCEscritorio{" +
                "tarjetaVideo='" + tarjetaVideo + '\'' +
                ", fuenteDePoder='" + fuenteDePoder + '\'' +
                ", chasis='" + chasis + '\'' +
                ", pantalla=" + pantalla +
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