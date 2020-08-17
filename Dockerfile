FROM openjdk:8

COPY demo-cloudbees/target/demo-cloudbees-0.0.1-SNAPSHOT.jar /demo-cloudbees/

EXPOSE 8080

CMD java -jar /demo-cloudbees/demo-cloudbees-0.0.1-SNAPSHOT.jar