FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD target/Authorization-0.0.1-SNAPSHOT.jar auth.jar
CMD ["java", "-jar", "auth.jar"]