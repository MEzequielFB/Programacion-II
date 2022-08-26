
public class Persona {
    
    private String nombre;
    private boolean asistente;
    private String telefono; //Si no se registra un telefono el valor es -1
    private String mail; //Si no se registra un mail el valor es null

    public Persona() {
        this("Mateo");
    }

    public Persona(String nombre) {

        setNombre(nombre);
        setEsAsistente(false);
        setTelefono("");
        setMail(null);
    }

    public Persona(String nombre, String telefono, String mail) {

        setNombre(nombre);
        setEsAsistente(true);
        setTelefono(telefono);
        setMail(mail);
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public boolean isEsAsistente() {
        return asistente;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getMail() {
        return mail;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEsAsistente(boolean asistente) {
        this.asistente = asistente;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + "]";
    }
}