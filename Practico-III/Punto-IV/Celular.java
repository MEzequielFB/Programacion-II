import java.util.ArrayList;

public class Celular {
    
    private String modelo;
    private ArrayList<Contacto> contactos;

    public Celular(String modelo) {

        this.modelo = modelo;
        this.contactos = new ArrayList<>();
    }

    //Funcionalidades
    private boolean contieneContactoConMismoEspacio(ArrayList<Contacto> lista, Contacto contactoParam) {

        for (Contacto contacto : lista) {

            if (contacto.ocupanMismoEspacio(contactoParam)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Contacto> getListaContactosRepetidos() { //Devuelve una lista con contactos que tienen repetidos

        ArrayList<Contacto> contactos_repetidos = new ArrayList<>();
        for (int i = 0; i < this.contactos.size(); i++) {

            for (int j = 0; j < this.contactos.size(); j++) {

                //Si j e i son iguales Y j e i no ocupan mismo espacio en memoria Y contactos_repetidos no contiene un contacto que contenga mismo espacio en memoria que el que se pasa por parámetro -> Se agrega el contacto a la lista de contactos repetidos
                if (this.contactos.get(i).equals(this.contactos.get(j)) && !this.contactos.get(i).ocupanMismoEspacio(this.contactos.get(j)) && !contieneContactoConMismoEspacio(contactos_repetidos, this.contactos.get(i))) {

                    contactos_repetidos.add(this.contactos.get(i));
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