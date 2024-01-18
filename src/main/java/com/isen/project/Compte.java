package com.isen.project;

import java.util.List;
import java.util.function.BooleanSupplier;

public class Compte {
    private String compte;
    private String solde;

    public Compte(String compte, String solde) {
		this.compte = compte;
		this.solde = solde;
	}

    public boolean contenuSoldeEstNull() {
        if(solde==null){
            return true;
        }
        return false;
    }

    public boolean contenuSoldeEstNegatif() {
        if(Integer.parseInt(solde)<=0){
            return true;
        }
        return false;
    }


}
