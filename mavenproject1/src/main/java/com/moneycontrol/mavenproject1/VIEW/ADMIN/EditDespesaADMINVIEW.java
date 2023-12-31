package com.moneycontrol.mavenproject1.VIEW.ADMIN;

import com.moneycontrol.mavenproject1.DAO.ProcessDAO;
import com.moneycontrol.mavenproject1.DTO.ProcessDTO;
import javax.swing.JOptionPane;

public class EditDespesaADMINVIEW extends javax.swing.JFrame {

    /**
     * Creates new form addDespesaVIEW
     */
    public EditDespesaADMINVIEW() {
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

        jComboBox1 = new javax.swing.JComboBox<>();
        parcelasTextfield = new javax.swing.JTextField();
        agenciaTextfield = new javax.swing.JTextField();
        tipo_despesaTextfield = new javax.swing.JTextField();
        parcelas_pagasTextfield = new javax.swing.JTextField();
        valor_despesaTextfield = new javax.swing.JTextField();
        despesaTextfield = new javax.swing.JTextField();
        id_despesaTextField = new javax.swing.JTextField();
        backBTN_editDespesa = new javax.swing.JButton();
        contaTextfield = new javax.swing.JTextField();
        editDespesaBTN_editDespesa = new javax.swing.JButton();
        btnBuscar_id_despesaVIEW = new javax.swing.JButton();
        id_despesa_not_enable = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bntExcluiDespesa = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

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
        parcelasTextfield.setBounds(559, 213, 425, 60);

        agenciaTextfield.setBackground(new java.awt.Color(51, 51, 51));
        agenciaTextfield.setForeground(new java.awt.Color(255, 255, 255));
        agenciaTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        agenciaTextfield.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agencia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(agenciaTextfield);
        agenciaTextfield.setBounds(6, 291, 428, 60);

        tipo_despesaTextfield.setBackground(new java.awt.Color(51, 51, 51));
        tipo_despesaTextfield.setForeground(new java.awt.Color(255, 255, 255));
        tipo_despesaTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tipo_despesaTextfield.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Digite o tipo de despesa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(tipo_despesaTextfield);
        tipo_despesaTextfield.setBounds(559, 75, 425, 60);

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
        parcelas_pagasTextfield.setBounds(559, 291, 425, 60);

        valor_despesaTextfield.setBackground(new java.awt.Color(51, 51, 51));
        valor_despesaTextfield.setForeground(new java.awt.Color(255, 255, 255));
        valor_despesaTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        valor_despesaTextfield.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Digite o valor da despesa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(valor_despesaTextfield);
        valor_despesaTextfield.setBounds(559, 147, 425, 60);

        despesaTextfield.setBackground(new java.awt.Color(51, 51, 51));
        despesaTextfield.setForeground(new java.awt.Color(255, 255, 255));
        despesaTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        despesaTextfield.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Digite sua despesa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(despesaTextfield);
        despesaTextfield.setBounds(6, 147, 425, 60);

        id_despesaTextField.setBackground(new java.awt.Color(51, 51, 51));
        id_despesaTextField.setForeground(new java.awt.Color(255, 255, 255));
        id_despesaTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID da conta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        id_despesaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_despesaTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(id_despesaTextField);
        id_despesaTextField.setBounds(14, 18, 122, 68);

        backBTN_editDespesa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backBTN_editDespesa.setText("VOLTAR");
        backBTN_editDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTN_editDespesaActionPerformed(evt);
            }
        });
        getContentPane().add(backBTN_editDespesa);
        backBTN_editDespesa.setBounds(884, 6, 100, 28);

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
        contaTextfield.setBounds(6, 213, 428, 60);

        editDespesaBTN_editDespesa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        editDespesaBTN_editDespesa.setText("CONCLUIR");
        editDespesaBTN_editDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDespesaBTN_editDespesaActionPerformed(evt);
            }
        });
        getContentPane().add(editDespesaBTN_editDespesa);
        editDespesaBTN_editDespesa.setBounds(890, 370, 120, 28);

        btnBuscar_id_despesaVIEW.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBuscar_id_despesaVIEW.setText("BUSCAR");
        btnBuscar_id_despesaVIEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar_id_despesaVIEWActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar_id_despesaVIEW);
        btnBuscar_id_despesaVIEW.setBounds(183, 12, 100, 38);

        id_despesa_not_enable.setBackground(new java.awt.Color(51, 51, 51));
        id_despesa_not_enable.setForeground(new java.awt.Color(255, 255, 255));
        id_despesa_not_enable.setEnabled(false);
        id_despesa_not_enable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_despesa_not_enableActionPerformed(evt);
            }
        });
        getContentPane().add(id_despesa_not_enable);
        id_despesa_not_enable.setBounds(240, 80, 119, 60);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID DESPESA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 90, 201, 43);

        bntExcluiDespesa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bntExcluiDespesa.setText("EXCLUIR");
        bntExcluiDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntExcluiDespesaActionPerformed(evt);
            }
        });
        getContentPane().add(bntExcluiDespesa);
        bntExcluiDespesa.setBounds(780, 370, 110, 28);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("ADICIONAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(659, 369, 120, 28);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Editar Despesas");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(317, 6, 500, 43);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\olliv\\OneDrive\\Ambiente de Trabalho\\controle imagens\\Tech Lines.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 300, 430);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\olliv\\OneDrive\\Ambiente de Trabalho\\controle imagens\\FundoPreto.jpg")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1040, 430);

        setSize(new java.awt.Dimension(1046, 432));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void parcelas_pagasTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parcelas_pagasTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parcelas_pagasTextfieldActionPerformed

    private void id_despesaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_despesaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_despesaTextFieldActionPerformed

    //BOTÃO VOLTAR
    private void backBTN_editDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTN_editDespesaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        MoneyControlADMINVIEW moneycontroladminVIEW = new MoneyControlADMINVIEW();
        moneycontroladminVIEW.setVisible(true);
    }//GEN-LAST:event_backBTN_editDespesaActionPerformed

    private void contaTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contaTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contaTextfieldActionPerformed

    private void parcelasTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parcelasTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parcelasTextfieldActionPerformed

    // BOTAO FUNÇÃO EDITAR DESPESA
    private void editDespesaBTN_editDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDespesaBTN_editDespesaActionPerformed
        // TODO add your handling code here:
        int id;
        String despesa;
        String tipo_despesa;
        String valor_despesa;
        String parcelas;
        String parcelas_pagas;
        String agencia;
        String conta;

        //pegando o texto dos imputs
        id = Integer.parseInt(id_despesa_not_enable.getText());
        despesa = despesaTextfield.getText();
        tipo_despesa = tipo_despesaTextfield.getText();
        valor_despesa = valor_despesaTextfield.getText();
        parcelas = parcelasTextfield.getText();
        parcelas_pagas = parcelas_pagasTextfield.getText();
        agencia = agenciaTextfield.getText();
        conta = contaTextfield.getText();

        //instanciando novo DTO
        ProcessDTO processDTO = new ProcessDTO();
        processDTO.setId(id);
        processDTO.setDespesa(despesa);
        processDTO.setTipo_despesa(tipo_despesa);
        processDTO.setValor_despesa(valor_despesa);
        processDTO.setParcelas(parcelas);
        processDTO.setParcelas_pagas(parcelas_pagas);
        processDTO.setAgencia(agencia);
        processDTO.setConta(conta);

        //instanciando novo DAO que vai chamar a função
        ProcessDAO processDAO = new ProcessDAO();

        //chamando a função
        processDAO.editarDespesa(processDTO);

        //mensagem de sucesso
        JOptionPane.showMessageDialog(null, "despesa adicionada com sucesso");

        //limpando inputs
        id_despesaTextField.setText("");
        id_despesa_not_enable.setText("");
        despesaTextfield.setText("");
        tipo_despesaTextfield.setText("");
        valor_despesaTextfield.setText("");
        parcelasTextfield.setText("");
        parcelas_pagasTextfield.setText("");
        agenciaTextfield.setText("");
        contaTextfield.setText("");


    }//GEN-LAST:event_editDespesaBTN_editDespesaActionPerformed

    //BOTAO PESQIUISAR DESPESA PARA COMPLETAR OS INPUTS 
    private void btnBuscar_id_despesaVIEWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar_id_despesaVIEWActionPerformed
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
            id_despesa_not_enable.setText(String.valueOf(processDTO.getId()));
            despesaTextfield.setText(processDTO.getDespesa());
            tipo_despesaTextfield.setText(processDTO.getTipo_despesa());
            valor_despesaTextfield.setText(processDTO.getValor_despesa());
            parcelasTextfield.setText(processDTO.getParcelas());
            parcelas_pagasTextfield.setText(processDTO.getParcelas_pagas());
            agenciaTextfield.setText(processDTO.getAgencia());
            contaTextfield.setText(processDTO.getConta());
        }


    }//GEN-LAST:event_btnBuscar_id_despesaVIEWActionPerformed

    private void id_despesa_not_enableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_despesa_not_enableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_despesa_not_enableActionPerformed
    //BOTAO EXCLUIR DESPESA
    private void bntExcluiDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExcluiDespesaActionPerformed
        // TODO add your handling code here:
        //declarando id que vai receber o dado 
        int id_despesa;
        //covertendo o dado de string para int
        id_despesa = Integer.parseInt(id_despesa_not_enable.getText());

        //instanciando novo DTO
        ProcessDTO processDTO = new ProcessDTO();
        processDTO.setId(id_despesa);

        //instanciando DAO para  chamar a função excluir
        ProcessDAO processDAO = new ProcessDAO();
        //chamando fumção
        processDAO.excluiDespesa(processDTO);
        JOptionPane.showMessageDialog(null, "despesa excluida ciom sucesso!!");

        //limpando campos
        id_despesaTextField.setText("");
        id_despesa_not_enable.setText("");
        tipo_despesaTextfield.setText("");
        despesaTextfield.setText("");
        valor_despesaTextfield.setText("");
        contaTextfield.setText("");
        parcelasTextfield.setText("");
        agenciaTextfield.setText("");
        parcelas_pagasTextfield.setText("");
        


    }//GEN-LAST:event_bntExcluiDespesaActionPerformed
    //BOTAO ADICIONAR DEPSESA
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        AddDespesaADMINVIEW adddepsesaadminVIEW = new AddDespesaADMINVIEW();
        adddepsesaadminVIEW.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agenciaTextfield;
    private javax.swing.JButton backBTN_editDespesa;
    private javax.swing.JButton bntExcluiDespesa;
    private javax.swing.JButton btnBuscar_id_despesaVIEW;
    private javax.swing.JTextField contaTextfield;
    private javax.swing.JTextField despesaTextfield;
    private javax.swing.JButton editDespesaBTN_editDespesa;
    private javax.swing.JTextField id_despesaTextField;
    private javax.swing.JTextField id_despesa_not_enable;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField parcelasTextfield;
    private javax.swing.JTextField parcelas_pagasTextfield;
    private javax.swing.JTextField tipo_despesaTextfield;
    private javax.swing.JTextField valor_despesaTextfield;
    // End of variables declaration//GEN-END:variables
}
