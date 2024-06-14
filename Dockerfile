FROM gradle:jdk17 AS build
COPY . .
RUN gradle bootJar

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /build/libs/outdoorGame-0.0.1-SNAPSHOT.jar outdoorGame.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "outdoorGame.jar"]