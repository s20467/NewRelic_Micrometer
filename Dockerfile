FROM openjdk
RUN microdnf install findutils
COPY ./build/libs/NewRelic_Micrometer-0.0.1-SNAPSHOT.jar /app/app.jar
WORKDIR /app

CMD ["java", "-jar", "app.jar"]