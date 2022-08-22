public class PuntoGeometrico {
    
    private int x;
    private int y;

    public PuntoGeometrico() {
        this(0, 0);
    }

    public PuntoGeometrico(int x, int y) {
        
        this.x = x;
        this.y = y;
    }

    //Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //Funcionalidades
    public void desplazarPuntos(int valorX, int valorY) {
        x += valorX;
        y += valorY;
    }

    public double getDistanciaEuclidea(PuntoGeometrico punto2) {
        return Math.sqrt( Math.pow(x - punto2.getX(), 2) + Math.pow(y - punto2.getY(), 2) );
    }

    @Override
    public String toString() {
        return "PuntoGeometrico [x=" + x + ", y=" + y + "]";
    }
}