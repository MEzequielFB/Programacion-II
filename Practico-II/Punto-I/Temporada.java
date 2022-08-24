import java.util.Arrays;

public class Temporada {
    
    private String Titulo;
    private int cantEpisodios;

    private Episodio [] episodios;

    public Temporada(int cantEpisodios) {

        this.Titulo = "Temporada";
        this.cantEpisodios = cantEpisodios;
        this.episodios = new Episodio[cantEpisodios];
    }

    //Getters
    public String getTitulo() {
        return Titulo;
    }    

    public int getCantEpisodios() {
        return cantEpisodios;
    }

    //Setters
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    //Cambia la cantidad de episodios de la temporada y crea un nuevo array con esa cantidad
    //Lo hace si la nueva cantidad es mayor a la actual
    public void setCantEpisodios(int cantEpisodios) { 

        if (cantEpisodios > this.cantEpisodios) {

            this.cantEpisodios = cantEpisodios;
            resizeArray(cantEpisodios);
        } else {
            System.out.println("No se puede disminuir el tamanio de un array.\n"
                                + "Cantidad actual: " + this.cantEpisodios + "\n"
                                + "Cantidad ingresada: " + cantEpisodios);
        }
    }

    //Funcionalidades
    //Determina el tamaño del nuevo array, copia los elementos del array actual y reemplaza el array actual por el nuevo
    private void resizeArray(int cantEpisodios) {

        Episodio [] newArray = new Episodio[cantEpisodios];

        for (int i = 0; i < this.episodios.length; i++) {
            newArray[i] = this.episodios[i];
        }
        this.episodios = newArray;
    }

    //Agrega un episodio al arreglo
    //Se crea un variable que indica la cantidad de episodios ya definidos en el arreglo
    //Si este es igual a la cantidad de episodios no se pueden agregar más episodios y se muestra un mensaje en pantalla
    public void addEpisodio(Episodio episodio) {

        int cantEpisodiosDefinidos = 0;
        for (int i = 0; i < episodios.length; i++) {
            
            if (episodios[i] == null) {
                
                episodios[i] = episodio;
                return;
            } else {
                cantEpisodiosDefinidos++;
            }
        }
        if (cantEpisodiosDefinidos == episodios.length) {
            System.out.println("Se alcanzó límite de episodios de la temporada. Se requiere aumentar el tamanio del arreglo");
        }
    }

    //Verifica que no sea null para que no dé error
    public int getCantEpisodiosVistos() {

        int episodiosVistos = 0;
        for (int i = 0; i < episodios.length; i++) {

            if (episodios[i] != null && episodios[i].isVisto()) {
                episodiosVistos++;
            }
        }
        return episodiosVistos;
    }

    public double getPromedio() {

        double suma = 0;
        double cantEpisodiosValidos = 0;

        for (int i = 0; i < episodios.length; i++) {

            if (episodios[i] != null && episodios[i].getCalificacion() >= episodios[i].MIN_CALIFICACION) {

                suma += episodios[i].getCalificacion();
                cantEpisodiosValidos++;
            }
        }
        if (cantEpisodiosValidos > 0) {
            return suma / cantEpisodiosValidos;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Temporada [Titulo=" + Titulo + ", cantEpisodios=" + cantEpisodios + ", episodios=" + Arrays.toString(episodios) + "]";
    }
}