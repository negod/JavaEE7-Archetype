# JavaEE7-Archetype
Archetype for JavaEE7 projects

This project is a good start for a JavaEE7 project it includes the following..

+ SL4J with Logback - logging is implemented and should place itself under C:\apps\YourApplicationName
+ SWAGGER Implemented in the REST Service - When deployed you should get the UI from http://localhost:8080/YourApplicationName/apidocs
+ Hibernate 4.3.1 - In the archetype a Javax metamodel of the entities is generated for use with CriteriaBuilder
+ Lombok 1.16.8 - For automatic generation of Getters, Setters, ToString etc with annotations

##### Easiest environment to get up and running fast

+ [Netbeans 8.1] (https://netbeans.org/downloads/) 
+ [JDK8] (http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
+ [Glassfish 4.1 ( NOT 4.1.1 )] (https://glassfish.java.net/download-archive.html)
+ [Maven 3 > ] (https://maven.apache.org/download.cgi)

This project uses the built in Derby in memory database that is preconfigured in Glassfish 4.1.
You should be able to compile the project and deploy it directly.

When doing the first "mvn clean install" the following happens.

1. JPAModelGen generates the metamodel 
2. A logging.properties file is generated and that is later used by logback.xml for its properties
3. Swagger documentation is generated from Javadoc 

##### Package overview

##### config
startup for the application. Here the rootpath for the REST servive is set ( Currently "rest" ) and the REST stateless beans should be added here

##### dao
This package contains the DAO layer with a GenericDao that is an abstract class with basic CRUD operations. 
The GenericDao also holds the PersistanceUnit injection. So all DAOs should extend the GenericDao.

The AccountDao is an example of how a DAO should be used together with the GenericDao

##### entity
This package contains all entities needed in your application. The GenericEntity has the basic need any table should have.
The GenericEntity is a MappedSuperclass and entities should inherit from that class. See the Account entity for an example.

##### exception
All your own exceptions here

##### service
All your REST services here

#### Configure to fit your project
+ Update persistance.xml to enable it for your datasource
+ Generate och create entities
+ Create new services


