FROM openjdk:11
EXPOSE 8009
ARG JAR_FILE=target/microservice-client-products-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]