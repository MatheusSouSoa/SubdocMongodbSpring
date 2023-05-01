package br.com.api.pratica.entities;

import java.util.UUID;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Carros")
public class Car {

    private UUID chassi;
    private String model;
    private String brand;
    private String color;

    public Car( String model, String brand, String color){
            this.setChassi();
            this.color = color;
            this.brand = brand;
            this.model = model;
    }

    public void setChassi( ){
        this.chassi = UUID.randomUUID();
    }

}
