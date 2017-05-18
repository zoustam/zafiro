FROM frolvlad/alpine-oraclejdk8:slim
ADD target/gs-spring-boot-0.1.0.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]