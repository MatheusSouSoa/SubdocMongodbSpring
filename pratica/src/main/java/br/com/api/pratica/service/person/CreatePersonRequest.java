package br.com.api.pratica.service.person;

import lombok.Data;

@Data
public class CreatePersonRequest {

    public String name;
    public Long cpf;
    public String email;

}
