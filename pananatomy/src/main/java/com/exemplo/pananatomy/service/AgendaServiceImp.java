package com.exemplo.pananatomy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemplo.pananatomy.model.Agenda;
import com.exemplo.pananatomy.repository.AgendaRepository;
import com.exemplo.pananatomy.repository.MedicoRepository;

@Service
public class AgendaServiceImp implements AgendaService {

	@Autowired
	MedicoRepository medicoRepository;
	
	@Autowired
	AgendaRepository agendaRepository;

	@Override
	public List<Agenda> obterTodos() {
		return this.agendaRepository.findAll();
	}

	@Override
	public Agenda obterPorCod(String cod) {
		return this.agendaRepository
				.findById(cod)
				.orElseThrow(() -> new IllegalArgumentException("Agenda inexistente!"));
	}

	@Override
	public Agenda criar(Agenda agenda) {
	//	Medico medico = 
	//			this.medicoRepository
	//			.findById(agenda.getMedico().getId())
	//			.orElseThrow(() -> new IllegalArgumentException("Agenda inexistente"));
	//	agenda.setAgenda(agenda);

		return this.agendaRepository.save(agenda);
	}
}
