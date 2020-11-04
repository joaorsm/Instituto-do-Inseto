//João Roberto Savini Merante RA 1886525

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joao
 */
public class CadastroEscorpiao extends javax.swing.JFrame {

    private Escorpiao escorpiao = new Escorpiao();
    private BancoEscorpiao bancoEscorpiao = new BancoEscorpiao();
    /**
     * Creates new form CadastroEscorpiao
     */
    public CadastroEscorpiao() {
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

        caixaCor = new javax.swing.JTextField();
        rotuloPais = new javax.swing.JLabel();
        caixaPais = new javax.swing.JTextField();
        rotuloEstado = new javax.swing.JLabel();
        caixaEstado = new javax.swing.JTextField();
        botaoLimpar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        rotuloId = new javax.swing.JLabel();
        caixaId = new javax.swing.JTextField();
        rotuloOlhos = new javax.swing.JLabel();
        caixaOlhos = new javax.swing.JTextField();
        rotuloPeconhento = new javax.swing.JLabel();
        caixaPeconhento = new javax.swing.JTextField();
        rotuloEspecie = new javax.swing.JLabel();
        caixaEspecie = new javax.swing.JTextField();
        rotuloCor = new javax.swing.JLabel();
        rotuloFerrao = new javax.swing.JLabel();
        caixaFerrao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Escorpião");

        rotuloPais.setText("País");

        rotuloEstado.setText("Estado:");

        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        botaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5e.jpg"))); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        rotuloId.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        rotuloId.setText("ID:");

        rotuloOlhos.setText("Quantidade de Olhos:");

        rotuloPeconhento.setText("Peçonhento (true or false):");

        rotuloEspecie.setText("Especie:");

        rotuloCor.setText("Cor:");

        rotuloFerrao.setText("Ferrao (true or false):");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rotuloId, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rotuloOlhos, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(caixaOlhos, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(caixaId, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rotuloCor, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rotuloEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rotuloPais, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rotuloEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(caixaEspecie)
                                    .addComponent(caixaCor)
                                    .addComponent(caixaPais)
                                    .addComponent(caixaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(rotuloPeconhento, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(caixaPeconhento, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rotuloFerrao)
                        .addGap(34, 34, 34)
                        .addComponent(caixaFerrao, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(caixaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoLimpar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(caixaOlhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotuloOlhos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(caixaEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotuloEspecie))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(caixaCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotuloCor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(caixaPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotuloPais))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(caixaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotuloEstado)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(rotuloId)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixaPeconhento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotuloPeconhento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloFerrao)
                    .addComponent(caixaFerrao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        caixaId.setText("");
        caixaId.setText("");
        caixaOlhos.setText("");
        caixaPeconhento.setText("");
        caixaEspecie.setText("");
        caixaCor.setText("");
        caixaPais.setText("");
        caixaEstado.setText("");
        caixaFerrao.setText("");
        caixaId.requestFocus();
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        salvar();
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void salvar() {
        escorpiao = new Escorpiao();

        try {
            escorpiao.setId(Integer.parseInt(caixaId.getText()));
            escorpiao.setQuantidadeOlhos(Integer.parseInt(caixaOlhos.getText()));
            escorpiao.setPeconhento(Boolean.parseBoolean(caixaPeconhento.getText()));
            escorpiao.setEspecie(caixaEspecie.getText());
            escorpiao.setCor(caixaCor.getText());
            escorpiao.getRegiao().setPais(caixaPais.getText());
            escorpiao.getRegiao().setEstado(caixaEstado.getText());
            escorpiao.setFerrao(Boolean.parseBoolean(caixaFerrao.getText()));
            if (bancoEscorpiao.consultaEscorpiaoCodigo(escorpiao) == null) {
                bancoEscorpiao.getBdEscorpiao().add(escorpiao);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "ID ja existe", "Erro", 0);
                caixaId.setText("");
                caixaId.requestFocus();
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Tipo de dados não aceito", "Erro no cadastro", JOptionPane.ERROR_MESSAGE);
        } catch (OlhosException oe) {
            oe.avisoOlhos();
            caixaOlhos.setText("");
            caixaOlhos.requestFocus();
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
            java.util.logging.Logger.getLogger(CadastroEscorpiao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroEscorpiao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroEscorpiao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroEscorpiao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroEscorpiao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField caixaCor;
    private javax.swing.JTextField caixaEspecie;
    private javax.swing.JTextField caixaEstado;
    private javax.swing.JTextField caixaFerrao;
    private javax.swing.JTextField caixaId;
    private javax.swing.JTextField caixaOlhos;
    private javax.swing.JTextField caixaPais;
    private javax.swing.JTextField caixaPeconhento;
    private javax.swing.JLabel rotuloCor;
    private javax.swing.JLabel rotuloEspecie;
    private javax.swing.JLabel rotuloEstado;
    private javax.swing.JLabel rotuloFerrao;
    private javax.swing.JLabel rotuloId;
    private javax.swing.JLabel rotuloOlhos;
    private javax.swing.JLabel rotuloPais;
    private javax.swing.JLabel rotuloPeconhento;
    // End of variables declaration//GEN-END:variables
}
