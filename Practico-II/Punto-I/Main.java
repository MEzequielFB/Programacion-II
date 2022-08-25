public class Main {
    public static void main(String[] args) {

        //Instancias
        Episodio e1 = new Episodio("Episodio 1 Temporada 1", "Pasan cosas");
        Episodio e2 = new Episodio("Episodio 2 Temporada 1", "Pasan cosas");
        Episodio e3 = new Episodio("Episodio 3  Temporada 1", "Pasan cosas");
        Episodio e4 = new Episodio("Episodio extra", "Pasan cosas");
        Episodio e5 = new Episodio("Episodio 2 Temporada 2", "Pasan cosas");

        Temporada t1 = new  Temporada(3);
        Temporada t2 = new  Temporada(2);
        t1.setTitulo("Temporada 1");
        t2.setTitulo("Temporada 2");

        Serie s1 = new Serie(2);

        //Funcionalidades
        //Setea nueva cantidad de episodios de una temporada
        t1.setCantEpisodios(6);

        //Calificación no válida
        e1.setCalificacion(10);
        System.out.println("Calificación: " + e1.getCalificacion());
        System.out.println("Visto: " + e1.isVisto() + "\n");

        //Agregar episodios
        System.out.println(t1.toString());
        t1.addEpisodio(e1);
        t1.addEpisodio(e2);
        t1.addEpisodio(e3);
        System.out.println(t1.toString() + "\n");

        t2.addEpisodio(e4);
        t2.addEpisodio(e5);

        //Agregar temporadas
        s1.addTemporada(t1);
        s1.addTemporada(t2);        

        //Obtener total de episodios vistos de una temporada
        e1.setVisto(true);
        e2.setVisto(true);
        System.out.println("Episodios vistos t1: " + t1.getCantEpisodiosVistos());

        //Obtener episodios vistos de una serie
        e4.setVisto(true);
        e5.setVisto(true);
        System.out.println("Episodios vistos s1: " + s1.getCantEpisodiosVistos() + "\n");

        //Obtener promedio de las calificaciones de una temporada
        e1.setCalificacion(2);
        e2.setCalificacion(5);
        e3.setCalificacion(3);
        System.out.println("Promedio de t1: " + t1.getPromedio());

        e4.setCalificacion(3);
        e5.setCalificacion(1);
        System.out.println("Promedio de t2: " + t2.getPromedio());

        //Promedio de episodios de una serie
        System.out.println("Promedio s1: " + s1.getPromedio());

        //Determinar si se vio todos los episodios de una serie
        System.out.println("Se vieron todos los episodios de s1? " + s1.areAllEpisodiosVistos());
    }
}