# Étape 1 : Construire l'application avec Maven
FROM maven:3.8.6-openjdk-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Utilisation d'une image Java 21
FROM openjdk:21-jdk-slim

# Définition du répertoire de travail
WORKDIR /app

# Copier le JAR dans l’image Docker
COPY target/*.jar app.jar

# Exposer le port de l’application
EXPOSE 8080

# Exécuter l’application Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]
