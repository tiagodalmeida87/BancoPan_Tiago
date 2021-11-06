package com.exemplo.pananatomy.service;

import java.util.List;

import com.exemplo.pananatomy.model.Agenda;

public interface AgendaService {

	public List<Agenda> obterTodos();
	
	public Agenda obterPorCod(String cod);
	
	public Agenda criar(Agenda agenda);
}
