public class Main {
    public static void main(String[] args) {

        PuntoGeometrico p1 = new PuntoGeometrico();
        PuntoGeometrico p2 = new PuntoGeometrico();
        PuntoGeometrico p3 = new PuntoGeometrico();
        PuntoGeometrico p4 = new PuntoGeometrico();

        PuntoGeometrico p5 = new PuntoGeometrico(3, 3);
        PuntoGeometrico p6 = new PuntoGeometrico(3, 0);
        PuntoGeometrico p7 = new PuntoGeometrico(0, -2);

        Rectangulo re1 = new Rectangulo(p1, p2, p3, p4); //Rectangulo
        Rectangulo re2 = new Rectangulo(p1, p5, p3, p6); //Cuadrado
        Rectangulo re3 = new Rectangulo(p1, p2, p7, p4); //NO es un rectangulo

        System.out.println("Puntos geométricos:");
        //Desplazar puntos
        p1.desplazarPuntos(0, 3);
        p2.desplazarPuntos(6, 3);
        p3.desplazarPuntos(0, 0);
        p4.desplazarPuntos(6, 0);        

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());        

        //Obtener distancia euclídea
        System.out.println("Distancia euclidea: " + p1.getDistanciaEuclidea(p2));
        System.out.println("Distancia euclidea: " + p1.getDistanciaEuclidea(p3) + "\n");

        System.out.println("Rectangulos: ");
        //Es un rectangulo
        System.out.println("Es un rectángulo? " + re1.esRectangulo());
        System.out.println("Es un rectángulo? " + re2.esRectangulo());
        System.out.println("Es un rectángulo? " + re3.esRectangulo());

        //ToString
        System.out.println(re1.toString());
        System.out.println(re2.toString());
        System.out.println(re3.toString());

        //Obtiene área
        System.out.println("Área: " + re1.getArea());
        System.out.println("Área: " + re2.getArea());
        System.out.println("Área: " + re3.getArea());

        //Es un cuadrado
        System.out.println("Es un cuadrado? " + re1.esCuadrado());
        System.out.println("Es un cuadrado? " + re2.esCuadrado());
        System.out.println("Es un cuadrado? " + re3.esCuadrado());

        //Largo del lado superior
        System.out.println("Largo del mayor lado: " + re1.getLadoMasLargo());
        System.out.println("Largo del mayor lado: " + re2.getLadoMasLargo());
        System.out.println("Largo del mayor lado: " + re3.getLadoMasLargo());

        //Está acostado o parado
        System.out.println("Está acostado? " + re1.estaAcostado());
        System.out.println("Está acostado? " + re2.estaAcostado());
        System.out.println("Está acostado? " + re3.estaAcostado());

        //Compara Rectangulos
        System.out.println("Rec1 es mayor a rec2? " + re1.esMayor(re2));
        System.out.println("Rec2 es mayor a rec1? " + re2.esMayor(re1));
        System.out.println("Rec2 es mayor a rec3? " + re2.esMayor(re3));
    }
}