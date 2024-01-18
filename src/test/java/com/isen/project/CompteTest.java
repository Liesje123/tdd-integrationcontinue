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
     * TEST SOLDE
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
     * Est-ce que le nouveau solde d'un compte est inférieur à l'ancien 
     */
    @Test
    @DisplayName("Test - compte - Est-ce que le nouveau solde est inférieur à l'ancien ")
    void inferieurSolde(){
        assertTrue(compte.contenuSoldeEstInferieur());
    }

    /*
     * Est-ce que le nouveau solde d'un compte après un retrait est négatif 
     */
    @Test
    @DisplayName("Test - compte - Est que le nouveau sole est négatif ")
    void contenuNouveauSoldeNegatif() {
        int montantRetrait = 1600;

        assertTrue(Integer.parseInt(compte.retirerSolde(montantRetrait)) < 0);
    }

}
