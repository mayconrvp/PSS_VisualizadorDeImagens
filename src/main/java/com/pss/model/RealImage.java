/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.model;

import com.pss.view.PrincipalView;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author mayco
 */
public class RealImage implements Image{
    PrincipalView view = PrincipalView.getInstance();
    
    private String fileName;
    private ImageIcon img;
    
    ArrayList<ProxyImage> imagens = new ArrayList<>();

    public RealImage(String fileName) throws Exception{
        this.fileName = fileName;
        carregarImagem();
    }
    
    @Override
    public void display() {
        System.out.println("Exibindo imagem " + fileName);
        view.getImagemGrande().setIcon(img);
    }
    
    public void carregarImagem() throws Exception{
        System.out.println("Carregando imagem " + fileName);
        img = new ImageIcon(fileName);
        img.setImage(img.getImage().getScaledInstance(view.getImagemGrande().getWidth(), view.getImagemGrande().getHeight(), 1));
    }
}
