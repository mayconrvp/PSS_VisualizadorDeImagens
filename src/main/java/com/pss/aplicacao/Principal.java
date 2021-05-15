/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.aplicacao;


import com.pss.presenter.ImagemWebPresenter;
import com.pss.presenter.PrincipalPresenter;
import java.io.IOException;

/**
 *
 * @author mayco
 */
public class Principal {
    
    public static void main(String[] args) throws IOException {
        PrincipalPresenter.getInstance();
        new ImagemWebPresenter();
    }
}