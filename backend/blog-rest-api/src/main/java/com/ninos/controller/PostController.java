package com.ninos.controller;

import com.ninos.dto.PostDto;
import com.ninos.dto.PostResponse;
import com.ninos.service.PostService;
import com.ninos.utils.AppConstants;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@AllArgsConstructor
@RestController
@RequestMapping("api/v1/posts")
public class PostController {

    private PostService postService;


    // create Blog Post
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    public ResponseEntity<PostDto> createNewPost(@Valid @RequestBody PostDto postDto){
        PostDto newPostDto = postService.createPost(postDto);
        return new ResponseEntity<>(newPostDto, HttpStatus.CREATED);
    }


    // get all Posts
    @GetMapping()
    public PostResponse getAllPosts(
            @RequestParam(value = "pageNo", defaultValue = AppConstants.DEFAULT_PAGE_NUMBER, required = false) int pageNo,
            @RequestParam(value = "pageSize", defaultValue = AppConstants.DEFAULT_PAGE_SIZE, required = false) int pageSize,
            @RequestParam(value = "sortBy", defaultValue = AppConstants.DEFAULT_SORT_BY, required = false) String sortBy,
            @RequestParam(value = "sortDir", defaultValue = AppConstants.DEFAULT_SORT_DIRECTION, required = false) String sortDir
    ){
      return postService.getAllPost(pageNo,pageSize, sortBy,sortDir);
    }

    // get Post by id
    @GetMapping("/{id}")
    public ResponseEntity<PostDto> getPostById(@PathVariable("id") Long id){
      return ResponseEntity.ok(postService.getPostById(id));
    }


    // update Post
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/{id}")
    public ResponseEntity<PostDto> updatePost(@Valid @RequestBody PostDto postDto, @PathVariable("id") Long id){
         PostDto postResponse = postService.updatePost(postDto, id);
         return new ResponseEntity<>(postResponse,HttpStatus.OK);
    }


    // delete Post
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePost(@PathVariable("id") Long id){
        postService.deletePostById(id);
        return new ResponseEntity<>("Post entity deleted successfully",HttpStatus.OK);
    }





}
