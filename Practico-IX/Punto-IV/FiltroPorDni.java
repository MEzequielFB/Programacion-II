public class FiltroPorDni extends Filtro {

    private String dni_buscado;

    public FiltroPorDni(String dni_buscado) {
        this.dni_buscado = dni_buscado;
    }

    @Override
    public boolean cumple(Seguro seguro) {
        return seguro.getDniDuenio().equalsIgnoreCase(this.dni_buscado);
    }
}