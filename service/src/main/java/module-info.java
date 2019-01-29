module example.service {
    requires example.persistence;

    requires spring.context;
    requires spring.beans;

    exports red.jackal.training.spring.jpms.service;

    opens red.jackal.training.spring.jpms.service.impl to spring.beans;
}