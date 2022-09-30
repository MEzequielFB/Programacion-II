public class CentroComputos {
    
    private ColaOrdenada cola_computadoras;
    private ColaOrdenada cola_procesos;

    public CentroComputos() {
        this.cola_computadoras = new ColaOrdenada();
        this.cola_procesos = new ColaOrdenada();
    }

    //Funcionalidades
    public void ejecutarProcesos() {

        while (!cola_computadoras.estaVacia() && !cola_procesos.estaVacia()) {

            Computadora computadora = (Computadora) this.cola_computadoras.getPrimerElemento();
            if (computadora.estaDisponible()) {
                computadora.setProcesoEjecutado((Proceso) this.cola_procesos.getPrimerElemento());
            }
        }
    }

    public void addProceso(Proceso proceso) {

        if (!this.cola_procesos.contieneElemento(proceso)) {
            this.cola_procesos.addElemento(proceso);
        }
    }

    public void addComputadora(Computadora computadora) {

        if (!this.cola_computadoras.contieneElemento(computadora)) {
            this.cola_computadoras.addElemento(computadora);
        }
    }

    @Override
    public String toString() {
        return "CentroComputos [cola_procesos=" + cola_procesos + ", cola_computadoras=" + cola_computadoras + "]";
    }
}