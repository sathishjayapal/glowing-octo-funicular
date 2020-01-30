FROM openjdk:jdk-alpine
RUN apk --no-cache add netcat-openbsd
COPY /target/fargatesample-0.0.1-SNAPSHOT.jar /tmp
WORKDIR /tmp
CMD java -jar fargatesample-0.0.1-SNAPSHOT.jar
