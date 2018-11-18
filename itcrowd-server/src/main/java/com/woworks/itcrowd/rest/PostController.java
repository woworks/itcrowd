package com.woworks.itcrowd.rest;

import com.woworks.itcrowd.domain.Post;
import com.woworks.itcrowd.service.PostService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("api/posts")
    public List<Post> listBooks() {
         return postService.getLastPosts();
    }

    @GetMapping("api/posts/{id}")
    public Post editBooks(@PathVariable ObjectId id) {
            return postService.getPostById(id).orElseThrow(NotFoundException::new);
    }

    @PostMapping(value = "api/books/{id}")
    public void editBook(@PathVariable Long id, @RequestBody Post post) {
        this.postService.insertPost(post);
    }
}
