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

import java.util.function.BooleanSupplier;

public class Utilisateur {
	public String id;
	public String mdp;
	public String compte;

    public Utilisateur(String id, String mdp, String compte) {
		this.id = id;
		this.mdp = mdp;
		this.compte = compte;
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

    public boolean estSolde(String test_compte) {
        if(test_compte == compte){
			return true;
		}
		return false;
    }

}
