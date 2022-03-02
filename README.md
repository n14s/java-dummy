# JAVA Dummy

Dummy project for test and demonstation purposes.

# Test: Building jars with exterior config files

This branch demonstrates how to control the behaviour of a simple JAVA app using a config file that reside outside of the packaged jar.

The (few) dependencies are packaged inside, so the app can be deployed anywhere.

The app single function is to output the value of the json object, defined in the config.json.

After being packaged, the object of the config.json can be manipulated, alternating the behaviour of the app

## Maven plugins

The plugins used to attain this behaviour are:

1. maven-assembly-plugin: package jar with dependencies inside
2. maven-antrun-plugin: copy resources (config.json) to target dir
3. maven-jar-plugin: add dir where the jar resides to the classpath, so it can find the config file

## Execution

To test the inteded behaviour simply

1. Run `mvn clean package` to build
2. Run `cd target` to go to the packaged jar file
3. Run `java -jar java-dummy-1.0-SNAPSHOT-jar-with-dependencies.jar` to run the app
4. Manipulate the value of the config.json file.
5. Run `java -jar java-dummy-1.0-SNAPSHOT-jar-with-dependencies.jar` again to check for changes in the output.
