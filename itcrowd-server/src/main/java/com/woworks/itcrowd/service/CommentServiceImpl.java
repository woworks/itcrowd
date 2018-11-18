package com.woworks.itcrowd.service;

import com.woworks.itcrowd.domain.Post;
import com.woworks.itcrowd.domain.Comment;
import com.woworks.itcrowd.repository.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    private final CommentsRepository commentsDao;

    @Autowired
    public CommentServiceImpl(CommentsRepository commentsDao) {
        this.commentsDao = commentsDao;
    }

    @Override
    public List<Comment> getPostComments(Post post) {
        return this.commentsDao.findAll();
    }

    @Override
    public void insertComment(Comment comment) {
        commentsDao.insert(comment);
    }
}
