import java.util.ArrayList;

public class Celular {
    
    private String modelo;
    private ArrayList<Contacto> contactos;

    public Celular(String modelo) {

        this.modelo = modelo;
        this.contactos = new ArrayList<>();
    }

    //Funcionalidades
    public ArrayList<Contacto> getListaContactosRepetidos() { //Devuelve todos los contactos con sus repetidos
        
        ArrayList<Contacto> contactos_repetidos = new ArrayList<>();
        for (int i = 0; i < contactos.size()-1; i++) {

            for (int j = i+1; j < contactos.size(); j++) {

                if (contactos.get(i).getTelefono() == contactos.get(j).getTelefono()) {

                    if (!contactos_repetidos.contains(contactos.get(i))) {

                        contactos_repetidos.add(contactos.get(i));
                    }

                    contactos_repetidos.add(contactos.get(j));
                }
            }
        }
        return contactos_repetidos;
    }

    private double getPromedioEdadContactos() {
        
        int suma = 0;
        for (Contacto contacto : this.contactos) {

            suma += contacto.getEdad();
        }
        return (double) suma / contactos.size();
    }

    private ArrayList<Contacto> getContactosConRepetidos() { //Devuelve una lista con contactos que tienen repetidos

        ArrayList<Contacto> contactos_repetidos = new ArrayList<>();
        for (int i = 0; i < contactos.size()-1; i++) {

            for (int j = i+1; j < contactos.size(); j++) {

                if (contactos.get(i).equals(contactos.get(j)) && !contactos_repetidos.contains(contactos.get(i))) {

                    contactos_repetidos.add(contactos.get(i));
                }
            }
        }
        return contactos_repetidos;
    }

    public String getResumenContactos() {
        return "Cantidad de contactos: " + this.contactos.size() + "\n"
                + "Contactos repetidos: " + this.getContactosConRepetidos() + "\n"
                + "Promedio de edad de contactos: " + this.getPromedioEdadContactos();
    }

    public void addContacto(Contacto c) {
        contactos.add(c);
    }

    //Getters
    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return this.modelo + "[" + contactos + "]";
    }
}