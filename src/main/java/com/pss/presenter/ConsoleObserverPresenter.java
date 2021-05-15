/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.presenter;

import com.pss.interfaces.Observer;
import com.pss.interfaces.Subject;
import com.pss.model.ProxyImageCollection;

/**
 *
 * @author mayco
 */
public class ConsoleObserverPresenter implements Observer{

    @Override
    public void update(Subject subject) {
        ProxyImageCollection proxyCollection = (ProxyImageCollection) subject;
        int size = proxyCollection.getProxysImages().size();
        System.out.println("Exibindo miniatura da imagem " + proxyCollection.getProxysImages().get(size-1).getFileName());
    }
    
}
