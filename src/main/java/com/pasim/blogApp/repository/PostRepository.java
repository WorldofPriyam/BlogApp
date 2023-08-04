package com.pasim.blogApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pasim.blogApp.model.Post;

public interface PostRepository extends JpaRepository<Post,Long> {
	
	List<Post> findByCategoryId(Long categoryId);

}
