import java.util.ArrayList;

public class Cultivo {

    private String nombre;
    private ArrayList<Enfermedad> enfermedades_frecuentes;

    public Cultivo(String nombre) {

        this.nombre = nombre;
        this.enfermedades_frecuentes = new ArrayList<>();
    }

    //Funcionalidades
    public boolean leSirveProducto(ProductoQuimico producto_quimico) {
        
        boolean cura_enfermedad = false;
        for (Enfermedad enfermedad : this.enfermedades_frecuentes) {

            if (producto_quimico.trataEnfermedad(enfermedad)) {
                cura_enfermedad = true;
                break;
            }
        }
        return cura_enfermedad && producto_quimico.desaconsejaCultivo(this);
    }

    public void addEnfermedadFrecuente(Enfermedad enfermedad) {

        if (!this.enfermedades_frecuentes.contains(enfermedad)) {
            this.enfermedades_frecuentes.add(enfermedad);
        }
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Cultivo otroCultivo = (Cultivo) o;
            return this.getNombre().equalsIgnoreCase(otroCultivo.getNombre());
        }
        catch(Exception exc) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Cultivo [nombre=" + nombre + ", enfermedades_frecuentes=" + enfermedades_frecuentes + "]";
    }
}