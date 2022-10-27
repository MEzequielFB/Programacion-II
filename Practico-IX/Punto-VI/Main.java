public class Main {
    public static void main(String[] args) {

        Comarca comarca1 = new Comarca("comarquita", 1000000, 250000, 1200000000);
        Comarca comarca2 = new Comarca("the shire", 1400000, 4369000, 1450000000);
        Comarca comarca3 = new Comarca("el duende", 35000, 90000, 377000000);
        Comarca comarca4 = new Comarca("el carlos", 2000000, 10000000, 1700000000);

        TerritorioCompuesto territorio_compuesto1 = new TerritorioCompuesto("aman");
        TerritorioCompuesto territorio_compuesto2= new TerritorioCompuesto("norte");
        TerritorioCompuesto territorio_compuesto3= new TerritorioCompuesto("sur");

        territorio_compuesto2.addRegion(comarca1);

        territorio_compuesto3.addRegion(comarca2);
        territorio_compuesto3.addRegion(comarca3);

        territorio_compuesto1.addRegion(territorio_compuesto2);
        territorio_compuesto1.addRegion(territorio_compuesto3);

        Censo censo1 = new Censo();
        censo1.addRegion(territorio_compuesto1);
        censo1.addRegion(comarca4);

        //Servicios
        System.out.println("Cantidad de habitantes de 'aman': " + censo1.getCantidadHabitantesPorTerritorio(territorio_compuesto1));
        System.out.println("Superficie de 'el carlos': " + censo1.getSuperficiePorTerritorio(comarca4));
        System.out.println("Ingresos per capita de 'norte': " + censo1.getIngresosPerCapitaPorTerritorio(territorio_compuesto2));
        System.out.println("Densidad de 'sur': " + censo1.getDensidadPorTerritorio(territorio_compuesto3));

        //Busquedas
        FiltroPorCantidadHabitantes filtro_cantidad_habitantes1 = new FiltroPorCantidadHabitantes(100000);
        System.out.println("\nComarcas con mas de 100000 habitantes: " + censo1.buscarComarcas(filtro_cantidad_habitantes1));
        
        FiltroPorDensidad filtro_densidad1 = new FiltroPorDensidad(4);
        System.out.println("Comarcas con densidad de mas de 4: " + censo1.buscarComarcas(filtro_densidad1));

        FiltroPorNombre filtro_nombre1 = new FiltroPorNombre("the shire");
        System.out.println("Comarcas con el nombre 'the shire': " + censo1.buscarComarcas(filtro_nombre1));

        FiltroOr filtro_or1 = new FiltroOr(filtro_densidad1, filtro_nombre1);
        System.out.println("Comarcas con de densidad de mas de 4 o con el nombre 'the shire': " + censo1.buscarComarcas(filtro_or1));
    }
}