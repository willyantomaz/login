FROM openjdk:21

ARG JAR_FILE=target/api_login.jar

COPY ${JAR_FILE} api.jar

EXPOSE 3000

ENTRYPOINT ["java","-jar","/api.jar"]

