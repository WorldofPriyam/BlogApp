package com.pasim.blogApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pasim.blogApp.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
