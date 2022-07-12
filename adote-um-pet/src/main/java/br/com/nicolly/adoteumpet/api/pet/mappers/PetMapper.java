package br.com.nicolly.adoteumpet.api.pet.mappers;

import org.springframework.stereotype.Component;

import br.com.nicolly.adoteumpet.api.pet.dtos.PetResponse;
import br.com.nicolly.adoteumpet.core.models.Pet;

@Component
public class PetMapper {
    public PetResponse toResponse(Pet pet){
        var PetResponse = new PetResponse();
        PetResponse.setId(pet.getId());
        PetResponse.setNome(pet.getNome());
        PetResponse.setHistoria(pet.getHistoria());
        PetResponse.setFoto(pet.getFoto());
        return PetResponse;
    }
}
