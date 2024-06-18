# Build the application
FROM gradle:jdk17 AS build
WORKDIR /home/gradle/project
COPY . .

# Run the build to create the JAR file
RUN chmod +x gradlew
RUN ./gradlew clean bootJar

# Verify the JAR file is created
RUN ls /home/gradle/project/build/libs

# Package the application
FROM openjdk:17-jdk-slim
COPY --from=build /home/gradle/project/build/libs/*.jar outdoorGame.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "outdoorGame.jar"]
