public class Episodio {
    
    public final int MIN_CALIFICACION = 1;
    public final int MAX_CALIFICACION = 5;
    public final int CALIFICACION_NO_VISTO = -1;

    private String titulo;
    private String descripcion;
    private boolean visto;
    private int calificacion; //1 a 5

    public Episodio() {
        this("Titulo", "Descripcion");
    }

    public Episodio(String titulo, String descripcion) {

        setTitulo(titulo);
        setDescripcion(descripcion);
        this.visto = false;
        this.calificacion = -1;
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isVisto() {
        return visto;
    }

    public int getCalificacion() {
        return calificacion;
    }

    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //Si se setea como 'no visto', también se setea la calificación como '-1'
    public void setVisto(boolean visto) {
        this.visto = visto;
        if (!visto) {
            setCalificacion(CALIFICACION_NO_VISTO);
        }
    }

    //Se espera un valor entre 1 y 5 o con valor -1
    public void setCalificacion(int calificacion) {

        if ((calificacion >= MIN_CALIFICACION && calificacion <= MAX_CALIFICACION) || calificacion == CALIFICACION_NO_VISTO) {

            this.calificacion = calificacion;
            if (!this.visto && calificacion >= MIN_CALIFICACION) { //Si el episodio figura como no visto pero se ingresa una calificación positiva se setea como visto
                setVisto(true);
            }
        } else {
            
            System.out.println("Calificación: " + calificacion + " no es válido. Tiene que ser entre " + MIN_CALIFICACION + " y " + MAX_CALIFICACION);
        }
    }

    //Funcionalidades

    @Override
    public String toString() {
        return "Episodio [titulo=" + titulo + ", descripcion=" + descripcion + ", calificacion=" + calificacion + ", visto=" + visto + "]";
    }
}