public class Main {
    public static void main(String[] args) {

        Noticia noticia1 = new Noticia("Messi", "asfasfasf", "afasfacsa", "javier", "link1");
        Noticia noticia2 = new Noticia("Nadal", "asfasfasf", "afasfacsa", "javier", "link2");
        Noticia noticia3 = new Noticia("Escenario", "asfasfasf", "afasfacsa", "javier", "link3");

        Categoria categoria1 = new Categoria("deportes", "asfasdvavd", "sdasfasfa.jpg");
        Categoria categoria2 = new Categoria("arte", "asfasdvavd", "sdasfasfa.jpg");
        Categoria categoria3 = new Categoria("general", "asfasdvavd", "sdasfasfa.jpg");

        categoria1.addElemento(noticia1);
        categoria1.addElemento(noticia2);

        categoria2.addElemento(noticia3);

        categoria3.addElemento(categoria1);
        categoria3.addElemento(categoria2);

        Sistema sistema = new Sistema();
        sistema.addElemento(categoria3);
        System.out.println("Mapa del sitio: " + sistema.getMapa(noticia1));
        System.out.println("Mapa del sitio: " + sistema.getMapa(categoria2));
    }
}