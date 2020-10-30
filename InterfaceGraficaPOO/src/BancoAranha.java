//João Roberto Savini Merante RA 1886525

import java.util.ArrayList;
import java.util.List;

public class BancoAranha {

    private static List<Aranha> bdAranha = new ArrayList<Aranha>();
    private static Aranha aranha = new Aranha();

    public List<Aranha> getBdAranha() {
        return bdAranha;
    }

    public Aranha consultaAranhaCodigo(Aranha aranha) {
        for (int i = 0; i < bdAranha.size(); i++) {
            if (bdAranha.get(i).getId() == aranha.getId()) {
                return bdAranha.get(i);
            }
        }
        return null;
    }
    
    public void imprimirAranha(Aranha aranha) {
        System.out.println();
        System.out.println("ID: " + aranha.getId());
        System.out.println("Pernas: " + aranha.getPernas());
        System.out.println("Olhos: " + aranha.getQuantidadeOlhos());
        System.out.println("Especie: " + aranha.getEspecie());
        System.out.println("Cor: " + aranha.getCor());
        System.out.println("Pais: " + aranha.getRegiao().getPais());
        System.out.println("Estado: " + aranha.getRegiao().getEstado());
        System.out.println("Sub ordem: " + aranha.getSubOrdem());
        if (aranha.getTeia()) {
            aranha.seda(aranha.getTeia());
        } else {
            aranha.seda(aranha.getTeia());
            aranha.seda();
        }
        aranha.cacar();
        aranha.peconhento(aranha.getPeconhento());
        if (aranha.getPeconhento()) {
            aranha.peconhento(aranha.getVeneno());
        }
    }

    public Aranha alterarAranha(Aranha aranha, Aranha novaAranha) {
        for (int i = 0; i < bdAranha.size(); i++) {
            if (bdAranha.get(i).getId() == aranha.getId()) {
                bdAranha.set(i, novaAranha);
                return bdAranha.get(i);
            }
        }
        return null;
    }

    public Aranha excluirAranha(Aranha aranha) {

        aranha = consultaAranhaCodigo(aranha);
        if (bdAranha.remove(aranha)) {
            return aranha;
        }
        return null;
    }
}
