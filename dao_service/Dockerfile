# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="pavel.k9696@gmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8081 available to the world outside this container
EXPOSE 8082

# The application's jar file
ARG JAR_FILE=target/dao_service-1.0-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} dao_service.jar

# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/dao_service.jar"]