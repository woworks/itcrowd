package com.woworks.itcrowd.rest;

import com.woworks.itcrowd.domain.Post;
import com.woworks.itcrowd.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
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


    @PostMapping("api/posts")
    public Post savePost(@RequestBody Post post) {
            return this.postService.save(post);
    }
}
