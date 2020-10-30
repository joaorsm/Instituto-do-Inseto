//João Roberto Savini Merante RA 1886525

import javax.swing.JOptionPane;

public class Escorpiao extends Aracnideos implements InfoFerrao {

    private Boolean ferrao;

    public Escorpiao() {
        ferrao = true;
    }

    public void setFerrao(Boolean ferrao) {
        this.ferrao = ferrao;
    }

    public Boolean getFerrao() {
        return ferrao;
    }

    public void alerta() {
        JOptionPane.showMessageDialog(null, "Cuidado para nao ser ferroado!", "ALERTA", 0);
        //System.out.println("Cuidado para nao ser ferroado!");
    }

    // ======================== metodo abstrato na classe mae =========================
    public void cacar() {
        JOptionPane.showMessageDialog(null, "Escorpiao espera a presa escondido", "Modo de caçar", 1);
        //System.out.println("Escorpiao espera a presa escondido");
    }

    // ===================== implemento interface ==============================
    public void informativo() {
        JOptionPane.showMessageDialog(null, "Escorpioes perdem o ferrao quando ameacados a fim de sobreviver ate o acasalamento", "Informativo", 1);
        //System.out.println("Escorpioes perdem o ferrao quando ameacados a fim de sobreviver ate o acasalamento");
    }
}
