package com.exemplo.pananatomy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.pananatomy.model.Medico;
import com.exemplo.pananatomy.service.MedicoService;

@RestController
@RequestMapping(path = "/medicos")
public class MedicoController {

	@Autowired
	private MedicoService medicoService;
	
	@GetMapping
	public List<Medico> obeterTodos() {
		return this.medicoService.obterTodos();
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Medico> obterPorCodigo(@PathVariable String id) {
		Medico obj = this.medicoService.obterPorCod(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public Medico criar(@RequestBody Medico medico) {
		return this.medicoService.criar(medico);
	}
}