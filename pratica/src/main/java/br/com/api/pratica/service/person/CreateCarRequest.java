package br.com.api.pratica.service.person;

import java.util.UUID;

import lombok.Data;

@Data
public class CreateCarRequest {

    public UUID chassi;
    public String model;
    public String brand;
    public String color;
}
