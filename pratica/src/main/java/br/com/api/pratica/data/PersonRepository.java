package br.com.api.pratica.data;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.api.pratica.entities.Person;

public interface PersonRepository extends MongoRepository<Person, UUID>{
    
    Optional<Person> findPersonByCpf(Long cpf);
    List<Person> findAll();

}
