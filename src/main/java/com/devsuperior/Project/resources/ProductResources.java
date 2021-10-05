package com.devsuperior.Project.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.Project.entities.Product;
import com.devsuperior.Project.repositories.ProductRepository;


//Criação de rota para trazer uma list do objeto categoria//
@RestController
@RequestMapping(value = "/product")
public class ProductResources {
	
	// injetando dependepencias 
	@Autowired
	private ProductRepository productRepository;

	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = productRepository.findAll();
		
		return ResponseEntity.ok().body(list);
	}
//Retornando um objeto unico 
	
	@GetMapping(value = "/{id}")
	
	//@pahtVariable é para o spring reconher a varável no link//
	
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product cat = productRepository.findById(id).get();
		return ResponseEntity.ok().body(cat);
	}
	
}
