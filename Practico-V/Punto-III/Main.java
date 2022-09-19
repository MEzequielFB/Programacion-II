public class Main {
    public static void main(String[] args) {

        CerealCosechaGruesa ccg1 = new CerealCosechaGruesa("girasol");
        CerealCosechaFina ccf1 = new CerealCosechaFina("trigo");
        CerealPastura cp1 = new CerealPastura("alfalfa");

        Lote l1 = new Lote(30);
        Lote l2 = new Lote(50);
        Lote l3 = new Lote(50);

        Cooperativa cooperativa1 = new Cooperativa("Cooperativa los Lituanos");

        cooperativa1.addCereal(ccg1);
        cooperativa1.addCereal(ccf1);
        cooperativa1.addCereal(cp1);

        cooperativa1.addLote(l1);
        cooperativa1.addLote(l2);
        cooperativa1.addLote(l3);

        cooperativa1.addMineralPrimario("hierro");
        cooperativa1.addMineralPrimario("magnesio");

        ccg1.addMineralNecesario("azufre");
        ccg1.addMineralNecesario("cloro");

        ccf1.addMineralNecesario("potasio");

        cp1.addMineralNecesario("magnesio");

        l1.addMineral("magnesio");
        l1.addMineral("potasio");
        l1.addMineral("cloro");

        l2.addMineral("azufre");
        l2.addMineral("cloro");
        l2.addMineral("potasio");
        l2.addMineral("magnesio");

        l3.addMineral("sodio");

        System.out.println("Lotes aptos para sembrar ccf1(trigo): " + cooperativa1.getLotesAptos(ccf1));
        System.out.println("Lotes aptos para sembrar cp1(alfalfa): " + cooperativa1.getLotesAptos(cp1));
        System.out.println("");
        System.out.println("Cereales aptos para ser sembrados en l1: " + cooperativa1.getCerealesAptos(l1));
        System.out.println("Cereales aptos para ser sembrados en l2: " + cooperativa1.getCerealesAptos(l2));
        System.out.println("");
        System.out.println("l1 es especial: " + cooperativa1.loteEsEspecial(l1));
        System.out.println("l2 es especial: " + cooperativa1.loteEsEspecial(l2));
        System.out.println("l3 es especial: " + cooperativa1.loteEsEspecial(l3));
    }
}