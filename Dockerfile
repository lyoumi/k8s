FROM lyoumi/cwg:base
RUN rm -rvf build && rm -rvf k8s
RUN mkdir build && cd build \
    && git clone https://github.com/lyoumi/k8s.git \
    && cd k8s \
    && git pull \
    && mvn clean install \
    && cd target \
    && cp example-1.0.0.jar /build/app.jar
ENTRYPOINT exec java -jar /build/app.jar --debug
