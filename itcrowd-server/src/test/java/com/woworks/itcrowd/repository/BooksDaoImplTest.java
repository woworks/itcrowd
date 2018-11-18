package com.woworks.itcrowd.repository;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
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
class BooksDaoImplTest {

    /*private static final String AUTHOR = "Charles Dickens";
    private static final String TITLE = "Oliver Twist";
    private static final String GENRE = "Social novel";

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private AuthorsDao authorsDao;

    @Autowired
    private BooksDao booksDao;

    @Test
    void count() {

        Author author1 = new Author(AUTHOR);
        Genre genre1 = new Genre(GENRE);

        Post book1 = new Post();
        book1.setTitle(TITLE);
        book1.setAuthor(author1);
        book1.setGenres(Sets.newHashSet(genre1));

        this.entityManager.persist(author1);
        this.entityManager.persist(genre1);
        this.entityManager.persist(book1);
        this.entityManager.flush();

        long booksCount = this.booksDao.count();

        // 5 added at startup + one new
        assertEquals(6, booksCount);
    }

    @Test
    void insert() {

        Author author1 = new Author(AUTHOR);
        Genre genre1 = new Genre(GENRE);

        Post book1 = new Post();
        book1.setTitle(TITLE);
        book1.setAuthor(author1);
        book1.setGenres(Sets.newHashSet(genre1));

        this.entityManager.persist(author1);
        this.entityManager.persist(genre1);

        this.booksDao.save(book1);
        this.entityManager.flush();

        Post book2 = this.booksDao.findByTitle(TITLE).get();

        assertEquals(book1, book2);
    }

    @Test
    void getBooksByGenre() {
        Author author1 = new Author(AUTHOR);
        Genre genre1 = new Genre(GENRE);

        Post book1 = new Post();
        book1.setTitle(TITLE);
        book1.setAuthor(author1);
        book1.setGenres(Sets.newHashSet(genre1));

        this.entityManager.persist(author1);
        this.entityManager.persist(genre1);

        this.booksDao.save(book1);
        this.entityManager.flush();

        List<Post> bookList = this.booksDao.findByGenres(genre1);

        assertEquals(1, bookList.size());
        assertEquals(book1, bookList.get(0));
    }

    @Test
    void getBookByName() {
        Author author1 = new Author(AUTHOR);
        Genre genre1 = new Genre(GENRE);

        Post book1 = new Post();
        book1.setTitle(TITLE);
        book1.setAuthor(author1);
        book1.setGenres(Sets.newHashSet(genre1));

        this.entityManager.persist(author1);
        this.entityManager.persist(genre1);

        this.booksDao.save(book1);
        this.entityManager.flush();

        Post book2 = this.booksDao.findByTitle(TITLE).get();

        assertEquals(book1, book2);
    }


    @Test
    void getAll() {
        List<Post> bookList = Lists.newArrayList(this.booksDao.findAll());
        assertEquals(5, bookList.size());
    }*/
}