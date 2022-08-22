import java.util.Arrays;

public class Rectangulo {
    
    private PuntoGeometrico [] vertices;

    public Rectangulo(PuntoGeometrico v1, PuntoGeometrico v2, PuntoGeometrico v3, PuntoGeometrico v4) {

        vertices = new PuntoGeometrico[4];
        vertices[0] = v1;
        vertices[1] = v2;
        vertices[2] = v3;
        vertices[3] = v4;
    }

    /* PuntoGeometrico vertice1;
    PuntoGeometrico vertice2;
    PuntoGeometrico vertice3;
    PuntoGeometrico vertice4; */

    /* public Rectangulo(PuntoGeometrico vertice1, PuntoGeometrico vertice2, PuntoGeometrico vertice3, PuntoGeometrico vertice4) {
        
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
        this.vertice4 = vertice4;
    } */

    //Funcionalidades
    //v1y = v2y
    //v3y = v4y

    //v1x = v3x
    //v2x = v4x

    //v1y != v3y
    //v1y != v4y
    //v2y != v3y
    //v2y != v4y

    //v1x != v2x
    //v1x != v4x
    //v3x != v2x
    //v3x != v4x
    public boolean esRectangulo() {
        return ( ( vertices[0].getY() == vertices[1].getY() && vertices[2].getY() == vertices[3].getY() ) && ( vertices[0].getX() == vertices[2].getX() && vertices[1].getX() == vertices[3].getX() ) && ( vertices[0].getY() != vertices[2].getY() && vertices[0].getY() != vertices[3].getY() && vertices[1].getY() != vertices[2].getY() && vertices[1].getY() != vertices[3].getY() ) && ( vertices[0].getX() != vertices[1].getX() && vertices[0].getX() != vertices[3].getX() && vertices[2].getX() != vertices[1].getX() && vertices[2].getX() != vertices[3].getX() ) );
    }

    public void desplazarRectangulo(int valorX, int valorY) {

        for (int i = 0; i < vertices.length; i++) {
            vertices[i].desplazarPuntos(valorX, valorY);
        }
    }

    public double getArea() {
        return getBase() * getAltura();
    }

    public int esMayor(Rectangulo rectangulo) {

        double thisArea = this.getArea();
        double paramArea = rectangulo.getArea();

        if (thisArea > paramArea) {
            return 1;
        } else if (thisArea == paramArea) {
            return 0;
        }
        return -1;
    }

    public boolean esCuadrado() {
        return getBase() == getAltura();
    }

    //Guarda el lado de todos los lados, los compara y devuelve el más largo
    public double getLadoMasLargo() {
                
        double lado1 = vertices[0].getDistanciaEuclidea(vertices[1]);
        double lado2 = vertices[2].getDistanciaEuclidea(vertices[3]);
        double lado3 = vertices[0].getDistanciaEuclidea(vertices[2]);
        double lado4 = vertices[1].getDistanciaEuclidea(vertices[3]);
        double [] lados = new double[4];

        lados[0] = lado1;
        lados[1] = lado2;
        lados[2] = lado3;
        lados[3] = lado4;
        double aux = 0;

        for (int i = 0; i < lados.length; i++) {
            if (lados[i] > aux) {
                aux = lados[i];
            }
        }
        return aux;
        /* double base = getBase();
        double altura = getAltura();

        if (base > altura) {
            return base;
        } else if (base < altura) {
            return altura;
        }
        return -1; */
    }

    public boolean estaAcostado() {
        return getBase() > getAltura();
    }

    private double getBase() {
        return vertices[0].getDistanciaEuclidea(vertices[1]);        
    }

    private double getAltura() {
        return vertices[0].getDistanciaEuclidea(vertices[2]);
    }

    @Override
    public String toString() {
        return "Rectangulo [vertices=" + Arrays.toString(vertices) + "]";
    }
}