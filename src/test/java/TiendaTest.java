import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.List.*;
import static org.junit.jupiter.api.Assertions.*;

class TiendaTest {

    private Tienda tienda;
    private List<Dispositivo> catalogo;


    @BeforeEach
    void setUp() {
        PCEscritorio pc1 = new PCEscritorio(
                "HP",
                16,
                1000,
                "AMD",
                "Ryzen",
                2023,
                500_000,
                10,
                "tarjeta",
                "500W",
                "Chasis",
                new Pantalla("LG", "LT",2023 ));

        PCEscritorio pc2 = new PCEscritorio(
                "HP",
                16,
                1000,
                "Intel",
                "I5",
                2023,
                700_000,
                3,
                "tarjeta",
                "700W",
                "Chasis",
                new Pantalla("Samsumg", "LT",2023 ));

        Tablet tablet1 = new Tablet(
                "Apple",
                8,
                200,
                "Intel",
                "I3",
                2023,
                40_000,
                15,
                of("Audifonos", "Mouse"),
                new Resolucion(1920, 1080));

        Tablet tablet2 = new Tablet(
                "HP",
                8,
                200,
                "Intel",
                "I9",
                2023,
                400_000,
                6,
                of("Audifonos"),
                new Resolucion(1920, 1080));

        Notebook notebook1 = new Notebook(
                "HP",
                8,
                500,
                "Intel",
                "I9",
                2023,
                400_000,
                6,
                11,
                "Gamer",
                new Resolucion(1920, 1080));

        Notebook notebook2 = new Notebook(
                "ASUS",
                16,
                800,
                "Intel",
                "I9",
                2023,
                800_000,
                3,
                11,
                "Gamer",
                new Resolucion(1920, 1080));

        catalogo = new ArrayList<>();

        catalogo.add(pc1);
        catalogo.add(pc2);
        catalogo.add(tablet1);
        catalogo.add(tablet2);
        catalogo.add(notebook1);
        catalogo.add(notebook2);

        Cliente cliente = new Cliente("Cliente1", "Apellido", "correo@gmail.com", 987654321, "Temuco", EstadoCivil.SOLTERO_A);
        tienda = new Tienda("Direccion",
                catalogo,
                new ArrayList<>(of(cliente)));
    }

    @Test
    void agregarCliente_cuandoNoSeRepite() {
        Cliente cliente = new Cliente("Cliente1", "Apellido", "correo@gmail.com", 123456789, "Temuco", EstadoCivil.SOLTERO_A);
        tienda.registrarCliente(cliente);

        int size = tienda.getClientes().size();
        int nroContacto = tienda.getClientes().get(1).getNroContacto();

        assertEquals(2, size);
        assertEquals(123456789, nroContacto);

    }

    @Test
    void agregarCliente_arrojaExcepcion_cuandoElClienteYaExiste() {
        Cliente cliente = new Cliente("Cliente1", "Apellido", "correo@gmail.com", 987654321, "Temuco", EstadoCivil.SOLTERO_A);

        RuntimeException exception = assertThrows(RuntimeException.class,
                () -> tienda.registrarCliente(cliente));

        assertEquals("Cliente Existente", exception.getMessage());
    }

    @Test
    void agregarDispositivo() {
        Notebook notebook = new Notebook(
                "Dell",
                16,
                800,
                "Intel",
                "I9",
                2023,
                800_000,
                3,
                11,
                "Gamer",
                new Resolucion(1920, 1080));

        tienda.agregarDispositivo(notebook);

        int size = tienda.getCatalogo().size();
        assertEquals(7, size);
    }

    @Test
    void obtenerInformacionProducto() {
        String tablaEspecificacion = tienda.getCatalogo().get(0).getTablaEspecificacion();

        String esperado = "PCEscritorio{tarjetaVideo='tarjeta', fuenteDePoder='500W', chasis='Chasis', pantalla=Pantalla{marca='LG', modelo='LT', year=2023}, marca='HP', ramGB=16, almacenamientoGB=1000, procesador='AMD', modelo='Ryzen', year=2023, precio=500000, stock=10}";

        assertEquals(esperado, tablaEspecificacion);
    }

    @Test
    void buscarPorMarca() {
        List<Dispositivo> hp = tienda.buscarDispositivo("HP");

        int size = hp.size();
        assertEquals(4, size);
    }

    @Test
    void buscarPorModeloYTipo() {
        List<Dispositivo> dispositivos = tienda.buscarDispositivo("I9", "Notebook");

        int size = dispositivos.size();
        assertEquals(2, size);
    }
}