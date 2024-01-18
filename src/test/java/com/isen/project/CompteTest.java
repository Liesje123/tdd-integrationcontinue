package com.isen.project;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CompteTest {

    private Compte compte;

    @BeforeEach
    void init(){
        compte = new Compte("15","1500");
    }

    /*
     * TEST LIRE LE SOLDE D'UN COMPTE
     */
    
    /*
     * Est-ce que le solde d'un compte est null 
     */
    @Test
    @DisplayName("Test - compte - Est-ce que le solde d'un compte est null ")
    void contenuSoldeNull(){
        assertFalse(compte.contenuSoldeEstNull());
    }

    /*
     * Est-ce que le solde d'un compte est négatif 
     */
    @Test
    @DisplayName("Test - compte - Est-ce que le solde d'un compte est négatif ")
    void contenuSoldeNegatif(){
        assertFalse(compte.contenuSoldeEstNegatif());
    }

    /*
     * TEST RETIRER DE L'ARGENT
     */
    @Test
    @DisplayName("Test - compte - Est-ce que le nouveau solde est inférieur à l'ancien ")
    void inferieurSolde(){
        assertTrue(compte.contenuSoldeEstInferieur());
    }

    /*
     * TEST DEPOSER DE L'ARGENT LIQUIDE
     */
    /*
     * Est-ce que si je dépose une somme, le solde du compte change ?
     */
    @Test
    @DisplayName("Test - compte - Est-ce que le nouveau solde est supérieur à l'ancien ")
    void superieurSold(){
        assertTrue(compte.contenuSoldeEstSuperieur());
    }

}
