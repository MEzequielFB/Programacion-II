import java.time.LocalDateTime;

public class Alquiler {
    
    private Socio socio;
    private Cancha cancha;
    private LocalDateTime fecha;
    private double precio_pagado;

    public Alquiler(Socio socio, Cancha cancha, LocalDateTime fecha, double precio_pagado) {
        this.socio = socio;
        this.cancha = cancha;
        this.fecha = fecha;
        this.precio_pagado = precio_pagado;
    }

    public Socio getSocio() {
        return this.socio;
    }

    public Cancha getCancha() {
        return this.cancha;
    }

    public LocalDateTime getFecha() {
        return this.fecha;
    }

    public double getPrecioPagado() {
        return this.precio_pagado;
    }

    @Override
    public boolean equals(Object o) {

        try {
            Alquiler otroAlquiler = (Alquiler) o;
            return this.getSocio().equals(otroAlquiler.getSocio()) && this.getCancha().equals(otroAlquiler.getCancha()) && this.getFecha().isEqual(otroAlquiler.getFecha());
        }
        catch(Exception exc) {
            return false;
        }
    }
}