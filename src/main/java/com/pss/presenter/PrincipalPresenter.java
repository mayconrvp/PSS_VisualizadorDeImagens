/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.presenter;

import com.pss.model.ProxyImage;
import com.pss.model.ProxyImageCollection;
import com.pss.view.PrincipalView;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author mayco
 */
public final class PrincipalPresenter{

    private static PrincipalPresenter instance;
    private final PrincipalView view;
    
    private ProxyImageCollection imagens = ProxyImageCollection.getInstance();
    ArrayList<JLabel> labels = new ArrayList<>();
    
    private PrincipalPresenter() throws IOException{ 
        
        view = PrincipalView.getInstance();
        registrarObservadores();
        carregarLabels();
        carregarMiniaturas();
        configuraListeners();
        view.setVisible(true);   
    }
    
    public static PrincipalPresenter getInstance() throws IOException{
        if (instance == null){
            instance = new PrincipalPresenter();
        }
        return instance;
    }
    
    
    public void carregarLabels(){
        labels.add(view.getIconImg1());
        labels.add(view.getIconImg2());
        labels.add(view.getIconImg3());
        labels.add(view.getIconImg4());
        labels.add(view.getIconImg5());       
    }
    
    public void carregarMiniaturas() throws IOException{   
        imagens.add(new ProxyImage("Imagem1.jpg"));
        imagens.add(new ProxyImage("Imagem2.jpg"));
        imagens.add(new ProxyImage("Imagem3.jpg"));
        imagens.add(new ProxyImage("Imagem4.jpg"));
        imagens.add(new ProxyImage("Imagem5.jpg"));
        int i=0;
        for (ProxyImage imagen : imagens.getProxysImages()) {
            
            ImageIcon icon = new ImageIcon(imagen.getFileName());
            icon.setImage(icon.getImage().getScaledInstance(labels.get(i).getWidth(), labels.get(i).getHeight(), 1));
            labels.get(i).setIcon(icon);
            i++;
        }
    }
    
    public void registrarObservadores(){
        ConsoleObserverPresenter ob1 = new ConsoleObserverPresenter();
        ProxyImageCollection.getInstance().registrarObservador(ob1);
    }
    
    public void configuraListeners(){
        view.getIconImg1().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                imagens.getProxysImages().get(0).display();
            }
        });
        
        view.getIconImg2().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                imagens.getProxysImages().get(1).display();
            }
        });
        
        view.getIconImg3().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                imagens.getProxysImages().get(2).display();
            }
        });
        
        view.getIconImg4().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                imagens.getProxysImages().get(3).display();
            }
        });
        
        view.getIconImg5().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                imagens.getProxysImages().get(4).display();
            }
        });
    }
}
