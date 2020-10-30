//João Roberto Savini Merante RA 1886525

import java.util.ArrayList;
import java.util.List;

public class BancoEscorpiao {

    private static List<Escorpiao> bdEscorpiao = new ArrayList<Escorpiao>();
    private static Aranha aranha = new Aranha();
    private static Leitura leitura = new Leitura();

    public List<Escorpiao> getBdEscorpiao() {
        return bdEscorpiao;
    }

    public Escorpiao consultaEscorpiaoCodigo(Escorpiao escorpiao) {
        for (int i = 0; i < bdEscorpiao.size(); i++) {
            if (bdEscorpiao.get(i).getId() == escorpiao.getId()) {
                return bdEscorpiao.get(i);
            }
        }
        return null;
    }

    public void imprimirEscorpiao(Escorpiao escorpiao) {
        System.out.println();
        System.out.println("ID: " + escorpiao.getId());
        System.out.println("Pernas: " + escorpiao.getPernas());
        System.out.println("Olhos: " + escorpiao.getQuantidadeOlhos());
        System.out.println("Especie: " + escorpiao.getEspecie());
        System.out.println("Cor: " + escorpiao.getCor());
        System.out.println("Pais: " + escorpiao.getRegiao().getPais());
        System.out.println("Estado: " + escorpiao.getRegiao().getEstado());
        escorpiao.cacar();
        if (escorpiao.getPeconhento()) {
            escorpiao.peconhento();
        } else {
            System.out.println("Nao peconhento");
        }
        if (escorpiao.getFerrao()) {
            System.out.println("Possui ferrao!");
            escorpiao.alerta();
        } else {
            System.out.println("Ja perdeu o ferrao");
        }
        escorpiao.informativo();
    }

    public Escorpiao alterarEscorpiao(Escorpiao escorpiao, Escorpiao novoEscorpiao) {
        for (int i = 0; i < bdEscorpiao.size(); i++) {
            if (bdEscorpiao.get(i).getId() == escorpiao.getId()) {
                bdEscorpiao.set(i, novoEscorpiao);
                return bdEscorpiao.get(i);
            }
        }
        return null;
    }

    public Escorpiao excluirEscorpiao(Escorpiao escorpiao) {

        escorpiao = consultaEscorpiaoCodigo(escorpiao);
        if (bdEscorpiao.remove(escorpiao)) {
            return escorpiao;
        }
        return null;
    }
}
