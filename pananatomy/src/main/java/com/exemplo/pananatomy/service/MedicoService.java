package com.exemplo.pananatomy.service;

import java.util.List;

import com.exemplo.pananatomy.model.Medico;

public interface MedicoService {

	public List<Medico> obterTodos();
	
	public Medico obterPorCod(String cod);
	
	public Medico criar(Medico medico);
}
