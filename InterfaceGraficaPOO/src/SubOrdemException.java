//João Roberto Savini Merante RA 1886525

import javax.swing.JOptionPane;

public class SubOrdemException extends Exception {

    public void avisoSubOrdem() {
        JOptionPane.showMessageDialog(null, "A sub ordem deve ser # Mesothelae # ou # Opisthothelae #", "Sub Ordem não existe", JOptionPane.ERROR_MESSAGE);
    }
}