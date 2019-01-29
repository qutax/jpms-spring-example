module example.persistence {
    requires java.persistence;
    requires java.sql;

    requires java.xml.bind;
    requires net.bytebuddy;

    requires spring.context;
    requires spring.data.jpa;
    requires spring.jdbc;
    requires spring.orm;
    requires spring.tx;

    exports red.jackal.training.spring.jpms.entity;
    exports red.jackal.training.spring.jpms.repository to example.service;

    opens red.jackal.training.spring.jpms.config to spring.core, spring.beans, spring.context;
    opens red.jackal.training.spring.jpms.entity to org.hibernate.orm.core, spring.core;
}