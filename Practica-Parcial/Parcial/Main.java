import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Noticia noticia1 = new Noticia("tenis de mesa extra", "gano el chino laverchi");
        Noticia noticia2 = new Noticia("extra extra", "increible noticia", "candelaria", "moda");
        Noticia noticia3 = new Noticia("bebidas energeticas y el azucar", "es esto realmente bueno", "viviana", "salud");

        noticia1.addPalabraClave("torneo");
        noticia2.addPalabraClave("extra");
        noticia2.addPalabraClave("ropa");
        noticia3.addPalabraClave("salud");
        noticia3.addPalabraClave("desmayo");

        Seccion seccion1 = new Seccion(1);
        Seccion seccion2 = new Seccion(6);
        SeccionEspecial seccion_especial1 = new SeccionEspecial("ultimo momento", 2);

        Sistema sistema1 = new Sistema();

        seccion1.addElemento(noticia1);
        seccion1.addElemento(noticia2);
        seccion2.addElemento(noticia3);
        seccion_especial1.addElemento(seccion1);
        seccion_especial1.addElemento(seccion2);

        sistema1.addElemento(seccion_especial1);

        Seccion.setMensajeSinCategoria("sin categoria");

        System.out.println("Categoria seccion1: " + seccion1.getCategoria());
        System.out.println("Categoria seccion2: " + seccion2.getCategoria());
        System.out.println("Categoria seccion_especial1: " + seccion_especial1.getCategoria());

        System.out.println();

        System.out.println("Palabras clave noticia1: " + noticia1.getPalabrasClave());
        System.out.println("Palabras clave seccion1: " + seccion1.getPalabrasClave());
        System.out.println("Palabras clave seccion_especial1: " + seccion_especial1.getPalabrasClave());

        System.out.println();

        FiltroPorTituloContiene filtro_titulo1 = new FiltroPorTituloContiene("extra");
        System.out.println("Noticias que contienen 'extra' en el titulo: " + sistema1.buscarNoticias(filtro_titulo1));

        System.out.println();

        FiltroPorContenidoContiene filtro_contenido1 = new FiltroPorContenidoContiene("bueno");
        ArrayList<String> palabras_clave = new ArrayList<>();
        palabras_clave.add("muy bueno");
        palabras_clave.add("bien");
        sistema1.completarNoticia(noticia3, filtro_contenido1, palabras_clave);
        System.out.println("Palabras clave noticia3: " + noticia3.getPalabrasClave());
    }
}