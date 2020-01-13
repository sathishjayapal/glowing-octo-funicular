FROM openjdk:latest
MAINTAINER sathishk.jayapal@dot.wi.gov
WORKDIR /opt/springbootapp/
ADD /target/fargatesample-0.0.1-SNAPSHOT.jar /opt/springbootapp/
RUN chmod +x fargatesample-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "fargatesample-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080
