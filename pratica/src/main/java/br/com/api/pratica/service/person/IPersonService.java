package br.com.api.pratica.service.person;

import org.springframework.http.ResponseEntity;

import br.com.api.pratica.entities.Car;

public interface IPersonService {
    String createPerson(CreatePersonRequest request);
    ResponseEntity<?> select();
    String createCar(Long cpf, Car request);

}
