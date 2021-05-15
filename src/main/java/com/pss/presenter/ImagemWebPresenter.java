/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.presenter;

import com.pss.view.PrincipalView;
import java.awt.MediaTracker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author mayco
 */
public class ImagemWebPresenter {
    private final PrincipalView view;
    BufferedImage img = null;

    public ImagemWebPresenter() {
        this.view = PrincipalView.getInstance();
        configuraListeners();
    }
    
    
    public void configuraListeners(){
        view.getBtnCarregar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                String url = view.getTxtUrl().getText();
                try {
                    carregarImagemWeb(url);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(view, ex.getMessage());
                }
            }
        });
        
    }
    
    public void carregarImagemWeb(String url) throws MalformedURLException, IOException{
        URL caminho = new URL(url);
        ImageIcon imagemIcon = new ImageIcon(caminho);
        while(imagemIcon.getImageLoadStatus() == MediaTracker.LOADING); 
        imagemIcon.setImage(imagemIcon.getImage().getScaledInstance(view.getImagemGrande().getWidth(), view.getImagemGrande().getWidth(), 1));
        view.getImagemGrande().setIcon(imagemIcon);
        view.setVisible(true);
    }
}
