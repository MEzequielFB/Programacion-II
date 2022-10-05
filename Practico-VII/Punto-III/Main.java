public class Main {
    public static void main(String[] args) {

        Planta planta1 = new Planta("aureum planta", "plantax", "arace", "monoplanta", false, 7, 4);
        Planta planta2 = new Planta("aureum plantita", "crassula", "autput", "monoplanta", true, 6, 3);
        Planta planta3 = new Planta("ateos clark", "crassula", "autput", "monoplanta", true, 3, 6);

        planta1.addNombreVulgar("lengua de suegra");
        planta1.addNombreVulgar("alaibaba");

        planta2.addNombreVulgar("tomate frio");

        Vivero vivero1 = new Vivero();

        vivero1.addPlanta(planta1);
        vivero1.addPlanta(planta2);
        vivero1.addPlanta(planta3);

        FiltroPorNombreCientifico filtro1 = new FiltroPorNombreCientifico("aureum");
        FiltroPorNombreVulgar filtro2 = new FiltroPorNombreVulgar("lengua de suegra");
        FiltroPorClasificacion filtro3 = new FiltroPorClasificacion("crassula");

        FiltroPorSol filtro4 = new FiltroPorSol(5);
        FiltroPorAgua filtro5 = new FiltroPorAgua(3);
        FiltroNot filtro6 = new FiltroNot(filtro5);
        FiltroAnd filtro7 = new FiltroAnd(filtro4, filtro6);

        System.out.println("Plantas que contengan 'aureum' en su nombre_cientifico: " + vivero1.buscarPlantas(filtro1));
        System.out.println("Plantas conocidas por el nombre vulgar 'lengua de suegra': " + vivero1.buscarPlantas(filtro2));
        System.out.println("Plantas clasificadas como 'crassula': " + vivero1.buscarPlantas(filtro3));
        System.out.println("Plantas que requieran mas de 5 puntos de sol y menos de 3 de agua: " + vivero1.buscarPlantas(filtro7)); //Preguntar filtros por agua y sol
        
    }
}