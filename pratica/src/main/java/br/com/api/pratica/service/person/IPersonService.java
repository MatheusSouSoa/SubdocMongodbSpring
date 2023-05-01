package br.com.api.pratica.service.person;

import org.springframework.http.ResponseEntity;

public interface IPersonService {
    String createPerson(CreatePersonRequest request);
    ResponseEntity<?> select();
    String createCar(Long cpf, CreateCarRequest request);

}
