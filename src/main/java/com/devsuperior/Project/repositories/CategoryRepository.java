package com.devsuperior.Project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.Project.entities.Category;

@Repository
public interface CategoryRepository  extends JpaRepository<Category, Long>{
	

}