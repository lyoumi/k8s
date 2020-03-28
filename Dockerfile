FROM lyoumi/cwg
RUN mkdir build
RUN git clone https://github.com/lyoumi/k8s.git
RUN cd k8s \
    && mvn clean install
RUN cp target/example-0.0.1-SNAPSHOT.jar /build/app.jar
ENTRYPOINT exec java -jar /build/app.jar --debug
