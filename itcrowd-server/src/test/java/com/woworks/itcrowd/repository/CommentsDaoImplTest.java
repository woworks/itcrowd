package com.woworks.itcrowd.repository;

import com.google.common.collect.Sets;
import com.woworks.itcrowd.domain.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
@ComponentScan("ru.otus.hw19springsecurity.repository")
class CommentsDaoImplTest {

    /*private static final String AUTHOR = "Charles Dickens";
    private static final String TITLE = "Oliver Twist";
    private static final String GENRE = "Social novel";
    private static final String USERNAME = "JohnDoe";
    private static final String COMMENT = "I like this book!";

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CommentsRepository commentsDao;


    @BeforeEach
    void cleanComments() {
        this.entityManager.getEntityManager().createQuery("delete from Comment")
                .executeUpdate();
        entityManager.getEntityManager()
                .createNativeQuery("ALTER TABLE comments ALTER COLUMN id RESTART WITH 1")
                .executeUpdate();
        this.entityManager.getEntityManager().createQuery("delete from Post")
                .executeUpdate();
    }

    @Test
    void save() {

        Post book = getTestBook();
        this.entityManager.persist(book);

        Comment comment = getTestComment();
        comment.setBook(book);
        this.commentsDao.save(comment);

        Comment comment2 = this.entityManager.find(Comment.class, 1L);

        assertEquals(comment, comment2);
    }

    @Test
    void getCommentsByBook() {

        Post book = getTestBook();
        this.entityManager.persist(book);

        Comment comment = getTestComment();
        comment.setBook(book);
        this.commentsDao.save(comment);

        List<Comment> commentList = this.commentsDao.getCommentsByBook(book);
        assertEquals(comment, commentList.get(0));
    }

    private static Post getTestBook() {
        Author author = new Author(AUTHOR);
        Genre genre = new Genre(GENRE);

        Post book = new Post();
        book.setTitle(TITLE);
        book.setAuthor(author);
        book.setGenres(Sets.newHashSet(genre));
        return book;
    }

    private static Comment getTestComment() {
        User user = new User();
        user.setUsername(USERNAME);

        Comment comment = new Comment();
        comment.setText(COMMENT);
        comment.setUser(user);

        return comment;
    }*/
}