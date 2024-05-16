# 03 - Compiling Java

## 001 Introduction

going back to basics, we will review how to compile and package Java applications from the command line. This is important to understand how Java applications are built and how to use the command line to compile and package Java applications.

## 002 Review of Java Compile and Packaging

![alt text](image.png)
![alt text](image-1.png)
![alt text](image-2.png)
![alt text](image-3.png)

## 003 Hello World Java Command Line

create a simple Java application that prints "Hello, World!" to the console. This will be a simple Java application that we will compile and run from the command line.

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

```bash
javac HelloWorld.java
```

![alt text](image-4.png)

.class file is the compiled Java file that can be run using the `java` command.
this is called compiled bytecode.

```bash
java HelloWorld
```

![alt text](image-5.png)

## 004 Creating Java jar files from Command Line

let's create a jar file from the HelloWorld application. This will allow us to package the application into a single file that can be run on any system with the Java runtime installed.

```bash
jar cf myJar.jar HelloWorld.class
```

![alt text](image-6.png)

let's run the HelloWorld application from the jar file.

```bash
java -classpath myJar.jar HelloWorld
```

![alt text](image-7.png)

let's unzip the jar file to see the contents.

```bash
unzip myJar.jar
```

![alt text](image-8.png)

## 005 Using 3rd Party Jars with Command Line Java

![alt text](image-9.png)

```bash
javac -classpath ./lib/* HelloWorld.java
```

```bash
java -classpath ./lib/commons-lang3-3.8.1.jar:./ HelloWorld
```
