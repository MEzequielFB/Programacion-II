import java.util.Arrays;

public class Serie {
    
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    
    private int cantTemporadas;
    private Temporada [] temporadas;

    public Serie(int cantTemporadas) {

        this.titulo = "Titulo";
        this.descripcion = "Descripcion";
        this.creador = "Jorge";
        this.genero = "Accion";
        this.cantTemporadas = cantTemporadas;
        this.temporadas = new Temporada[cantTemporadas];
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCreador() {
        return creador;
    }

    public String getGenero() {
        return genero;
    }

    public int getCantTemporadas() {
        return cantTemporadas;
    }

    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCantTemporadas(int cantTemporadas) {

        if (cantTemporadas > this.cantTemporadas) {

            this.cantTemporadas = cantTemporadas;
            resizeArray(cantTemporadas);
        } else {
            System.out.println("No se puede disminuir el tamanio de un array.\n"
                                + "Cantidad actual: " + this.cantTemporadas + "\n"
                                + "Cantidad ingresada: " + cantTemporadas);
        }
    }

    //Funcionalidades
    private void resizeArray(int cantTemporadas) {

        Temporada [] newArray = new Temporada[cantTemporadas];

        for (int i = 0; i < this.temporadas.length; i++) {
            newArray[i] = this.temporadas[i];
        }
        this.temporadas = newArray;
    }

    public void addTemporada(Temporada temporada) {

        int cantTemporadasDefinidas = 0;
        for (int i = 0; i < temporadas.length; i++) {
            
            if (temporadas[i] == null) {

                temporadas[i] = temporada;
                return;
            } else {
                cantTemporadasDefinidas++;
            }
        }
        if (cantTemporadasDefinidas == temporadas.length) {
            System.out.println("Se alcanzó el límite de temporadas de la serie. Se requiere aumentar el tamanio del arreglo");
        }
    }

    public int getCantEpisodiosVistos() {

        int episodiosVistos = 0;
        for (int i = 0; i < temporadas.length; i++) {

            episodiosVistos += temporadas[i].getCantEpisodiosVistos();
        }
        return episodiosVistos;
    }

    public double getPromedio() {
        
        double suma = 0;
        double cantTemporadasValidas = 0;

        for (int i = 0; i < temporadas.length; i++) {

            if (temporadas[i] != null && temporadas[i].getPromedio() != 0) {

                suma += temporadas[i].getPromedio();
                cantTemporadasValidas++;
            }
        }
        if (cantTemporadasValidas > 0) {
            return suma / cantTemporadasValidas;
        }
        return 0;
    }

    /* public boolean isAllEpisodiosVistos() {

        for (int i = 0; i < temporadas.length; i++) {

            if (temporadas[i] != null) {
                temporadas[i].getCantEpisodiosVistos()
            }
        }
    } */

    @Override
    public String toString() {
        return "Serie [titulo=" + titulo + ", descripcion=" + descripcion + ", cantTemporadas=" + cantTemporadas + ", creador=" + creador + ", genero=" + genero + ", temporadas=" + Arrays.toString(temporadas) + "]";
    }
}
