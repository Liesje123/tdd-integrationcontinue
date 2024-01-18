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

    public String retirerSolde(int argentRetirer) {
        this.solde = "" + (Integer.parseInt(this.solde)-argentRetirer);
        return (this.solde);
    }

    public boolean contenuSoldeEstInferieur() {
        if (Integer.parseInt(this.solde)>=Integer.parseInt(retirerSolde(10))){
            return true;
        }
        return false;
    }


}
