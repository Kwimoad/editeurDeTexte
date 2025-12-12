# Mini-Projet : Éditeur de Texte

**Module** : Programmation Avancée et Technologie JEE  
**Encadrant** : Prof. Ali Yahyaouy  
**Programme** : Master WISD  

---

## Description

Ce projet est un **éditeur de texte** développé en Java.  
Il permet la gestion de fichiers texte avec des fonctionnalités classiques telles que l'ouverture, la fermeture, la sauvegarde et la modification de texte.  
L'interface est intuitive et intégrée avec des icônes pour chaque action.

---

## Structure du Projet

.
├── .idea
├── src
│ └── application
│ ├── editeurTexte.java # Interface principale contenant toutes les fonctionnalités
│ ├── SODialog.java # Interface pour récupérer le nom du fichier et son chemin
│ └── GestionFichier.java # Classe pour l'ouverture et la fermeture des fichiers
├── icon # Répertoire contenant les icônes des actions
├── Main.java # Fichier principal pour exécuter l'application
├── .gitignore
├── README.md
└── editeurDeTexte.iml

yaml
Copier le code

---

## Détails des fichiers

- **`editeurTexte.java`**  
  Interface principale de l'application. Contient toutes les fonctionnalités liées à l'édition du texte (police, couleur, mise en forme, etc.).

- **`SODialog.java`**  
  Interface permettant de récupérer le nom du fichier et son chemin avant d'effectuer des opérations telles que l'ouverture ou l'enregistrement.

- **`GestionFichier.java`**  
  Classe qui gère l'ouverture et la fermeture des fichiers, et facilite la lecture et l'écriture dans des fichiers texte.

- **`icon/`**  
  Contient toutes les icônes utilisées dans l'interface pour les actions (ouvrir, sauvegarder, nouveau fichier, etc.).

- **`Main.java`**  
  Point d'entrée de l'application. Permet de lancer l'éditeur de texte.

---

## Fonctionnalités

- Ouvrir, créer et fermer des fichiers texte
- Sauvegarder les modifications
- Modifier la police et la couleur du texte
- Interface graphique intuitive avec icônes pour les actions

---

## Installation & Exécution

1. Cloner le projet :  
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
Auteur
Karim Aouad
Étudiant en Master WISD

