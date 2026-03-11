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
- JDK 25 or higher (or your preferred Java version, configurable via `javaVersion`)

## Usage

### Generate a New Project

Run the following command to create a new project from this archetype:

```bash
mvn archetype:generate \
  -DarchetypeGroupId=org.udavpit.archetypes \
  -DarchetypeArtifactId=java-simple-archetype \
  -DarchetypeVersion={version}
```

### Interactive Mode

For interactive prompts (project coordinates and properties):

```bash
mvn archetype:generate \
  -DarchetypeGroupId=org.udavpit.archetypes \
  -DarchetypeArtifactId=java-simple-archetype \
  -DarchetypeVersion={version}
```

### Batch Mode (Non-Interactive)

Specify all parameters in a single command:

```bash
mvn archetype:generate -B \
  -DarchetypeGroupId=org.udavpit.archetypes \
  -DarchetypeArtifactId=java-simple-archetype \
  -DarchetypeVersion={version} \
  -DgroupId=com.example \
  -DartifactId=my-app \
  -Dversion=1.0-SNAPSHOT \
  -DpackageName=com.example \
  -DmainClass=App \
  -DjavaVersion=25
```

## Configuration Properties

| Property      | Description              | Default Value   |
|---------------|--------------------------|-----------------|
| `packageName` | Base package for sources | `com.example`   |
| `mainClass`   | Main class name          | `App`           |
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

Note: The actual class names depend on the `mainClass` property (default: `App`).

## Generated Project Features

The generated project includes:

- **App.java**: Simple main class with "Hello from ${package}!" output
- **AppTest.java**: Basic JUnit 6 test example (test class name matches `mainClass` + `Test`)
- **pom.xml**: Pre-configured with:
  - JUnit Jupiter 6.0.3 dependency
  - AssertJ 3.27.7 dependency
  - Maven Compiler Plugin 3.15.0
  - Maven Surefire Plugin 3.5.5 (unit tests)
  - Maven Failsafe Plugin 3.5.5 (integration tests)

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

Note: Adjust the main class name based on your `mainClass` property value.

## Local Installation

To use this archetype locally, install it to your local Maven repository:

```bash
mvn clean install
```

## License

This project is open source and available for use in your Java projects.
