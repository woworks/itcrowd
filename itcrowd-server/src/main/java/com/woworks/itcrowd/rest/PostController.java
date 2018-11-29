package com.woworks.itcrowd.rest;

import com.woworks.itcrowd.domain.Post;
import com.woworks.itcrowd.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("api/posts/recent")
    public List<Post> getRecentPosts(@RequestParam int size) {
         return postService.getRecentPosts(size);
    }

    @GetMapping("api/posts/popular")
    public List<Post> getPopularPosts(@RequestParam int size) {
        return postService.getPopularPosts(size);
    }

    @GetMapping("api/posts")
    public List<Post> listPosts(Pageable pageable) {
        return postService.getPostsPaginated(pageable);
    }

    @GetMapping("api/posts/{id}")
    public ResponseEntity<Post> getPost(@PathVariable String id) {
        Optional<Post> postOptional = postService.getPostById(id);
        if (postOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(postOptional.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }


    @PostMapping("api/posts")
    public Post savePost(@RequestBody Post post) {
            return this.postService.save(post);
    }
}
