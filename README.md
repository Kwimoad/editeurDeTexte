# 📝 Mini-Projet : Éditeur de Texte

[![Java](https://img.shields.io/badge/Java-17-blue)](https://www.oracle.com/java/) 
[![License](https://img.shields.io/badge/License-Academic-green)](#licence)

**Module** : Programmation Avancée et Technologie JEE  
**Encadrant** : Prof. Ali Yahyaouy  
**Programme** : Master WISD  

---

## 📖 Description

Ce projet est un **éditeur de texte** développé en Java.  
Il permet la gestion de fichiers texte avec des fonctionnalités classiques :  

- Créer, ouvrir et fermer des fichiers
- Sauvegarder les modifications
- Modifier la police et la couleur du texte
- Interface graphique intuitive avec icônes pour chaque action

L’objectif du projet est de pratiquer la programmation avancée en Java et la conception d’interfaces graphiques avec Swing.

---

## 🗂 Structure du Projet

.
├── .idea
├── src
│ └── application
│ ├── editeurTexte.java # Interface principale avec toutes les fonctionnalités
│ ├── SODialog.java # Interface pour récupérer le nom et le chemin du fichier
│ └── GestionFichier.java # Classe pour l'ouverture et la fermeture des fichiers
├── icon # Répertoire contenant les icônes des actions
├── Main.java # Fichier principal pour exécuter l'application
├── .gitignore
├── README.md
└── editeurDeTexte.iml

yaml
Copier le code

---

## 🛠 Détails des fichiers

- **`editeurTexte.java`** : Interface principale de l'application, contenant toutes les fonctionnalités de l’éditeur.  
- **`SODialog.java`** : Interface pour récupérer le nom et le chemin du fichier avant ouverture ou sauvegarde.  
- **`GestionFichier.java`** : Gestion des fichiers (ouverture, lecture, écriture, fermeture).  
- **`icon/`** : Contient toutes les icônes utilisées dans l’interface.  
- **`Main.java`** : Point d’entrée de l’application pour exécuter l’éditeur.  

---

## ⚙️ Fonctionnalités

| Fonctionnalité                | Description                                           |
|--------------------------------|-------------------------------------------------------|
| Nouveau fichier               | Crée un nouveau document vide                        |
| Ouvrir fichier                | Ouvre un fichier texte existant                       |
| Sauvegarder                   | Enregistre les modifications sur le fichier          |
| Police & Style                | Modifier le style, la taille et le type de police    |
| Couleur du texte              | Changer la couleur du texte sélectionné              |
| Interface graphique           | Icônes intuitives pour chaque action                 |

---

## 🚀 Installation & Exécution

1. **Cloner le projet** :  
   ```bash
   git clone https://github.com/Kwimoad/editeurDeTexte.git
Accéder au répertoire :

bash
Copier le code
cd editeurDeTexte
Compiler le projet :

bash
Copier le code
javac src/application/*.java Main.java
Exécuter l'application :

bash
Copier le code
java Main
👤 Auteur
Karim Aouad
Étudiant en Master WISD
