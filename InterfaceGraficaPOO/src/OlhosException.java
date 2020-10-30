//João Roberto Savini Merante RA 1886525
import javax.swing.JOptionPane;

public class OlhosException extends Exception {

    public void avisoOlhos() {
        JOptionPane.showMessageDialog(null, "Quantidade de olhos deve ser Par", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
