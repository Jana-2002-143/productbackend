# Use official OpenJDK as base image
FROM eclipse-temurin:25-jdk-jammy

# Set working directory
WORKDIR /app

# Copy the JAR built by Maven
COPY target/shop-0.0.1-SNAPSHOT.jar app.jar

# Use environment variable PORT (Render provides this)
ENV PORT=10000
EXPOSE $PORT

# Run the app with the dynamic port
ENTRYPOINT ["sh", "-c", "java -jar app.jar --server.port=${PORT}"]
