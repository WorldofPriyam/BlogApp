package com.pasim.blogApp.service;

import java.util.List;

import com.pasim.blogApp.payload.PostDto;
import com.pasim.blogApp.payload.PostResponse;

public interface PostService {
	
	PostDto createPost(PostDto postDto);
	
    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePostById(long id);

    List<PostDto> getPostsByCategory(Long categoryId);

}
