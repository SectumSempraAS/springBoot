# springBoot
Learning use of spring boot 

JAVA VERSION 

$ java --version

openjdk version "1.8.0_382"

OpenJDK Runtime Environment (Zulu 8.72.0.17-CA-macos-aarch64) (build 1.8.0_382-b05)

OpenJDK 64-Bit Server VM (Zulu 8.72.0.17-CA-macos-aarch64) (build 25.382-b05, mixed mode)

#Packaging and running a Spring Boot app : Deployment and Monitoring#
//We can generate jar of the application which can be started on any machine, one of the benefits of spring boot is that it provides independently deployable application. Because it already packages servelet container and related configurations//

How to get Jar file

$ ./mvnw clean install

Running jar file

$ java -jar target/{jar_name}

jar_name  = course-api-data-0.0.1-SNAPSHOT.jar

Runs spring boot even if we are outside the IDE context, really handy when we work on microservices


