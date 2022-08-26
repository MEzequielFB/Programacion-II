public class Main {
    public static void main(String[] args) {

        Ciudad c1 = new Ciudad("Mar del Plata", 1000000, 500000, 200000, 10000, 750000, 1000, 1500000); //Mínimo de habitantes y en déficit
        Ciudad c2 = new Ciudad("Tandil", 50000, 250000, 175000, 40000, 10000, 25000, 1500000); //Está en déficit pero no se tiene en cuenta porque no cumple el mínimo de habitantes
        Ciudad c3 = new Ciudad("Bahía Blanca", 200000, 100000, 50000, 40000, 10000, 25000, 50000); //Mínimo de habitantes y sin déficit

        Ciudad c4 = new Ciudad("Ciudad de Córdoba", 100000, 50000, 50000, 50000, 10000, 25000, 300000); //Mínimo de habitantes y con déficit
        Ciudad c5 = new Ciudad("Villa Carlos Paz", 100000, 50000, 50000, 50000, 10000, 25000, 300000); //Mínimo de habitantes y con déficit

        Provincia pro1 = new Provincia("Buenos Aires");
        Provincia pro2 = new Provincia("Córdoba");

        Pais pais1 = new Pais("Argentina");

        //Agrega ciudades
        pro1.addCiudad(c1);
        pro1.addCiudad(c2);
        pro1.addCiudad(c3);

        pro2.addCiudad(c4);
        pro2.addCiudad(c5);

        //Agrega provincias
        pais1.addProvincia(pro1);
        pais1.addProvincia(pro2);

        //Ciudad que están en déficit en una provincia
        System.out.println("Ciudades en déficit en " + pro1.getNombre() + ": " +pro1.getCiudadesEnDeficit());
        System.out.println("Ciudades en déficit en " + pro2.getNombre() + ": " +pro2.getCiudadesEnDeficit());

        //Ciudades (con un mínimo de 100000 habitantes) que están en déficit en un país
        System.out.println("Ciudades en déficit en " + pais1.getNombre() + ": " + pais1.getCiudadesEnDeficit());

        //Provincias con mas de la mitad de las ciudades con déficit
        System.out.println("Provincias con más de la mitad de las ciudades con déficit: " + pais1.getProvinciasConMasDeLaMitadDeDeficit());
    }
}