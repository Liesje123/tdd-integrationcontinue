/*
 * Copyright 2015-2023 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.isen.project;

import java.util.Arrays;
import java.util.List;
import java.util.function.BooleanSupplier;

public class Utilisateur {
	public String id;
	public String mdp;
	public String role;
	public boolean connecte;
	public List<String> comptes;
	

    public Utilisateur(String id, String mdp, List<String> comptes, String role) {
		this.id = id;
		this.mdp = mdp;
		this.comptes = comptes;
		this.role = role;
		this.connecte = false;
	}

	public boolean coupleIdentification_id(String test_id) {
        if(test_id == id){
			return true;
		}
		return false;
	}

	public boolean coupleIdentification_mdp(String test_mdp) {
        if(test_mdp == mdp){
			return true;
		}
		return false;
	}

	public boolean coupleIdentification(String test_id, String test_mdp) {
        return coupleIdentification_id(test_id)&&coupleIdentification_mdp(test_mdp);
	}


	public boolean comptesEstPasVide() {
		boolean estPasVide = false;
		if(!comptes.isEmpty()){
			estPasVide = true;
		}
		return estPasVide;
	}

	public boolean aCompte(String testCompte) {
		boolean aCompte = false;
		for (String compte : comptes){
			if (compte.equals(testCompte)){
				aCompte = true;
			}
		}
		return aCompte;
	}

	public boolean estRole(String test_role) {
		if(test_role == role){
			return true;
		}
		return false;
	}

	public boolean estConnecte() {
		return connecte;
	}

	public void seConnecter() {
        connecte = true;
    }

    public void seDeconnecter() {
        connecte = false;
    }

}
