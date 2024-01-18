package com.isen.project;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CompteTest {

    private Compte compte;
    private Utilisateur banquier;
    private Utilisateur client;

    @BeforeEach
    void init(){
        compte = new Compte("15","1500");
        banquier = new Utilisateur("id","mdp",Arrays.asList("15","16","17"),"banquier");
        client = new Utilisateur("id","mdp",Arrays.asList("15","16","17"),"client");
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
     * Est-ce que si je dépose de l'argent liquide, le solde du compte change ?
     */
    @Test
    @DisplayName("Test - compte - Est-ce que le nouveau solde est supérieur à l'ancien ")
    void superieurSold(){
        assertTrue(compte.contenuSoldeEstSuperieur());
    }

    /*
     * TEST DEPOSER DE L'ARGENT EN CHEQUE
     */
    /*
     * Est-ce que je suis admin et peut déposer un chèque?
     */
    @Test
	@DisplayName("Test - compte - Est-ce que role est admin soit 'banquier' -> oui")
	void roleEstAdmin(){
		assertTrue(banquier.estRole("banquier"));
	}

     /*
     * Est-ce que je suis bien pas admin et peut déposer un chèque?
     */
    @Test
	@DisplayName("Test - compte - Est-ce que role est admin soit 'banquier' ->non")
	void roleEstPasAdmin(){
		assertFalse(client.estRole("banquier"));
	}
    /*
     * Est-ce que si je dépose en tant qu'admin un chèque, le solde du compte change ?
     */
    @Test
    @DisplayName("Test - compte - admin - Est-ce que le nouveau solde est supérieur à l'ancien ")
    void superieurSoldChequeAdmin(){
        assertTrue(compte.contenuSoldePourChequeEstSuperieur(banquier));
    }
    /*
     * Est-ce que si je dépose en tant qu'admin un chèque, le solde du compte change ?
     */
    @Test
    @DisplayName("Test - compte - client - Est-ce que le nouveau solde est supérieur à l'ancien ")
    void superieurSoldChequeClient(){
        assertFalse(compte.contenuSoldePourChequeEstSuperieur(client));
    }


}
