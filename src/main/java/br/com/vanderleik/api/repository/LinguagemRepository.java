package br.com.vanderleik.api.repository;

import br.com.vanderleik.api.entity.Linguagem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LinguagemRepository extends MongoRepository<Linguagem, String> {
}
