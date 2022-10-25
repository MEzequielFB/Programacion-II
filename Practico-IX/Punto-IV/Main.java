import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        CalcularCostoPorcentaje calculador_porcentaje1 = new CalcularCostoPorcentaje(20);
        CalcularCostoMontoFijo  calculador_monto_fijo1 = new CalcularCostoMontoFijo(1500);
        CalcularCostoMontoFijoPorcentaje calculador_monto_fijo_porcentaje1 = new CalcularCostoMontoFijoPorcentaje(1600, 40);

        SeguroSimple seguro_simple1 = new SeguroSimple("seguro de vida", "41653765", "salud", 1, 6000, calculador_porcentaje1);
        SeguroSimple seguro_simple2 = new SeguroSimple("seguro automotor", "372849281", "automotor", 10, 3000, calculador_monto_fijo1);
        SeguroSimple seguro_simple3 = new SeguroSimple("seguro hogar", "47876543", "incendio y hogar bienestar", 3, 300000, calculador_monto_fijo_porcentaje1);
        SeguroSimple seguro_simple4 = new SeguroSimple("seguro de vida", "7538291", "saludx2", 5, 16000, calculador_monto_fijo_porcentaje1);


        SeguroTemporal seguro_temporal1 = new SeguroTemporal("seguro temporal", "es temporal", seguro_simple1, LocalDate.of(2022, 10, 15), LocalDate.of(2023, 6, 15));

        SeguroIntegrador seguro_integrador1 = new SeguroIntegrador("seguro integrador", "24134323", "tien varios seguros");

        seguro_integrador1.addSeguro(seguro_simple2);
        seguro_integrador1.addSeguro(seguro_simple3);

        Aseguradora aseguradora1 = new Aseguradora();
        aseguradora1.addSeguro(seguro_integrador1);
        aseguradora1.addSeguro(seguro_simple4);
        aseguradora1.addSeguro(seguro_temporal1);

        //Inciso a
        FiltroPorDescripcionContiene filtro_descripcion_contiene1 = new FiltroPorDescripcionContiene("automotor");
        ComparadorPorDni comparador_dni1 = new ComparadorPorDni();
        ComparadorPorNumero comparador_numero1 = new ComparadorPorNumero();
        ComparadorAnd comparador_and1 = new ComparadorAnd(comparador_dni1, comparador_numero1);
        System.out.println("Seguros que contengan la palabra 'automotor' en la descripcion ordenados por dni: " + aseguradora1.buscarSeguros(filtro_descripcion_contiene1, comparador_and1));

        //Inciso b
        FiltroPorDescripcionContiene filtro_descripcion_contiene2 = new FiltroPorDescripcionContiene("hogar");
        FiltroPorMontoAsegurado filtro_monto_asegurado1 = new FiltroPorMontoAsegurado(250000);
        FiltroAnd filtro_and1 = new FiltroAnd(filtro_descripcion_contiene2, filtro_monto_asegurado1);
        System.out.println("Seguros con descripcion que contenga 'hogar' y tenga un monto asegurado mayor a 250000 ordenados por dni: " + aseguradora1.buscarSeguros(filtro_and1, comparador_dni1));

        //Inciso c
        FiltroPorDni filtro_dni1 = new FiltroPorDni("24134323");
        System.out.println("Seguros con dni '24134323' ordenados por numero de poliza: " + aseguradora1.buscarSeguros(filtro_dni1, comparador_numero1));
    }
}