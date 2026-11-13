package com.commun.evenement;

import com.communclient.evenement.Evenement;

/**
 * Cette interface représente un gestionnaire d'événement.
 */
@FunctionalInterface
public interface GestionnaireEvenement {
	/**
	* Méthode de gestion de l'événement.
	*
	* @param evenement L'événement à gérer.
	*/
	void traiter(Evenement evenement);
}
