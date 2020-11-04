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
public class MenuEscorpiao extends javax.swing.JFrame {

    private Escorpiao escorpiao = new Escorpiao();
    private BancoEscorpiao bancoEscorpiao = new BancoEscorpiao();

    /**
     * Creates new form MenuEscorpiao
     */
    public MenuEscorpiao() {
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

        rotuloId = new javax.swing.JLabel();
        caixaId = new javax.swing.JTextField();
        rotuloOlhos = new javax.swing.JLabel();
        caixaOlhos = new javax.swing.JTextField();
        rotuloEspecie = new javax.swing.JLabel();
        caixaEspecie = new javax.swing.JTextField();
        rotuloCor = new javax.swing.JLabel();
        caixaCor = new javax.swing.JTextField();
        rotuloPais = new javax.swing.JLabel();
        caixaPais = new javax.swing.JTextField();
        rotuloEstado = new javax.swing.JLabel();
        caixaEstado = new javax.swing.JTextField();
        rotuloPeconhento = new javax.swing.JLabel();
        caixaPeconhento = new javax.swing.JTextField();
        rotuloFerrao = new javax.swing.JLabel();
        caixaFerrao = new javax.swing.JTextField();
        botaoInserir = new javax.swing.JButton();
        botaoConsultar = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        botaoAtualizarTabela = new javax.swing.JButton();
        botaoAbrirTabela = new javax.swing.JButton();
        botaoAbrirLista = new javax.swing.JButton();
        botaoAbrirCombo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEscorpiao = new javax.swing.JTable();
        rotuloImageEscorpiao = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuInserirEscorpiao = new javax.swing.JMenuItem();
        menuAlterarEscorpiao = new javax.swing.JMenuItem();
        menuTabelaEscorpiao = new javax.swing.JMenuItem();
        menuListaEscorpiao = new javax.swing.JMenuItem();
        menuComboEscorpiao = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Escorpião");

        rotuloId.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        rotuloId.setText("ID:");

        rotuloOlhos.setText("Quantidade de Olhos:");

        rotuloEspecie.setText("Especie:");

        rotuloCor.setText("Cor:");

        rotuloPais.setText("País");

        rotuloEstado.setText("Estado:");

        rotuloPeconhento.setText("Peçonhento (true or false):");

        rotuloFerrao.setText("Ferrao (true or false):");

        botaoInserir.setText("Inserir");
        botaoInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirActionPerformed(evt);
            }
        });

        botaoConsultar.setText("Consultar ID");
        botaoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarActionPerformed(evt);
            }
        });

        botaoAlterar.setText("Alterar ID");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
            }
        });

        botaoExcluir.setText("Excluir ID");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botaoAtualizarTabela.setText("Atualizar Tabela");
        botaoAtualizarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarTabelaActionPerformed(evt);
            }
        });

        botaoAbrirTabela.setText("Abrir Tabela");
        botaoAbrirTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAbrirTabelaActionPerformed(evt);
            }
        });

        botaoAbrirLista.setText("Abrir Lista");
        botaoAbrirLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAbrirListaActionPerformed(evt);
            }
        });

        botaoAbrirCombo.setText("Abrir Combo Box");
        botaoAbrirCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAbrirComboActionPerformed(evt);
            }
        });

        tableEscorpiao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Especie", "Qtd Olhos", "Cor", "País", "Estado", "Peçonhento", "Ferrao", "Pernas"
            }
        ));
        tableEscorpiao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEscorpiaoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableEscorpiao);

        rotuloImageEscorpiao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/resize-16042758991790258728a6dd1190d12ca35661bfd2a196c024d3.jpg"))); // NOI18N

        jMenu1.setText("Principal");

        jMenuItem1.setText("Menu Aranha");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Escorpiao");

        menuInserirEscorpiao.setText("Inserir");
        menuInserirEscorpiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInserirEscorpiaoActionPerformed(evt);
            }
        });
        jMenu2.add(menuInserirEscorpiao);

        menuAlterarEscorpiao.setText("Alterar");
        menuAlterarEscorpiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlterarEscorpiaoActionPerformed(evt);
            }
        });
        jMenu2.add(menuAlterarEscorpiao);

        menuTabelaEscorpiao.setText("Abrir Tabela");
        menuTabelaEscorpiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTabelaEscorpiaoActionPerformed(evt);
            }
        });
        jMenu2.add(menuTabelaEscorpiao);

        menuListaEscorpiao.setText("Abrir Lista");
        menuListaEscorpiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListaEscorpiaoActionPerformed(evt);
            }
        });
        jMenu2.add(menuListaEscorpiao);

        menuComboEscorpiao.setText("Abrir Combo Box");
        menuComboEscorpiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuComboEscorpiaoActionPerformed(evt);
            }
        });
        jMenu2.add(menuComboEscorpiao);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(botaoConsultar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(botaoAlterar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoInserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(rotuloImageEscorpiao)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rotuloId, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rotuloOlhos, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(caixaId, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(caixaOlhos))
                                .addGap(18, 18, 18)
                                .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(305, 305, 305)
                                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rotuloCor, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rotuloEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rotuloPais, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rotuloEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rotuloPeconhento, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rotuloFerrao))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(caixaFerrao)
                                        .addGap(118, 118, 118))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(caixaPeconhento, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                        .addComponent(caixaPais, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(caixaCor, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(caixaEspecie)
                                        .addComponent(caixaEstado))))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(botaoAtualizarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(botaoAbrirTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(botaoAbrirLista, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(botaoAbrirCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoVoltar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
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
                            .addComponent(rotuloEstado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(caixaPeconhento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotuloPeconhento))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotuloFerrao)
                            .addComponent(caixaFerrao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoSalvar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoInserir)
                            .addComponent(rotuloId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rotuloImageEscorpiao)))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAtualizarTabela)
                    .addComponent(botaoAbrirTabela)
                    .addComponent(botaoVoltar)
                    .addComponent(botaoAbrirLista)
                    .addComponent(botaoAbrirCombo))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAtualizarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarTabelaActionPerformed
        showTableEscorpiao(bancoEscorpiao);
    }//GEN-LAST:event_botaoAtualizarTabelaActionPerformed

    public void showTableEscorpiao(BancoEscorpiao bancoEscorpiao) {
        escorpiao = new Escorpiao();
        DefaultTableModel modeloTabelaEscorpiao = new DefaultTableModel();
        modeloTabelaEscorpiao = (DefaultTableModel) tableEscorpiao.getModel();
        modeloTabelaEscorpiao.setRowCount(0);

        for (int i = 0; i < bancoEscorpiao.getBdEscorpiao().size(); i++) {
            try {
                escorpiao.setId(bancoEscorpiao.getBdEscorpiao().get(i).getId());
                escorpiao.setQuantidadeOlhos(bancoEscorpiao.getBdEscorpiao().get(i).getQuantidadeOlhos());
                escorpiao.setPeconhento(bancoEscorpiao.getBdEscorpiao().get(i).getPeconhento());
                escorpiao.setEspecie(bancoEscorpiao.getBdEscorpiao().get(i).getEspecie());
                escorpiao.setCor(bancoEscorpiao.getBdEscorpiao().get(i).getCor());
                escorpiao.getRegiao().setPais(bancoEscorpiao.getBdEscorpiao().get(i).getRegiao().getPais());
                escorpiao.getRegiao().setEstado(bancoEscorpiao.getBdEscorpiao().get(i).getRegiao().getEstado());
                escorpiao.setPernas(bancoEscorpiao.getBdEscorpiao().get(i).getPernas());
                escorpiao.setFerrao(bancoEscorpiao.getBdEscorpiao().get(i).getFerrao());
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Tipo de não aceito", "Erro no cadastro", JOptionPane.ERROR_MESSAGE);
            } catch (OlhosException oe) {
                oe.avisoOlhos();
            }
            modeloTabelaEscorpiao.insertRow(i, new Object[]{escorpiao.getId(), escorpiao.getEspecie(),
                escorpiao.getQuantidadeOlhos(), escorpiao.getCor(),
                escorpiao.getRegiao().getPais(), escorpiao.getRegiao().getEstado(),
                escorpiao.getPeconhento(), escorpiao.getFerrao(), escorpiao.getPernas()});
        }
    }

    private void botaoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarActionPerformed
        consultarEscorpiaoCodigo();
    }//GEN-LAST:event_botaoConsultarActionPerformed

    public void consultarEscorpiaoCodigo() {
        escorpiao = new Escorpiao();
        try {
            escorpiao.setId(Integer.parseInt(caixaId.getText()));
            escorpiao = bancoEscorpiao.consultaEscorpiaoCodigo(escorpiao);
            if (escorpiao != null) {
                caixaId.setText(Integer.toString(escorpiao.getId()));
                caixaOlhos.setText(Integer.toString(escorpiao.getQuantidadeOlhos()));
                caixaPeconhento.setText(Boolean.toString(escorpiao.getPeconhento()));
                caixaEspecie.setText(escorpiao.getEspecie());
                caixaCor.setText(escorpiao.getCor());
                caixaPais.setText(escorpiao.getRegiao().getPais());
                caixaEstado.setText(escorpiao.getRegiao().getEstado());
                caixaFerrao.setText(Boolean.toString(escorpiao.getFerrao()));
                escorpiao.cacar();
                if (escorpiao.getPeconhento()) {
                    escorpiao.peconhento();
                } else {
                    JOptionPane.showMessageDialog(null, "Escorpiao Nao peçonhento", "Peçonhento", 1);
                    //System.out.println("Escorpiao Nao peconhento");
                }
                if (escorpiao.getFerrao()) {
                    JOptionPane.showMessageDialog(null, " Possui Ferrão", "Estado do Ferrão", 1);
                    //System.out.println("Possui ferrao!");
                    escorpiao.alerta();
                } else {
                    JOptionPane.showMessageDialog(null, " Já perdeu o Ferrão", "Estado do Ferrão", 1);
                    //System.out.println("Ja perdeu o ferrao");
                }
                escorpiao.informativo();
            } else {
                JOptionPane.showMessageDialog(null, " Não existe um escorpião com este ID!", "Erro ao consultar", 0);
                caixaId.setText("");
                caixaId.requestFocus();
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O ID deve ser um inteiro!", "Erro de ID", JOptionPane.ERROR_MESSAGE);
            caixaId.setText("");
            caixaId.requestFocus();
        }
    }

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed
        escorpiao = new Escorpiao();
        try {
            escorpiao.setId(Integer.parseInt(caixaId.getText()));
            escorpiao = bancoEscorpiao.consultaEscorpiaoCodigo(escorpiao);
            if (escorpiao != null) {
                new AlteraEscorpiao().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Não existe uma escorpiao com este código!", "Erro", 1);
                caixaId.setText("");
                caixaId.setText("");
                caixaOlhos.setText("");
                caixaPeconhento.setText("");
                caixaEspecie.setText("");
                caixaCor.setText("");
                caixaPais.setText("");
                caixaEstado.setText("");
                caixaId.requestFocus();
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O ID deve ser inteiro", "Erro", 1);
            caixaId.setText("");
            caixaId.setText("");
            caixaOlhos.setText("");
            caixaPeconhento.setText("");
            caixaEspecie.setText("");
            caixaCor.setText("");
            caixaPais.setText("");
            caixaEstado.setText("");
            caixaId.requestFocus();
        }
    }//GEN-LAST:event_botaoAlterarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        excluirEscorpiaoCodigo();
    }//GEN-LAST:event_botaoExcluirActionPerformed

    public void excluirEscorpiaoCodigo() {
        escorpiao = new Escorpiao();
        try {
            escorpiao.setId(Integer.parseInt(caixaId.getText()));
            escorpiao = bancoEscorpiao.consultaEscorpiaoCodigo(escorpiao);
            if (escorpiao != null) {
                caixaId.setText(Integer.toString(escorpiao.getId()));
                caixaOlhos.setText(Integer.toString(escorpiao.getQuantidadeOlhos()));
                caixaPeconhento.setText(Boolean.toString(escorpiao.getPeconhento()));
                caixaEspecie.setText(escorpiao.getEspecie());
                caixaCor.setText(escorpiao.getCor());
                caixaPais.setText(escorpiao.getRegiao().getPais());
                caixaEstado.setText(escorpiao.getRegiao().getEstado());
                int resp = JOptionPane.showConfirmDialog(null, "Confirmar exclusão?", "Excluir", JOptionPane.YES_NO_CANCEL_OPTION);
                if (resp == 0) {
                    bancoEscorpiao.excluirEscorpiao(escorpiao);
                    JOptionPane.showMessageDialog(null, "Escorpiao excluída", "Exclusão", 1);
                    caixaId.setText("");
                    caixaId.setText("");
                    caixaOlhos.setText("");
                    caixaPeconhento.setText("");
                    caixaEspecie.setText("");
                    caixaCor.setText("");
                    caixaPais.setText("");
                    caixaEstado.setText("");
                    caixaId.requestFocus();
                } else {
                    caixaId.setText("");
                    caixaId.setText("");
                    caixaOlhos.setText("");
                    caixaPeconhento.setText("");
                    caixaEspecie.setText("");
                    caixaCor.setText("");
                    caixaPais.setText("");
                    caixaEstado.setText("");
                    caixaId.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, " Não existe uma escorpiao com este ID!", "Erro de Consulta", 0);
                caixaId.setText("");
                caixaId.requestFocus();
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O ID deve ser um inteiro!", "Erro de ID", JOptionPane.ERROR_MESSAGE);
            caixaId.setText("");
            caixaId.requestFocus();
        }
    }

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void tableEscorpiaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEscorpiaoMouseClicked
        String componente1 = "";
        int i;
        //int coluna;
        //int linha = tableEscorpiao.getSelectedRow();

        for (i = 0; i < tableEscorpiao.getColumnCount(); i++) {
            componente1 += tableEscorpiao.getModel().getValueAt(tableEscorpiao.getSelectedRow(), i).toString();
            if (i < (tableEscorpiao.getColumnCount() - 1)) {
                componente1 += " - ";
            }
        }
        JOptionPane.showMessageDialog(null, "Escorpiao: " + componente1, "Escorpiao selecionado", 1);
    }//GEN-LAST:event_tableEscorpiaoMouseClicked

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        caixaId.setText("");
        caixaId.setText("");
        caixaOlhos.setText("");
        caixaPeconhento.setText("");
        caixaEspecie.setText("");
        caixaCor.setText("");
        caixaPais.setText("");
        caixaEstado.setText("");
        caixaId.requestFocus();
        caixaFerrao.setText("");
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
                showTableEscorpiao(bancoEscorpiao);
            } else {
                JOptionPane.showMessageDialog(null, "Codigo ja existe", "Erro", 0);
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

    private void botaoInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirActionPerformed
        new CadastroEscorpiao().setVisible(true);
    }//GEN-LAST:event_botaoInserirActionPerformed

    private void botaoAbrirTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAbrirTabelaActionPerformed
        new JanelaTabelaEscorpiao().showTableEscorpiao(bancoEscorpiao);
    }//GEN-LAST:event_botaoAbrirTabelaActionPerformed

    private void botaoAbrirListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAbrirListaActionPerformed
        new JanelaListaEscorpiao().showListEscorpiao(bancoEscorpiao);
    }//GEN-LAST:event_botaoAbrirListaActionPerformed

    private void botaoAbrirComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAbrirComboActionPerformed
        new JanelaComboEscorpiao().showComboEscorpiao(bancoEscorpiao);
    }//GEN-LAST:event_botaoAbrirComboActionPerformed

    private void menuInserirEscorpiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInserirEscorpiaoActionPerformed
        new CadastroEscorpiao().setVisible(true);
    }//GEN-LAST:event_menuInserirEscorpiaoActionPerformed

    private void menuAlterarEscorpiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlterarEscorpiaoActionPerformed
        new AlteraEscorpiao().setVisible(true);
    }//GEN-LAST:event_menuAlterarEscorpiaoActionPerformed

    private void menuTabelaEscorpiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTabelaEscorpiaoActionPerformed
        new JanelaTabelaEscorpiao().showTableEscorpiao(bancoEscorpiao);
    }//GEN-LAST:event_menuTabelaEscorpiaoActionPerformed

    private void menuListaEscorpiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListaEscorpiaoActionPerformed
        new JanelaListaEscorpiao().showListEscorpiao(bancoEscorpiao);
    }//GEN-LAST:event_menuListaEscorpiaoActionPerformed

    private void menuComboEscorpiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuComboEscorpiaoActionPerformed
        new JanelaComboEscorpiao().showComboEscorpiao(bancoEscorpiao);
    }//GEN-LAST:event_menuComboEscorpiaoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
        new MenuAranha().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public void criarMenuEscorpiao() {
        this.setVisible(true);
        //showTableEscorpiao(bancoEscorpiao);
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
            java.util.logging.Logger.getLogger(MenuEscorpiao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuEscorpiao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuEscorpiao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuEscorpiao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuEscorpiao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAbrirCombo;
    private javax.swing.JButton botaoAbrirLista;
    private javax.swing.JButton botaoAbrirTabela;
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoAtualizarTabela;
    private javax.swing.JButton botaoConsultar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoInserir;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField caixaCor;
    private javax.swing.JTextField caixaEspecie;
    private javax.swing.JTextField caixaEstado;
    private javax.swing.JTextField caixaFerrao;
    private javax.swing.JTextField caixaId;
    private javax.swing.JTextField caixaOlhos;
    private javax.swing.JTextField caixaPais;
    private javax.swing.JTextField caixaPeconhento;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuAlterarEscorpiao;
    private javax.swing.JMenuItem menuComboEscorpiao;
    private javax.swing.JMenuItem menuInserirEscorpiao;
    private javax.swing.JMenuItem menuListaEscorpiao;
    private javax.swing.JMenuItem menuTabelaEscorpiao;
    private javax.swing.JLabel rotuloCor;
    private javax.swing.JLabel rotuloEspecie;
    private javax.swing.JLabel rotuloEstado;
    private javax.swing.JLabel rotuloFerrao;
    private javax.swing.JLabel rotuloId;
    private javax.swing.JLabel rotuloImageEscorpiao;
    private javax.swing.JLabel rotuloOlhos;
    private javax.swing.JLabel rotuloPais;
    private javax.swing.JLabel rotuloPeconhento;
    private javax.swing.JTable tableEscorpiao;
    // End of variables declaration//GEN-END:variables
}
