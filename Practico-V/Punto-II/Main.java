public class Main {
    public static void main(String[] args) {

        Hogwarts hogwarts = new Hogwarts();

        Casa c1 = new Casa("Esliferin", 3);
        Casa c2 = new Casa("Jafelpaf", 3);

        Alumno a1 = new Alumno("Jarri");
        Alumno a2 = new Alumno("Whisky");

        String cualidad1 = "Inteligente";
        String cualidad2 = "Valiente";
        String cualidad3 = "Honesto";
        String cualidad4 = "Hablador";

        c1.addCualidad(cualidad1);
        c1.addCualidad(cualidad2);

        c2.addCualidad(cualidad3);
        c2.addCualidad(cualidad4);

        a1.addCualidad(cualidad1);
        a1.addCualidad(cualidad2);
        a1.addCualidad(cualidad3);
        a1.addCualidad(cualidad4);

        a2.addCualidad(cualidad3);
        a2.addCualidad(cualidad4);

        hogwarts.addCasa(c1);
        hogwarts.addCasa(c2);
        hogwarts.addAlumno(a1);
        hogwarts.addAlumno(a2);

        c1.addAlumno(a1, hogwarts); //Lo agrega
        c1.addAlumno(a2, hogwarts); //No lo agrega, no tiene las cualidades

        c2.addAlumno(a1, hogwarts); //No lo agrega, ya pertenece a otra casa
        c2.addAlumno(a2, hogwarts); 

        System.out.println(c1);
        System.out.println(c2);

        //CasaLinaje
        Alumno a3 = new Alumno("Ron con coca");
        a3.addCualidad(cualidad1);
        a3.addCualidad(cualidad3);

        Alumno a4 = new Alumno("Jermaioni");
        a4.addCualidad(cualidad1);
        a4.addCualidad(cualidad3);

        a3.addFamiliar(a4);

        CasaLinaje cl1 = new CasaLinaje("Reivenclo", 2, a4);
        cl1.addCualidad(cualidad1);
        cl1.addCualidad(cualidad3);

        hogwarts.addCasa(cl1);
        hogwarts.addAlumno(a3);
        hogwarts.addAlumno(a4);

        cl1.addAlumno(a3, hogwarts);
        System.out.println(cl1);

        //CasaEnemistada
        Alumno a5 = new Alumno("Carol");
        a5.addCualidad(cualidad1);
        a5.addCualidad(cualidad4);
        a5.addCualidad(cualidad2);

        Alumno a6 = new Alumno("Christopher");
        a6.addCualidad(cualidad1);
        a6.addCualidad(cualidad4);

        CasaEnemistada ce1 = new CasaEnemistada("Grifindor", 2);
        ce1.addCualidad(cualidad1);
        ce1.addCualidad(cualidad4);
        ce1.addCasaEnemiga(c1);

        hogwarts.addCasa(ce1);
        hogwarts.addAlumno(a5);
        hogwarts.addAlumno(a6);

        ce1.addAlumno(a5, hogwarts); //No lo agrega porque es apto para Esliferin -> Casa enemiga de Grifindor
        ce1.addAlumno(a6, hogwarts);

        System.out.println(ce1);
    }
}