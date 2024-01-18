package com.isen.project;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class CompteTest {
    
    @Test
    void contenuSoldeNonNull(){
        Compte compte = new Compte();
        assertNotNull(compte.contenuSolde("15000"));
    }
}
