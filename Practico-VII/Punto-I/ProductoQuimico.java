import java.util.ArrayList;

public class ProductoQuimico {
    
    private String nombre;
    private ArrayList<Cultivo> cultivos_desaconsejados;
    private ArrayList<String> patologias_que_trata;

    public ProductoQuimico(String nombre) {

        this.nombre = nombre;
        this.cultivos_desaconsejados = new ArrayList<>();
        this.patologias_que_trata = new ArrayList<>();
    }

    //Funcionalidades
    public boolean trataEnfermedad(Enfermedad enfermedad) {

        int contador = 0;
        for (String patologia : this.patologias_que_trata) {

            if (enfermedad.contienePatologia(patologia)) {
                contador++;
            }
        }
        return contador == enfermedad.getCantidadPatologias();
    }
    //Producto: patologia A - patologia B - patologia C
    //Enfermedad: patologia A - patologia B

    public boolean desaconsejaCultivo(Cultivo cultivo) {
        return this.cultivos_desaconsejados.contains(cultivo);
    }

    public void addPatologiaQueTrata(String patologia) {

        if (!this.patologias_que_trata.contains(patologia)) {
            this.patologias_que_trata.add(patologia);
        }
    }

    public void addCultivoDesaconsejado(Cultivo cultivo) {

        if (!this.cultivos_desaconsejados.contains(cultivo)) {
            this.cultivos_desaconsejados.add(cultivo);
        }
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public boolean equals(Object o) {

        try {
            ProductoQuimico otroProductoQuimico = (ProductoQuimico) o;
            return this.getNombre().equalsIgnoreCase(otroProductoQuimico.getNombre());
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "ProductoQuimico [nombre=" + nombre + /* ", cultivos_desaconsejados=" + cultivos_desaconsejados
                + ", patologias_que_trata=" + patologias_que_trata + */ "]";
    }
}