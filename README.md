Java Compiler Demo
==================

Demo showing, that the Java compiler _cannot_ detect usage of Java APIs,
which are not available on previous Java versions. Instead _runtime_ errors occur, if the execution path leads to a class/method not available in the JRE.

Project Structure
-----------------

The project consists of two modules:

* `lib`: a library, which uses an API available only since Java 11, compiled with JDK 11 but with `source` and `target` equal to 8.
* `app`: a module, which uses the `lib`, but is compiled and run with JDK 8.

Running the Project
-------------------

``
$ JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64 mvn -pl lib clean install
``

``
$ JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64 mvn -pl app clean verify
``

The last maven build shows the following error during test run:

``
Java11ApiExampleTest.test:10 » NoSuchMethod java.util.Optional.isEmpty()Z
``
