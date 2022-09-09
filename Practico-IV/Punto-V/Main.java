import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        Empresa e1 = new Empresa("Empresa D:");

        ProductoFresco pfresco1 = new ProductoFresco("Huevo de gallina", LocalDate.of(2023, 11, 10), LocalDate.of(2022, 6, 11), "La granjita");

        ProductoRefrigerado pRefrigerado1 = new ProductoRefrigerado("Milanesa de pollo", LocalDate.of(2023, 11, 10), LocalDate.of(2022, 6, 11), "Le granje", -5);

        ProductoCongeladoPorAire pCongeladoXAire1 = new ProductoCongeladoPorAire("papas fritas", LocalDate.of(2023, 11, 10), LocalDate.of(2022, 6, 11), "El origen", -10, 25, 25, 45, 5);

        ProductoCongeladoPorAgua pCongeladoXAgua1 = new ProductoCongeladoPorAgua("Arvejas", LocalDate.of(2023, 11, 10), LocalDate.of(2022, 6, 11), "El origen", -8, 0.35);

        ProductoCongeladoPorNitrogeno pCongeladoXNitrogeno1 = new ProductoCongeladoPorNitrogeno("Granos de maiz", LocalDate.of(2023, 11, 10), LocalDate.of(2022, 6, 11), "Origen 2", -15, "Un método", 1000);

        e1.addProducto(pfresco1);

        e1.addProducto(pRefrigerado1);
        e1.addProducto(pCongeladoXAgua1);
        e1.addProducto(pCongeladoXAire1);
        /* e1.addProducto(pCongeladoXNitrogeno1); */

        System.out.println(e1.getProducto(pfresco1) + "\n");        
        System.out.println(e1.getProducto(pRefrigerado1) + "\n");
        System.out.println(e1.getProducto(pCongeladoXAgua1) + "\n");
        System.out.println(e1.getProducto(pCongeladoXAire1) + "\n");
        System.out.println(e1.getProducto(pCongeladoXNitrogeno1) + "\n");
    }
}