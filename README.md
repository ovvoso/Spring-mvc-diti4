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

L'application sera accessible à l'adresse : `http://localhost:2025/personnes`

## 📷 Captures d'écran

<img  src="../../Captures/Capt1.png"/>

## 🤝 Contribution

1. Fork le projet
2. Créez une branche pour votre fonctionnalité (`git checkout -b feature/nouvelle-fonctionnalite`)
3. Commitez vos changements (`git commit -am 'Ajout d'une nouvelle fonctionnalité'`)
4. Push vers la branche (`git push origin feature/nouvelle-fonctionnalite`)
5. Créez une Pull Request

## 📄 Licence

Ce projet est développé dans un cadre pédagogique pour le cours DITI4.

## 👨‍💻 Auteur

- **Thierno Maadjou Sow**
- 📧 Email: thiernomaadjous@gmail.com
- 💼 LinkedIn: [Thierno Maadjou Sow](www.linkedin.com/in/sow-thierno-maadjou-developpeur)
- 🌐 GitHub: [ThiernoMaadjou](https://github.com/ThiernoMaadjou)

## 📞 Contact

Pour toute question ou suggestion concernant ce projet, n'hésitez pas à me contacter!

---

⭐ N'hésitez pas à donner une étoile au projet si vous l'avez trouvé utile !
