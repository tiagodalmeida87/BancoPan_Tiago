package com.exemplo.pananatomy.model;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "db_medico")
public class Medico implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String nome;
	private String especialidades;
	
	//@DBRef
	private Medico agenda;
	
	//private List<Agenda> agendas = new ArrayList<>();
	
	public Medico() {
		super();
	}
	
	public Medico(String id, String nome, String especialidades, Medico agenda) {
		super();
		this.id = id;
		this.nome = nome;
		this.especialidades = especialidades;
		this.agenda = agenda;
	}

	public Medico(String id, String nome, String especialidades, Double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.especialidades = especialidades;
	}
		
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidades() {
		return especialidades;
	}
	
	public void setAgenda(Medico agenda) {
		this.agenda = agenda;
	}
	
	public Medico getAgenda() {
		return agenda;
	}
	
	public void setEspecialidades(String especialidades) {
		this.especialidades = especialidades;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medico other = (Medico) obj;
		return Objects.equals(agenda, other.agenda) && Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}

	/*public List<Agenda> getAgendas() {
		return agendas;
	}*/
	
}
