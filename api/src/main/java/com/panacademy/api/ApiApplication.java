package com.panacademy.api;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.panacademy.api.model.Produto;
import com.panacademy.api.model.Usuario;
import com.panacademy.api.repositories.ProdutoRepository;
import com.panacademy.api.repositories.UsuarioRepository;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner {
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Autowired
	ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario("Maria Silva", "1234");
		Usuario u2 = new Usuario("Joao da Silva", "1234");
		
		Produto p1 = new Produto("TV Sony", 3450.00);
		Produto p2 = new Produto("SmartPhone LG", 2000.00);

		usuarioRepository.saveAll(Arrays.asList(u1, u2));
		
		produtoRepository.saveAll(Arrays.asList(p1, p2));
	}
}