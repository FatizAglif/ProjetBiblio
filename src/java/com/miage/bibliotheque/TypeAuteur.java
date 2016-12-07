/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miage.bibliotheque;

/**
 *
 * @author edou
 */
public enum TypeAuteur {
    PRINCIPAL(0), 
    COAUTEUR (1);
     TypeAuteur(int val){
        this.val = val;
    }
     int val; 
    
}
