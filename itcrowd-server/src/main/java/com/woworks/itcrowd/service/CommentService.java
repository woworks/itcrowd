package com.woworks.itcrowd.service;

import com.woworks.itcrowd.domain.Post;
import com.woworks.itcrowd.domain.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> getPostComments(Post book);

    void insertComment(Comment comment);
}
