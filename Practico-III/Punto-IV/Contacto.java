import java.time.LocalDate;
import java.time.Period;

public class Contacto {
 
    private String nombre;
    private String apellido;
    private LocalDate fecha_nacimiento;
    private String telefono;
    private Direccion direccion;
    private String email;

    public Contacto(String nombre, String apellido, LocalDate fecha_nacimiento, String telefono, Direccion direccion, String email) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
    }

    //Funcionalidades
    public boolean ocupanMismoEspacio(Object o) {
        return this == o;
    }

    public int getEdad() {
        return Period.between(this.fecha_nacimiento, LocalDate.now()).getYears();
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "[nombre=" + nombre + ", apellido=" + apellido + ", edad=" + this.getEdad() +  ", telefono=" + telefono + ", ciudad=" + this.direccion.getCiudad() + "]";
    }

    @Override
    public boolean equals(Object o) {

        Contacto otroContacto = (Contacto) o;

        return this.nombre.equals(otroContacto.getNombre()) && this.apellido.equals(otroContacto.getApellido()) && this.telefono.equals(otroContacto.getTelefono());
    }
}