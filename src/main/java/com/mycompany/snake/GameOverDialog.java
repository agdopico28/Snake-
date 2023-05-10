/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.snake;

import java.awt.Frame;
import java.util.Locale;

/**
 *
 * @author alu10701951
 */
public class GameOverDialog extends javax.swing.JDialog {

    public Board board; 
    public InitGamer initGamer;
    private static OptionsDialog options;
    private Frame thisParent;
    /**
     * Creates new form GameOverDialog
     */
    public GameOverDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        thisParent = parent;
    }

    public void setHighScore(int score) {
        lHighScore.setText("" + score);
    }
    
    public void setScore(int score){
        lScore.setText(""+ score);
    }
    
    public void setName(){
        lName.setText(ConfigData.instance.getName());
    }
    
    public void setInitGamer(InitGamer initGamer){
        this.initGamer = initGamer;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bConfiguration = new javax.swing.JButton();
        bPlayAgain = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lName = new javax.swing.JLabel();
        lScore = new javax.swing.JLabel();
        lHighScore = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Highscore:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 20));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        bConfiguration.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        bConfiguration.setText("Configuration");
        bConfiguration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConfigurationActionPerformed(evt);
            }
        });
        jPanel2.add(bConfiguration, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, -1));

        bPlayAgain.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        bPlayAgain.setText("Play Again");
        bPlayAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPlayAgainActionPerformed(evt);
            }
        });
        jPanel2.add(bPlayAgain, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Score:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        lName.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lName.setForeground(new java.awt.Color(255, 255, 255));
        lName.setText("aa");
        jPanel2.add(lName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 60, 20));

        lScore.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lScore.setForeground(new java.awt.Color(255, 255, 255));
        lScore.setText("aaaaa");
        jPanel2.add(lScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        lHighScore.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lHighScore.setForeground(new java.awt.Color(255, 255, 255));
        lHighScore.setText("aaaaaa");
        jPanel2.add(lHighScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 50, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/snakeGameOver.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bPlayAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPlayAgainActionPerformed
      initGamer.initGame();
      dispose();
    }//GEN-LAST:event_bPlayAgainActionPerformed

    private void bConfigurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConfigurationActionPerformed
        dispose();
        options = new OptionsDialog(thisParent, true);
        options.setInitGamer(initGamer);
        options.setVisible(true);
        
    }//GEN-LAST:event_bConfigurationActionPerformed

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
            java.util.logging.Logger.getLogger(GameOverDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameOverDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameOverDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameOverDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GameOverDialog dialog = new GameOverDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bConfiguration;
    private javax.swing.JButton bPlayAgain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lHighScore;
    private javax.swing.JLabel lName;
    private javax.swing.JLabel lScore;
    // End of variables declaration//GEN-END:variables
}
