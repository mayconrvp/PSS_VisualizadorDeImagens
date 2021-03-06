/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.view;

import com.pss.model.ProxyImage;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author mayco
 */
public class PrincipalView extends javax.swing.JFrame {

    private static PrincipalView instance;
    
    /**
     * Creates new form PrincipalView
     */
    
    private PrincipalView(){
        initComponents();
        setLocationRelativeTo(this.getParent());        
    }
    
//    public PrincipalView() {
//        
//    }
    
    public static PrincipalView getInstance(){
        if (instance == null){
            instance = new PrincipalView();
        }
        return instance;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        iconImg2 = new javax.swing.JLabel();
        iconImg3 = new javax.swing.JLabel();
        iconImg4 = new javax.swing.JLabel();
        iconImg5 = new javax.swing.JLabel();
        iconImg1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        imagemGrande = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUrl = new javax.swing.JTextField();
        btnCarregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Visualizar últimas imagens");
        setResizable(false);

        iconImg2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        iconImg2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconImg2MouseClicked(evt);
            }
        });

        iconImg3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        iconImg3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconImg3MouseClicked(evt);
            }
        });

        iconImg4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        iconImg4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconImg4MouseClicked(evt);
            }
        });

        iconImg5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        iconImg5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconImg5MouseClicked(evt);
            }
        });

        iconImg1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconImg1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(iconImg5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(iconImg4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconImg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconImg3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(iconImg1, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iconImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(iconImg3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(iconImg4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iconImg5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Clique na miniatura para exibir");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("a imagem em alta resolução");

        imagemGrande.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        imagemGrande.setMaximumSize(new java.awt.Dimension(1280, 720));
        imagemGrande.setMinimumSize(new java.awt.Dimension(800, 600));

        jLabel3.setText("Para visualizar uma imagem da Internet, cole o URL da imagem no campo ao lado:");

        btnCarregar.setText("Carregar URL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUrl))
                    .addComponent(imagemGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 946, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(69, 69, 69))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCarregar)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagemGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarregar))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iconImg2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconImg2MouseClicked
        //new ProxyImage("Imagem2.jpg");
    }//GEN-LAST:event_iconImg2MouseClicked

    private void iconImg3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconImg3MouseClicked
        //new ProxyImage("Imagem3.jpg");
    }//GEN-LAST:event_iconImg3MouseClicked

    private void iconImg4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconImg4MouseClicked
        //new ProxyImage("Imagem4.jpg");
    }//GEN-LAST:event_iconImg4MouseClicked

    private void iconImg5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconImg5MouseClicked
        //new ProxyImage("Imagem5.jpg");
    }//GEN-LAST:event_iconImg5MouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarregar;
    private javax.swing.JLabel iconImg1;
    private javax.swing.JLabel iconImg2;
    private javax.swing.JLabel iconImg3;
    private javax.swing.JLabel iconImg4;
    private javax.swing.JLabel iconImg5;
    private javax.swing.JLabel imagemGrande;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtUrl;
    // End of variables declaration//GEN-END:variables

    

    public JLabel getIconImg2() {
        return iconImg2;
    }

    public JLabel getIconImg3() {
        return iconImg3;
    }

    public JLabel getIconImg4() {
        return iconImg4;
    }

    public JLabel getIconImg5() {
        return iconImg5;
    }

    public JLabel getImagemGrande() {
        return imagemGrande;
    }

    public JLabel getIconImg1() {
        return iconImg1;
    }

    public JButton getBtnCarregar() {
        return btnCarregar;
    }

    public JTextField getTxtUrl() {
        return txtUrl;
    }
}