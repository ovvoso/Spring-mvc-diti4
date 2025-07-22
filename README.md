# Spring MVC DITI4 - Gestion des Personnes

Un projet Spring Boot avec Spring MVC pour la gestion des personnes développé dans le cadre du cours DITI4.

## 📋 Description

Cette application web permet de gérer une liste de personnes avec des fonctionnalités complètes de CRUD (Create, Read, Update, Delete). Elle utilise Spring Boot, Thymeleaf pour les vues et PostgreSQL comme base de données.

## ✨ Fonctionnalités

- 📄 **Liste paginée** des personnes avec navigation
- 🔍 **Recherche** par nom ou prénom (insensible à la casse)
- ➕ **Ajout** de nouvelles personnes
- ✏️ **Modification** des informations existantes
- 🗑️ **Suppression** avec confirmation
- 📱 **Interface responsive** avec CSS personnalisé

## 🛠️ Technologies utilisées

- **Backend**: Spring Boot 3.5.3
- **ORM**: Spring Data JPA
- **Base de données**: PostgreSQL
- **Template Engine**: Thymeleaf
- **CSS**: Style personnalisé
- **Build Tool**: Maven
- **Java**: Version 17
- **Annotations**: Lombok

## 📁 Structure du projet

```
src/
├── main/
│   ├── java/
│   │   └── sn/springmvcditi4/
│   │       ├── SpringMvcDiti4Application.java
│   │       ├── controller/
│   │       │   └── PersonneController.java
│   │       ├── entity/
│   │       │   └── Personne.java
│   │       └── repository/
│   │           └── PersonneRepository.java
│   └── resources/
│       ├── static/
│       │   └── style.css
│       └── templates/
│           └── personnes/
│               ├── list.html
│               └── form.html
```

## 📤 Mise en ligne sur GitHub

### Étapes pour mettre le projet sur GitHub

#### 1. Créer un repository sur GitHub
- Allez sur [github.com](https://github.com) et connectez-vous
- Cliquez sur "New repository"
- Nommez votre repository : `spring-mvc-diti4`
- Ajoutez une description : "🚀 Application web Spring Boot pour la gestion des personnes avec CRUD complet, 🔍 recherche et 📱 interface responsive"
- Ne cochez pas "Initialize with README" (vous en avez déjà un)
- Cliquez sur "Create repository"

#### 2. Initialiser Git localement
Ouvrez un terminal dans le dossier de votre projet et exécutez :

```bash
# Initialiser le repository Git
git init

# Ajouter tous les fichiers
git add .

# Premier commit
git commit -m "Initial commit: Spring MVC DITI4 project"

# Renommer la branche principale
git branch -M main
```

#### 3. Lier votre projet au repository GitHub

```bash
# Remplacez YOUR_USERNAME par votre nom d'utilisateur GitHub
git remote add origin https://github.com/YOUR_USERNAME/spring-mvc-diti4.git

# Pousser votre code sur GitHub
git push -u origin main
```

#### 4. Commandes utiles pour les mises à jour futures

```bash
# Ajouter les modifications
git add .

# Commit avec message
git commit -m "Description de vos modifications"

# Pousser vers GitHub
git push origin main

# Vérifier le statut
git status

# Voir l'historique des commits
git log --oneline
```


## ⚙️ Installation et Configuration

### Prérequis

- Java 17 ou supérieur
- Maven 3.6+
- PostgreSQL
- IDE (IntelliJ IDEA, Eclipse, VS Code)
- Git (pour cloner le projet)

### 1. Cloner le projet

```bash
git clone https://github.com/YOUR_USERNAME/spring-mvc-diti4.git
cd spring-mvc-diti4
```

### 2. Configuration de la base de données

Créez une base de données PostgreSQL et configurez le fichier `application.properties` :

```properties
# Base de données
spring.datasource.url=jdbc:postgresql://localhost:5432/diti4_db
spring.datasource.username=your_username
spring.datasource.password=your_password

# JPA/Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

### 3. Installation des dépendances

```bash
mvn clean install
```

### 4. Lancement de l'application

```bash
mvn spring-boot:run
```

L'application sera accessible à l'adresse : `http://localhost:8080/personnes`

## 🚀 Utilisation

### Page d'accueil
- Accédez à `http://localhost:8080/personnes`
- Visualisez la liste paginée des personnes

### Ajouter une personne
1. Cliquez sur "➕ Ajouter une personne"
2. Remplissez le formulaire (nom, prénom, âge, classe)
3. Cliquez sur "💾 Enregistrer"

### Rechercher
- Utilisez la barre de recherche en haut de la page
- Tapez un nom ou prénom et cliquez sur "Rechercher"
- Cliquez sur "Réinitialiser" pour afficher toutes les personnes

### Modifier une personne
1. Cliquez sur "✏️ Modifier" dans la ligne correspondante
2. Modifiez les informations souhaitées
3. Cliquez sur "💾 Enregistrer"

### Supprimer une personne
1. Cliquez sur "🗑️ Supprimer" dans la ligne correspondante
2. Confirmez la suppression dans la boîte de dialogue

## 📊 Modèle de données

### Entité Personne

| Champ   | Type    | Description                |
|---------|---------|----------------------------|
| id      | Integer | Identifiant unique (auto)  |
| nom     | String  | Nom de famille            |
| prenom  | String  | Prénom                    |
| age     | Integer | Âge de la personne        |
| classe  | String  | Classe d'appartenance     |

## 🔧 API Endpoints

| Méthode | URL                    | Description                    |
|---------|------------------------|--------------------------------|
| GET     | `/personnes`           | Liste des personnes           |
| GET     | `/personnes/ajouter`   | Formulaire d'ajout            |
| POST    | `/personnes/enregistrer` | Enregistrer une personne    |
| GET     | `/personnes/modifier/{id}` | Formulaire de modification |
| GET     | `/personnes/supprimer/{id}` | Supprimer une personne    |

## 📷 Captures d'écran

*Ajoutez ici des captures d'écran de votre application*

## 🤝 Contribution

1. Fork le projet
2. Créez une branche pour votre fonctionnalité (`git checkout -b feature/nouvelle-fonctionnalite`)
3. Commitez vos changements (`git commit -am 'Ajout d'une nouvelle fonctionnalité'`)
4. Push vers la branche (`git push origin feature/nouvelle-fonctionnalite`)
5. Créez une Pull Request

## 📝 To-Do

- [ ] Ajouter la validation des formulaires
- [ ] Implémenter l'authentification
- [ ] Ajouter des tests unitaires
- [ ] Améliorer le design responsive
- [ ] Ajouter l'export en PDF/Excel

## 📄 Licence

Ce projet est développé dans un cadre pédagogique pour le cours DITI4.

## 👨‍💻 Auteur

- **Votre Nom** - *Étudiant DITI4*

---

⭐ N'hésitez pas à donner une étoile au projet si vous l'avez trouvé utile !