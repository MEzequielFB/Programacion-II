public class Main {
    public static void main(String[] args) {
        
        ExpresionBasica expresionB1 = new ExpresionBasica(5);
        ExpresionBasica expresionB2 = new ExpresionBasica(7);

        ExpresionMatematicaSuma expresionM1 = new ExpresionMatematicaSuma(expresionB1, expresionB2);
        ExpresionMatematicaMultiplicacion expresionM2 = new ExpresionMatematicaMultiplicacion(expresionB2, expresionM1);
        ExpresionMatematicaResta expresionM3 = new ExpresionMatematicaResta(expresionM2, expresionM1);

        System.out.println("Resultado b1: " + expresionB1.getResultado());
        System.out.println("Numeros b1: " + expresionB1.getNumeros());
        System.out.println("Operadores b1: " + expresionB1.getOperadores());
        System.out.println("Expresion b1: " + expresionB1.getExpresion());
        System.out.println();
        System.out.println("Resultado m2: " + expresionM2.getResultado());
        System.out.println("Numeros m2: " + expresionM2.getNumeros());
        System.out.println("Operadores m2: " + expresionM2.getOperadores());
        System.out.println("Expresion m2: " + expresionM2.getExpresion());
        System.out.println();
        System.out.println("Resultado m3: " + expresionM3.getResultado());
        System.out.println("Numeros m3: " + expresionM3.getNumeros());
        System.out.println("Operadores m3: " + expresionM3.getOperadores());
        System.out.println("Expresion m3: " + expresionM3.getExpresion());
    }
}