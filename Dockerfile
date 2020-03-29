FROM lyoumi/cwg
RUN rm -rvf build && rm -rvf k8s
RUN mkdir build && cd build \
    && git clone https://github.com/lyoumi/k8s.git \
    && cd k8s \
    && mvn clean install \
    && cd target \
    && ls -la \
    && cp example-0.0.1-SNAPSHOT.jar /build/app.jar
ENTRYPOINT exec java -jar /build/app.jar --debug
