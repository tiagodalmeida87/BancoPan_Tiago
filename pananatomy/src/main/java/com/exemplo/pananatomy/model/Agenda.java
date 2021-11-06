package com.exemplo.pananatomy.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Agenda implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String data;
	private String paciente;
	
	@DBRef
	private Medico medico;
	
	public Agenda() {
		super();
	}
	
	public Agenda(String id, String data, String paciente, Medico medico) {
		super();
		this.id = id;
		this.data = data;
		this.paciente = paciente;
		this.medico = medico;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

}

/*
{
    "nome": "Medico Galera",
    "especialidades": "Infectologista"
}
*/