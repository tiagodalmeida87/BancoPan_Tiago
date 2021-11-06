package com.exemplo.pananatomy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemplo.pananatomy.model.Medico;
import com.exemplo.pananatomy.repository.MedicoRepository;

@Service
public class MedicoServiceImp implements MedicoService {

	@Autowired
	MedicoRepository medicoRepository;

	@Override
	public List<Medico> obterTodos() {
		return this.medicoRepository.findAll();
	}

	@Override
	public Medico obterPorCod(String cod) {
		return this.medicoRepository
				.findById(cod)
				.orElseThrow(() -> new IllegalArgumentException("Médico inexistente!"));
	}

	@Override
	public Medico criar(Medico medico) {
	medico.setId(null);
		Medico agenda = 
				this.medicoRepository
				.findById(medico.getAgenda().getId())
				.orElseThrow(() -> new IllegalArgumentException("Agenda inexistente"));
		medico.setAgenda(agenda);

		return this.medicoRepository.save(medico);
	}
}
