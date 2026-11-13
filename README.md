# 🏦 Bank Project

A classic Java client-server banking application built with standard Sockets, multi-threading, and a Swing graphical user interface. This project allows multiple clients to connect to a central bank server, manage accounts (checking and savings), view transaction history, and perform basic banking operations concurrently.



## Features

Client-Server Architecture: Uses Java Socket communication with dedicated background threads (ThreadEcouteurDeTexte, ThreadEcouteurDeConnexions, ThreadDesInactifs) for non-blocking message handling.

Graphical User Interface (GUI): Built with Java Swing following the Observer Pattern (Observable / Observateur) to sync UI state seamlessly upon connection changes.

Account Management: Supports multiple client profiles, checking accounts (CompteCheque), savings accounts (CompteEpargne), and custom transaction history tracking (PileChaineeSimple).

Inactivity Management: Automatically tracks and manages inactive client sessions.




## Project Structure

Bank-Project/  
│  
├── src/  
│   ├── serveur/      `Server-side logic, connection handlers, and bank data models`  
│   ├── client/       `Client-side UI frames, panels, and event listeners`  
│   └── commun/       `Shared networking protocols and utility classes`  
│  
└── README.md  



## ⚙️ Getting Started & Prerequisites

Make sure you have Java Development Kit (JDK 8 or higher) installed on your machine.
