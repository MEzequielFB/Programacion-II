import java.util.ArrayList;

public class CasaEnemistada extends Casa {
 
    private ArrayList<Casa> casasEnemigas;

    public CasaEnemistada(String nombre, int maximo_alumnos) {

        super(nombre, maximo_alumnos);
        this.casasEnemigas = new ArrayList<>();
    }

    //Funcionalidades
    public void addCasaEnemiga(Casa c) {

        if (!this.casasEnemigas.contains(c) && !c.equals(this)) {

            this.casasEnemigas.add(c);
        }
    }

    @Override
    public void addAlumno(Alumno a, Hogwarts h) { //Ademas de las condiciones de la superclase, se asegura de que el alumno a agregar no pueda ser admitido en una casa enemistada

        if (!this.alumnos.contains(a) && this.alumnos.size() <= this.getMaximoAlumnos() && a.tieneCualidadesNecesarias(this) && !a.tieneCasaAsignada(h) && h.contieneAlumno(a)) {

            for (Casa casaEnemiga : this.casasEnemigas) {

                if (a.tieneCualidadesNecesarias(casaEnemiga)) {
                    return;
                }
            }
            this.alumnos.add(a);
        }
    }
}