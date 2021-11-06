package com.exemplo.pananatomy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.exemplo.pananatomy.model.Agenda;

public interface AgendaRepository extends MongoRepository<Agenda, String> {

}
