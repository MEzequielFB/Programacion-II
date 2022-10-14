import java.util.ArrayList;

public class ExpresionBasica extends Expresion {
    
    private int numero;

    public ExpresionBasica(int numero) {
        this.numero = numero;
    }

    //Getters
    @Override
    public int getResultado() {
        return this.numero;
    }

    @Override
    public ArrayList<Integer> getNumeros() { //Se puede abstraer

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(this.numero);
        return numeros;
    }

    @Override
    public ArrayList<String> getOperadores() { //Se puede abstraer
        return new ArrayList<>();
    }

    @Override
    public String getExpresion() { 
        return this.numero + "";
    }
}