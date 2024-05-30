FROM openjdk:17
COPY "./target/envios.jar" "app.jar"
EXPOSE 8032
ENTRYPOINT ["java", "-jar", "app.jar"]