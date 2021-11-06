package com.exemplo.pananatomy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.exemplo.pananatomy.model.Medico;

public interface MedicoRepository extends MongoRepository<Medico, String> {

}
