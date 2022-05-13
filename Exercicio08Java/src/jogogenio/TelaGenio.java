/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jogogenio;


import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Cedric
 */
public class TelaGenio extends javax.swing.JFrame {

    /**
     * Creates new form TelaGenio
     */
    public TelaGenio() {
        initComponents();
        lblfrase.setText("<html>Vou pensar em um número entre <strong> 1 e 5</strong>. Tente adivinhar</html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblfrase = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblimagem = new javax.swing.JLabel();
        jnum = new javax.swing.JSpinner();
        btnPalpite = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo do genio");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblfrase.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblfrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfrase.setText("Frase");
        lblfrase.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblfrase.setName("tela"); // NOI18N
        getContentPane().add(lblfrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 180, 70));
        lblfrase.getAccessibleContext().setAccessibleDescription("tela");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ballonpq.png"))); // NOI18N
        jLabel2.setAutoscrolls(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 260, 210));

        lblimagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/geniopensando.png"))); // NOI18N
        lblimagem.setToolTipText("");
        lblimagem.setAutoscrolls(true);
        getContentPane().add(lblimagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, 322));

        jnum.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        getContentPane().add(jnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 100, 30));

        btnPalpite.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPalpite.setText("Palpite");
        btnPalpite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPalpiteActionPerformed(evt);
            }
        });
        getContentPane().add(btnPalpite, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPalpiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPalpiteActionPerformed
        // TODO add your handling code here:
        //Icon icon = new ImageIcon("//imagens//genio.png");
       int numPensado = (int) Math.floor( 1 + Math.random() * (5 - 1)); 
       int num = Integer.parseInt(jnum.getValue().toString());
       String f1 = "<html><b>ACERTOU!</html>";
       String f2 = "<html><b>Errou!</b><br> Eu pensei no número <b> " + numPensado+"</b></html>";
       String r = (num == numPensado)? f1 : f2;
       lblfrase.setFont(new Font("Tahoma", Font.PLAIN, 18));
       //lblimagem.setIcon(icon);
       lblimagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/genio.png"))); 
       lblfrase.setText(r);
       
    }//GEN-LAST:event_btnPalpiteActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGenio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPalpite;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSpinner jnum;
    private javax.swing.JLabel lblfrase;
    private javax.swing.JLabel lblimagem;
    // End of variables declaration//GEN-END:variables
}
