FROM quay.io/quarkus/ubi-quarkus-native-image:21.3-java11 AS build-stage
USER quarkus
WORKDIR /code
ENV GRADLE_USER_HOME=/home/quarkus/.gradle
COPY --chown=quarkus:quarkus . .
RUN rm -rf ${GRADLE_USER_HOME}/wrapper/dists/gradle-7.2-bin/*/gradle-7.2-bin.zip.lck
RUN --mount=target=${GRADLE_USER_HOME},type=cache ./gradlew build -Dquarkus.package.type=native -Dquarkus.native.native-image-xmx=5g
#RUN ./gradlew build -Dquarkus.package.type=native -Dquarkus.native.native-image-xmx=5g

FROM registry.access.redhat.com/ubi8/ubi-minimal:8.4
WORKDIR /work/
ARG SERVICE_NAME
RUN chown 1001 /work \
    && chmod "g+rwX" /work \
    && chown 1001:root /work
COPY --from=build-stage --chown=1001:root /code/services/${SERVICE_NAME}/build/*-runner /work/application

EXPOSE 8080
USER 1001

CMD ["./application", "-Dquarkus.http.host=0.0.0.0"]