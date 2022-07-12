package br.com.nicolly.adoteumpet.api.adocao.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.nicolly.adoteumpet.api.adocao.dtos.AdocaoRequest;
import br.com.nicolly.adoteumpet.api.adocao.dtos.AdocaoResponse;
import br.com.nicolly.adoteumpet.api.pet.mappers.PetMapper;
import br.com.nicolly.adoteumpet.core.models.Adocao;
import br.com.nicolly.adoteumpet.core.repositories.PetRepository;

@Component
public class AdocaoMapper {

    @Autowired
    private PetRepository petRepository; 
    
    private PetMapper petMapper;

    public Adocao toModel(AdocaoRequest AdocaoRequest) {
    var adocao = new Adocao();
    adocao.setEmail(AdocaoRequest.getEmail());
    adocao.setValor(AdocaoRequest.getValor());
    adocao.setPet(petRepository.findByIdOrElseThrow(AdocaoRequest.getPetId()));
    return adocao;
 }

    public AdocaoResponse toResponse(Adocao adocao){
        var adocaoResponse = new AdocaoResponse();
        adocaoResponse.setId(adocao.getId());
        adocaoResponse.setEmail(adocao.getEmail());
        adocaoResponse.setValor(adocao.getValor());
        adocaoResponse.setPet(petMapper.toResponse(adocao.getPet()));
        return adocaoResponse;
       

    }
}
