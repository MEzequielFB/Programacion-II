import java.util.ArrayList;

public class Coleccion {
    
    private ArrayList<Documento> documentos;

    public Coleccion() {
        this.documentos = new ArrayList<>();
    }

    //Funcionalidades
    public ArrayList<Documento> buscarDocumentos(Filtro filtro) {

        ArrayList<Documento> documentos_filtrados = new ArrayList<>();
        for (Documento documento : this.documentos) {

            if (filtro.cumple(documento)) {
                documentos_filtrados.add(documento);
            }
        }
        return documentos_filtrados;
    }

    public void addDocumento(Documento documento) {

        if (!this.documentos.contains(documento)) {
            this.documentos.add(documento);
        }
    }
}