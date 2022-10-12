public class FiltroPorPreferencia extends Filtro {
 
    private String preferencia_buscada;

    public FiltroPorPreferencia(String preferencia_buscada) {
        this.preferencia_buscada = preferencia_buscada;
    }

    public boolean cumple(Cliente cliente) {
        return cliente.tienePreferencia(this.preferencia_buscada);
    }
}