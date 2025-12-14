# Utilise une image JDK 21
FROM eclipse-temurin:21-jdk

# Crée un dossier de travail
WORKDIR /app

# Copie le JAR compilé dans le conteneur
COPY target/securegrade-0.0.1-SNAPSHOT.jar app.jar

# Expose le port de l'application
EXPOSE 8080

# Commande pour lancer l'application
ENTRYPOINT ["java", "-jar", "app.jar"]
