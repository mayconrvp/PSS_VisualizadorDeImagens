/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.model;

import com.pss.interfaces.Observer;
import com.pss.interfaces.Subject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author mayco
 */
public class ProxyImageCollection implements Subject{
    
    private static ProxyImageCollection instance;
    private final Set<Observer> observadores = new LinkedHashSet<Observer>();
    private final List<ProxyImage> proxysList= new ArrayList<>();
    
    private ProxyImageCollection(){        
    }
    
    public static ProxyImageCollection getInstance(){
        if (instance == null){
            instance = new ProxyImageCollection();
        }
        return instance;
    }
    
    public void add(ProxyImage img){
        proxysList.add(img);
        notificar();
    }
    
    public void remove(ProxyImage img){
        proxysList.remove(img);
        notificar();
    }
    
    @Override
    public void registrarObservador(Observer observer) {
        observadores.add(observer);  
    }

    @Override
    public void desregistrarObservador(Observer observer) {
        observadores.remove(observer);
    }

    @Override
    public void notificar() {
        for (Observer observer : observadores){
            observer.update(this);
        }
    }

    public Set<Observer> getObservadores() {
        return observadores;
    }

    public List<ProxyImage> getProxysImages() {
        return Collections.unmodifiableList(proxysList);
    }
    
}
