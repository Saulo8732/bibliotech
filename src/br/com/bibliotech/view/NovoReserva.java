/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bibliotech.view;

import br.com.bibliotech.controller.ReservaController;
import br.com.bibliotech.controller.AlunoController;
import br.com.bibliotech.controller.FuncionarioController;
import br.com.bibliotech.controller.LivroController;
import br.com.bibliotech.controller.ProfessorController;
import br.com.bibliotech.model.Aluno;
import br.com.bibliotech.model.Funcionario;
import br.com.bibliotech.model.Livro;
import br.com.bibliotech.model.Professor;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Trinity
 */
public class NovoReserva extends javax.swing.JFrame {
    private ReservaController reservaController;
    private LivroController livroController;
    private AlunoController alunoController;
    private ProfessorController professorController;
    private boolean salvo = false;
    
    /**
     * Creates new form NovoReserva
     */
    public NovoReserva() {
        livroController = new LivroController();
        reservaController = new ReservaController();
        alunoController = new AlunoController();
        professorController = new ProfessorController();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        comboLivro = new javax.swing.JComboBox<>();
        comboUsuario = new javax.swing.JComboBox<>();
        dataEntrega = new javax.swing.JFormattedTextField();
        txtdataInicial = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(49, 81, 88));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Usuário");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Livro");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Data de inicial");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 70, -1));

        comboLivro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboLivroActionPerformed(evt);
            }
        });
        jPanel1.add(comboLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 130, -1));

        comboUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(comboUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 130, -1));

        dataEntrega.setText("    -  -  ");
        jPanel1.add(dataEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 130, 30));

        txtdataInicial.setText("    -  -  ");
        jPanel1.add(txtdataInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 130, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Data de entrega");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        String usuario = (String) comboUsuario.getSelectedItem();
        String dadosLivro = (String) comboLivro.getSelectedItem();
        String[] split = dadosLivro.split("-");
        String idLivro = split[0];
        String dataInicial = txtdataInicial.getText();
        String dataFinal = dataEntrega.getText();
        
        SimpleDateFormat formatacao = new SimpleDateFormat("dd-MM-yyyy", new Locale("pt-br"));
        String sDataAtual = formatacao.format(new Date());
        Date dataDigitada1 = null;
        Date dataDigitada2 = null;
        Date dDateAtual = null;
        try {
            dataDigitada1 = formatacao.parse(dataInicial);
            dataDigitada2 = formatacao.parse(dataFinal);
            
            dDateAtual = formatacao.parse(sDataAtual);
            
            
            long miliDataDigitada1 = dataDigitada1.getTime();
            long miliDataDigitada2 = dataDigitada2.getTime();
            long miliDataAtual = dDateAtual.getTime();
            
            
            if(dataDigitada1 != null && dDateAtual != null) {
                if(miliDataDigitada1 < miliDataAtual){
                    JOptionPane.showMessageDialog(rootPane, "A data inicial não pode ser no passado!");
                    return;
                }
            }
            if(dataDigitada2 != null && dDateAtual != null) {
                if(miliDataDigitada2 < miliDataDigitada1){
                    JOptionPane.showMessageDialog(rootPane, "A data final não pode ser menor que a inicial!");
                    return;
                }
            }
            
            
        } catch(ParseException e) {
            System.out.println(e);
        }
        
//        String[] dataSplit = dataFinal.split("-");
//        int ano = Integer.parseInt(dataSplit[0]);
//        int mes = Integer.parseInt(dataSplit[1]);
//        int dia = Integer.parseInt(dataSplit[2]);
        
//        SimpleDateFormat formatacao = new SimpleDateFormat("yyyy-MM-dd", new Locale("pt-br"));
//        String dataAtual = formatacao.format(diaAtual);
//        String[] datas = dataAtual.split("-");
//        int anoAtual = Integer.parseInt(datas[0]);
//        int mesAtual = Integer.parseInt(datas[1]);
//        int diaAtual = Integer.parseInt(datas[2]);
        formatacao = new SimpleDateFormat("yyyy-MM-dd", new Locale("pt-br"));
        if (dataDigitada1 != null) {
        dataInicial = formatacao.format(dataDigitada1);
        }
        if (dataDigitada2 != null) {
        dataFinal = formatacao.format(dataDigitada2);
        }
        
        reservaController.salvarReserva(usuario, idLivro, dataInicial, dataFinal);


        
        salvo = true;
        TelaReservas m = new TelaReservas();
        m.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        if(!salvo){
            TelaReservas m = new TelaReservas();
            m.setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        ArrayList livrosDisponiveis = livroController.listarLivrosDisponiveis();
        comboLivro.removeAllItems();
        for(int i = 0; i < livrosDisponiveis.size(); i++){
            Livro livro = (Livro) livrosDisponiveis.get(i);
            String nome = livro.getId() + "- " + livro.getNome();
            comboLivro.addItem(nome);
        }
        
        
        //USUÁRIOSSSSSS
        comboUsuario.removeAllItems();
        
        ArrayList alunosDisponiveis = alunoController.listarLoginAlunosDisponiveis();
        for(int i = 0; i < alunosDisponiveis.size(); i++){
            Aluno aluno = (Aluno) alunosDisponiveis.get(i);
            String login = aluno.getLogin();
            comboUsuario.addItem(login);
        }
        
        ArrayList professoresDisponiveis = professorController.listarLoginProfessoresDisponiveis();
        for(int i = 0; i < professoresDisponiveis.size(); i++){
            Professor professor = (Professor) professoresDisponiveis.get(i);
            String login = professor.getLogin();
            comboUsuario.addItem(login);
        }
        try{
        MaskFormatter formater = new MaskFormatter(); 
        formater.setMask("##-##-####"); 
        formater.install(dataEntrega);
        
        } catch (Exception e){
            System.out.println(e);
        }
        try{
        MaskFormatter formater = new MaskFormatter(); 
        formater.setMask("##-##-####"); 
        formater.install(txtdataInicial);
        
        } catch (Exception e){
            System.out.println(e);
        }
        
        
    }//GEN-LAST:event_formWindowActivated

    private void comboLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboLivroActionPerformed

    private void comboUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(NovoReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> comboLivro;
    private javax.swing.JComboBox<String> comboUsuario;
    private javax.swing.JFormattedTextField dataEntrega;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField txtdataInicial;
    // End of variables declaration//GEN-END:variables
}
