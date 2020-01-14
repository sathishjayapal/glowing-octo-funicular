FROM openjdk:jdk-alpine
COPY myapp/target/fargatesample-0.0.1-SNAPSHOT.jar /deployments/
CMD java -jar /deployments/fargatesample-0.0.1-SNAPSHOT.jar
