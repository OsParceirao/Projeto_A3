package com.moneycontrol.mavenproject1.VIEW.USUARIO;

import com.moneycontrol.mavenproject1.DAO.ProcessDAO;
import com.moneycontrol.mavenproject1.DTO.ProcessDTO;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class RelatorioUSERVIEW extends javax.swing.JFrame {

    private void relatorio() {
        //criando a classe que vai chamar a function
        ProcessDAO processDAO = new ProcessDAO();
        String nomeDespesa;
        nomeDespesa = pesquisaCursotextfieldVIEW.getText();

        List<ProcessDTO> relatorio = processDAO.tirarRelatorio(nomeDespesa);

        //criando variavel default table model para inserir content in tables
        DefaultTableModel tabelarelatorio = (DefaultTableModel) tbRelatorioVIEW.getModel();

        //limpando a tabela para nao dar duplicidade de coisas pesquisadas
        tabelarelatorio.setNumRows(0);

        //percorrendo o list relatorio e inserir na tabela
        for (ProcessDTO processDTO : relatorio)
        {
            Object[] obj = new Object[]
            {
                processDTO.getId(), //id
                processDTO.getAgencia(),//agencia
                processDTO.getConta(),//conta
                processDTO.getDespesa(),//despesa
                processDTO.getTipo_despesa(),//tipo_despesa
                processDTO.getValor_despesa(),//valor_despesa
                processDTO.getParcelas(), //parcelas
                processDTO.getParcelas_pagas()//parcelas_pagas
            };

            //retornando oobjeto array
            tabelarelatorio.addRow(obj);

        }

    }

    public RelatorioUSERVIEW() {
        initComponents();
        //chamando metodo que sempre sera executado sempre que esse formulario for executado
        relatorio();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbRelatorioVIEW = new javax.swing.JTable();
        pesquisaCursotextfieldVIEW = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RELATÓRIO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(361, 6, 230, 43);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("EDITAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(760, 500, 90, 28);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("EXCLUIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(850, 500, 100, 28);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("ADICIONAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(640, 500, 120, 28);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("VOLTAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(30, 500, 100, 27);

        tbRelatorioVIEW.setBackground(new java.awt.Color(51, 51, 51));
        tbRelatorioVIEW.setForeground(new java.awt.Color(255, 255, 255));
        tbRelatorioVIEW.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "AGENCIA", "CONTA", "DESPESA", "TIPO DE DESPESA", "VALOR DA DESPESA", "PARCELAS ", "PARCELAS PAGAS"
            }
        ));
        jScrollPane2.setViewportView(tbRelatorioVIEW);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(31, 145, 903, 339);

        pesquisaCursotextfieldVIEW.setBackground(new java.awt.Color(51, 51, 51));
        pesquisaCursotextfieldVIEW.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        pesquisaCursotextfieldVIEW.setForeground(new java.awt.Color(255, 255, 255));
        pesquisaCursotextfieldVIEW.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                pesquisaCursotextfieldVIEWCaretUpdate(evt);
            }
        });
        pesquisaCursotextfieldVIEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaCursotextfieldVIEWActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisaCursotextfieldVIEW);
        pesquisaCursotextfieldVIEW.setBounds(274, 86, 660, 41);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome da Despesa");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 80, 300, 43);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\olliv\\OneDrive\\Ambiente de Trabalho\\controle imagens\\Tech Lines.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -10, 360, 570);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\olliv\\OneDrive\\Ambiente de Trabalho\\controle imagens\\FundoPreto.jpg")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 960, 560);

        setSize(new java.awt.Dimension(965, 563));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //BOTAO ADICIONAR DESPESA
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        AddDespesaUSERVIEW adddespesaVIEW = new AddDespesaUSERVIEW();
        adddespesaVIEW.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    //BOTAO VOLTAR
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        MoneyControlUSERVIEW moneycontroluserVIEW = new MoneyControlUSERVIEW();
        moneycontroluserVIEW.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    //BOTAO EXCLUIR DESPESA
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        EditDespesaUSERVIEW editdespesaVIEW = new EditDespesaUSERVIEW();
        editdespesaVIEW.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    //BOTAO EDITAR DESPESA
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        EditDespesaUSERVIEW editdepsesaVIEW = new EditDespesaUSERVIEW();
        editdepsesaVIEW.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    private void pesquisaCursotextfieldVIEWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaCursotextfieldVIEWActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_pesquisaCursotextfieldVIEWActionPerformed

    //CAMPOD E PESQUISAR DESPESA
    private void pesquisaCursotextfieldVIEWCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_pesquisaCursotextfieldVIEWCaretUpdate
        // TODO add your handling code here:
        relatorio();
    }//GEN-LAST:event_pesquisaCursotextfieldVIEWCaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField pesquisaCursotextfieldVIEW;
    private javax.swing.JTable tbRelatorioVIEW;
    // End of variables declaration//GEN-END:variables
}
