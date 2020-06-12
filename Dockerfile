#### Stage 1: Build the application.properties
FROM openjdk:14-jdk-alpine

# Copy jar files to the image
ARG JAR_FILE=target/gloreactdashboard-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} /home/gloreactdashboard/
ARG CONFIG_FILE=target/classes/application.properties
COPY ${CONFIG_FILE} /home/gloreactdashboard/config/

# Set the current working directory inside the image
WORKDIR /home/gloreactdashboard/

# Create user that will run the application.properties
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
# Use root to create folder in image & give new user rights
USER root
RUN chown -R spring /home/gloreactdashboard/

ENTRYPOINT ["java","-jar","/home/gloreactdashboard/gloreactdashboard-0.0.1-SNAPSHOT.jar","--spring.config.location=config/application.properties"]