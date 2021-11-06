package com.panacademy.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panacademy.api.model.Produto;
import com.panacademy.api.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;

	public Produto findById(Integer id) {
		Optional<Produto> obj = repository.findById(id);
		return obj.orElse(null);
	}

	public List<Produto> findAll() {
		return repository.findAll();
	}
	
	//Metodo Put
	public Produto update(Integer id, Produto obj) {
		Produto newObj = findById(id);
		newObj.setNome(obj.getNome());
		newObj.setPreco(obj.getPreco());
		return repository.save(newObj);
	}

	//Metodo Post
	public Produto create(Produto obj) {
		obj.setId(null);
		return repository.save(obj);
	}

	public void delete(Integer id) {
		findById(id);
		repository.deleteById(id);
	}

}
