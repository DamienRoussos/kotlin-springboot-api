# Use the official OpenJDK image as the base image
FROM openjdk:21-slim as builder

# Set the working directory inside the container
WORKDIR /build

# Copy the Gradle executable and wrapper
COPY gradlew .
COPY gradle gradle

# Copy the build script files
COPY build.gradle.kts .
COPY settings.gradle.kts .

# Copy your application source
COPY src src

# Grant execution permissions to the gradlew script
RUN chmod +x ./gradlew

# Build the application using Gradle Wrapper
RUN ./gradlew bootJar

# Use OpenJDK image for running the application
FROM openjdk:21-slim

# Set the deployment directory
WORKDIR /app

# Copy only the built artifact from the build stage
COPY --from=builder /build/build/libs/*.jar app.jar

# Expose the port your application runs on
EXPOSE 8080

# Command to run your app using the java binary
CMD ["java", "-jar", "app.jar"]