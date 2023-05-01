package br.com.api.pratica.service.person;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.api.pratica.data.PersonRepository;
import br.com.api.pratica.entities.Car;
import br.com.api.pratica.entities.Person;

@Service
public class PersonService implements IPersonService {
    
    @Autowired
    private PersonRepository _PersonRepository;

    public String createPerson(CreatePersonRequest request){
        var person = new Person(request.cpf, request.name, request.email);

        _PersonRepository.save(person);

        return person.getCpf().toString();
    }

    public String createCar(Long cpf, CreateCarRequest request){
        var car = new Car(request.brand, request.color, request.model);
        Person person = _PersonRepository.findPersonByCpf(cpf)
                .orElseThrow(() -> new RuntimeException("Documento não encontrado"));
        person.getCars().add(car);

        _PersonRepository.save(person);

        return person.getCpf().toString() + " " + car.getChassi();
    }

    public ResponseEntity<?> select(){

        return new ResponseEntity<>(_PersonRepository.findAll(), HttpStatus.OK);

    }


}
