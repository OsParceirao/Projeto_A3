package com.moneycontrol.mavenproject1.VIEW.USUARIO;

import com.moneycontrol.mavenproject1.DAO.ProcessDAO;
import com.moneycontrol.mavenproject1.DTO.ProcessDTO;
import javax.swing.JOptionPane;

class PesquisaDespesaUSERVIEW extends javax.swing.JFrame {

    /**
     * Creates new form PesquisaDespesaVIEW
     */
    public PesquisaDespesaUSERVIEW() {
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

        PesquisaDespesaLabel = new javax.swing.JLabel();
        id_despesaTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        contaTextfield = new javax.swing.JTextField();
        agenciaTextfield = new javax.swing.JTextField();
        parcelas_pagasTextfield = new javax.swing.JTextField();
        parcelasTextfield = new javax.swing.JTextField();
        tipo_despesaTextfield = new javax.swing.JTextField();
        valor_despesaTextfield = new javax.swing.JTextField();
        despesaTextfield = new javax.swing.JTextField();
        backBTN_editDespesa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        PesquisaDespesaLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        PesquisaDespesaLabel.setForeground(new java.awt.Color(255, 255, 255));
        PesquisaDespesaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PesquisaDespesaLabel.setText("Pesquisando Despesas");
        PesquisaDespesaLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(PesquisaDespesaLabel);
        PesquisaDespesaLabel.setBounds(258, 22, 350, 43);

        id_despesaTextField.setBackground(new java.awt.Color(51, 51, 51));
        id_despesaTextField.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(id_despesaTextField);
        id_despesaTextField.setBounds(470, 90, 43, 26);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NUMERO DE IDENTIFICAÇÃO DA DESPESA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(163, 92, 300, 17);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("PESQUISAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(520, 90, 120, 28);

        contaTextfield.setBackground(new java.awt.Color(51, 51, 51));
        contaTextfield.setForeground(new java.awt.Color(255, 255, 255));
        contaTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contaTextfield.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Conta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        contaTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contaTextfieldActionPerformed(evt);
            }
        });
        getContentPane().add(contaTextfield);
        contaTextfield.setBounds(472, 276, 428, 60);

        agenciaTextfield.setBackground(new java.awt.Color(51, 51, 51));
        agenciaTextfield.setForeground(new java.awt.Color(255, 255, 255));
        agenciaTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        agenciaTextfield.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agencia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(agenciaTextfield);
        agenciaTextfield.setBounds(6, 276, 428, 60);

        parcelas_pagasTextfield.setBackground(new java.awt.Color(51, 51, 51));
        parcelas_pagasTextfield.setForeground(new java.awt.Color(255, 255, 255));
        parcelas_pagasTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        parcelas_pagasTextfield.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Parcelas Pagas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        parcelas_pagasTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parcelas_pagasTextfieldActionPerformed(evt);
            }
        });
        getContentPane().add(parcelas_pagasTextfield);
        parcelas_pagasTextfield.setBounds(6, 198, 425, 60);

        parcelasTextfield.setBackground(new java.awt.Color(51, 51, 51));
        parcelasTextfield.setForeground(new java.awt.Color(255, 255, 255));
        parcelasTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        parcelasTextfield.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Parcelas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        parcelasTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parcelasTextfieldActionPerformed(evt);
            }
        });
        getContentPane().add(parcelasTextfield);
        parcelasTextfield.setBounds(475, 198, 425, 60);

        tipo_despesaTextfield.setBackground(new java.awt.Color(51, 51, 51));
        tipo_despesaTextfield.setForeground(new java.awt.Color(255, 255, 255));
        tipo_despesaTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tipo_despesaTextfield.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Digite o tipo de despesa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(tipo_despesaTextfield);
        tipo_despesaTextfield.setBounds(6, 366, 425, 60);

        valor_despesaTextfield.setBackground(new java.awt.Color(51, 51, 51));
        valor_despesaTextfield.setForeground(new java.awt.Color(255, 255, 255));
        valor_despesaTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        valor_despesaTextfield.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Digite o valor da despesa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        valor_despesaTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor_despesaTextfieldActionPerformed(evt);
            }
        });
        getContentPane().add(valor_despesaTextfield);
        valor_despesaTextfield.setBounds(475, 120, 425, 60);

        despesaTextfield.setBackground(new java.awt.Color(51, 51, 51));
        despesaTextfield.setForeground(new java.awt.Color(255, 255, 255));
        despesaTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        despesaTextfield.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Digite sua despesa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(despesaTextfield);
        despesaTextfield.setBounds(6, 120, 425, 60);

        backBTN_editDespesa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backBTN_editDespesa.setText("VOLTAR");
        backBTN_editDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTN_editDespesaActionPerformed(evt);
            }
        });
        getContentPane().add(backBTN_editDespesa);
        backBTN_editDespesa.setBounds(746, 41, 100, 28);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\olliv\\OneDrive\\Ambiente de Trabalho\\controle imagens\\Tech Lines.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 530, 450);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\olliv\\OneDrive\\Ambiente de Trabalho\\controle imagens\\FundoPreto.jpg")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 910, 460);

        setSize(new java.awt.Dimension(920, 461));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//AÇÃO DE BUSCAR DESPESA PRA EDITAR NO BANCO
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //criando variavel que vai pesquisar no banco
        int id_despesa;

        //passando string que veio do inputs para int
        id_despesa = Integer.parseInt(id_despesaTextField.getText());

        //chamando função de pesquisar
        ProcessDAO processDAO = new ProcessDAO();
        ProcessDTO processDTO = processDAO.pesquisaDespesa(id_despesa);
        if (processDTO == null)
        {
            JOptionPane.showMessageDialog(null, "Despesa não encontrada !!!!!");
        } else
        {//preenchendo od inputs com os dados resgatados do banco    
            despesaTextfield.setText(processDTO.getDespesa());
            tipo_despesaTextfield.setText(processDTO.getTipo_despesa());
            valor_despesaTextfield.setText(processDTO.getValor_despesa());
            parcelasTextfield.setText(processDTO.getParcelas());
            parcelas_pagasTextfield.setText(processDTO.getParcelas_pagas());
            agenciaTextfield.setText(processDTO.getAgencia());
            contaTextfield.setText(processDTO.getConta());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void contaTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contaTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contaTextfieldActionPerformed

    private void parcelasTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parcelasTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parcelasTextfieldActionPerformed

    private void parcelas_pagasTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parcelas_pagasTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parcelas_pagasTextfieldActionPerformed

     //BOTAO VOLTAR PESQUISAVIEW
    private void backBTN_editDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTN_editDespesaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        MoneyControlUSERVIEW moneycontroluserVIEW = new MoneyControlUSERVIEW();
        moneycontroluserVIEW.setVisible(true);
    }//GEN-LAST:event_backBTN_editDespesaActionPerformed

    private void valor_despesaTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor_despesaTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor_despesaTextfieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PesquisaDespesaLabel;
    private javax.swing.JTextField agenciaTextfield;
    private javax.swing.JButton backBTN_editDespesa;
    private javax.swing.JTextField contaTextfield;
    private javax.swing.JTextField despesaTextfield;
    private javax.swing.JTextField id_despesaTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField parcelasTextfield;
    private javax.swing.JTextField parcelas_pagasTextfield;
    private javax.swing.JTextField tipo_despesaTextfield;
    private javax.swing.JTextField valor_despesaTextfield;
    // End of variables declaration//GEN-END:variables
}