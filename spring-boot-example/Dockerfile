#FROM java:8
FROM anapsix/alpine-java:8_server-jre_unlimited
ADD target/spring-boot-aws-elasticbeanstalk-example-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]