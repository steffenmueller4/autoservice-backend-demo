# Autoservice Backend Demo

This application is a small Spring Boot web application for demo purposes.
The application is written in Kotlin and uses Gradle.

To build and run the application, you can either run the application via Docker or by installing Java and some other dependencies on your system.
The steps to build and run the application via Docker are described in the section 'The Docker Way'.
The steps to build and run the application on your system directly are described in the section 'The System Way'.
Choose one way to build and run the application.

## Checkout Source Code

To check out the source code, you need to have GIT.
Change to a directory of your choice and check out the source code via:
```
git clone https://github.com/steffenmueller4/autoservice-backend-demo.git
```

Afterwards change to the project's root folder.
```
cd autoservice-backend-demo
```

## The Docker Way

To build and run the application via Docker, you need to install Docker on your system.

Run:
```
docker --version
```
to test if Docker is installed correctly.

### Build

To build the application via Docker, simply run:
```
./docker-build-app.sh
```
when you have a Linux or Mac OS.

If you are on a Windows, run:
```
docker-build-app.bat
```

### Run

To run the application, simply run:
```
./docker-run-app-locally.sh
```
when you have a Linux or Mac OS.

If you are on a Windows, run:
```
docker-run-app-locally.bat
```

Afterwards, you can access the application via:
```
http://localhost:8080/
```

When you access the app and everything works fine, you will see the text: `This is a test app.`

## The System Way

To build and run the application, you have to install:
* Java >= 11
* Gradle

### Build

To build the application, run:
```
gradlew build
```

### Run

To run the application, either run:
```
gradlew bootRun
```
or, after building the application in the previous step, run:
```
java -jar build/libs/autoservice-backend-demo-0.0.1-SNAPSHOT.jar
```

Afterwards, you can access the application via:
```
http://localhost:8080/
```

When you access the app and everything works fine, you will see the text: `This is a test app.`
