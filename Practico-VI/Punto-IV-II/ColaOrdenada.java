public abstract class ColaOrdenada extends ColaDeProcesos {
    
    @Override
    public void addProceso(Proceso nuevo_proceso) {

        if (!this.procesos.contains(nuevo_proceso)) {

            for (Proceso proceso : this.procesos) {

                if (this.esMayor(nuevo_proceso, proceso)) {

                    this.procesos.add(this.procesos.indexOf(proceso), nuevo_proceso);
                    return;
                }
            }
            this.procesos.add(nuevo_proceso);
        }
    }

    public abstract boolean esMayor(Proceso proceso1, Proceso proceso2);
}
