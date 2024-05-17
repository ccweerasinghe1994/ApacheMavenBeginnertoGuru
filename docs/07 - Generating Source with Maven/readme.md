# Generating Source with Maven

## 002 XSD to Java with Maven

```xsd
<?xml version="1.0"?>
<xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema"
            xmlns:jaxb="http://java.sun.com/xml/ns/jaxb" jaxb:version="2.0">

    <!--This tells JAXB what package to create the Java classes in-->
    <xsd:annotation>
        <xsd:appinfo>
            <jaxb:schemaBindings>
                <jaxb:package name="guru.springframework.domain"/>
            </jaxb:schemaBindings>
        </xsd:appinfo>
    </xsd:annotation>

    <xsd:complexType name="Product">
        <xsd:sequence>
            <xsd:element name="productId" type="xsd:integer"/>
            <xsd:element name="productDescription" type="xsd:string"/>
            <xsd:element name="productPrice" type="xsd:decimal"/>
        </xsd:sequence>
    </xsd:complexType>

    <xsd:complexType name="CreateProductRequest">
        <xsd:complexContent>
            <xsd:extension base="Product">
                <xsd:attribute name="apikey" type="xsd:string"/>
            </xsd:extension>
        </xsd:complexContent>
    </xsd:complexType>

</xsd:schema>
```

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.wchamara</groupId>
    <artifactId>jaxb-project</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>21</maven.compiler.source>
        <maven.compiler.target>21</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <jaxb2.version>2.3.3</jaxb2.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>javax.xml.bind</groupId>
            <artifactId>jaxb-api</artifactId>
            <version>2.3.1</version>
        </dependency>
    </dependencies>
    <build>
        <plugins>
            <plugin>
                <groupId>org.jvnet.jaxb2.maven2</groupId>
                <artifactId>maven-jaxb2-plugin</artifactId>
                <version>0.15.3</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>generate</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
</project>
```

by adding this plugin to the `pom.xml` file, we can generate the java classes from the xsd file.

```java

```

![alt text](image.png)

## 003 Assignment - Clean JAXB Project Automatically

## 004 Assignment Review - Clean JAXB Project Automatically

## 005 Using Maven to Generate Java Classes from JSON Schema

## 006 Challenge - Create Project Lombok Project with Maven

## 007 Generating Java Classes with Project Lombok and Maven

## 008 Challenge - Create MapStruct Project with Maven

## 009 Generating Java Classes with MapStruct and Maven
