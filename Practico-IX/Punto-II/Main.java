import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        GastoSimple gasto_simple1 = new GastoSimple("cimientos", LocalDate.of(2022, 10, 11), "alta", 900, "construccion");
        GastoSimple gasto_simple2 = new GastoSimple("pintura", LocalDate.of(2022, 10, 21), "media",600, "construccion");
        GastoSimple gasto_simple3 = new GastoSimple("vehiculo", LocalDate.of(2022, 10, 25), "alta",1800, "transporte");

        GastoDetallado gasto_detallado1 = new GastoDetallado("construccion de edificio", LocalDate.of(2022, 11, 11), "media");

        gasto_detallado1.addDetalle(gasto_simple1);
        gasto_detallado1.addDetalle(gasto_simple2);

        Sistema sistema1 = new Sistema();
        sistema1.addGasto(gasto_detallado1);
        sistema1.addGasto(gasto_simple3);

        System.out.println(gasto_detallado1);

        //Filtros para obtener montos
        //Filtro 1
        FiltroPorFecha filtro_fecha1 = new FiltroPorFecha(LocalDate.of(2022, 10, 11));
        System.out.println("Monto total por fecha 11/10/22: " + sistema1.getMontoTotalPorFiltro(filtro_fecha1));

        //Filtro 2
        FiltroPorRubro filtro_rubro1 = new FiltroPorRubro("construccion");
        System.out.println("Monto total por rubro 'construccion': " + sistema1.getMontoTotalPorFiltro(filtro_rubro1));

        //Filtro 5
        FiltroPorFecha filtro_fecha2 = new FiltroPorFecha(LocalDate.of(2022, 10, 21));
        FiltroPorDescripcion filtro_descripcion1 = new FiltroPorDescripcion("pintura");
        FiltroAnd filtro_and1 = new FiltroAnd(filtro_fecha2, filtro_descripcion1);
        System.out.println("Monto total por descripcion 'pintura' y fecha 21/10/22: " + sistema1.getMontoTotalPorFiltro(filtro_and1));

        //Filtros para obtener listas
        //Filtro 3
        System.out.println();
        FiltroPorFecha filtro_fecha3 = new FiltroPorFecha(LocalDate.of(2022, 11, 11));
        System.out.println("Lista de gastos por fecha 11/11/22: " + sistema1.getListaGastosPorFiltro(filtro_fecha3));

        //Filtro 4
        FiltroPorCalidad filtro_calidad1 = new FiltroPorCalidad("media");
        System.out.println("Lista de gastos por calidad 'media': " + sistema1.getListaGastosPorFiltro(filtro_calidad1));

        //Filtro 6
        FiltroPorMonto filtro_monto1 = new FiltroPorMonto(1556);
        System.out.println("Lista de gastos por monto '1556': " + sistema1.getListaGastosPorFiltro(filtro_monto1));
    }
}