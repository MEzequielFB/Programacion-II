import java.time.LocalDate;
import java.util.ArrayList;

public class Link extends Elemento {

    private Elemento elemento_vinculado;

    public Link(String nombre, LocalDate fecha_creacion, LocalDate fecha_modificacion, Elemento elemento_vinculado) {
        super(nombre, fecha_creacion, fecha_modificacion);
        this.elemento_vinculado = elemento_vinculado;
    }

    //Getters
    @Override
    public ArrayList<Elemento> getElementosFiltrados(Filtro filtro) {

        ArrayList<Elemento> elementos_filtrados = new ArrayList<>();
        if (filtro.cumple(this)) {
            elementos_filtrados.add(this);
        }
        return elementos_filtrados;
    }

    public Elemento getElementoVinculado() {
        return this.elemento_vinculado;
    }

    @Override
    public int getTamanio() {
        return 1;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Link otroLink = (Link) o;
            return this.getNombre().equalsIgnoreCase(otroLink.getNombre());
        }
        catch(Exception exc) {
            return false;
        }
    }
}