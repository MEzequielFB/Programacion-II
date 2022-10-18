public class Main {
    public static void main(String[] args) {
        
        Ninio ninio1 = new Ninio("juan", "41859382");
        Ninio ninio2 = new Ninio("paco", "34875930");
        Ninio ninio3 = new Ninio("estefi", "45938291");
        Ninio ninio4 = new Ninio("valentin", "45963291");

        Carta carta1 = new Carta(ninio1);
        Carta carta2 = new Carta(ninio1);
        Carta carta3 = new Carta(ninio2);
        Carta carta4 = new Carta(ninio3);
        Carta carta5 = new Carta(ninio4);

        carta1.addRegalo("pelota de futbol");
        carta2.addRegalo("camiseta de boca");
        carta2.addRegalo("pc gamer");

        carta3.addRegalo("pinceles");
        carta3.addRegalo("camiseta de boca");
        carta3.addRegalo("pc gamer");

        carta4.addRegalo("pc gamer");

        carta5.addRegalo("pc gamer");
        carta5.addRegalo("pinceles");
        carta5.addRegalo("camiseta de boca");

        Buzon buzon1 = new Buzon();
        Buzon buzon2 = new Buzon();

        buzon1.addNinioBueno(ninio2);
        buzon1.addNinioBueno(ninio3);
        buzon1.addCarta(carta3);
        buzon1.addCarta(carta4);

        buzon2.addNinioBueno(ninio4);
        buzon2.addCarta(carta1);
        buzon2.addCarta(carta2);
        buzon2.addCarta(carta5);

        Zona zona1 = new Zona("tandil");
        zona1.addElementoNavidad(buzon1);
        zona1.addElementoNavidad(buzon2);

        Sistema sistema1 = new Sistema();
        sistema1.addElementoNavidad(buzon1);
        sistema1.addElementoNavidad(buzon2);
        sistema1.addElementoNavidad(zona1);

        sistema1.guardarCartas();
        System.out.println(sistema1);

        System.out.println("Cantidad de cartas recibidas en buzon1: " + sistema1.getCantCartasRecibidas(buzon1));
        System.out.println("Cantidad de cartas por camiseta de boca en buzon1: " + sistema1.getCantidadCartasPorRegalo(buzon1, "camiseta de boca"));
        System.out.println("Porcentaje de cartas con un regalo especifico en buzon1: " + sistema1.getPorcentajeCartasPorRegalo(buzon1, "pc gamer"));
        System.out.println("Cantidad de ninios malos que mandaron cartas en buzon1: " + sistema1.getCantidadNiniosMalos(buzon1));

        System.out.println();

        System.out.println("Cantidad de cartas recibidas en zona1: " + sistema1.getCantCartasRecibidas(zona1));
        System.out.println("Cantidad de cartas por camiseta de boca en buzon1: " + sistema1.getCantidadCartasPorRegalo(zona1, "camiseta de boca"));
        System.out.println("Porcentaje de cartas con un regalo especifico en zona1: " + sistema1.getPorcentajeCartasPorRegalo(zona1, "pc gamer"));
        System.out.println("Cantidad de ninios malos que mandaron cartas en zona1: " + sistema1.getCantidadNiniosMalos(zona1));
    }
}