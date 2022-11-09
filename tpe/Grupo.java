import java.util.ArrayList;

public class Grupo extends ElementoEstudiantil implements Comparable<Grupo> {

    private ArrayList<ElementoEstudiantil> elementos;

    public Grupo(String nombre) {
        super(nombre);
        this.elementos = new ArrayList<>();
    }

    //Funcionalidades
    public void addElemento(ElementoEstudiantil elemento) {
        if (!this.elementos.contains(elemento)) {
            this.elementos.add(elemento);
        }
    }

    @Override
    public int compareTo(Grupo otroGrupo) {
        return this.getCantidadAlumnos() - otroGrupo.getCantidadAlumnos();
    }

    //Getters
    @Override
    public int getCantidadAlumnos() {
        int cantidad_alumnos = 0;
        for (ElementoEstudiantil elemento : this.elementos) {
            cantidad_alumnos += elemento.getCantidadAlumnos();
        }
        return cantidad_alumnos;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Grupo otroGrupo = (Grupo) o;
            return this.getNombre().equalsIgnoreCase(otroGrupo.getNombre());
        }
        catch(Exception exc) {
            return false;
        }
    }
}