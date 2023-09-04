# Use an official Maven image as the base image
FROM maven:3.8.3-openjdk-17 AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml and the whole source code to the container
COPY pom.xml .
COPY src/ src/

# Run the Maven build
RUN mvn -DskipTests clean package

# Second stage of the Dockerfile for running the application
FROM eclipse-temurin:17

# Set the working directory inside the container
WORKDIR /app

# Copy the generated JAR file from the build stage
COPY --from=build /app/target/*.jar service2.jar

# Define the command to run the application
CMD ["java", "-jar", "service2.jar"]
