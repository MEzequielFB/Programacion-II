public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("javier", "tandil", "sarmiento 123");
        Persona persona2 = new Persona("francisco", "tandil", "mitre 500");
        Persona persona3 = new Persona("cecilia", "mar del plata", "constitucion 4732");

        EnvioPaquete envioP1 = new EnvioPaquete(persona1, persona2, "sucursal", 15);
        EnvioPaquete envioP2 = new EnvioPaquete(persona1, persona2, "sucursal", 10);
        EnvioCarta envioC1 = new EnvioCarta(persona2, persona3, "domicilio");
        EnvioCarta envioC2 = new EnvioCarta(persona3, persona2, "domicilio");

        ComboPostal comboP1 = new ComboPostal();
        ComboPostal comboP2 = new ComboPostal();

        comboP1.addEnvio(envioP1);
        comboP1.addEnvio(envioP2);
        comboP1.addEnvio(envioC1);

        comboP2.addEnvio(comboP1);
        comboP2.addEnvio(envioC2);

        System.out.println(comboP1);
        System.out.println(comboP2);
        System.out.println("Cantidad de envios de comboP1: " + comboP1.getCantidadEnvios());
        System.out.println("Cantidad de envios de comboP2: " + comboP2.getCantidadEnvios());
        System.out.println("Peso comboP1: " + comboP1.getPeso());
        System.out.println("Peso de comboP2: " + comboP2.getPeso());
    }
}