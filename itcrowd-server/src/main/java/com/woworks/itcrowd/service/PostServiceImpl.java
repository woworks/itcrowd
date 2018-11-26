package com.woworks.itcrowd.service;

import com.woworks.itcrowd.domain.Post;
import com.woworks.itcrowd.repository.PostRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository){
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> getLastPosts() {
        return this.postRepository.findAll();
    }

    @Override
    public Post save(Post post) {
        return this.postRepository.save(post);
    }

    @Override
    public Optional<Post> getPostById(ObjectId id) {
        return this.postRepository.findById(id);
    }


}
