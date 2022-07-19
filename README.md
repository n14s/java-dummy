# JAVA Dummy

Dummy project for test and demonstation purposes.

# Test: Integrating Git commands

This branch demonstrates how to integrate Git commands into a Java App.

The goal is to clone a repo into a target directory.

The app shall be packed into a docker image.

## Maven plugins

The plugins used to attain this behaviour are:

1. JGIT
1. maven-assembly-plugin: package jar with dependencies inside

## Execution

To test the inteded behaviour simply

1. Run `mvn clean package` to build
2. Run `cd target` to go to the packaged jar file
3. Run `java -jar java-dummy-1.0-SNAPSHOT-jar-with-dependencies.jar` to run the app
