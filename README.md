# Outdoor Game backend

This project is a backend application written in Java for PSIM project.
It was deployed using Docker on Render.

## Endpoints and project structure
Every endpoint controller is placed in its own package with Service and Repository classes.

## Installation
### Using java
1. You need at least java 17 installed on your machine and Gradle 8. Then you can build the jar.
```bash
gradle clean bootJar
```
2. Now you can run the application
```bash
java -jar outdoorGame-0.0.1-SNAPSHOT.jar
```
### Using Docker
Alternatively you can use Dockerfile that comes bundled with project files. To do that install the newest version of docker and run:
```bash
docker build -t outdoor-game .
docker run -p 4000:80 outdoor-game
```
## Data format
Data returned from the endpoints will look like this:
```json
  {
    "id": {
      "timestamp": 1717508310,
      "date": "2024-06-04T13:38:30.000+00:00"
    },
    "username": "Jan",
    "password": "Koks1234"
  }
```