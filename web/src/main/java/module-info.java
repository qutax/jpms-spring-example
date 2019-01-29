module example.web {
    requires example.persistence;
    requires example.service;

    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.beans;
    requires spring.web;

    opens red.jackal.training.spring.jpms.web to spring.core, spring.beans, spring.context;
    opens red.jackal.training.spring.jpms.web.controller to spring.beans, spring.web;
}