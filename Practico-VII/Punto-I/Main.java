public class Main {
    public static void main(String[] args) {

        Cultivo cultivo1 = new Cultivo("girasol");
        Cultivo cultivo2 = new Cultivo("lino");
        Cultivo cultivo3 = new Cultivo("maiz");

        ProductoQuimico producto1 = new ProductoQuimico("agriferm");
        ProductoQuimico producto2 = new ProductoQuimico("quimiquendo");

        Enfermedad enfermedad1 = new Enfermedad("cochinilla");
        Enfermedad enfermedad2 = new Enfermedad("enfermedad mala");

        Empresa empresa1 = new Empresa("agricola productos");

        cultivo1.addEnfermedadFrecuente(enfermedad1);

        cultivo2.addEnfermedadFrecuente(enfermedad1);
        cultivo2.addEnfermedadFrecuente(enfermedad2);

        cultivo3.addEnfermedadFrecuente(enfermedad2);

        producto1.addCultivoDesaconsejado(cultivo2);
        producto1.addCultivoDesaconsejado(cultivo3);
        producto1.addPatologiaQueTrata("hojas amarillas");
        producto1.addPatologiaQueTrata("deshidratacion");
        producto1.addPatologiaQueTrata("hojas mordidas");

        producto2.addCultivoDesaconsejado(cultivo1);
        producto2.addPatologiaQueTrata("caida de frutos");
        producto2.addPatologiaQueTrata("hojas mordidas");

        enfermedad1.addPatologia("hojas amarillas");
        enfermedad1.addPatologia("deshidratacion");

        enfermedad2.addPatologia("hojas mordidas");

        empresa1.addProductoQuimico(producto1);
        empresa1.addProductoQuimico(producto2);

        FiltroPorEnfermedad filtroPorEnfermedad1 = new FiltroPorEnfermedad(enfermedad1);
        FiltroPorEnfermedad filtroPorEnfermedad2 = new FiltroPorEnfermedad(enfermedad2);

        FiltroPorCultivoDesaconsejado filtroPorCultivoDesaconsejado1 = new FiltroPorCultivoDesaconsejado(cultivo2);
        FiltroNot filtroNot1 = new FiltroNot(filtroPorCultivoDesaconsejado1);

        FiltroAnd filtroAnd1 = new FiltroAnd(filtroPorEnfermedad1, filtroNot1);

        System.out.println("Lista de productos que tratan la cochinilla: " + empresa1.filtrarProductos(filtroPorEnfermedad1));
        System.out.println("Lista de productos que tratan la enfermedad mala: " + empresa1.filtrarProductos(filtroPorEnfermedad2));
        System.out.println("Lista de productos que sirven para tratar la cochinilla en el lino: " + empresa1.filtrarProductos(filtroAnd1));
    }
}