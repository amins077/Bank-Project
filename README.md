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

### 1. Compiling the Project

Navigate to your project root directory and compile all Java source files:

```
javac -d bin $(find . -name "*.java")
```

### 2. Running the Server

Socket applications require the server to be active before any client attempts connection. Locate your server's main entry point (e.g., ServeurBanque) and run it:

```
java -cp bin serveur.ServeurBanque
```

Confirm that the console outputs a success message indicating the server is listening for connections.

### 3. Running the Client

Once the server is running, launch the client application:

```
java -cp bin client.MainFrame
```

In the login window (PanneauConnexion), ensure the host is set to localhost and the correct port matches your server configuration.

## 📝 Current Status & Known Issues

This project is currently being maintained and refactored. Check out the Issues tab for active tasks, including:

Stabilizing socket communication buffers.

Finalizing missing account selection listeners.

Resolving thread-safety considerations in active connection tracking.

Translation to english.

## 🤝 Contributing

Contributions, bug reports, and pull requests are always welcome! Feel free to open an issue if you encounter any runtime exceptions or bugs.
