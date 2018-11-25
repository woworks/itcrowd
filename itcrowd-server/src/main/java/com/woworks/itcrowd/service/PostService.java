package com.woworks.itcrowd.service;

import com.woworks.itcrowd.domain.Post;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;

public interface PostService {

    List<Post> getLastPosts();

    Post save(Post post);

    Optional<Post> getPostById(ObjectId id);

}
