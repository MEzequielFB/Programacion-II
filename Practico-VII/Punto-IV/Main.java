public class Main {
    public static void main(String[] args) {
        
        Ficha ficha1 = new Ficha("torta", 1, 4, 1);
        Ficha ficha2 = new Ficha("chupetin", 6, 2, 1);
        Ficha ficha3 = new Ficha("alfajor", 7, 4, 3);

        FichaEspecial fichaE1 = new FichaEspecial("toblerone", 12, 6);

        Tablero tablero1 = new Tablero(15);

        tablero1.addFicha(ficha1);
        tablero1.addFicha(ficha2);
        tablero1.addFicha(ficha3);
        tablero1.addFicha(fichaE1);

        FiltroPorPoderSuperior filtro1 = new FiltroPorPoderSuperior(2);
        FiltroPorTamanioSuperior filtro2 = new FiltroPorTamanioSuperior(4);
        FiltroPorFortalezaSuperior filtro3 = new FiltroPorFortalezaSuperior(5);
        FiltroOr filtro4 = new FiltroOr(filtro1, filtro2);

        System.out.println("Fichas con poder de destrucción mayor a 2: " + tablero1.buscarFichas(filtro1));
        System.out.println("Fichas con tamanio mayor a 4: " + tablero1.buscarFichas(filtro2));
        System.out.println("Fichas con fortaleza mayor a 5: " + tablero1.buscarFichas(filtro3));
        System.out.println("Poder de destrucción del toblerone: " + fichaE1.getPoderDestruccion());
        System.out.println("Fichas con poder mayor a 2 o tamanio mayor a 4: " + tablero1.buscarFichas(filtro4));
    }
}