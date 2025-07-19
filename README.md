# 🏦 Microservice Banque - Comparaison de Web Services

## 🎯 Objectif du Projet

L’objectif de ce projet est de concevoir un microservice bancaire permettant la gestion des comptes bancaires tout en explorant **quatre approches différentes** pour l’exposition de services web. Il vise à comparer ces méthodes en termes de simplicité, flexibilité, configuration et usage.

## ⚙️ Fonctionnalités

- Création de comptes bancaires
- Consultation des comptes par ID
- Liste de tous les comptes
- Suppression de comptes
- Accès aux données via différents types de web services

---

## 🌐 Technologies Utilisées

| Couche             | Technologie                                                   |
|--------------------|---------------------------------------------------------------|
| Backend            | Java, Spring Boot, Spring Data JPA                            |
| Base de données    | H2 Database                                                   |
| Web Services       | JAX-RS (Jersey), Spring REST, Spring Data REST, JAX-WS (SOAP) |
| Outils             | Maven, Postman, WSDL Tools, Intellij, SOAP UI                 |

---

## 🔁 Web Services Implémentés

### 1. JAX-RS (Jersey)
- Implémentation manuelle des services REST avec les annotations `@Path`, `@GET`, `@POST`, etc.
- Plus flexible mais nécessite plus de configuration
- Permet un contrôle total sur les routes et les réponses

### 2. Spring REST Controller
- Implémentation simple et rapide à l’aide de `@RestController`
- S’intègre naturellement avec Spring Boot
- Facile à tester avec Postman

### 3. Spring Data REST
- Exposition automatique des repositories JPA via REST
- Nécessite très peu de code pour exposer les données
- Moins flexible pour les logiques complexes

### 4. JAX-WS (SOAP)
- Implémentation de web services SOAP avec `@WebService`
- Utilisation de `SimpleJaxWsServiceExporter`
- Génération automatique d’un WSDL
- Plus verbeux mais adapté aux systèmes interopérables et existants

---

## 📊 Comparaison des Méthodes

| Critère                 | JAX-RS (Jersey) | Spring REST | Spring Data REST | JAX-WS (SOAP) |
|-------------------------|----------------|-------------|------------------|---------------|
| Facilité de mise en œuvre | ❌ Moyenne      | ✅ Facile    | ✅ Très facile    | ❌ Complexe    |
| Contrôle de l’API       | ✅ Élevé        | ✅ Bon       | ❌ Limité         | ✅ Élevé       |
| Format                  | JSON           | JSON        | JSON + HATEOAS   | XML (WSDL/SOAP) |
| Courbe d’apprentissage  | Moyenne        | Faible      | Faible           | Élevée        |
| Standard industriel     | ✅              | ✅           | ✅                | ✅ (interopérabilité) |

---

## 📂 Structure du Projet


### Description des Dossiers Principaux

SOAP-REST-SpringBoot/ 

└── microservice-banque/

├── .mvn/                     # Configuration Maven

├── src/

│   └── main/

│       ├── java/

│       │   └── com.mdk.microservicebanque/

│       │       ├── entities/            # Entités JPA (Compte, etc.)

│       │       ├── repositories/        # Interfaces Spring Data JPA

│       │       └── webService/          # 4 types de Web Services

│       │           ├── CompteRestController.java    # Spring REST

│       │           ├── CompteRestJaxRs.java         # JAX-RS (Jersey)

│       │           ├── CompteSoapApi.java           # SOAP (JAX-WS)

│       │           ├── BanqueMsConfig.java          # Config JAX-RS/SOAP

│       │           └── MicroserviceBanqueApp.java   # Classe main Spring Boot

│       └── resources/

│           ├── static/

│           ├── templates/

│           └── application.properties     # Configuration de l’application

└── pom.xml

## Cloner et Exécuter le Projet

### Prérequis
- Java JDK 17
- Maven 3.6 ou supérieur
- IDE (IntelliJ IDEA, Eclipse, etc.) - optionnel

### Étapes pour cloner et lancer le projet

1. **Cloner le dépôt**  
   Ouvrez un terminal et exécutez la commande suivante :
   ```bash
   git clone https://github.com/MahmoudDkhissi/SOAP-REST-SpringBoot.git
   cd SOAP-REST-SpringBoot
   cd microservice-banque
2. **Accès aux endpoints**

   **Spring REST :** http://localhost:8082/springRest/banque/comptes

   **JAX-RS Jersey :** http://localhost:8082/jaxRs/banque/comptes

   **Spring Data REST :** http://localhost:8082/dataRest/banque/comptes

   **SOAP (WSDL) :** http://localhost:8088/banque/compteSoapApi?wsdl