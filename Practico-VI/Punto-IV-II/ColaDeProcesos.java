import java.util.ArrayList;

public abstract class ColaDeProcesos {
    
    protected ArrayList<Proceso> procesos;

    public ColaDeProcesos() {

        this.procesos = new ArrayList<>();
    }

    public boolean estaVacia() {
        return procesos.isEmpty();
    }

    public Proceso getPrimerProceso() {

        if (!this.procesos.isEmpty()) {

            return this.procesos.remove(0);
        }
        return null;
    }

    public abstract void addProceso(Proceso nuevo_proceso);

    public abstract boolean esMayor(Proceso proceso1, Proceso proceso2);

    @Override
    public String toString() {
        return "ColaDeProcesos [procesos=" + procesos + "]";
    }
}