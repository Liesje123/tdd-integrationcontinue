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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class UtilisateurTest {
	/**
	 * TEST IDENTIFICATION
	 */
	@Before
	Utilisateur utilisateur = new Utilisateur("id","15","mdp");

	@Test
	@DisplayName("Test - utilisateur - Id est valide")
	void idEstValide(){
		assertTrue(utilisateur.coupleIdentification_id(utilisateur.id));
	}

	@Test
	@DisplayName("Test - utilisateur - Id est invalide")
	void idEstInvalide(){
		assertFalse(utilisateur.coupleIdentification_id("pas bon id"));
	}

	@Test
	@DisplayName("Test - utilisateur - mdp est valide")
	void mdpEstValide(){
		assertTrue(utilisateur.coupleIdentification_mdp(utilisateur.mdp));
	}

	@Test
	@DisplayName("Test - utilisateur - mdp est invalide")
	void mdpEstInvalide(){
		assertFalse(utilisateur.coupleIdentification_mdp("pas bon id"));
	}

	@Test
	@DisplayName("Test - utilisateur - couple id+mdp est valide")
	void coupleEstValide(){
		assertTrue(utilisateur.coupleIdentification(utilisateur.id,utilisateur.mdp));
	}

	@Test
	@DisplayName("Test - utilisateur - couple id+mdp est invalide")
	void coupleEstInvalide(){
		assertFalse(utilisateur.coupleIdentification("pas bon id","pas bon mdp"));
	}

	@Test
	@DisplayName("Test - utilisateur - solde existe")
	void afficheSold(){
		assertTrue(utilisateur.compte.length()!= 0);
	}

	@Test
	@DisplayName("Test - utilisateur - solde ")
	void afficheSoldNonNull(){
		assertTrue(utilisateur.estSolde(utilisateur.compte));
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
