public class TrabajoPoster extends Trabajo {
    
    public TrabajoPoster() {
        super("Poster");
    }

    //Funcionalidades
    @Override
    public boolean evaluadorEsApto(Evaluador evaluador) {

        for (String tema : this.temas) {

            if (evaluador.conoceTema(tema)) {
                return true;
            }
        }
        return false;
    }
}
