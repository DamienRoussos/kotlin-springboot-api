# Stage 1: Build stage
FROM gradle:7.2.0-jdk11 AS builder

# Set the working directory in the container
WORKDIR /app

# Copy the Gradle build files
COPY build.gradle.kts settings.gradle.kts /app/

# Copy the source code
COPY src /app/src/

# Build the application
RUN gradle build --no-daemon

# Stage 2: Runtime stage
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the build stage
COPY --from=builder /app/build/libs/kotlin-api-0.0.1-SNAPSHOT.jar /app/kotlin-api.jar

# Expose the port your app runs on
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "kotlin-api.jar"]
