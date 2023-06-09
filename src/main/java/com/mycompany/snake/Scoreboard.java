/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.snake;

/**
 *
 * @author alu10701951
 */
public class Scoreboard extends javax.swing.JPanel implements Incrementer{

    private int score;
   
    public Scoreboard() {
        initComponents();
        myInits();
    }

    public void myInits() {
        score = 0;
        lPoints.setText(String.valueOf(score));
        lName.setText(ConfigData.instance.getName());
    }
    
    @Override
    public int getScore() {
        return score;
    }

    @Override
    public void incrementScore(int increment) {
       score += increment;
       lPoints.setText(String.valueOf(score));
    }

    @Override
    public void resetScore() {
        score = 0;
        lName.setText(ConfigData.instance.getName());
        lPoints.setText("0");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lPoints = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setBackground(new java.awt.Color(198, 115, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMinimumSize(new java.awt.Dimension(98, 28));
        setPreferredSize(new java.awt.Dimension(98, 28));

        jLabel1.setText("Name:");
        add(jLabel1);
        add(lName);

        jLabel2.setText("Points:");
        add(jLabel2);
        add(lPoints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lName;
    private javax.swing.JLabel lPoints;
    // End of variables declaration//GEN-END:variables

    
}
