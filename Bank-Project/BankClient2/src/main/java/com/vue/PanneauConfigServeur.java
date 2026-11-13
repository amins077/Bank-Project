package com.vue;

import javax.swing.*;
import java.awt.*;


public class PanneauConfigServeur extends JPanel {
    private JTextField txtAdrServeur, txtNumPort;

    public PanneauConfigServeur(String adr, int port) {
        //Création et initialisation des composants :
        txtAdrServeur = new JTextField(adr);
        txtNumPort = new JTextField(String.valueOf(port));

        //Configuration du panneau
        setLayout(new GridLayout(2,2));
        add(new JLabel("Adresse IP : "));
        add(txtAdrServeur);
        add(new JLabel("Port : "));
        add(txtNumPort);
    }
    public String getAdresseServeur() {
        return txtAdrServeur.getText();
    }
    public String getPortServeur() {
        return txtNumPort.getText();
    }
}
