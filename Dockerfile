 # Étape 1 : Construire l'application avec Maven
FROM maven:3.8.6-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Étape 2 : Image finale minimale
FROM openjdk:21-jdk-slim
WORKDIR /app

# Copier le JAR depuis l’étape précédente
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
