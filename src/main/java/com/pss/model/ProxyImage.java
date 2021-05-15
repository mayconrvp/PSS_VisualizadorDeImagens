/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mayco
 */
public class ProxyImage implements Image{
    
    private String fileName;
    private RealImage imagemReal;
    

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (imagemReal == null){
            try {
                imagemReal = new RealImage(fileName);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        imagemReal.display();
    } 

    public String getFileName() {
        return fileName;
    }
}