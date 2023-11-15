# SpringBoot-exam
# Introduction
Ce projet consiste en une application de gestion dédiée à la catégorisation des articles.
Son développement a été réalisé en utilisant les technologies et outils suivants :
Spring Boot:Un framework Java qui simplifie le développement d'applications web tout en facilitant la création de services RESTful.
Swagger:Un outil de documentation d'API qui génère une documentation interactive pour les endpoints de l'application, offrant ainsi
une référence claire et conviviale pour comprendre et explorer les fonctionnalités disponibles.
# Les technologies utilisees:
-Spring Boot
-Maven 
-JPA 
-Swagger 
-JPQL 
-Postman
# La base de donnees :
![base de donnees exam](https://github.com/MeryemRACHYQ/SpringBoot-exam/assets/147452254/003233c3-ee4a-4df2-9b76-fb2464fe44d9)
# Swagger
![swagger](https://github.com/MeryemRACHYQ/SpringBoot-exam/assets/147452254/917d34a7-ae5e-4d33-b2d8-b54b7b7508ee)
# Cruds
# Get
 ![get art](https://github.com/MeryemRACHYQ/SpringBoot-exam/assets/147452254/4747699f-4404-4a56-8717-dc18c626491b)
# POST
![WhatsApp Image 2023-11-15 at 5 42 54 PM](https://github.com/MeryemRACHYQ/SpringBoot-exam/assets/147452254/dfa91aab-9d40-4b91-8444-5ba801c01176)
 # delete
![delete categorie](https://github.com/MeryemRACHYQ/SpringBoot-exam/assets/147452254/d1ce2781-b6d7-44e7-b657-ecc435e7ff07)

# put 
![Uploading image.png…]()

# documentation swagger
La documentation Swagger de l'API est accessible à l'adresse http://localhost:8088/swagger-ui.html.
Cette interface fournit une description détaillée des endpoints de votre application, y compris des informations sur les paramètres,
les types de données, et les réponses attendues.

En utilisant l'interface Swagger, vous avez la possibilité de tester directement les endpoints de votre API.
Cette fonctionnalité interactive vous permet d'envoyer des requêtes HTTP simulées et d'observer les réponses en temps réel. 
Cela simplifie grandement le processus de compréhension et de validation des fonctionnalités de votre API sans avoir à utiliser des outils externes.

La documentation Swagger offre également des fonctionnalités telles que des exemples de requêtes et de réponses, 
des détails sur les codes d'état HTTP, et la possibilité d'exporter la documentation au format JSON ou YAML.

# Configuration
Les paramètres de configuration de la base de données sont spécifiés dans le fichier src/main/resources/application.properties.
Les entités et les repositories sont définis dans les packages com.votre.package.model et com.votre.package.repository,
tandis que les contrôleurs chargés de la gestion des requêtes HTTP sont situés dans le package com.votre.package.controller.
Les services métier sont, quant à eux, regroupés dans le package com.votre.package.service.

