package br.com.api.pratica.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Pessoas")
public class Person {
    
    @Id
    private Long cpf;
    private String name;
    private String email;
    private List<Car> cars; 

    public Person(Long cpf, String name, String email)  {
        this.cpf = cpf;
        this.name = name;
        this.email = email;
        this.cars = new ArrayList<Car>();
    }
}
