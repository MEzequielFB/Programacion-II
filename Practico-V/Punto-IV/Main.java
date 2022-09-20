public class Main {
    public static void main(String[] args) {

        //MDQ
        ContribuyenteSimple cs1 = new ContribuyenteSimple("Fermín", 10000);
        ContribuyenteSimple cs2 = new ContribuyenteSimple("Caterina", 10000);
        ContribuyenteSimple cs3 = new ContribuyenteSimple("Estefania", 12000);

        //Tandil
        ContribuyenteSimple cs4 = new ContribuyenteSimple("Marcelo", 5000);
        ContribuyenteComerciante cc1 = new ContribuyenteComerciante("Carlos", 15000, 100000);

        //Bahía Blanca
        ContribuyenteSimple cs5 = new ContribuyenteSimple("Esteban", 10000);
        ContribuyenteProgramador cp1 = new ContribuyenteProgramador("Ezequiel", 10000, 100000);

        //Ciudad de Cordoba
        ContribuyenteComerciante cc2 = new ContribuyenteComerciante("Carla", 5000, 50000);
        ContribuyenteComerciante cc3 = new ContribuyenteComerciante("Evelin", 2000, 10000);

        //Villa Carlos Paz
        ContribuyenteProgramador cp2 = new ContribuyenteProgramador("Facundo", 15000, 50000);

        Ciudad c1 = new Ciudad("Mar del Plata", 1000000, 40000); //Mínimo de habitantes y en déficit
        Ciudad c2 = new Ciudad("Tandil", 50000, 50000); //Está en déficit pero no se tiene en cuenta porque no cumple el mínimo de habitantes
        Ciudad c3 = new Ciudad("Bahía Blanca", 200000, 10000); //Mínimo de habitantes y sin déficit

        Ciudad c4 = new Ciudad("Ciudad de Córdoba", 100000, 30000); //Mínimo de habitantes y con déficit
        Ciudad c5 = new Ciudad("Villa Carlos Paz", 100000, 300000); //Mínimo de habitantes y con déficit

        Provincia pro1 = new Provincia("Buenos Aires");
        Provincia pro2 = new Provincia("Córdoba");

        Pais pais1 = new Pais("Argentina");

        //Agrega contribuyentes
        c1.addContribuyente(cs1);
        c1.addContribuyente(cs2);
        c1.addContribuyente(cs3);

        c2.addContribuyente(cs4);
        c2.addContribuyente(cc1);

        c3.addContribuyente(cs5);
        c3.addContribuyente(cp1);

        c4.addContribuyente(cc2);
        c4.addContribuyente(cc3);

        c5.addContribuyente(cp2);

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