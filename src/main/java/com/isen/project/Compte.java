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

    /*
     * Retirer de l'argent
     */

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

    /*
     * Déposer de l'argent liquide
     */
    public String ajouterArgent(int ajoutArgent) {
        this.solde = "" + (Integer.parseInt(this.solde)+ajoutArgent);
        return (this.solde);
    }

    public boolean contenuSoldeEstSuperieur() {
        if (Integer.parseInt(this.solde)<=Integer.parseInt(ajouterArgent(10))){
            return true;
        }
    return false;
    }

   /*
     * Déposer de l'argent d'un chèque
     */
    public boolean contenuSoldePourChequeEstSuperieur(Utilisateur utilisateur_a_verifier) {
        if ((utilisateur_a_verifier.getRole().equals("banquier"))&&(Integer.parseInt(this.solde)<=Integer.parseInt(ajouterArgent(10)))){
            return true;
        }
    return false;
    }

    public String getSolde(){
        return solde;
    }

}
