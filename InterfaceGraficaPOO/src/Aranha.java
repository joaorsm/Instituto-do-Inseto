//João Roberto Savini Merante RA 1886525

import javax.swing.JOptionPane;

public class Aranha extends Aracnideos {

    private Boolean teia;
    private String subOrdem;
    private String veneno;

    public Aranha() {
        teia = true;
        subOrdem = "";
        veneno = "";
    }

    // ============================== metodos get/set ==============================
    public Boolean getTeia() {
        return teia;
    }

    public void setTeia(Boolean teia) {
        this.teia = teia;
    }

    public String getVeneno() {
        return veneno;
    }

    public void setVeneno(String veneno) {
        this.veneno = veneno;
    }

    // ===================== metodo abstrato na classe mãe ==========================
    public void cacar() {
        if (teia) {
            JOptionPane.showMessageDialog(null, "Aranha espera a presa se embolar na teia", "Modo de caçar", 1);
            //System.out.println("Aranha espera a presa se embolar na teia");
        } else {
            JOptionPane.showMessageDialog(null, "Aranha caça de outras formas...", "Modo de caçar", 1);
            //System.out.println("Aranha caca de outras formas...");
        }
    }

    // ================================== sobrecarga ===================================
    public void seda() {
        JOptionPane.showMessageDialog(null, "Produz seda para qualquer fim", "Finalidade da seda", 1);
        //System.out.println("Produz seda para qualquer fim");
    }

    public void seda(Boolean teia) {
        if (teia) {
            JOptionPane.showMessageDialog(null, "Produz teia", "Finalidade da seda", 1);
            //System.out.println("Finalidade da seda: Produz teia");
        } else {
            JOptionPane.showMessageDialog(null, "Nao produz teia", "Finalidade da seda", 1);
            //System.out.println("Finalidade da seda: Nao produz teia");
        }
    }

    public void peconhento(Boolean peconhento) {
        if (peconhento) {
            JOptionPane.showMessageDialog(null, "Aranha peconhenta", " Peconhento", 0);
        } else {
            JOptionPane.showMessageDialog(null, "Aranha sem veneno", " Nome do veneno invalido", 0);
        }
    }

    public void peconhento(String veneno) {
        JOptionPane.showMessageDialog(null, "O nome do veneno eh: " +veneno, " Peconhenta", 0);
        //System.out.println("O nome do veneno eh: " + veneno);
    }

    // ================================ sobrescrita e coerção ==============================
    public void peconhento() {
        System.out.println("Aranha peconhento!!!");
    }

    // ================================ exception ========================================
    public String getSubOrdem() {
        return subOrdem;
    }

    public void setSubOrdem(String subOrdem) throws SubOrdemException {
        if (subOrdem.equalsIgnoreCase("Mesothelae")) //Mesothelae Opisthothelae
        {
            this.subOrdem = subOrdem;
        } else if (subOrdem.equalsIgnoreCase("Opisthothelae")) {
            this.subOrdem = subOrdem;
        } else {
            throw new SubOrdemException();
        }
    }
}
