public class Main {
    public static void main(String[] args) {

        Planta planta1 = new Planta("aureum planta", "plantax", "arace", "monoplanta", false, 7, 4);
        Planta planta2 = new Planta("aureum plantita", "crassula", "autput", "monoplanta", true, 6, 2);
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

        FiltroPorSolSuperior filtro4 = new FiltroPorSolSuperior(5);
        FiltroPorAguaInferior filtro5 = new FiltroPorAguaInferior(3);
        FiltroAnd filtro6 = new FiltroAnd(filtro4, filtro5);

        FiltroPorSolInferior filtro7 = new FiltroPorSolInferior(4);
        FiltroPorAguaSuperior filtro8 = new FiltroPorAguaSuperior(4);
        FiltroAnd filtro9 = new FiltroAnd(filtro7, filtro8);

        FiltroPorInterior filtro10 = new FiltroPorInterior();
        FiltroAnd filtro11 = new FiltroAnd(filtro10, filtro5);

        FiltroAnd filtro12 = new FiltroAnd(filtro3, filtro4);

        System.out.println("Plantas que contengan 'aureum' en su nombre_cientifico: " + vivero1.buscarPlantas(filtro1));
        System.out.println("Plantas conocidas por el nombre vulgar 'lengua de suegra': " + vivero1.buscarPlantas(filtro2));
        System.out.println("Plantas clasificadas como 'crassula': " + vivero1.buscarPlantas(filtro3));
        System.out.println("Plantas que requieran mas de 5 puntos de sol y menos de 3 de agua: " + vivero1.buscarPlantas(filtro6));
        System.out.println("Plantas que requieran menos de 4 puntos de sol y mas de 4 de agua: " + vivero1.buscarPlantas(filtro9));
        System.out.println("Plantas que requieran menos de 3 puntos de agua y sean de interior: " + vivero1.buscarPlantas(filtro11));
        System.out.println("Plantas clasificadas como 'crassula' y que necesiten mas de 5 puntos de sol: " + vivero1.buscarPlantas(filtro12));
    }
}