import java.util.ArrayList;

public class CentroComputos {
    
    private ArrayList<Computadora> computadoras;
    private ColaDeProcesos cola_procesos;

    public CentroComputos(ColaDeProcesos cola_procesos) {

        this.computadoras = new ArrayList<>();
        this.cola_procesos = cola_procesos;
    }

    //Funcionalidades
    public void ejecutarProcesos() {

        for (Computadora computadora : this.computadoras) {

            if (computadora.estaDisponible() && !this.cola_procesos.estaVacia()) {

                computadora.setProcesoEjecutado(this.cola_procesos.getPrimerProceso());
            }
        }
    }

    public void addProceso(Proceso proceso) {
        this.cola_procesos.addProceso(proceso);
    }

    public void addComputadora(Computadora computadora) {

        if (!this.computadoras.contains(computadora)) {
            this.computadoras.add(computadora);
        }
    }

    @Override
    public String toString() {
        return "CentroComputos [cola_procesos=" + cola_procesos + ", computadoras=" + computadoras + "]";
    }
}