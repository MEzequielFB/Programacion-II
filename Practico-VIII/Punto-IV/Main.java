import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        
        Votante votante1 = new Votante("ezequiel", "41483920");
        Votante votante2 = new Votante("matias", "45382918");
        Votante votante3 = new Votante("fernanda", "374839283");
        Votante votante4 = new Votante("federico", "65749392");
        Votante votante5 = new Votante("mariana", "23748372");
        Votante votante6 = new Votante("martin", "39479281");
        Votante votante7 = new Votante("mariano", "746293829");

        Candidato candidato1 = new Candidato("esteban", "pro", "alianza");
        Candidato candidato2 = new Candidato("julian", "pj", "nosotros");
        Candidato candidato3 = new Candidato("juliana", "ucr", "radicando");

        Voto voto1 = new Voto(votante1, candidato1, LocalTime.of(11, 0, 0));
        Voto voto2 = new Voto(votante2, candidato1, LocalTime.of(11, 30, 0));
        Voto voto3 = new Voto(votante3, candidato1, LocalTime.of(9, 0, 0));

        Voto voto4 = new Voto(votante4, candidato2, LocalTime.of(15, 46, 0));

        Voto voto5 = new Voto(votante5, null, LocalTime.of(16, 0, 0));
        Voto voto6 = new Voto(votante6, null, LocalTime.of(13, 47, 0));

        Voto voto7 = new Voto(votante7, candidato3, LocalTime.of(17, 19, 0));

        Mesa mesa1 = new Mesa(1);
        Mesa mesa2 = new Mesa(2);
        Mesa mesa3 = new Mesa(3);

        mesa1.addVotante(votante1);
        mesa1.addVotante(votante2);
        mesa1.addVoto(voto1);
        mesa1.addVoto(voto2);

        mesa2.addVotante(votante3);
        mesa2.addVotante(votante4);
        mesa2.addVotante(votante5);
        mesa2.addVoto(voto3);
        mesa2.addVoto(voto4);
        mesa2.addVoto(voto5);

        mesa3.addVotante(votante6);
        mesa3.addVotante(votante7);
        mesa3.addVoto(voto6);
        mesa3.addVoto(voto7);

        Zona zona1 = new Zona("los pinares");
        Zona zona2 = new Zona("caisamar");
        Zona zona3 = new Zona("mar del plata");

        zona1.addElementoVoto(mesa1);
        zona1.addElementoVoto(mesa2);

        zona2.addElementoVoto(mesa3);

        zona3.addElementoVoto(zona1);
        zona3.addElementoVoto(zona2);

        Eleccion eleccion1 = new Eleccion();
        eleccion1.addElementoVoto(mesa1);
        eleccion1.addElementoVoto(mesa2);
        eleccion1.addElementoVoto(mesa3);
        eleccion1.addElementoVoto(zona1);
        eleccion1.addElementoVoto(zona2);

        eleccion1.addCandidato(candidato1);
        eleccion1.addCandidato(candidato2);
        eleccion1.addCandidato(candidato3);

        System.out.println("Candidatos ordenados: " + eleccion1.getCandidatosOrdenados());
        System.out.println("Porcentaje de votos del candidato1 en zona1: " + eleccion1.getPorcentajeVotosCandidatoPorElemento(zona1, candidato1));
        System.out.println("Porcentaje de votos en blanco en mesa2: " + eleccion1.getPorcentajeVotosBlancoPorElemento(mesa2));
        System.out.println("Porcentaje de votos emitidos entre las 10 y las 11 en zona3: " + eleccion1.getPorcentajeVotosHorarioPorElemento(zona3, LocalTime.of(10, 0, 0), LocalTime.of(11, 0, 0)));
        System.out.println("Cantidad de votos emitidos en mesa1: " + eleccion1.getCantidadVotosPorElemento(mesa1));
    }
}