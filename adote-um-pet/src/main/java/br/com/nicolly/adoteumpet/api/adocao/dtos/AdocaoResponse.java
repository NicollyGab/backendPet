package br.com.nicolly.adoteumpet.api.adocao.dtos;

import java.math.BigDecimal;

import br.com.nicolly.adoteumpet.api.pet.dtos.PetResponse;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class AdocaoResponse {
    
    private Long id;
    private String email;
    private BigDecimal valor;
    private PetResponse pet;
}
