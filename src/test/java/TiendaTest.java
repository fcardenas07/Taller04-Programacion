import org.junit.jupiter.api.BeforeEach;

import java.util.List;

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
                List.of("Audifonos", "Mouse"),
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
                List.of("Audifonos"),
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


        catalogo.add(pc1);
        catalogo.add(pc2);
        catalogo.add(tablet1);
        catalogo.add(tablet2);
        catalogo.add(notebook1);
        catalogo.add(notebook2);
    }
}