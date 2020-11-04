//João Roberto Savini Merante RA 1886525

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Joao
 */
public class JanelaTabelaAranha extends javax.swing.JFrame {

    /**
     * Creates new form JanelaTabelaAranha
     */
    public JanelaTabelaAranha() {
        initComponents();
    }  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableAranha = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tabela Aranha");

        tableAranha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Especie", "Sub Ordem", "Qtd Olhos", "Cor", "País", "Estado", "Teia", "Peçonhento", "Veneno", "Pernas"
            }
        ));
        tableAranha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAranhaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableAranha);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1660, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tableAranhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAranhaMouseClicked
        String componente = "";
        int coluna;
        int linha = tableAranha.getSelectedRow() ;
        
        for(coluna = 0; coluna < tableAranha.getColumnCount(); coluna++){
            componente += tableAranha.getModel().getValueAt(linha, coluna).toString();
            if (coluna < (tableAranha.getColumnCount() - 1)) {
                componente += " - ";
            }
        }
        JOptionPane.showMessageDialog(null, "Aranha: " + componente, "Aranha selecionada", 1);
    }//GEN-LAST:event_tableAranhaMouseClicked

    public void showTableAranha(BancoAranha bancoAranha) {
        this.setVisible(true);
        Aranha aranha = new Aranha();
        DefaultTableModel modeloTabelaAranha = new DefaultTableModel();
        modeloTabelaAranha = (DefaultTableModel) tableAranha.getModel();
        modeloTabelaAranha.setRowCount(0);

        for (int i = 0; i < bancoAranha.getBdAranha().size(); i++) {
            try {
                aranha.setId(bancoAranha.getBdAranha().get(i).getId());
                aranha.setQuantidadeOlhos(bancoAranha.getBdAranha().get(i).getQuantidadeOlhos());
                aranha.setPeconhento(bancoAranha.getBdAranha().get(i).getPeconhento());
                aranha.setEspecie(bancoAranha.getBdAranha().get(i).getEspecie());
                aranha.setCor(bancoAranha.getBdAranha().get(i).getCor());
                aranha.getRegiao().setPais(bancoAranha.getBdAranha().get(i).getRegiao().getPais());
                aranha.getRegiao().setEstado(bancoAranha.getBdAranha().get(i).getRegiao().getEstado());
                aranha.setTeia(bancoAranha.getBdAranha().get(i).getTeia());
                aranha.setSubOrdem(bancoAranha.getBdAranha().get(i).getSubOrdem());
                aranha.setVeneno(bancoAranha.getBdAranha().get(i).getVeneno());
                aranha.setPernas(bancoAranha.getBdAranha().get(i).getPernas());
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Tipo de não aceito", "Erro no cadastro", JOptionPane.ERROR_MESSAGE);
            } catch (OlhosException oe) {
                oe.avisoOlhos();
            } catch (SubOrdemException soe) {
                soe.avisoSubOrdem();
            }

            modeloTabelaAranha.insertRow(i, new Object[]{aranha.getId(), aranha.getEspecie(),
                aranha.getSubOrdem(), aranha.getQuantidadeOlhos(), aranha.getCor(),
                aranha.getRegiao().getPais(), aranha.getRegiao().getEstado(), aranha.getTeia(),
                aranha.getPeconhento(), aranha.getVeneno(), aranha.getPernas()});

        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaTabelaAranha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaTabelaAranha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaTabelaAranha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaTabelaAranha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaTabelaAranha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableAranha;
    // End of variables declaration//GEN-END:variables
}
