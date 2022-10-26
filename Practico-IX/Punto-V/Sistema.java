import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sistema {
    
    private ArrayList<Comunicado> comunicados;

    public Sistema() {
        this.comunicados = new ArrayList<>();
    }

    //Funcionalidades
    public int getCantidadDeMensajesPorGrupo(Grupo grupo) {
        return grupo.getCantidadMensajes();
    }

    public ArrayList<Empleado> getListadoEmpleados(Limitacion filtro, Comparator<Empleado> comparador) {

        ArrayList<Empleado> empleados_filtrados = new ArrayList<>();
        for (Comunicado comunicado : this.comunicados) {
            empleados_filtrados.addAll(comunicado.getListadoEmpleados(filtro));
        }
        if (comparador != null) {
            Collections.sort(empleados_filtrados, comparador);
        }
        return empleados_filtrados;
    }

    public ArrayList<Empleado> getListadoEmpleados(Comparator<Empleado> comparador) {

        ArrayList<Empleado> empleados = new ArrayList<>();
        for (Comunicado comunicado : this.comunicados) {
            empleados.addAll(comunicado.getListadoEmpleados());
        }
        Collections.sort(empleados, comparador);
        return empleados;
    }

    public int getCantidadEmpleadosPorGrupo(Grupo grupo) {
        return grupo.getCantidadEmpleados();
    }

    public void addComunicado(Comunicado comunicado) {
        if (!this.comunicados.contains(comunicado)) {
            this.comunicados.add(comunicado);
        }
    }
}