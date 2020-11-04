//João Roberto Savini Merante RA 1886525

import javax.swing.JOptionPane;

public abstract class Aracnideos {

    private int id;
    private int pernas;
    private int quantidadeOlhos;
    private boolean peconhento;
    private String especie;
    private String cor;
    private Regiao regiao = new Regiao();

    public Aracnideos() {
        id = 0;
        pernas = 8;
        quantidadeOlhos = 0;
        peconhento = true;
        especie = "";
        cor = "";
    }

    // ========================== metodo final =====================================
    final public int getPernas() {
        return pernas;
    }

    final public void setPernas(int pernas) {
        this.pernas = pernas;
    }

    // ========================== metodos interface e exception ============================
    public int getQuantidadeOlhos() {
        return quantidadeOlhos;
    }

    public void setQuantidadeOlhos(int quantidadeOlhos) throws OlhosException {
        if ((quantidadeOlhos % 2) == 0) {
            this.quantidadeOlhos = quantidadeOlhos;
        } else {
            throw new OlhosException();
        }
    }

    // =========================== metodos ====================================
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getPeconhento() {
        return peconhento;
    }

    public void setPeconhento(boolean peconhento) {
        this.peconhento = peconhento;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Regiao getRegiao() {
        return regiao;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }

    public void peconhento() {
        JOptionPane.showMessageDialog(null, "Aracnideo peçonhento!", "Peçonhento", 1);
        //System.out.println("Aracnideo peconhento!");
    }

    // ======================== metodo abstrato ===============================
    public abstract void cacar();
}
