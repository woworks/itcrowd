package com.woworks.itcrowd.service;

import com.woworks.itcrowd.domain.Post;
import com.woworks.itcrowd.repository.PostsRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PostServiceImpl implements PostService {

    private final PostsRepository postRepository;
    private MongoOperations mongoOperations;

    public PostServiceImpl(PostsRepository postRepository, MongoOperations mongoOperations){
        this.postRepository = postRepository;
        this.mongoOperations = mongoOperations;
    }

    @Override
    public List<Post> getRecentPosts(int n) {
        Pageable lastN = PageRequest.of(0,  n,  Sort.by("createdDate"));
        return this.postRepository.findAll(lastN).getContent();
    }

    @Override
    public List<Post> getPopularPosts(int n) {
        Pageable lastN = PageRequest.of(0,  n,  Sort.by(Sort.Direction.DESC, "rating"));
        return this.postRepository.findAll(lastN).getContent();
    }

    @Override
    public List<Post> getPostsPaginated(Pageable pageable) {
        return null;
    }

    @Override
    public Post save(Post post) {
        return this.postRepository.save(post);
    }

    @Override
    public Optional<Post> getPostById(String id) {
        return this.postRepository.findById(id);
    }


}
