FROM frolvlad/alpine-oraclejdk8:8.131.11-slim
VOLUME /tmp
COPY target/kotlin-api-gateway-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 8080
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]