package com.woworks.itcrowd.service;

import com.woworks.itcrowd.domain.Post;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface PostService {

    List<Post> getRecentPosts(int n);

    List<Post> getPopularPosts(int n);

    List<Post> getPostsPaginated(Pageable pageable);

    Post save(Post post);

    Optional<Post> getPostById(ObjectId id);

}
