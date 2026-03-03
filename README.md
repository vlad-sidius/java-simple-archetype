# Java Simple Archetype

A Maven archetype for generating simple Java projects with modern defaults and JUnit 6 testing support.

## Overview

This archetype creates a ready-to-use Java project structure with:
- **Java 25** as the default version (configurable)
- **JUnit 6** (Jupiter) for testing
- Pre-configured Maven build plugins
- Standard project layout

## Prerequisites

- Maven 3.6+
- JDK 25 or higher (or your preferred Java version)

## Usage

### Generate a New Project

Run the following command to create a new project from this archetype:

```bash
mvn archetype:generate \
  -DarchetypeGroupId=org.udavpit.archetypes \
  -DarchetypeArtifactId=java-simple-archetype \
  -DarchetypeVersion=1.0.0
```

### Interactive Mode

For interactive prompts (project coordinates and properties):

```bash
mvn archetype:generate \
  -DarchetypeGroupId=org.udavpit.archetypes \
  -DarchetypeArtifactId=java-simple-archetype \
  -DarchetypeVersion=1.0.0
```

### Batch Mode (Non-Interactive)

Specify all parameters in a single command:

```bash
mvn archetype:generate -B \
  -DarchetypeGroupId=org.udavpit.archetypes \
  -DarchetypeArtifactId=java-simple-archetype \
  -DarchetypeVersion=1.0.0 \
  -DgroupId=com.example \
  -DartifactId=my-app \
  -Dversion=1.0-SNAPSHOT \
  -DpackageName=com.example \
  -DjavaVersion=25
```

## Configuration Properties

| Property      | Description              | Default Value   |
|---------------|--------------------------|-----------------|
| `packageName` | Base package for sources | `com.example`   |
| `javaVersion` | Java version to use      | `25`            |

## Generated Project Structure

```
my-app/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/
│   │   │       └── App.java
│   │   └── resources/
│   └── test/
│       └── java/
│           └── com/example/
│               └── AppTest.java
```

## Generated Project Features

The generated project includes:

- **App.java**: Simple main class with "Hello World!" output
- **AppTest.java**: Basic JUnit 6 test example
- **pom.xml**: Pre-configured with:
  - JUnit 6 (Jupiter) dependency
  - Maven Compiler Plugin
  - Maven Surefire Plugin (unit tests)
  - Maven Failsafe Plugin (integration tests)

## Building the Generated Project

After generating a project:

```bash
cd my-app

# Compile
mvn compile

# Run tests
mvn test

# Package
mvn package

# Run the application
mvn exec:java -Dexec.mainClass="com.example.App"
```

## Local Installation

To use this archetype locally, install it to your local Maven repository:

```bash
mvn clean install
```

## Project Information

- **Group ID**: `org.udavpit.archetypes`
- **Artifact ID**: `java-simple-archetype`
- **Version**: `1.0.0`
- **Packaging**: `maven-archetype`

## License

This project is open source and available for use in your Java projects.
