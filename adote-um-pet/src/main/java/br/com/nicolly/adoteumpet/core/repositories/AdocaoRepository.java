package br.com.nicolly.adoteumpet.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nicolly.adoteumpet.core.models.Adocao;

public interface AdocaoRepository extends JpaRepository<Adocao, Long> {
    
}
