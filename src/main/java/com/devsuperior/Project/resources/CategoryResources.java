package com.devsuperior.Project.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.Project.entities.Category;
import com.devsuperior.Project.repositories.CategoryRepository;


//Criação de rota para trazer uma list do objeto categoria//
@RestController
@RequestMapping(value = "/categories")
public class CategoryResources {
	
	// injetando dependepencias 
	@Autowired
	private CategoryRepository categoryRepository;

	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = categoryRepository.findAll();
		
		return ResponseEntity.ok().body(list);
	}
//Retornando um objeto unico 
	
	@GetMapping(value = "/{id}")
	
	//@pahtVariable é para o spring reconher a varável no link//
	
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category cat = categoryRepository.findById(id).get();
		return ResponseEntity.ok().body(cat);
	}
	
}
