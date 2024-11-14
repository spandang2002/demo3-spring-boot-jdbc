# demo3-spring-boot-jdbc
This is My Second Spring Boot Application

```mysql
show databases;
create database ilearn;
use ilearn;
show tables;
create table mycustomers
(
    cid   int primary key,
    cname char(10),
    email char(10),
    phone long,
    city  char(10)
);
show tables;
commit;
```

demo3-spring-boot-jdbc: Spring Boot–JDBC Example with Maven
===========================================================
This project is a simple example of how to use SpringBoot and JDBC with Maven.

**How SpringBoot Solves the Problems of spring application.**

_1) Starters => Gets All the Dependent Compatible Jars with given starter name._

* spring-boot-starter-jdbc
* spring-boot-starter-data-jpa
* spring-boot-starter-data-mongodb
* spring-boot-starter-web
* spring-boot-starter-thymeleaf
* spring-boot-starter-security
* spring-boot-starter-mail
* spring-boot-starter-test
* and Many more

_2) AutoConfiguration_

* Most of the Beans will be configured by the Spring Container automatically.
* Beans will be configured conditionally based on the availability of Classes in the Classpath.

_3) Centralizing the Configuration Data_

* You can centralize the Configuration Data/Parameters in Property Files or YAML Files.

**If you want to use Tomcat Connection Pool instead of default HikariCP with Spring-Boot, you can do the following:**

1. Update pom.xml
   A) ExcludeHikari Connection Pool

      ```maven
         <dependency> 
            <groupId>org.springframework.boot</groupId> 
            <artifactId>spring-boot-starter-jdbc</artifactId>
            <exclusions>
               <exclusion> 
                  <groupId>com.zaxxer</groupId> 
                  <artifactId>HikariCP</artifactId> 
               </exclusion>
            </exclusions>
         </dependency>
      ```

   B) Add Dependency for Tomcat Connection Pool

      ```maven
         <dependency> 
            <groupId>org.apache.tomcat</groupId> 
            <artifactId>tomcat-jdbc</artifactId> 
         </dependency>
      ```

2. Update application.properties 
   A) Remove Hikari Properties
   B) Add Tomcat Properties as follows
```properties
   spring.datasource.tomcat.initialSize=5
   spring.datasource.tomcat.max-active=25
```



