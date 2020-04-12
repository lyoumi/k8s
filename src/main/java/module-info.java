module com.k8s.example {
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires spring.context;
    requires spring.web;

    requires slf4j.api;

    requires spring.data.jpa;
    requires java.persistence;
    requires org.hibernate.orm.core;

    requires static lombok;
}