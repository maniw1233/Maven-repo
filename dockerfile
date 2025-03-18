# Use an official Java runtime as base image
FROM openjdk:17-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file from the Maven target directory
COPY target/demo-project2.jar app.jar

# Expose the application port
EXPOSE 9090

# Command to run the application
CMD ["java", "-jar", "app.jar"]

