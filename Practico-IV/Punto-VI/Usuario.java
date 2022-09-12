public class Usuario extends Persona {
    
    private String nombre_usuario;
    private String password;

    public Usuario(String nombre, String apellido, int edad, String nombre_usuario, String password) {

        super(nombre, apellido, edad);
        this.nombre_usuario = nombre_usuario;
        this.password = password;
    }

    //Getters
    public String getNombreUsuario() {
        return nombre_usuario;
    }

    public String getPassword() {
        return password;
    }
}