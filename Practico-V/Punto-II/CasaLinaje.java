public class CasaLinaje extends Casa {
    
    public CasaLinaje(String nombre, int maximo_alumnos, Alumno alumno) {

        super(nombre, maximo_alumnos);
        this.alumnos.add(alumno); //Hardcodeado para tener un alumno que actúe como familiar - Normalmente esto está mal porque no pasa por un control
    }

    //Funcionalidades
    @Override
    public void addAlumno(Alumno a, Hogwarts h) {

        if (!this.alumnos.contains(a) && this.alumnos.size() <= this.getMaximoAlumnos() && a.tieneCualidadesNecesarias(this) && !a.tieneCasaAsignada(h) && h.contieneAlumno(a) && a.tieneFamiliarEnCasa(this)) {

            this.alumnos.add(a);
        }
    }
}