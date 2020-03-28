FROM lyoumi/cwg
RUN mkdir build
RUN git clone https://github.com/lyoumi/k8s.git
RUN cd k8s
ENTRYPOINT exec mvn spring-boot:run
