import java.util.ArrayList;

public class Seccion extends ElementoNoticia {

    private int posicion_categoria;
    private CalculadorPalabraClave calculador_palabra_significativa;
    private ArrayList<ElementoNoticia> elementos;

    public Seccion(String titulo, String editor, int posicion_categoria, CalculadorPalabraClave calculador_palabra_significativa) {
        super(titulo, editor);
        this.posicion_categoria = posicion_categoria;
        this.calculador_palabra_significativa = calculador_palabra_significativa;
        this.elementos = new ArrayList<>();
    }

    //Funcionalidades
    public void addElemento(ElementoNoticia elemento) {
        if (!this.elementos.contains(elemento)) {
            this.elementos.add(elemento);
        }
    }

    //Getters
    public String getPalabraClaveSignificativa() {
        return this.calculador_palabra_significativa.calcularPalabraClave(this.getPalabrasClave());
    }

    @Override
    public int getCantidadElementosPorCaracteristica(Filtro filtro) {
        if (filtro.cumple(this)) {
            return 1;
        }
        int cantidad_elementos_cumplen = 0;
        for (ElementoNoticia elemento : this.elementos) {
            cantidad_elementos_cumplen += elemento.getCantidadElementosPorCaracteristica(filtro);
        }
        return cantidad_elementos_cumplen;
    }

    @Override
    public String getCategoria() {
        if (!this.elementos.isEmpty() || this.elementos.size() > this.posicion_categoria) {
            return this.elementos.get(this.posicion_categoria).getCategoria();
        }
        return null;
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        ArrayList<String> palabras_clave = new ArrayList<>();
        for (ElementoNoticia elemento : this.elementos) {
            for (String palabra_clave : elemento.getPalabrasClave()) {
                if (!palabras_clave.contains(palabra_clave)) {
                    palabras_clave.add(palabra_clave);
                }
            }
        }
        return palabras_clave;
    }

    @Override
    public String getContenido() {
        String contenido = "";
        for (ElementoNoticia elemento : this.elementos) {
            contenido += elemento.getContenido();
        }
        return contenido;
    }

    //Setters
    public void setCalculadorPalabraClave(CalculadorPalabraClave calculador_palabra_significativa) {
        this.calculador_palabra_significativa = calculador_palabra_significativa;
    }
}