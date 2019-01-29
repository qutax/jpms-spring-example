package red.jackal.training.spring.jpms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import red.jackal.training.spring.jpms.entity.ExampleEntity;
import red.jackal.training.spring.jpms.repository.ExampleRepository;
import red.jackal.training.spring.jpms.service.ExampleService;

import java.util.List;
import java.util.Optional;

@Service
public class DefaultExampleService implements ExampleService {

    private final ExampleRepository exampleRepository;

    @Autowired
    public DefaultExampleService(ExampleRepository exampleRepository) {
        this.exampleRepository = exampleRepository;
    }

    @Override
    public Optional<ExampleEntity> getExample(long id) {
        return exampleRepository.findById(id);
    }

    @Override
    public List<ExampleEntity> getAllExamples() {
        return exampleRepository.findAll();
    }

    @Override
    public ExampleEntity addExample(String name) {
        ExampleEntity exampleEntity = new ExampleEntity();
        exampleEntity.setName(name);
        return exampleRepository.save(exampleEntity);
    }
}
