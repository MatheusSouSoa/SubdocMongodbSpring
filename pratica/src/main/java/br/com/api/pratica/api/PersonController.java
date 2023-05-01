package br.com.api.pratica.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.pratica.entities.Car;
import br.com.api.pratica.service.person.CreatePersonRequest;
import br.com.api.pratica.service.person.IPersonService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api/v1/person")
public class PersonController {
    
    @Autowired
    private IPersonService _PersonService;

    @PostMapping()
    public ResponseEntity<String> createPerson(@RequestBody CreatePersonRequest request){

        var response = _PersonService.createPerson(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    
    @GetMapping()
    public ResponseEntity<?> select(){
        return _PersonService.select();
    }

    @PostMapping("/{cpf}/cars")
    public ResponseEntity<String> addCar(@PathVariable Long cpf, @RequestBody Car request){
        
        var response = _PersonService.createCar(cpf, request);

        return ResponseEntity.status(HttpStatus.OK).body(response);

    }
}
