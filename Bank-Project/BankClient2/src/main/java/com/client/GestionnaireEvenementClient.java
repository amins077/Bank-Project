package com.client;

import com.communclient.evenement.Evenement;
import com.communclient.evenement.GestionnaireEvenement;
import com.communclient.net.Connexion;

/**
 * Cette classe représente un gestionnaire d'événement d'un client. Lorsqu'un client reçoit un texte d'un serveur,
 * il crée un événement à partir du texte reçu et alerte ce gestionnaire qui réagit en gérant l'événement.
 */
public class GestionnaireEvenementClient implements GestionnaireEvenement {
    private Client client;

    /**
     * Construit un gestionnaire d'événements pour un client.
     *
     * @param client Client Le client pour lequel ce gestionnaire gère des événements
     */
    public GestionnaireEvenementClient(Client client) {
        this.client = client;
    }
    /**
     * Méthode de gestion d'événements. Cette méthode contiendra le code qui gère les réponses obtenues d'un serveur.
     *
     * @param evenement L'événement à gérer.
     */
    @Override
    public void traiter(Evenement evenement) {
        Object source = evenement.getSource();
        Connexion cnx;
        String typeEvenement, arg;
        String[] membres;
        if (source instanceof Connexion) {
            cnx = (Connexion) source;
            typeEvenement = evenement.getType();
            switch (typeEvenement) {
                /******************* COMMANDES GÉNÉRALES *******************/
                case "END": //Le serveur demande de fermer la connexion
                    client.deconnecter(); //On ferme la connexion
                    System.out.println("\t\t\t. Connexion avec le serveur fermée");
                    break;
                case "LIST": //Le serveur a renvoyé la liste des numéros de comptes connectés
                    arg = evenement.getArgument();
                    membres = arg.split(":");
                    System.out.println("\t\t" + membres.length + " connectés :");
                    for (String s : membres)
                        System.out.println("\t\t\t- " + s);
                    break;
                /******************* TRAITEMENT PAR DÉFAUT *******************/
                default: //Afficher le texte recu :
                    System.out.println("\t\t\t."+evenement.getType()+" "+evenement.getArgument());
            }
        }
    }
}