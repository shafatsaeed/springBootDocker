From openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/docker-spring-boot.jar docker-spring-boot.jar
ENTRYPOINT ["java", "-jar", "/docker-spring-boot.jar"]