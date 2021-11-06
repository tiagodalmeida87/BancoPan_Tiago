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

import com.exemplo.pananatomy.model.Agenda;
import com.exemplo.pananatomy.service.AgendaService;

@RestController
@RequestMapping(path = "/agenda")
public class AgendaController {

	@Autowired
	private AgendaService agendaService;
	
	@GetMapping
	public List<Agenda> obeterTodos() {
		return this.agendaService.obterTodos();
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Agenda> obterPorCodigo(@PathVariable String id) {
		Agenda obj = this.agendaService.obterPorCod(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public Agenda criar(@RequestBody Agenda medico) {
		return this.agendaService.criar(medico);
	}
}


/*
{
"data": "20211104",
"paciente": "Maria José",
"medico":{"id":"61846659e009352d05556166"}
}
*/