public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto("Mesa", 20, "Roble", "Marrón", 100);
        Producto p2 = new Producto("Mesa", 20, "Pino", "Marrón claro", 52);

        Producto p3 = new Producto("Silla", 5, "Pino", "Negro", 15);
        Producto p4 = new Producto("Silla", 6.5, "Roble", "Azul oscuro", 35);

        Producto p5 = new Producto("Banco", 6, "Pino", "Blanco", 20);

        Fabrica f1 = new Fabrica("Fábrica de muebles");

        //Agrega productos
        f1.addProducto(p1, 1); //Mesas
        f1.addProducto(p2, 1);

        f1.addProducto(p3, 1); //Sillas
        f1.addProducto(p4, 2);

        f1.addProducto(p5, 1); //Banco

        //Cambia porcentaje de venta
        p2.setPorcetanjeVenta(10);

        //Consola
        System.out.println("Ganancia p2: " + p2.getGanancia());
        System.out.println("Costo total: " + f1.getCostoTotal());
        System.out.println("Ganancia total estimada: " + f1.getGananciaTotalEstimada());
        
        //Vende productos
        f1.venderProducto(p1, 1); //Vende un producto y se sigue mostrando el mismo monto en costo -> BIEN
        f1.venderProducto(p2, 1);

        //Consola(1)
        System.out.println("Costo total: " + f1.getCostoTotal());
        System.out.println("Ganancia en ventas: " + f1.getGananciaVentas());
        System.out.println("Cantidad de sillas: " + f1.getCantTipoProductoEnStock("Silla"));
    }
}