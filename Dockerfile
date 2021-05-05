FROM openjdk:16-ea-29-jdk
ADD target/*.jar ecom-1.0.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","ecom-1.0.jar"]

