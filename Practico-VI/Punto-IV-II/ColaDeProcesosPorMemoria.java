public class ColaDeProcesosPorMemoria extends ColaOrdenada {
    
    @Override
    public boolean esMayor(Proceso proceso1, Proceso proceso2) {
        return  proceso1.getMemoria() > proceso2.getMemoria();
    }
}
