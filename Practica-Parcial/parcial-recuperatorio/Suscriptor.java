import java.util.ArrayList;

public class Suscriptor {
    
    private String nombre;
    private String apellido;
    private String email;
    private Filtro interes;
    private ArrayList<Noticia> noticias_recibidas;

    public Suscriptor(String nombre, String apellido, String email, Filtro interes) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.interes = interes;
        this.noticias_recibidas = new ArrayList<>();
    }

    //Funcionalidades
    public void addNoticia(Noticia noticia) {
        if (!this.noticias_recibidas.contains(noticia) && this.interes.cumple(noticia)) {
            this.noticias_recibidas.add(noticia);
        }
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getEmail() {
        return this.email;
    }

    public Filtro getInteres() {
        return this.interes;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setInteres(Filtro interes) {
        this.interes = interes;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Suscriptor otroSuscriptor = (Suscriptor) o;
            return this.getEmail().equalsIgnoreCase(otroSuscriptor.getEmail());
        }
        catch(Exception exc) {
            return false;
        }
    }
}