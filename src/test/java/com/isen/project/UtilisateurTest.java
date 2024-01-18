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

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UtilisateurTest {
	/**
	 * TEST IDENTIFICATION D'UN CLIENT (ID /MDP)
	 */
	private Utilisateur utilisateur;
	private String mauvaisMdp = "pas bon mdp";
	private String mauvaisId = "pas bon id";
	private String bonCompte="15";
	private String mauvaisCompte="25";

    @BeforeEach
    void init(){
        utilisateur = new Utilisateur("id","mdp",Arrays.asList("15","16","17"),"banquier");
    }

	/*
	 * Test de l'id du client 
	 */
	@Test
	@DisplayName("Test - utilisateur - Id est valide")
	void idEstValide(){
		assertTrue(utilisateur.coupleIdentification_id(utilisateur.id));
	}

	@Test
	@DisplayName("Test - utilisateur - Id est invalide")
	void idEstInvalide(){
		assertFalse(utilisateur.coupleIdentification_id(mauvaisId));
	}

	/*
	 * Test du mdp du client
	 */
	@Test
	@DisplayName("Test - utilisateur - mdp est valide")
	void mdpEstValide(){
		assertTrue(utilisateur.coupleIdentification_mdp(utilisateur.mdp));
	}

	@Test
	@DisplayName("Test - utilisateur - mdp est invalide")
	void mdpEstInvalide(){
		assertFalse(utilisateur.coupleIdentification_mdp(mauvaisMdp));
	}

	/*
	 * Test du couple (id+mdp) du client
	 */
	@Test
	@DisplayName("Test - utilisateur - couple id+mdp est valide")
	void coupleEstValide(){
		assertTrue(utilisateur.coupleIdentification(utilisateur.id,utilisateur.mdp));
	}

	@Test
	@DisplayName("Test - utilisateur - couple id+mdp est invalide")
	void coupleEstInvalide(){
		assertFalse(utilisateur.coupleIdentification(mauvaisId,mauvaisMdp));
	}

	/*
	 * TEST LISTER LES COMPTES D'UN CLIENT
	 */

	 /*
	  * Test Est-ce que le client possède des comptes / list compte est non nulle ? 
	  */
	@Test
	@DisplayName("Test - compte d'utilisateur - est pas vide ?")
	void compteUtilisateurEstPasVide(){
		assertTrue(utilisateur.comptesEstPasVide());
	}

	/*
	* Test Est-ce que le compte mock est dans la liste de compte client? 
	*/
	@Test
	@DisplayName("Test - compte d'utilisateur - est dans la liste de compte du client ?")
	void compteMockEstUnCompteClient(){
		assertTrue(utilisateur.aCompte(bonCompte));
	}

	@Test
	@DisplayName("Test - compte d'utilisateur - n'est pas dans la liste de compte du client ?")
	void compteMockEstPasUnCompteClient(){
		assertFalse(utilisateur.aCompte(mauvaisCompte));
	}
  
	@Test
	@DisplayName("Test - utilisateur - role - possède un rôle")
	void roleExiste(){
		assertTrue(utilisateur.estRole(utilisateur.role));
	}

	@Test
	@DisplayName("Test - utilisateur - role - admin soit 'banquier'")
	void roleEstAdmin(){
		assertTrue(utilisateur.estRole("banquier"));
	}

	@Test
	@DisplayName("Test - utilisateur - role - pas admin")
	void roleEstPasAdmin(){
		assertFalse(utilisateur.estRole("Client"));
	}

	@Test
	@DisplayName("Test - utilisateur - se connecter")
	void seConnecter() {
    	utilisateur.seConnecter();
    	assertTrue(utilisateur.estConnecte());
	}

	@Test
	@DisplayName("Test - utilisateur - se déconnecter")
	void seDeconnecter() {
    	utilisateur.seConnecter();
 		assertTrue(utilisateur.estConnecte());

    	utilisateur.seDeconnecter();
    	assertFalse(utilisateur.estConnecte());
	}

	// @Test
	// @DisplayName("1 + 1 = 2")
	// void addsTwoNumbers() {
	// 	Banque calculator = new Banque();
	// 	assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
	// }

	// @ParameterizedTest(name = "{0} + {1} = {2}")
	// @CsvSource({
	// 		"0,    1,   1",
	// 		"1,    2,   3",
	// 		"49,  51, 100",
	// 		"1,  100, 101"
	// })
	// void add(int first, int second, int expectedResult) {
	// 	Banque calculator = new Banque();
	// 	assertEquals(expectedResult, calculator.add(first, second),
	// 			() -> first + " + " + second + " should equal " + expectedResult);
	// }
}
