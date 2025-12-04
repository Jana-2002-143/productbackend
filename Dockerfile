# Use official OpenJDK as base image
FROM eclipse-temurin:25-jdk-jammy

# Set working directory
WORKDIR /app

# Copy built jar into the container
COPY target/shop-0.0.1-SNAPSHOT.jar app.jar

# Expose port (optional; Render will override)
EXPOSE 8080

# Run the app
ENTRYPOINT ["java","-jar","app.jar"]
