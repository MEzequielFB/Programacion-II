import java.util.ArrayList;

public class CentroComputos {
    
    private ArrayList<Computadora> computadoras;
    private ArrayList<Proceso> cola_espera;

    public CentroComputos() {

        this.computadoras = new ArrayList<>();
        this.cola_espera = new ArrayList<>();
    }

    //Funcionalidades
    public void ejecutarProcesos() {

        for (Computadora computadora : this.computadoras) {

            if (computadora.estaDisponible() && !this.cola_espera.isEmpty()) {

                computadora.setProcesoEjecutado(this.cola_espera.get(0));
                this.cola_espera.remove(0);
            }
        }
    }

    private boolean tieneMayorMemoria(Proceso proceso1, Proceso proceso2) {
        return proceso1.getMemoria() > proceso2.getMemoria();
    }

    public void addProceso(Proceso nuevo_proceso) {

        if (!this.cola_espera.contains(nuevo_proceso)) {

            for (Proceso proceso : this.cola_espera) {

                if (this.tieneMayorMemoria(nuevo_proceso, proceso)) {

                    this.cola_espera.add(this.cola_espera.indexOf(proceso), nuevo_proceso);
                    return;
                }
            }
            this.cola_espera.add(nuevo_proceso);
        }
    }

    public void addComputadora(Computadora computadora) {

        if (!this.computadoras.contains(computadora)) {
            this.computadoras.add(computadora);
        }
    }

    @Override
    public String toString() {
        return "CentroComputos [cola_espera=" + cola_espera + ", computadoras=" + computadoras + "]";
    }
}